package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstSourceofbookingDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstSourceofbookingDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstSourceofbooking;
import com.safasoft.pentaho.datatrans.src.service.CfinMstSourceofbookingService;

public class CfinMstSourceofbookingRun extends
	BaseRun<CfinMstSourceofbooking,CfinMstSourceofbookingService,CfinMstSourceofbookingDest,CfinMstSourceofbookingDestService> {

	@Override
	protected List<CfinMstSourceofbooking> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstSourceofbooking> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstSourceofbookingDest> cmsdList = new ArrayList<>();
		for(CfinMstSourceofbooking cms : bList) {
			CfinMstSourceofbookingDest cmsd = new CfinMstSourceofbookingDest();
			try {
				BeanUtils.copyProperties(cmsd, cms);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmsdList.add(cmsd);
		}
		if(cmsdList.size() > 0)
			service2.save(cmsdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
