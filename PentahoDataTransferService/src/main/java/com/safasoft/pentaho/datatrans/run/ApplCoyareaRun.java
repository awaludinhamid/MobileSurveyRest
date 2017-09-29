package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyareaDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCoyareaDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCoyarea;
import com.safasoft.pentaho.datatrans.src.service.ApplCoyareaService;

public class ApplCoyareaRun extends
BaseRun<ApplCoyarea,ApplCoyareaService,ApplCoyareaDest,ApplCoyareaDestService> {

@Override
protected List<ApplCoyarea> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<ApplCoyarea> bList, int numOfBulkRecord) {
 List<ApplCoyareaDest> acdList = new ArrayList<>();
 for(ApplCoyarea ac : bList) {
   ApplCoyareaDest acd = new ApplCoyareaDest();
   try {
     BeanUtils.copyProperties(acd, ac);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   acdList.add(acd);
 }
 if(acdList.size() > 0)
   service2.save(acdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}