package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrPeopleAssignmentDest;
import com.safasoft.pentaho.datatrans.dest.service.HrPeopleAssignmentDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrPeopleAssignment;
import com.safasoft.pentaho.datatrans.src.service.HrPeopleAssignmentService;

public class HrPeopleAssignmentRun extends
BaseRun<HrPeopleAssignment,HrPeopleAssignmentService,HrPeopleAssignmentDest,HrPeopleAssignmentDestService> {

@Override
protected List<HrPeopleAssignment> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrPeopleAssignment> bList, int numOfBulkRecord) {
 List<HrPeopleAssignmentDest> hpadList = new ArrayList<>();
 for(HrPeopleAssignment hpa : bList) {
   HrPeopleAssignmentDest hpad = new HrPeopleAssignmentDest();
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