package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrnbankBalanceDest;
import com.safasoft.pentaho.datatrans.dest.service.FinTrnbankBalanceDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinTrnbankBalance;
import com.safasoft.pentaho.datatrans.src.service.FinTrnbankBalanceService;

public class FinTrnbankBalanceRun extends
BaseRun<FinTrnbankBalance,FinTrnbankBalanceService,FinTrnbankBalanceDest,FinTrnbankBalanceDestService> {

@Override
protected List<FinTrnbankBalance> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinTrnbankBalance> bList, int numOfBulkRecord) {
 List<FinTrnbankBalanceDest> ftbdList = new ArrayList<>();
 for(FinTrnbankBalance ftb : bList) {
   FinTrnbankBalanceDest ftbd = new FinTrnbankBalanceDest();
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