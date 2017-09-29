package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiLkriDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiLkriDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiLkriDtl;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiLkriDtlService;

public class CfinTrnRiLkriDtlRun extends
BaseRun<CfinTrnRiLkriDtl,CfinTrnRiLkriDtlService,CfinTrnRiLkriDtlDest,CfinTrnRiLkriDtlDestService> {

@Override
protected List<CfinTrnRiLkriDtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnRiLkriDtl> bList, int numOfBulkRecord) {
 List<CfinTrnRiLkriDtlDest> ctrlddList = new ArrayList<>();
 for(CfinTrnRiLkriDtl ctrld : bList) {
   CfinTrnRiLkriDtlDest ctrldd = new CfinTrnRiLkriDtlDest();
   try {
     BeanUtils.copyProperties(ctrldd, ctrld);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctrlddList.add(ctrldd);
 }
 if(ctrlddList.size() > 0)
   service2.save(ctrlddList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}