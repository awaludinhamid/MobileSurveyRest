package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiRepayHistoryDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiRepayHistoryDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiRepayHistory;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiRepayHistoryService;

public class CfinTrnRiRepayHistoryRun extends
BaseRun<CfinTrnRiRepayHistory,CfinTrnRiRepayHistoryService,CfinTrnRiRepayHistoryDest,CfinTrnRiRepayHistoryDestService> {

@Override
protected List<CfinTrnRiRepayHistory> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnRiRepayHistory> bList, int numOfBulkRecord) {
 List<CfinTrnRiRepayHistoryDest> ctrrhdList = new ArrayList<>();
 for(CfinTrnRiRepayHistory ctrrh : bList) {
   CfinTrnRiRepayHistoryDest ctrrhd = new CfinTrnRiRepayHistoryDest();
   try {
     BeanUtils.copyProperties(ctrrhd, ctrrh);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctrrhdList.add(ctrrhd);
 }
 if(ctrrhdList.size() > 0)
   service2.save(ctrrhdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}