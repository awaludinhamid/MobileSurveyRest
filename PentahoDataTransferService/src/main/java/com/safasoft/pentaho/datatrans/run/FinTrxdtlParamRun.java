package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrxdtlParamDest;
import com.safasoft.pentaho.datatrans.dest.service.FinTrxdtlParamDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinTrxdtlParam;
import com.safasoft.pentaho.datatrans.src.service.FinTrxdtlParamService;

public class FinTrxdtlParamRun extends
BaseRun<FinTrxdtlParam,FinTrxdtlParamService,FinTrxdtlParamDest,FinTrxdtlParamDestService> {

@Override
protected List<FinTrxdtlParam> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinTrxdtlParam> bList, int numOfBulkRecord) {
 List<FinTrxdtlParamDest> ftpdList = new ArrayList<>();
 for(FinTrxdtlParam ftp : bList) {
   FinTrxdtlParamDest ftpd = new FinTrxdtlParamDest();
   try {
     BeanUtils.copyProperties(ftpd, ftp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ftpdList.add(ftpd);
 }
 if(ftpdList.size() > 0)
   service2.save(ftpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}