package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCompanyDataDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCompanyDataDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCompanyData;
import com.safasoft.pentaho.datatrans.src.service.ApplCompanyDataService;

public class ApplCompanyDataRun extends
	BaseRun<ApplCompanyData,ApplCompanyDataService,ApplCompanyDataDest,ApplCompanyDataDestService> {

	@Override
	protected List<ApplCompanyData> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCompanyData> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCompanyDataDest> acddList = new ArrayList<>();
		for(ApplCompanyData acd : bList) {
			//System.out.println(abb.getBankCode());
			ApplCompanyDataDest acdd = new ApplCompanyDataDest();
			try {
				BeanUtils.copyProperties(acdd, acd);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			acddList.add(acdd);
		}
		if(acddList.size() > 0)
			service2.save(acddList, numOfBulkRecord);
		
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
