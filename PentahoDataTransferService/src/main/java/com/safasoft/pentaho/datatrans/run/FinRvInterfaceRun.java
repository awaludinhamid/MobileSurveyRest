package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinRvInterfaceDest;
import com.safasoft.pentaho.datatrans.dest.service.FinRvInterfaceDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinRvInterface;
import com.safasoft.pentaho.datatrans.src.service.FinRvInterfaceService;

public class FinRvInterfaceRun extends
BaseRun<FinRvInterface,FinRvInterfaceService,FinRvInterfaceDest,FinRvInterfaceDestService> {

@Override
protected List<FinRvInterface> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinRvInterface> bList, int numOfBulkRecord) {
 List<FinRvInterfaceDest> fridList = new ArrayList<>();
 for(FinRvInterface fri : bList) {
   FinRvInterfaceDest frid = new FinRvInterfaceDest();
   try {
     BeanUtils.copyProperties(frid, fri);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fridList.add(frid);
 }
 if(fridList.size() > 0)
   service2.save(fridList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}