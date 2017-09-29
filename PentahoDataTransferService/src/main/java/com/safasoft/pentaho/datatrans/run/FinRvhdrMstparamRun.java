package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinRvhdrMstparamDest;
import com.safasoft.pentaho.datatrans.dest.service.FinRvhdrMstparamDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinRvhdrMstparam;
import com.safasoft.pentaho.datatrans.src.service.FinRvhdrMstparamService;

public class FinRvhdrMstparamRun extends
BaseRun<FinRvhdrMstparam,FinRvhdrMstparamService,FinRvhdrMstparamDest,FinRvhdrMstparamDestService> {

@Override
protected List<FinRvhdrMstparam> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinRvhdrMstparam> bList, int numOfBulkRecord) {
 List<FinRvhdrMstparamDest> frmdList = new ArrayList<>();
 for(FinRvhdrMstparam frm : bList) {
   FinRvhdrMstparamDest frmd = new FinRvhdrMstparamDest();
   try {
     BeanUtils.copyProperties(frmd, frm);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   frmdList.add(frmd);
 }
 if(frmdList.size() > 0)
   service2.save(frmdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}