package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvOutDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvOutDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvOutDtl;
import com.safasoft.pentaho.datatrans.src.service.RinvOutDtlService;

public class RinvOutDtlRun extends
BaseRun<RinvOutDtl,RinvOutDtlService,RinvOutDtlDest,RinvOutDtlDestService> {

@Override
protected List<RinvOutDtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvOutDtl> bList, int numOfBulkRecord) {
 List<RinvOutDtlDest> roddList = new ArrayList<>();
 for(RinvOutDtl rod : bList) {
   RinvOutDtlDest rodd = new RinvOutDtlDest();
   try {
     BeanUtils.copyProperties(rodd, rod);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   roddList.add(rodd);
 }
 if(roddList.size() > 0)
   service2.save(roddList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}