package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstPositionDest;
import com.safasoft.pentaho.datatrans.dest.service.HrMstPositionDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrMstPosition;
import com.safasoft.pentaho.datatrans.src.service.HrMstPositionService;

public class HrMstPositionRun extends
BaseRun<HrMstPosition,HrMstPositionService,HrMstPositionDest,HrMstPositionDestService> {

@Override
protected List<HrMstPosition> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrMstPosition> bList, int numOfBulkRecord) {
 List<HrMstPositionDest> hmpdList = new ArrayList<>();
 for(HrMstPosition hmp : bList) {
   HrMstPositionDest hmpd = new HrMstPositionDest();
   try {
     BeanUtils.copyProperties(hmpd, hmp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hmpdList.add(hmpd);
 }
 if(hmpdList.size() > 0)
   service2.save(hmpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}