package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghTrnVisitHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghTrnVisitHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghTrnVisitHdr;
import com.safasoft.pentaho.datatrans.src.service.CmTghTrnVisitHdrService;

public class CmTghTrnVisitHdrRun extends
BaseRun<CmTghTrnVisitHdr,CmTghTrnVisitHdrService,CmTghTrnVisitHdrDest,CmTghTrnVisitHdrDestService> {

@Override
protected List<CmTghTrnVisitHdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghTrnVisitHdr> bList, int numOfBulkRecord) {
 List<CmTghTrnVisitHdrDest> cttvhdList = new ArrayList<>();
 for(CmTghTrnVisitHdr cttvh : bList) {
   CmTghTrnVisitHdrDest cttvhd = new CmTghTrnVisitHdrDest();
   try {
     BeanUtils.copyProperties(cttvhd, cttvh);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   cttvhdList.add(cttvhd);
 }
 if(cttvhdList.size() > 0)
   service2.save(cttvhdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}