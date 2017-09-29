package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTerminationDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTerminationDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTermination;
import com.safasoft.pentaho.datatrans.src.service.CfinTerminationService;

public class CfinTerminationRun extends
BaseRun<CfinTermination,CfinTerminationService,CfinTerminationDest,CfinTerminationDestService> {

@Override
protected List<CfinTermination> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTermination> bList, int numOfBulkRecord) {
 List<CfinTerminationDest> ctdList = new ArrayList<>();
 for(CfinTermination ct : bList) {
   CfinTerminationDest ctd = new CfinTerminationDest();
   try {
     BeanUtils.copyProperties(ctd, ct);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctdList.add(ctd);
 }
 if(ctdList.size() > 0)
   service2.save(ctdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}