package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTbSaldoDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinTbSaldoDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinTbSaldo;
import com.safasoft.pentaho.datatrans.src.service.CfinTbSaldoService;

public class CfinTbSaldoRun extends
BaseRun<CfinTbSaldo,CfinTbSaldoService,CfinTbSaldoDest,CfinTbSaldoDestService> {

@Override
protected List<CfinTbSaldo> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<CfinTbSaldo> bList, int numOfBulkRecord) {
 List<CfinTbSaldoDest> ctsdList = new ArrayList<>();
 for(CfinTbSaldo cts : bList) {
   CfinTbSaldoDest ctsd = new CfinTbSaldoDest();
   try {
     BeanUtils.copyProperties(ctsd, cts);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   ctsdList.add(ctsd);
 }
 if(ctsdList.size() > 0)
   service2.save(ctsdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}