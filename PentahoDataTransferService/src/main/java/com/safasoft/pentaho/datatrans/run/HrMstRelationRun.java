package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstRelationDest;
import com.safasoft.pentaho.datatrans.dest.service.HrMstRelationDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrMstRelation;
import com.safasoft.pentaho.datatrans.src.service.HrMstRelationService;

public class HrMstRelationRun extends
BaseRun<HrMstRelation,HrMstRelationService,HrMstRelationDest,HrMstRelationDestService> {

@Override
protected List<HrMstRelation> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrMstRelation> bList, int numOfBulkRecord) {
 List<HrMstRelationDest> hmrdList = new ArrayList<>();
 for(HrMstRelation hmr : bList) {
   HrMstRelationDest hmrd = new HrMstRelationDest();
   try {
     BeanUtils.copyProperties(hmrd, hmr);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hmrdList.add(hmrd);
 }
 if(hmrdList.size() > 0)
   service2.save(hmrdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}