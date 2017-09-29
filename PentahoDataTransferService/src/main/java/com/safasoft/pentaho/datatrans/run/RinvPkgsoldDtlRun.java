package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPkgsoldDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.RinvPkgsoldDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.RinvPkgsoldDtl;
import com.safasoft.pentaho.datatrans.src.service.RinvPkgsoldDtlService;

public class RinvPkgsoldDtlRun extends
BaseRun<RinvPkgsoldDtl,RinvPkgsoldDtlService,RinvPkgsoldDtlDest,RinvPkgsoldDtlDestService> {

@Override
protected List<RinvPkgsoldDtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<RinvPkgsoldDtl> bList, int numOfBulkRecord) {
 List<RinvPkgsoldDtlDest> rpddList = new ArrayList<>();
 for(RinvPkgsoldDtl rpd : bList) {
   RinvPkgsoldDtlDest rpdd = new RinvPkgsoldDtlDest();
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