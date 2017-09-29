package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstJobDest;
import com.safasoft.pentaho.datatrans.dest.service.HrMstJobDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrMstJob;
import com.safasoft.pentaho.datatrans.src.service.HrMstJobService;

public class HrMstJobRun extends
BaseRun<HrMstJob,HrMstJobService,HrMstJobDest,HrMstJobDestService> {

@Override
protected List<HrMstJob> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrMstJob> bList, int numOfBulkRecord) {
 List<HrMstJobDest> hmjdList = new ArrayList<>();
 for(HrMstJob hmj : bList) {
   HrMstJobDest hmjd = new HrMstJobDest();
   try {
     BeanUtils.copyProperties(hmjd, hmj);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hmjdList.add(hmjd);
 }
 if(hmjdList.size() > 0)
   service2.save(hmjdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}