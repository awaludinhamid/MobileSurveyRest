package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvOutHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvOutHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvOutHdr;
import com.safasoft.pentaho.datatrans.src.service.RinvOutHdrService;

public class RinvOutHdrRun extends
BaseRun<RinvOutHdr,RinvOutHdrService,RinvOutHdrDest,RinvOutHdrDestService> {

@Override
protected List<RinvOutHdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvOutHdr> bList, int numOfBulkRecord) {
 List<RinvOutHdrDest> rohdList = new ArrayList<>();
 for(RinvOutHdr roh : bList) {
   RinvOutHdrDest rohd = new RinvOutHdrDest();
   try {
     BeanUtils.copyProperties(rohd, roh);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   rohdList.add(rohd);
 }
 if(rohdList.size() > 0)
   service2.save(rohdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}