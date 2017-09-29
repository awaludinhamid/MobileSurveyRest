package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrPeopleAllDest;
import com.safasoft.pentaho.datatrans.dest.service.HrPeopleAllDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrPeopleAll;
import com.safasoft.pentaho.datatrans.src.service.HrPeopleAllService;

public class HrPeopleAllRun extends
BaseRun<HrPeopleAll,HrPeopleAllService,HrPeopleAllDest,HrPeopleAllDestService> {

@Override
protected List<HrPeopleAll> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrPeopleAll> bList, int numOfBulkRecord) {
 List<HrPeopleAllDest> hpadList = new ArrayList<>();
 for(HrPeopleAll hpa : bList) {
   HrPeopleAllDest hpad = new HrPeopleAllDest();
   try {
     BeanUtils.copyProperties(hpad, hpa);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hpadList.add(hpad);
 }
 if(hpadList.size() > 0)
   service2.save(hpadList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}