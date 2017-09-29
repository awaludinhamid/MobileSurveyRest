package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCustomerDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCustomerDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstCustomer;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCustomerService;

public class ApplMstCustomerRun extends
	BaseRun<ApplMstCustomer,ApplMstCustomerService,ApplMstCustomerDest,ApplMstCustomerDestService> {

	@Override
	protected List<ApplMstCustomer> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstCustomer> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstCustomerDest> amcdList = new ArrayList<>();
		for(ApplMstCustomer amc : bList) {
			ApplMstCustomerDest amcd = new ApplMstCustomerDest();
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
