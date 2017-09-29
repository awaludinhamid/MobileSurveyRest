package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiMemoDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiMemoDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiMemo;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiMemoService;

public class CfinTrnRiMemoRun extends
BaseRun<CfinTrnRiMemo,CfinTrnRiMemoService,CfinTrnRiMemoDest,CfinTrnRiMemoDestService> {

@Override
protected List<CfinTrnRiMemo> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnRiMemo> bList, int numOfBulkRecord) {
 List<CfinTrnRiMemoDest> ctrmdList = new ArrayList<>();
 for(CfinTrnRiMemo ctrm : bList) {
   CfinTrnRiMemoDest ctrmd = new CfinTrnRiMemoDest();
   try {
     BeanUtils.copyProperties(ctrmd, ctrm);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctrmdList.add(ctrmd);
 }
 if(ctrmdList.size() > 0)
   service2.save(ctrmdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}