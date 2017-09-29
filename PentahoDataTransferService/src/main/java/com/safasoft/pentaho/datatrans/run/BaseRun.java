package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.persistence.Table;

import org.apache.log4j.Logger;

import com.safasoft.pentaho.datatrans.util.SessionUtil;

public abstract class BaseRun<B,T,B2,T2> {

	private final String tableName;
  protected final Logger logger = Logger.getLogger("others");
  protected final T service;
  protected final T2 service2;

  @SuppressWarnings("unchecked")
	public BaseRun() {
    // bean
    Class<B> clazzBean = (Class<B>) ((ParameterizedType)
            getClass().getGenericSuperclass())
            .getActualTypeArguments()[0];
    tableName = clazzBean.getAnnotation(Table.class).name();
  	// remarked for future purpose
    /*Class<B2> clazzBean2 = (Class<B2>) ((ParameterizedType)
        getClass().getGenericSuperclass())
        .getActualTypeArguments()[2];*/
    // service
    Class<T> clazzService = (Class<T>) ((ParameterizedType)
            getClass().getGenericSuperclass())
            .getActualTypeArguments()[1];
    String name = clazzService.getSimpleName();
    this.service = new SessionUtil<T>().getAppContext(
            name.substring(0,1).toLowerCase() + name.substring(1));
    Class<T2> clazzService2 = (Class<T2>) ((ParameterizedType)
        getClass().getGenericSuperclass())
        .getActualTypeArguments()[3];
		String name2 = clazzService2.getSimpleName();
		this.service2 = new SessionUtil<T2>().getAppContext(
		        name2.substring(0,1).toLowerCase() + name2.substring(1));
  }
  
  /**
   * Transfer data from source table to destination table
   * @param numOfBulkRecord int
   * 
   */
  public void transferData(final int numOfRecord, final int numOfBulkRecord, int numOfThreadActive) {
  	logger.info("Start transfer data for table " + tableName);
  	logger.info("-------------------------------------------");
  	logger.info("Start truncate table");
  	truncateTable(tableName);
  	logger.info("End truncate table");
  	//
  	ExecutorService executor = Executors.newFixedThreadPool(numOfThreadActive);
  	for(int pageNo = 1; pageNo <= getPage(count(),numOfRecord) && pageNo <= 10000; pageNo++) {
    	final int pageNoTmp = pageNo;
  		executor.submit(new Runnable() {				
				@Override
				public void run() {
		    	logger.info("Start transfer page " + pageNoTmp);
					// TODO Auto-generated method stub
		  		saveData(getData(pageNoTmp,numOfRecord),numOfBulkRecord);					
		    	logger.info("End transfer page " + pageNoTmp);
				}
			});
  	}
    executor.shutdown();
  	logger.info("-------------------------------------------");
  	logger.info("End transfer data for table " + tableName);
  }

  // all implementation on children class
  protected abstract List<B> getData(int pageNo, int numOfRecord);
  protected abstract int count();
  protected abstract void saveData(List<B> bList, int numOfBulkRecord);
  protected abstract int truncateTable(String tableName);
  
  // get number of page
  private int getPage(int count, int numOfBulkRecord) {
  	return (new Double(count/numOfBulkRecord).intValue()) + ((count % numOfBulkRecord) == 0 ? 0 : 1);
  }
}
