package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCashDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCashDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstCash;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCashService;

public class ApplMstCashRun extends
	BaseRun<ApplMstCash,ApplMstCashService,ApplMstCashDest,ApplMstCashDestService> {

	@Override
	protected List<ApplMstCash> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstCash> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstCashDest> amcdList = new ArrayList<>();
		for(ApplMstCash amc : bList) {
			//System.out.println(abb.getBankCode());
			ApplMstCashDest amcd = new ApplMstCashDest();
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
