package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstCardAccountDest;
import com.safasoft.pentaho.datatrans.dest.service.FinMstCardAccountDestService;
import com.safasoft.pentaho.datatrans.src.bean.FinMstCardAccount;
import com.safasoft.pentaho.datatrans.src.service.FinMstCardAccountService;

public class FinMstCardAccountRun extends
BaseRun<FinMstCardAccount,FinMstCardAccountService,FinMstCardAccountDest,FinMstCardAccountDestService> {

@Override
protected List<FinMstCardAccount> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<FinMstCardAccount> bList, int numOfBulkRecord) {
 List<FinMstCardAccountDest> fmcadList = new ArrayList<>();
 for(FinMstCardAccount fmca : bList) {
   FinMstCardAccountDest fmcad = new FinMstCardAccountDest();
   try {
     BeanUtils.copyProperties(fmcad, fmca);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   fmcadList.add(fmcad);
 }
 if(fmcadList.size() > 0)
   service2.save(fmcadList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}