package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPickupDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvPickupDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvPickupDtl;
import com.safasoft.pentaho.datatrans.src.service.RinvPickupDtlService;

public class RinvPickupDtlRun extends
BaseRun<RinvPickupDtl,RinvPickupDtlService,RinvPickupDtlDest,RinvPickupDtlDestService> {

@Override
protected List<RinvPickupDtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvPickupDtl> bList, int numOfBulkRecord) {
 List<RinvPickupDtlDest> rpddList = new ArrayList<>();
 for(RinvPickupDtl rpd : bList) {
   RinvPickupDtlDest rpdd = new RinvPickupDtlDest();
   try {
     BeanUtils.copyProperties(rpdd, rpd);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   rpddList.add(rpdd);
 }
 if(rpddList.size() > 0)
   service2.save(rpddList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}