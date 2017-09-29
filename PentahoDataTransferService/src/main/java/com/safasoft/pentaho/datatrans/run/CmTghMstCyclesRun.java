package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstCyclesDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstCyclesDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstCycles;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstCyclesService;

public class CmTghMstCyclesRun extends
BaseRun<CmTghMstCycles,CmTghMstCyclesService,CmTghMstCyclesDest,CmTghMstCyclesDestService> {

@Override
protected List<CmTghMstCycles> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstCycles> bList, int numOfBulkRecord) {
 List<CmTghMstCyclesDest> ctmcdList = new ArrayList<>();
 for(CmTghMstCycles ctmc : bList) {
   CmTghMstCyclesDest ctmcd = new CmTghMstCyclesDest();
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