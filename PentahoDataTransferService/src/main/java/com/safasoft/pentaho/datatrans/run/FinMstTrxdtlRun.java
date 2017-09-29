package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstTrxdtlDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstTrxdtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstTrxdtl;
import com.safasoft.pentaho.datatrans.src.service.FinMstTrxdtlService;

public class FinMstTrxdtlRun extends
BaseRun<FinMstTrxdtl,FinMstTrxdtlService,FinMstTrxdtlDest,FinMstTrxdtlDestService> {

@Override
protected List<FinMstTrxdtl> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstTrxdtl> bList, int numOfBulkRecord) {
 List<FinMstTrxdtlDest> fmtdList = new ArrayList<>();
 for(FinMstTrxdtl fmt : bList) {
   FinMstTrxdtlDest fmtd = new FinMstTrxdtlDest();
   try {
     BeanUtils.copyProperties(fmtd, fmt);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fmtdList.add(fmtd);
 }
 if(fmtdList.size() > 0)
   service2.save(fmtdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}