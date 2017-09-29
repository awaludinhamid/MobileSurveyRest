package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPrioritiesDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPrioritiesDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPriorities;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPrioritiesService;

public class CmTghMstPrioritiesRun extends
BaseRun<CmTghMstPriorities,CmTghMstPrioritiesService,CmTghMstPrioritiesDest,CmTghMstPrioritiesDestService> {

@Override
protected List<CmTghMstPriorities> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstPriorities> bList, int numOfBulkRecord) {
 List<CmTghMstPrioritiesDest> ctmpdList = new ArrayList<>();
 for(CmTghMstPriorities ctmp : bList) {
   CmTghMstPrioritiesDest ctmpd = new CmTghMstPrioritiesDest();
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