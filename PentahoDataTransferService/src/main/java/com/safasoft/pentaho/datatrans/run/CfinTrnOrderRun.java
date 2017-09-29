package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnOrderDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnOrderDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTrnOrder;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnOrderService;

public class CfinTrnOrderRun extends
BaseRun<CfinTrnOrder,CfinTrnOrderService,CfinTrnOrderDest,CfinTrnOrderDestService> {

@Override
protected List<CfinTrnOrder> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTrnOrder> bList, int numOfBulkRecord) {
 List<CfinTrnOrderDest> ctodList = new ArrayList<>();
 for(CfinTrnOrder cto : bList) {
   CfinTrnOrderDest ctod = new CfinTrnOrderDest();
   try {
     BeanUtils.copyProperties(ctod, cto);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctodList.add(ctod);
 }
 if(ctodList.size() > 0)
   service2.save(ctodList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}