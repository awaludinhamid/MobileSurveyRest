package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvReceivedHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvReceivedHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvReceivedHdr;
import com.safasoft.pentaho.datatrans.src.service.RinvReceivedHdrService;

public class RinvReceivedHdrRun extends
BaseRun<RinvReceivedHdr,RinvReceivedHdrService,RinvReceivedHdrDest,RinvReceivedHdrDestService> {

@Override
protected List<RinvReceivedHdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvReceivedHdr> bList, int numOfBulkRecord) {
 List<RinvReceivedHdrDest> rrhdList = new ArrayList<>();
 for(RinvReceivedHdr rrh : bList) {
   RinvReceivedHdrDest rrhd = new RinvReceivedHdrDest();
   try {
     BeanUtils.copyProperties(rrhd, rrh);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   rrhdList.add(rrhd);
 }
 if(rrhdList.size() > 0)
   service2.save(rrhdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}