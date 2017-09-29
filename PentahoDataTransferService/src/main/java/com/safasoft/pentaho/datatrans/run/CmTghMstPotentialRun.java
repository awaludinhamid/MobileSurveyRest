package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPotentialDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPotentialDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPotential;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPotentialService;

public class CmTghMstPotentialRun extends
BaseRun<CmTghMstPotential,CmTghMstPotentialService,CmTghMstPotentialDest,CmTghMstPotentialDestService> {

@Override
protected List<CmTghMstPotential> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstPotential> bList, int numOfBulkRecord) {
 List<CmTghMstPotentialDest> ctmpdList = new ArrayList<>();
 for(CmTghMstPotential ctmp : bList) {
   CmTghMstPotentialDest ctmpd = new CmTghMstPotentialDest();
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