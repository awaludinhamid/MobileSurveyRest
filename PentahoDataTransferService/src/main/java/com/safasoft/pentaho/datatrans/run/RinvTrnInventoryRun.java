package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvTrnInventoryDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvTrnInventoryDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvTrnInventory;
import com.safasoft.pentaho.datatrans.src.service.RinvTrnInventoryService;

public class RinvTrnInventoryRun extends
BaseRun<RinvTrnInventory,RinvTrnInventoryService,RinvTrnInventoryDest,RinvTrnInventoryDestService> {

@Override
protected List<RinvTrnInventory> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvTrnInventory> bList, int numOfBulkRecord) {
 List<RinvTrnInventoryDest> rtidList = new ArrayList<>();
 for(RinvTrnInventory rti : bList) {
   RinvTrnInventoryDest rtid = new RinvTrnInventoryDest();
   try {
     BeanUtils.copyProperties(rtid, rti);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   rtidList.add(rtid);
 }
 if(rtidList.size() > 0)
   service2.save(rtidList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}