package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstGroupCoahdrDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstGroupCoahdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstGroupCoahdr;
import com.safasoft.pentaho.datatrans.src.service.FinMstGroupCoahdrService;

public class FinMstGroupCoahdrRun extends
BaseRun<FinMstGroupCoahdr,FinMstGroupCoahdrService,FinMstGroupCoahdrDest,FinMstGroupCoahdrDestService> {

@Override
protected List<FinMstGroupCoahdr> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstGroupCoahdr> bList, int numOfBulkRecord) {
 List<FinMstGroupCoahdrDest> fmgcdList = new ArrayList<>();
 for(FinMstGroupCoahdr fmgc : bList) {
   FinMstGroupCoahdrDest fmgcd = new FinMstGroupCoahdrDest();
   try {
     BeanUtils.copyProperties(fmgcd, fmgc);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fmgcdList.add(fmgcd);
 }
 if(fmgcdList.size() > 0)
   service2.save(fmgcdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}