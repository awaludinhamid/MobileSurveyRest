package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrncashBalanceDest;
import com.safasoft.pentaho.datatrans.dest.service.FinTrncashBalanceDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinTrncashBalance;
import com.safasoft.pentaho.datatrans.src.service.FinTrncashBalanceService;

public class FinTrncashBalanceRun extends
BaseRun<FinTrncashBalance,FinTrncashBalanceService,FinTrncashBalanceDest,FinTrncashBalanceDestService> {

@Override
protected List<FinTrncashBalance> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinTrncashBalance> bList, int numOfBulkRecord) {
 List<FinTrncashBalanceDest> ftbdList = new ArrayList<>();
 for(FinTrncashBalance ftb : bList) {
   FinTrncashBalanceDest ftbd = new FinTrncashBalanceDest();
   try {
     BeanUtils.copyProperties(ftbd, ftb);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ftbdList.add(ftbd);
 }
 if(ftbdList.size() > 0)
   service2.save(ftbdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}