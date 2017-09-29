package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.GlPeriodDest;
import com.safasoft.pentaho.datatrans.dest.service.GlPeriodDestService;
import com.safasoft.pentaho.datatrans.src.bean.GlPeriod;
import com.safasoft.pentaho.datatrans.src.service.GlPeriodService;

public class GlPeriodRun extends
BaseRun<GlPeriod,GlPeriodService,GlPeriodDest,GlPeriodDestService> {

@Override
protected List<GlPeriod> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<GlPeriod> bList, int numOfBulkRecord) {
 List<GlPeriodDest> gpdList = new ArrayList<>();
 for(GlPeriod gp : bList) {
   GlPeriodDest gpd = new GlPeriodDest();
   try {
     BeanUtils.copyProperties(gpd, gp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   gpdList.add(gpd);
 }
 if(gpdList.size() > 0)
   service2.save(gpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}