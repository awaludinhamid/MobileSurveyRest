package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstPymtcardDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstPymtcardDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstPymtcard;
import com.safasoft.pentaho.datatrans.src.service.FinMstPymtcardService;

public class FinMstPymtcardRun extends
BaseRun<FinMstPymtcard,FinMstPymtcardService,FinMstPymtcardDest,FinMstPymtcardDestService> {

@Override
protected List<FinMstPymtcard> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstPymtcard> bList, int numOfBulkRecord) {
 List<FinMstPymtcardDest> fmpdList = new ArrayList<>();
 for(FinMstPymtcard fmp : bList) {
   FinMstPymtcardDest fmpd = new FinMstPymtcardDest();
   try {
     BeanUtils.copyProperties(fmpd, fmp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fmpdList.add(fmpd);
 }
 if(fmpdList.size() > 0)
   service2.save(fmpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}