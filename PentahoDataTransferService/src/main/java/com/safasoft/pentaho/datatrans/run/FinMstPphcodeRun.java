package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstPphcodeDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstPphcodeDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstPphcode;
import com.safasoft.pentaho.datatrans.src.service.FinMstPphcodeService;

public class FinMstPphcodeRun extends
BaseRun<FinMstPphcode,FinMstPphcodeService,FinMstPphcodeDest,FinMstPphcodeDestService> {

@Override
protected List<FinMstPphcode> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstPphcode> bList, int numOfBulkRecord) {
 List<FinMstPphcodeDest> fmpdList = new ArrayList<>();
 for(FinMstPphcode fmp : bList) {
   FinMstPphcodeDest fmpd = new FinMstPphcodeDest();
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