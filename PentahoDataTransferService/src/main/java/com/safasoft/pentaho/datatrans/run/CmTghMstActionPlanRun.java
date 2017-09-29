package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstActionPlanDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstActionPlanDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstActionPlan;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstActionPlanService;

public class CmTghMstActionPlanRun extends
BaseRun<CmTghMstActionPlan,CmTghMstActionPlanService,CmTghMstActionPlanDest,CmTghMstActionPlanDestService> {

@Override
protected List<CmTghMstActionPlan> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstActionPlan> bList, int numOfBulkRecord) {
 List<CmTghMstActionPlanDest> ctmapdList = new ArrayList<>();
 for(CmTghMstActionPlan ctmap : bList) {
   CmTghMstActionPlanDest ctmapd = new CmTghMstActionPlanDest();
   try {
     BeanUtils.copyProperties(ctmapd, ctmap);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmapdList.add(ctmapd);
 }
 if(ctmapdList.size() > 0)
   service2.save(ctmapdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}