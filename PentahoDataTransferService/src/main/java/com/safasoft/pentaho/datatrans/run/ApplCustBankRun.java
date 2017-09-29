package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustBankDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustBankDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCustBank;
import com.safasoft.pentaho.datatrans.src.service.ApplCustBankService;

public class ApplCustBankRun extends
	BaseRun<ApplCustBank,ApplCustBankService,ApplCustBankDest,ApplCustBankDestService>{

	@Override
	protected List<ApplCustBank> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCustBank> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCustBankDest> acbdList = new ArrayList<>();
		for(ApplCustBank acb : bList) {
			//System.out.println(abb.getBankCode());
			ApplCustBankDest acbd = new ApplCustBankDest();
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
