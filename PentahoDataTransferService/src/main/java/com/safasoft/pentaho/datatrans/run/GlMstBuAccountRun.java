package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstBuAccountDest;
import com.safasoft.pentaho.datatrans.dest.service.GlMstBuAccountDestService;
import com.safasoft.pentaho.datatrans.src.bean.GlMstBuAccount;
import com.safasoft.pentaho.datatrans.src.service.GlMstBuAccountService;

public class GlMstBuAccountRun extends
BaseRun<GlMstBuAccount,GlMstBuAccountService,GlMstBuAccountDest,GlMstBuAccountDestService> {

@Override
protected List<GlMstBuAccount> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<GlMstBuAccount> bList, int numOfBulkRecord) {
 List<GlMstBuAccountDest> gmbadList = new ArrayList<>();
 for(GlMstBuAccount gmba : bList) {
   GlMstBuAccountDest gmbad = new GlMstBuAccountDest();
   try {
     BeanUtils.copyProperties(gmbad, gmba);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   gmbadList.add(gmbad);
 }
 if(gmbadList.size() > 0)
   service2.save(gmbadList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}