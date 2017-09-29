package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvReceivedDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvReceivedDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvReceivedDtl;
import com.safasoft.pentaho.datatrans.src.service.RinvReceivedDtlService;

public class RinvReceivedDtlRun extends
BaseRun<RinvReceivedDtl,RinvReceivedDtlService,RinvReceivedDtlDest,RinvReceivedDtlDestService> {

@Override
protected List<RinvReceivedDtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvReceivedDtl> bList, int numOfBulkRecord) {
 List<RinvReceivedDtlDest> rrddList = new ArrayList<>();
 for(RinvReceivedDtl rrd : bList) {
   RinvReceivedDtlDest rrdd = new RinvReceivedDtlDest();
   try {
     BeanUtils.copyProperties(rrdd, rrd);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   rrddList.add(rrdd);
 }
 if(rrddList.size() > 0)
   service2.save(rrddList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}