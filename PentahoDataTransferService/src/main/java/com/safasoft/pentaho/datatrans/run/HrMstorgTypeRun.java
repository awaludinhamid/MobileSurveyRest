package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstorgTypeDest;
import com.safasoft.pentaho.datatrans.dest.service.HrMstorgTypeDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrMstorgType;
import com.safasoft.pentaho.datatrans.src.service.HrMstorgTypeService;

public class HrMstorgTypeRun extends
BaseRun<HrMstorgType,HrMstorgTypeService,HrMstorgTypeDest,HrMstorgTypeDestService> {

@Override
protected List<HrMstorgType> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrMstorgType> bList, int numOfBulkRecord) {
 List<HrMstorgTypeDest> hmtdList = new ArrayList<>();
 for(HrMstorgType hmt : bList) {
   HrMstorgTypeDest hmtd = new HrMstorgTypeDest();
   try {
     BeanUtils.copyProperties(hmtd, hmt);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hmtdList.add(hmtd);
 }
 if(hmtdList.size() > 0)
   service2.save(hmtdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}