package com.safasoft.mobsur.rest.client.run;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.safasoft.mobsur.rest.client.bean.support.UpdateStatusBean;
import com.safasoft.mobsur.rest.client.main.Main;
import com.safasoft.mobsur.rest.client.util.SessionUtil;

public class BaseRun<B,T> {

	//private final String beanName;
  //private final Class<List<B>> clazzBeanList;
  //private final Class<B[]> clazzArr;
  private final String coyCode;
  
  protected final String uri;
  protected final String userRun;
  protected final Logger logger = Logger.getLogger("others");
  protected final RestTemplate template;
  protected final T service;
  protected final Class<B> clazzBean;
  protected final int numOfBulkRecord = initNumOfBulkRecord();
  
  private ResponseEntity<B> respEntity;  

  @SuppressWarnings("unchecked")
	public BaseRun(RestTemplate template, String uri, String userRun, String coyCode) {
  	// rest client template
  	this.template = template;
		// url
    this.uri = uri;
    // bean
    clazzBean = (Class<B>) ((ParameterizedType)
            getClass().getGenericSuperclass())
            .getActualTypeArguments()[0];
    //remarked for later use, for other purposes
    //clazzBeanList = (Class<List<B>>) new ArrayList<List<B>>().getClass();
    //String name = clazzBean.getSimpleName();
    //this.beanName = name.substring(0,1).toLowerCase() + name.substring(1);
    // service
    Class<T> clazzService = (Class<T>) ((ParameterizedType)
            getClass().getGenericSuperclass())
            .getActualTypeArguments()[1];
    String name = clazzService.getSimpleName();
    this.service = new SessionUtil<T>().getAppContext(
            name.substring(0,1).toLowerCase() + name.substring(1));
    //user run
    this.userRun = userRun;
    //company
    this.coyCode = coyCode;
  }

  /**
   * Get data from WS
   * @param isSave
   * @param isUpdate
   * @return
   */
  public HttpStatus runGet(boolean isUpdate) {
  	//
  	logger.info("get request for: " + clazzBean.getName());
  	//
  	respEntity = template.getForEntity(uri +"/{coyCode}", clazzBean, getPathVariable());
  	HttpStatus status = respEntity.getStatusCode();
  	if(status == HttpStatus.OK) { //success
  		//save to local
  		B b = saveData(respEntity.getBody());
  		if(isUpdate) { //have to update server
  			ResponseEntity<UpdateStatusBean> updateStatusBean = 
  					template.postForEntity(getUriWithParams(uri + "/updatestatus"), getUpdateStatusBean(b), UpdateStatusBean.class);
  		}
  	} else if(status == HttpStatus.UNAUTHORIZED) {
  		logger.error("You have no authorization to this site !");
  	} else if(status == HttpStatus.EXPECTATION_FAILED) {
  		logger.error("Failed process request in server !");
  	}
  	//
  	logger.info(status.getReasonPhrase());
  	//
  	return status;
  }

  /**
   * Post data to WS with auto-generated object
   * @param isUpdate
   * @return
   */
	public HttpStatus runPost(boolean isUpdate) {
  	return runPost(isUpdate, getData());
  }

  /**
   * Post data to WS with manual-prepared object
   * @param isUpdate
   * @param bList
   * @return
   */
	public HttpStatus runPost(boolean isUpdate, B b) {
  	//
  	logger.info("post request for: " + clazzBean.getName());
  	//  	  
  	respEntity = template.postForEntity(getUriWithParams(uri + "/post"), b, clazzBean);
  	HttpStatus status = respEntity.getStatusCode();
  	if(status == HttpStatus.OK) {// success
  		//update local
  		if(isUpdate)
    		saveData(respEntity.getBody());
  	} else if(status == HttpStatus.UNAUTHORIZED) {
  		logger.error("You have no authorization to this site !");
  	} else if(status == HttpStatus.EXPECTATION_FAILED) {
  		logger.error("Failed process request in server !");
  	}
  	//
  	logger.info(status.getReasonPhrase());
  	//
  	return status;
  }

  // all implementation on children class
  protected B saveData(B b) {return null;}
  protected B getData() {return null;}
  protected UpdateStatusBean getUpdateStatusBean(B b) {return null;}
  protected void saveUpdateStatus(UpdateStatusBean updateStatusBean) {}
  
  public ResponseEntity<B> getRespEntity() {
  	return respEntity;
  }
  
  private int initNumOfBulkRecord() {
		//
    try {
      Properties prop = new Properties();
			prop.load(Main.class.getClassLoader().getResourceAsStream("jdbc.properties"));
	    return Integer.parseInt(prop.getProperty("batch.numOfBulkRecord"));  	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
    return 0;
  }
  
  private String getUriWithParams(String uriWithParams) {
  	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uriWithParams)
  			.queryParam("numOfBulkRecord", numOfBulkRecord)
  			.queryParam("userRun", userRun);
  	return builder.toUriString();
  }
  
  private Map<String,Object> getPathVariable() {
  	Map<String,Object> mapPath = new HashMap<>();
  	mapPath.put("coyCode", coyCode);
  	return mapPath;
  }
}
