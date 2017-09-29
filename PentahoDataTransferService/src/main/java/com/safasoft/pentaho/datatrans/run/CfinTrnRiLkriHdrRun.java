package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiLkriHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiLkriHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiLkriHdr;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiLkriHdrService;

public class CfinTrnRiLkriHdrRun extends
BaseRun<CfinTrnRiLkriHdr,CfinTrnRiLkriHdrService,CfinTrnRiLkriHdrDest,CfinTrnRiLkriHdrDestService> {

@Override
protected List<CfinTrnRiLkriHdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnRiLkriHdr> bList, int numOfBulkRecord) {
 List<CfinTrnRiLkriHdrDest> ctrlhdList = new ArrayList<>();
 for(CfinTrnRiLkriHdr ctrlh : bList) {
   CfinTrnRiLkriHdrDest ctrlhd = new CfinTrnRiLkriHdrDest();
   try {
     BeanUtils.copyProperties(ctrlhd, ctrlh);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctrlhdList.add(ctrlhd);
 }
 if(ctrlhdList.size() > 0)
   service2.save(ctrlhdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}