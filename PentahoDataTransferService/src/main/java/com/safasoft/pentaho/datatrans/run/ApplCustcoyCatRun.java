package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustcoyCatDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustcoyCatDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCustcoyCat;
import com.safasoft.pentaho.datatrans.src.service.ApplCustcoyCatService;

public class ApplCustcoyCatRun extends
	BaseRun<ApplCustcoyCat,ApplCustcoyCatService,ApplCustcoyCatDest,ApplCustcoyCatDestService> {

	@Override
	protected List<ApplCustcoyCat> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCustcoyCat> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCustcoyCatDest> accdList = new ArrayList<>();
		for(ApplCustcoyCat acc : bList) {
			//System.out.println(abb.getBankCode());
			ApplCustcoyCatDest accd = new ApplCustcoyCatDest();
			try {
				BeanUtils.copyProperties(accd, acc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			accdList.add(accd);
		}
		if(accdList.size() > 0)
			service2.save(accdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
