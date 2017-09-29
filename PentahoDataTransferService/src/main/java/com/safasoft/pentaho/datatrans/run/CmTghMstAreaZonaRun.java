package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstAreaZonaDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstAreaZonaDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstAreaZona;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstAreaZonaService;

public class CmTghMstAreaZonaRun extends
BaseRun<CmTghMstAreaZona,CmTghMstAreaZonaService,CmTghMstAreaZonaDest,CmTghMstAreaZonaDestService> {

@Override
protected List<CmTghMstAreaZona> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstAreaZona> bList, int numOfBulkRecord) {
 List<CmTghMstAreaZonaDest> ctmazdList = new ArrayList<>();
 for(CmTghMstAreaZona ctmaz : bList) {
   CmTghMstAreaZonaDest ctmazd = new CmTghMstAreaZonaDest();
   try {
     BeanUtils.copyProperties(ctmazd, ctmaz);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmazdList.add(ctmazd);
 }
 if(ctmazdList.size() > 0)
   service2.save(ctmazdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}