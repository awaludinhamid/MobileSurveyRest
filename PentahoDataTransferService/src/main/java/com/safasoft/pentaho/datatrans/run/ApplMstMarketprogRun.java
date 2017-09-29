package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstMarketprogDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstMarketprogDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstMarketprog;
import com.safasoft.pentaho.datatrans.src.service.ApplMstMarketprogService;

public class ApplMstMarketprogRun extends
BaseRun<ApplMstMarketprog,ApplMstMarketprogService,ApplMstMarketprogDest,ApplMstMarketprogDestService> {

@Override
protected List<ApplMstMarketprog> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<ApplMstMarketprog> bList, int numOfBulkRecord) {
 List<ApplMstMarketprogDest> ammdList = new ArrayList<>();
 for(ApplMstMarketprog amm : bList) {
   ApplMstMarketprogDest ammd = new ApplMstMarketprogDest();
   try {
     BeanUtils.copyProperties(ammd, amm);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ammdList.add(ammd);
 }
 if(ammdList.size() > 0)
   service2.save(ammdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}