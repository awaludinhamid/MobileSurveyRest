package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiContractDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiContractDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiContract;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiContractService;

public class CfinTrnRiContractRun extends
BaseRun<CfinTrnRiContract,CfinTrnRiContractService,CfinTrnRiContractDest,CfinTrnRiContractDestService> {

@Override
protected List<CfinTrnRiContract> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnRiContract> bList, int numOfBulkRecord) {
 List<CfinTrnRiContractDest> ctrcdList = new ArrayList<>();
 for(CfinTrnRiContract ctrc : bList) {
   CfinTrnRiContractDest ctrcd = new CfinTrnRiContractDest();
   try {
     BeanUtils.copyProperties(ctrcd, ctrc);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctrcdList.add(ctrcd);
 }
 if(ctrcdList.size() > 0)
   service2.save(ctrcdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}