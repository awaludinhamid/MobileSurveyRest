package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPitstopDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPitstopDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPitstop;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPitstopService;

public class CmTghMstPitstopRun extends
BaseRun<CmTghMstPitstop,CmTghMstPitstopService,CmTghMstPitstopDest,CmTghMstPitstopDestService> {

@Override
protected List<CmTghMstPitstop> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstPitstop> bList, int numOfBulkRecord) {
 List<CmTghMstPitstopDest> ctmpdList = new ArrayList<>();
 for(CmTghMstPitstop ctmp : bList) {
   CmTghMstPitstopDest ctmpd = new CmTghMstPitstopDest();
   try {
     BeanUtils.copyProperties(ctmpd, ctmp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmpdList.add(ctmpd);
 }
 if(ctmpdList.size() > 0)
   service2.save(ctmpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}