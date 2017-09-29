package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPkgsoldHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvPkgsoldHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvPkgsoldHdr;
import com.safasoft.pentaho.datatrans.src.service.RinvPkgsoldHdrService;

public class RinvPkgsoldHdrRun extends
BaseRun<RinvPkgsoldHdr,RinvPkgsoldHdrService,RinvPkgsoldHdrDest,RinvPkgsoldHdrDestService> {

@Override
protected List<RinvPkgsoldHdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvPkgsoldHdr> bList, int numOfBulkRecord) {
 List<RinvPkgsoldHdrDest> rphdList = new ArrayList<>();
 for(RinvPkgsoldHdr rph : bList) {
   RinvPkgsoldHdrDest rphd = new RinvPkgsoldHdrDest();
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