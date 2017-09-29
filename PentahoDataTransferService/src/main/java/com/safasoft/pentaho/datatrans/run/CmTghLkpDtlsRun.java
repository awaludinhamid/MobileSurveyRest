package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghLkpDtlsDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghLkpDtlsDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghLkpDtls;
import com.safasoft.pentaho.datatrans.src.service.CmTghLkpDtlsService;

public class CmTghLkpDtlsRun extends
BaseRun<CmTghLkpDtls,CmTghLkpDtlsService,CmTghLkpDtlsDest,CmTghLkpDtlsDestService> {

@Override
protected List<CmTghLkpDtls> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghLkpDtls> bList, int numOfBulkRecord) {
 List<CmTghLkpDtlsDest> ctlddList = new ArrayList<>();
 for(CmTghLkpDtls ctld : bList) {
   CmTghLkpDtlsDest ctldd = new CmTghLkpDtlsDest();
   try {
     BeanUtils.copyProperties(ctldd, ctld);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctlddList.add(ctldd);
 }
 if(ctlddList.size() > 0)
   service2.save(ctlddList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}