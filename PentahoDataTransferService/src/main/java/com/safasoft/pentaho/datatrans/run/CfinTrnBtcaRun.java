package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnBtcaDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnBtcaDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnBtca;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnBtcaService;

public class CfinTrnBtcaRun extends
BaseRun<CfinTrnBtca,CfinTrnBtcaService,CfinTrnBtcaDest,CfinTrnBtcaDestService> {

@Override
protected List<CfinTrnBtca> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnBtca> bList, int numOfBulkRecord) {
 List<CfinTrnBtcaDest> ctbdList = new ArrayList<>();
 for(CfinTrnBtca ctb : bList) {
   CfinTrnBtcaDest ctbd = new CfinTrnBtcaDest();
   try {
     BeanUtils.copyProperties(ctbd, ctb);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctbdList.add(ctbd);
 }
 if(ctbdList.size() > 0)
   service2.save(ctbdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}