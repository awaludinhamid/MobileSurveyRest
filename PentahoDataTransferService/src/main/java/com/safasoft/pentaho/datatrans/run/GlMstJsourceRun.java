package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstJsourceDest;
import com.safasoft.pentaho.datatrans.dest.service.GlMstJsourceDestService;
import com.safasoft.pentaho.datatrans.src.bean.GlMstJsource;
import com.safasoft.pentaho.datatrans.src.service.GlMstJsourceService;

public class GlMstJsourceRun extends
BaseRun<GlMstJsource,GlMstJsourceService,GlMstJsourceDest,GlMstJsourceDestService> {

@Override
protected List<GlMstJsource> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<GlMstJsource> bList, int numOfBulkRecord) {
 List<GlMstJsourceDest> gmjdList = new ArrayList<>();
 for(GlMstJsource gmj : bList) {
   GlMstJsourceDest gmjd = new GlMstJsourceDest();
   try {
     BeanUtils.copyProperties(gmjd, gmj);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   gmjdList.add(gmjd);
 }
 if(gmjdList.size() > 0)
   service2.save(gmjdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}