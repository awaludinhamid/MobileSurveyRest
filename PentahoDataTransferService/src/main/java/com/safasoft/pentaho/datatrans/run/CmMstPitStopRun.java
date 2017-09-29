package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmMstPitStopDest;
import com.safasoft.pentaho.datatrans.dest.service.CmMstPitStopDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmMstPitStop;
import com.safasoft.pentaho.datatrans.src.service.CmMstPitStopService;

public class CmMstPitStopRun extends
BaseRun<CmMstPitStop,CmMstPitStopService,CmMstPitStopDest,CmMstPitStopDestService> {

@Override
protected List<CmMstPitStop> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmMstPitStop> bList, int numOfBulkRecord) {
 List<CmMstPitStopDest> cmpsdList = new ArrayList<>();
 for(CmMstPitStop cmps : bList) {
   CmMstPitStopDest cmpsd = new CmMstPitStopDest();
   try {
     BeanUtils.copyProperties(cmpsd, cmps);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   cmpsdList.add(cmpsd);
 }
 if(cmpsdList.size() > 0)
   service2.save(cmpsdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}