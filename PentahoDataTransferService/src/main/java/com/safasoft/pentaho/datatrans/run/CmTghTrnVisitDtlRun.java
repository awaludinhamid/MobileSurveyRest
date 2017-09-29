package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghTrnVisitDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghTrnVisitDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghTrnVisitDtl;
import com.safasoft.pentaho.datatrans.src.service.CmTghTrnVisitDtlService;

public class CmTghTrnVisitDtlRun extends
BaseRun<CmTghTrnVisitDtl,CmTghTrnVisitDtlService,CmTghTrnVisitDtlDest,CmTghTrnVisitDtlDestService> {

@Override
protected List<CmTghTrnVisitDtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghTrnVisitDtl> bList, int numOfBulkRecord) {
 List<CmTghTrnVisitDtlDest> cttvddList = new ArrayList<>();
 for(CmTghTrnVisitDtl cttvd : bList) {
   CmTghTrnVisitDtlDest cttvdd = new CmTghTrnVisitDtlDest();
   try {
     BeanUtils.copyProperties(cttvdd, cttvd);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   cttvddList.add(cttvdd);
 }
 if(cttvddList.size() > 0)
   service2.save(cttvddList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}