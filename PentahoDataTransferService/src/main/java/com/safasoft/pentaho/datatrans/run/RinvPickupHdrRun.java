package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPickupHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvPickupHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvPickupHdr;
import com.safasoft.pentaho.datatrans.src.service.RinvPickupHdrService;

public class RinvPickupHdrRun extends
BaseRun<RinvPickupHdr,RinvPickupHdrService,RinvPickupHdrDest,RinvPickupHdrDestService> {

@Override
protected List<RinvPickupHdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvPickupHdr> bList, int numOfBulkRecord) {
 List<RinvPickupHdrDest> rphdList = new ArrayList<>();
 for(RinvPickupHdr rph : bList) {
   RinvPickupHdrDest rphd = new RinvPickupHdrDest();
   try {
     BeanUtils.copyProperties(rphd, rph);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   rphdList.add(rphd);
 }
 if(rphdList.size() > 0)
   service2.save(rphdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}