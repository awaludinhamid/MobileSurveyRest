package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstRelationDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstRelationDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstRelation;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstRelationService;

public class CmTghMstRelationRun extends
BaseRun<CmTghMstRelation,CmTghMstRelationService,CmTghMstRelationDest,CmTghMstRelationDestService> {

@Override
protected List<CmTghMstRelation> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstRelation> bList, int numOfBulkRecord) {
 List<CmTghMstRelationDest> ctmrdList = new ArrayList<>();
 for(CmTghMstRelation ctmr : bList) {
   CmTghMstRelationDest ctmrd = new CmTghMstRelationDest();
   try {
     BeanUtils.copyProperties(ctmrd, ctmr);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmrdList.add(ctmrd);
 }
 if(ctmrdList.size() > 0)
   service2.save(ctmrdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}