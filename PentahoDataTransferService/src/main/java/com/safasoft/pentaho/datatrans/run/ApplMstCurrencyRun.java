package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCurrencyDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCurrencyDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstCurrency;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCurrencyService;

public class ApplMstCurrencyRun extends
	BaseRun<ApplMstCurrency,ApplMstCurrencyService,ApplMstCurrencyDest,ApplMstCurrencyDestService> {

	@Override
	protected List<ApplMstCurrency> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstCurrency> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstCurrencyDest> amcdList = new ArrayList<>();
		for(ApplMstCurrency amc : bList) {
			ApplMstCurrencyDest amcd = new ApplMstCurrencyDest();
			try {
				BeanUtils.copyProperties(amcd, amc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amcdList.add(amcd);
		}
		if(amcdList.size() > 0)
			service2.save(amcdList, numOfBulkRecord);
		
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
