package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinInvhdrMstparamDest;
import com.safasoft.pentaho.datatrans.dest.service.FinInvhdrMstparamDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinInvhdrMstparam;
import com.safasoft.pentaho.datatrans.src.service.FinInvhdrMstparamService;

public class FinInvhdrMstparamRun extends
BaseRun<FinInvhdrMstparam,FinInvhdrMstparamService,FinInvhdrMstparamDest,FinInvhdrMstparamDestService> {

@Override
protected List<FinInvhdrMstparam> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinInvhdrMstparam> bList, int numOfBulkRecord) {
 List<FinInvhdrMstparamDest> fimdList = new ArrayList<>();
 for(FinInvhdrMstparam fim : bList) {
   FinInvhdrMstparamDest fimd = new FinInvhdrMstparamDest();
   try {
     BeanUtils.copyProperties(fimd, fim);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fimdList.add(fimd);
 }
 if(fimdList.size() > 0)
   service2.save(fimdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}