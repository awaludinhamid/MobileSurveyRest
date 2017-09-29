package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyBankacctDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCoyBankacctDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCoyBankacct;
import com.safasoft.pentaho.datatrans.src.service.ApplCoyBankacctService;

public class ApplCoyBankacctRun extends
	BaseRun<ApplCoyBankacct,ApplCoyBankacctService,ApplCoyBankacctDest,ApplCoyBankacctDestService> {

	@Override
	protected List<ApplCoyBankacct> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCoyBankacct> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCoyBankacctDest> acbdList = new ArrayList<>();
		for(ApplCoyBankacct acb : bList) {
			//System.out.println(abb.getBankCode());
			ApplCoyBankacctDest acbd = new ApplCoyBankacctDest();
			try {
				BeanUtils.copyProperties(acbd, acb);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			acbdList.add(acbd);
		}
		if(acbdList.size() > 0)
			service2.save(acbdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
