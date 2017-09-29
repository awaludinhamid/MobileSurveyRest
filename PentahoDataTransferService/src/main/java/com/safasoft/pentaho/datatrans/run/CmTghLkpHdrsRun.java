package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghLkpHdrsDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghLkpHdrsDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghLkpHdrs;
import com.safasoft.pentaho.datatrans.src.service.CmTghLkpHdrsService;

public class CmTghLkpHdrsRun extends
BaseRun<CmTghLkpHdrs,CmTghLkpHdrsService,CmTghLkpHdrsDest,CmTghLkpHdrsDestService> {

@Override
protected List<CmTghLkpHdrs> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghLkpHdrs> bList, int numOfBulkRecord) {
 List<CmTghLkpHdrsDest> ctlhdList = new ArrayList<>();
 for(CmTghLkpHdrs ctlh : bList) {
   CmTghLkpHdrsDest ctlhd = new CmTghLkpHdrsDest();
   try {
     BeanUtils.copyProperties(ctlhd, ctlh);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctlhdList.add(ctlhd);
 }
 if(ctlhdList.size() > 0)
   service2.save(ctlhdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}