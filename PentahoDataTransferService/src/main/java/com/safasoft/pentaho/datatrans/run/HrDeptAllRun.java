package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrDeptAllDest;
import com.safasoft.pentaho.datatrans.dest.service.HrDeptAllDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrDeptAll;
import com.safasoft.pentaho.datatrans.src.service.HrDeptAllService;

public class HrDeptAllRun extends
BaseRun<HrDeptAll,HrDeptAllService,HrDeptAllDest,HrDeptAllDestService> {

@Override
protected List<HrDeptAll> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrDeptAll> bList, int numOfBulkRecord) {
 List<HrDeptAllDest> hdadList = new ArrayList<>();
 for(HrDeptAll hda : bList) {
   HrDeptAllDest hdad = new HrDeptAllDest();
   try {
     BeanUtils.copyProperties(hdad, hda);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hdadList.add(hdad);
 }
 if(hdadList.size() > 0)
   service2.save(hdadList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}