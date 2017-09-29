package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstUnitLocationDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstUnitLocationDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstUnitLocation;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstUnitLocationService;

public class CmTghMstUnitLocationRun extends
BaseRun<CmTghMstUnitLocation,CmTghMstUnitLocationService,CmTghMstUnitLocationDest,CmTghMstUnitLocationDestService> {

@Override
protected List<CmTghMstUnitLocation> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstUnitLocation> bList, int numOfBulkRecord) {
 List<CmTghMstUnitLocationDest> ctmuldList = new ArrayList<>();
 for(CmTghMstUnitLocation ctmul : bList) {
   CmTghMstUnitLocationDest ctmuld = new CmTghMstUnitLocationDest();
   try {
     BeanUtils.copyProperties(ctmuld, ctmul);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmuldList.add(ctmuld);
 }
 if(ctmuldList.size() > 0)
   service2.save(ctmuldList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}