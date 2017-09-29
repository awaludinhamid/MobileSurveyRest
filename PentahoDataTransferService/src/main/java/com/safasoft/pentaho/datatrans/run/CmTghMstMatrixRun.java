package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstMatrixDest;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstMatrixDestService;
import com.safasoft.pentaho.datatrans.src.bean.CmTghMstMatrix;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstMatrixService;

public class CmTghMstMatrixRun extends
BaseRun<CmTghMstMatrix,CmTghMstMatrixService,CmTghMstMatrixDest,CmTghMstMatrixDestService> {

@Override
protected List<CmTghMstMatrix> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CmTghMstMatrix> bList, int numOfBulkRecord) {
 List<CmTghMstMatrixDest> ctmmdList = new ArrayList<>();
 for(CmTghMstMatrix ctmm : bList) {
   CmTghMstMatrixDest ctmmd = new CmTghMstMatrixDest();
   try {
     BeanUtils.copyProperties(ctmmd, ctmm);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctmmdList.add(ctmmd);
 }
 if(ctmmdList.size() > 0)
   service2.save(ctmmdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}