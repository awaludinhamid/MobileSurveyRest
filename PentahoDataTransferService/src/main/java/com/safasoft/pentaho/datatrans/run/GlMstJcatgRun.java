package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstJcatgDest;
import com.safasoft.pentaho.datatrans.dest.service.GlMstJcatgDestService;
import com.safasoft.pentaho.datatrans.src.bean.GlMstJcatg;
import com.safasoft.pentaho.datatrans.src.service.GlMstJcatgService;

public class GlMstJcatgRun extends
BaseRun<GlMstJcatg,GlMstJcatgService,GlMstJcatgDest,GlMstJcatgDestService> {

@Override
protected List<GlMstJcatg> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<GlMstJcatg> bList, int numOfBulkRecord) {
 List<GlMstJcatgDest> gmjdList = new ArrayList<>();
 for(GlMstJcatg gmj : bList) {
   GlMstJcatgDest gmjd = new GlMstJcatgDest();
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