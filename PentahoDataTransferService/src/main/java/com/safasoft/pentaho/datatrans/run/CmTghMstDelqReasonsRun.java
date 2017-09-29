package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstDelqReasonsDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstDelqReasonsDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstDelqReasons;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstDelqReasonsService;

public class CmTghMstDelqReasonsRun extends
BaseRun<CmTghMstDelqReasons,CmTghMstDelqReasonsService,CmTghMstDelqReasonsDest,CmTghMstDelqReasonsDestService> {

@Override
protected List<CmTghMstDelqReasons> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstDelqReasons> bList, int numOfBulkRecord) {
 List<CmTghMstDelqReasonsDest> ctmdrdList = new ArrayList<>();
 for(CmTghMstDelqReasons ctmdr : bList) {
   CmTghMstDelqReasonsDest ctmdrd = new CmTghMstDelqReasonsDest();
   try {
     BeanUtils.copyProperties(ctmdrd, ctmdr);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmdrdList.add(ctmdrd);
 }
 if(ctmdrdList.size() > 0)
   service2.save(ctmdrdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}