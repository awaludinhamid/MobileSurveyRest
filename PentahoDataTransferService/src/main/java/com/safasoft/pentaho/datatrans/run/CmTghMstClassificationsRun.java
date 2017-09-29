package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstClassificationsDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstClassificationsDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstClassifications;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstClassificationsService;

public class CmTghMstClassificationsRun extends
BaseRun<CmTghMstClassifications,CmTghMstClassificationsService,CmTghMstClassificationsDest,CmTghMstClassificationsDestService> {

@Override
protected List<CmTghMstClassifications> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstClassifications> bList, int numOfBulkRecord) {
 List<CmTghMstClassificationsDest> ctmcdList = new ArrayList<>();
 for(CmTghMstClassifications ctmc : bList) {
   CmTghMstClassificationsDest ctmcd = new CmTghMstClassificationsDest();
   try {
     BeanUtils.copyProperties(ctmcd, ctmc);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmcdList.add(ctmcd);
 }
 if(ctmcdList.size() > 0)
   service2.save(ctmcdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}