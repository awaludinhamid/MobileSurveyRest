package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstLkpParamDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstLkpParamDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstLkpParam;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstLkpParamService;

public class CmTghMstLkpParamRun extends
BaseRun<CmTghMstLkpParam,CmTghMstLkpParamService,CmTghMstLkpParamDest,CmTghMstLkpParamDestService> {

@Override
protected List<CmTghMstLkpParam> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstLkpParam> bList, int numOfBulkRecord) {
 List<CmTghMstLkpParamDest> ctmlpdList = new ArrayList<>();
 for(CmTghMstLkpParam ctmlp : bList) {
   CmTghMstLkpParamDest ctmlpd = new CmTghMstLkpParamDest();
   try {
     BeanUtils.copyProperties(ctmlpd, ctmlp);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmlpdList.add(ctmlpd);
 }
 if(ctmlpdList.size() > 0)
   service2.save(ctmlpdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}