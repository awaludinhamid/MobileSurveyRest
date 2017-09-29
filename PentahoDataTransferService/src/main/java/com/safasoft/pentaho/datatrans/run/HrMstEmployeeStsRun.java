package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstEmployeeStsDest;
import com.safasoft.pentaho.datatrans.dest.service.HrMstEmployeeStsDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrMstEmployeeSts;
import com.safasoft.pentaho.datatrans.src.service.HrMstEmployeeStsService;

public class HrMstEmployeeStsRun extends
BaseRun<HrMstEmployeeSts,HrMstEmployeeStsService,HrMstEmployeeStsDest,HrMstEmployeeStsDestService> {

@Override
protected List<HrMstEmployeeSts> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrMstEmployeeSts> bList, int numOfBulkRecord) {
 List<HrMstEmployeeStsDest> hmesdList = new ArrayList<>();
 for(HrMstEmployeeSts hmes : bList) {
   HrMstEmployeeStsDest hmesd = new HrMstEmployeeStsDest();
   try {
     BeanUtils.copyProperties(hmesd, hmes);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hmesdList.add(hmesd);
 }
 if(hmesdList.size() > 0)
   service2.save(hmesdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}