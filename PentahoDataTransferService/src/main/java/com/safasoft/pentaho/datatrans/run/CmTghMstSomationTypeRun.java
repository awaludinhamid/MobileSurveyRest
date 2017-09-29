package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstSomationTypeDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstSomationTypeDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstSomationType;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstSomationTypeService;

public class CmTghMstSomationTypeRun extends
BaseRun<CmTghMstSomationType,CmTghMstSomationTypeService,CmTghMstSomationTypeDest,CmTghMstSomationTypeDestService> {

@Override
protected List<CmTghMstSomationType> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstSomationType> bList, int numOfBulkRecord) {
 List<CmTghMstSomationTypeDest> ctmstdList = new ArrayList<>();
 for(CmTghMstSomationType ctmst : bList) {
   CmTghMstSomationTypeDest ctmstd = new CmTghMstSomationTypeDest();
   try {
     BeanUtils.copyProperties(ctmstd, ctmst);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmstdList.add(ctmstd);
 }
 if(ctmstdList.size() > 0)
   service2.save(ctmstdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}