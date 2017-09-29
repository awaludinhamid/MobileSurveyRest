package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstBankDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstBankDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstBank;
import com.safasoft.pentaho.datatrans.src.service.ApplMstBankService;

public class ApplMstBankRun extends
	BaseRun<ApplMstBank,ApplMstBankService,ApplMstBankDest,ApplMstBankDestService>{

	@Override
	protected List<ApplMstBank> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstBank> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstBankDest> ambdList = new ArrayList<>();
		for(ApplMstBank amb : bList) {
			//System.out.println(abb.getBankCode());
			ApplMstBankDest ambd = new ApplMstBankDest();
			try {
				BeanUtils.copyProperties(ambd, amb);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			ambdList.add(ambd);
		}
		if(ambdList.size() > 0)
			service2.save(ambdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
