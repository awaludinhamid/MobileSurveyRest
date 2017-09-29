package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstCfgacctDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstCfgacctDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstCfgacct;
import com.safasoft.pentaho.datatrans.src.service.CfinMstCfgacctService;

public class CfinMstCfgacctRun extends
BaseRun<CfinMstCfgacct,CfinMstCfgacctService,CfinMstCfgacctDest,CfinMstCfgacctDestService> {

@Override
protected List<CfinMstCfgacct> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinMstCfgacct> bList, int numOfBulkRecord) {
 List<CfinMstCfgacctDest> cmcdList = new ArrayList<>();
 for(CfinMstCfgacct cmc : bList) {
   CfinMstCfgacctDest cmcd = new CfinMstCfgacctDest();
   try {
     BeanUtils.copyProperties(cmcd, cmc);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   cmcdList.add(cmcd);
 }
 if(cmcdList.size() > 0)
   service2.save(cmcdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}