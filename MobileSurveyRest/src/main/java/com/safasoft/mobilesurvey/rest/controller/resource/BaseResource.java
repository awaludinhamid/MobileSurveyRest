package com.safasoft.mobilesurvey.rest.controller.resource;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.safasoft.mobilesurvey.rest.client.bean.support.UpdateStatusBean;
import com.safasoft.mobilesurvey.rest.security.ServerAuthentication;

/**
 * Resource superclass
 * Used for data transfer between client and server
 * @created Jun 19, 2016
 * @author awal
 * @param <B>, bean class of extended class
 */
public class BaseResource<B> {
	
	protected final Logger logger = Logger.getLogger("others");	
	protected Date today = new Date(System.currentTimeMillis());
  
	@Autowired
	private HttpServletRequest request;

	/**
	 * Deafult constructor
	 */
	public BaseResource() {
			//no longer available ?
      /*Class<T> clazzService = (Class<T>) ((ParameterizedType)
              getClass().getGenericSuperclass())
              .getActualTypeArguments()[1];*/
  }

	/**
	 * Response get data
	 * @param coyId
	 * @return wrapper contains list of <B>
	 */
	@RequestMapping(value="/{coyCode}", method=RequestMethod.GET)
  public ResponseEntity<B> doGet(
  		@PathVariable("coyCode") String coyCode) {
		//
  	logger.info("get response for " + this.getClass().getName());
  	//
  	try {
	  	if(new ServerAuthentication().isAuthentication(request.getSession().getId())) {			
				return new ResponseEntity<B>(getData(coyCode),HttpStatus.OK);
			}
	  	return new ResponseEntity<B>(HttpStatus.UNAUTHORIZED);
  	} catch(Exception x) {
  		x.printStackTrace();
  		logger.error(x);
  	}
  	return new ResponseEntity<B>(HttpStatus.EXPECTATION_FAILED);
  }

	/**
	 * Receive post data
	 * @param bList
	 * @param numOfBulkRecord
	 * @return wrapper contains list of updated <B>
	 */
  @RequestMapping(value="/post", method=RequestMethod.POST)
  public ResponseEntity<B> doPost(
  		@RequestBody B b,
  		@RequestParam("numOfBulkRecord") int numOfBulkRecord,
  		@RequestParam("userRun") String userRun) {
  	//
  	logger.info("post response for " + this.getClass().getName());
  	//
  	//try {
	  	if(new ServerAuthentication().isAuthentication(request.getSession().getId())) {
	  		return new ResponseEntity<B>(saveData(b, numOfBulkRecord, userRun),HttpStatus.OK);
	    }
	  	return new ResponseEntity<B>(HttpStatus.UNAUTHORIZED);
  }

	/**
	 * Receive update status data
	 * @param bList
	 * @param numOfBulkRecord
	 * @return
	 */
  @RequestMapping(value="/updatestatus", method=RequestMethod.POST)
  public ResponseEntity<UpdateStatusBean> doUpdateStatus(
  		@RequestBody UpdateStatusBean updateStatusBean,
  		@RequestParam("numOfBulkRecord") int numOfBulkRecord,
  		@RequestParam("userRun") String userRun) {
  	//
  	logger.info("update status response for " + this.getClass().getName());
  	//
  	try {
	  	if(new ServerAuthentication().isAuthentication(request.getSession().getId())) {
	  		return new ResponseEntity<UpdateStatusBean>(updateStatus(updateStatusBean, numOfBulkRecord, userRun),HttpStatus.OK);
	    }
	  	return new ResponseEntity<UpdateStatusBean>(HttpStatus.UNAUTHORIZED);
  	} catch(Exception x) {
  		x.printStackTrace();
  		logger.error(x);
  	}
  	return new ResponseEntity<UpdateStatusBean>(HttpStatus.EXPECTATION_FAILED);
  }

  //implementation on child class
  protected B getData(String coyCode) {return null;}
  protected B saveData(B b, int numOfBulkRecord, String userRun) {return null;}
  protected UpdateStatusBean updateStatus(UpdateStatusBean updateStatusBean, int numOfBulkRecord, String userRun) {return null;}
}
