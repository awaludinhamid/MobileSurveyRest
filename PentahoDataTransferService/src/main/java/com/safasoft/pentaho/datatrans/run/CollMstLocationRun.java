package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CollMstLocationDest;
import com.safasoft.pentaho.datatrans.dest.service.CollMstLocationDestService;
import com.safasoft.pentaho.datatrans.src.bean.CollMstLocation;
import com.safasoft.pentaho.datatrans.src.service.CollMstLocationService;

public class CollMstLocationRun extends
BaseRun<CollMstLocation,CollMstLocationService,CollMstLocationDest,CollMstLocationDestService> {

@Override
protected List<CollMstLocation> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CollMstLocation> bList, int numOfBulkRecord) {
 List<CollMstLocationDest> cmldList = new ArrayList<>();
 for(CollMstLocation cml : bList) {
   CollMstLocationDest cmld = new CollMstLocationDest();
   try {
     BeanUtils.copyProperties(cmld, cml);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   cmldList.add(cmld);
 }
 if(cmldList.size() > 0)
   service2.save(cmldList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}