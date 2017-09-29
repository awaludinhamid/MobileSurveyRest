package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPatternDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPatternDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPattern;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPatternService;

public class CmTghMstPatternRun extends
BaseRun<CmTghMstPattern,CmTghMstPatternService,CmTghMstPatternDest,CmTghMstPatternDestService> {

@Override
protected List<CmTghMstPattern> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstPattern> bList, int numOfBulkRecord) {
 List<CmTghMstPatternDest> ctmpdList = new ArrayList<>();
 for(CmTghMstPattern ctmp : bList) {
   CmTghMstPatternDest ctmpd = new CmTghMstPatternDest();
   try {
     BeanUtils.copyProperties(ctmpd, ctmp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmpdList.add(ctmpd);
 }
 if(ctmpdList.size() > 0)
   service2.save(ctmpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}