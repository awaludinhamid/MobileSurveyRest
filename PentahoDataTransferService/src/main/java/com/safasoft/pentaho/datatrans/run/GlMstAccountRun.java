package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstAccountDest;
import com.safasoft.pentaho.datatrans.dest.service.GlMstAccountDestService;
import com.safasoft.pentaho.datatrans.src.bean.GlMstAccount;
import com.safasoft.pentaho.datatrans.src.service.GlMstAccountService;

public class GlMstAccountRun extends
BaseRun<GlMstAccount,GlMstAccountService,GlMstAccountDest,GlMstAccountDestService> {

@Override
protected List<GlMstAccount> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<GlMstAccount> bList, int numOfBulkRecord) {
 List<GlMstAccountDest> gmadList = new ArrayList<>();
 for(GlMstAccount gma : bList) {
   GlMstAccountDest gmad = new GlMstAccountDest();
   try {
     BeanUtils.copyProperties(gmad, gma);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   gmadList.add(gmad);
 }
 if(gmadList.size() > 0)
   service2.save(gmadList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}