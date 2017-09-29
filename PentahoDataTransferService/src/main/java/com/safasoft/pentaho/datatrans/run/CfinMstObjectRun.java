package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstObjectDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstObjectDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstObject;
import com.safasoft.pentaho.datatrans.src.service.CfinMstObjectService;

public class CfinMstObjectRun extends
	BaseRun<CfinMstObject,CfinMstObjectService,CfinMstObjectDest,CfinMstObjectDestService> {

	@Override
	protected List<CfinMstObject> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstObject> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstObjectDest> cmodList = new ArrayList<>();
		for(CfinMstObject cmo : bList) {
			CfinMstObjectDest cmod = new CfinMstObjectDest();
			try {
				BeanUtils.copyProperties(cmod, cmo);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmodList.add(cmod);
		}
		if(cmodList.size() > 0)
			service2.save(cmodList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
