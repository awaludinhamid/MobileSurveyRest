package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstCardIssuerDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstCardIssuerDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstCardIssuer;
import com.safasoft.pentaho.datatrans.src.service.FinMstCardIssuerService;

public class FinMstCardIssuerRun extends
BaseRun<FinMstCardIssuer,FinMstCardIssuerService,FinMstCardIssuerDest,FinMstCardIssuerDestService> {

@Override
protected List<FinMstCardIssuer> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstCardIssuer> bList, int numOfBulkRecord) {
 List<FinMstCardIssuerDest> fmcidList = new ArrayList<>();
 for(FinMstCardIssuer fmci : bList) {
   FinMstCardIssuerDest fmcid = new FinMstCardIssuerDest();
   try {
     BeanUtils.copyProperties(fmcid, fmci);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fmcidList.add(fmcid);
 }
 if(fmcidList.size() > 0)
   service2.save(fmcidList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}