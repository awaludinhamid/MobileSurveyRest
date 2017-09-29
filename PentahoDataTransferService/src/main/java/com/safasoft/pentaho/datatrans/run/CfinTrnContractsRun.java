package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnContractsDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnContractsDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnContracts;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnContractsService;

public class CfinTrnContractsRun extends
BaseRun<CfinTrnContracts,CfinTrnContractsService,CfinTrnContractsDest,CfinTrnContractsDestService> {

@Override
protected List<CfinTrnContracts> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnContracts> bList, int numOfBulkRecord) {
 List<CfinTrnContractsDest> ctcdList = new ArrayList<>();
 for(CfinTrnContracts ctc : bList) {
   CfinTrnContractsDest ctcd = new CfinTrnContractsDest();
   try {
     BeanUtils.copyProperties(ctcd, ctc);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctcdList.add(ctcd);
 }
 if(ctcdList.size() > 0)
   service2.save(ctcdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}