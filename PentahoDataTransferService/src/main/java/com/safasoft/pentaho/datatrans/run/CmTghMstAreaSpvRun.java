package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstAreaSpvDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstAreaSpvDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstAreaSpv;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstAreaSpvService;

public class CmTghMstAreaSpvRun extends
BaseRun<CmTghMstAreaSpv,CmTghMstAreaSpvService,CmTghMstAreaSpvDest,CmTghMstAreaSpvDestService> {

@Override
protected List<CmTghMstAreaSpv> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstAreaSpv> bList, int numOfBulkRecord) {
 List<CmTghMstAreaSpvDest> ctmasdList = new ArrayList<>();
 for(CmTghMstAreaSpv ctmas : bList) {
   CmTghMstAreaSpvDest ctmasd = new CmTghMstAreaSpvDest();
   try {
     BeanUtils.copyProperties(ctmasd, ctmas);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmasdList.add(ctmasd);
 }
 if(ctmasdList.size() > 0)
   service2.save(ctmasdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}