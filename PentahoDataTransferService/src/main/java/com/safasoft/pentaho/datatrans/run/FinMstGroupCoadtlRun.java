package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstGroupCoadtlDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstGroupCoadtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstGroupCoadtl;
import com.safasoft.pentaho.datatrans.src.service.FinMstGroupCoadtlService;

public class FinMstGroupCoadtlRun extends
BaseRun<FinMstGroupCoadtl,FinMstGroupCoadtlService,FinMstGroupCoadtlDest,FinMstGroupCoadtlDestService> {

@Override
protected List<FinMstGroupCoadtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstGroupCoadtl> bList, int numOfBulkRecord) {
 List<FinMstGroupCoadtlDest> fmgcdList = new ArrayList<>();
 for(FinMstGroupCoadtl fmgc : bList) {
   FinMstGroupCoadtlDest fmgcd = new FinMstGroupCoadtlDest();
   try {
     BeanUtils.copyProperties(fmgcd, fmgc);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fmgcdList.add(fmgcd);
 }
 if(fmgcdList.size() > 0)
   service2.save(fmgcdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}