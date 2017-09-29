package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplBankBranchDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplBankBranchDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplBankBranch;
import com.safasoft.pentaho.datatrans.src.service.ApplBankBranchService;

public class ApplBankBranchRun extends
	BaseRun<ApplBankBranch,ApplBankBranchService,ApplBankBranchDest,ApplBankBranchDestService> {

	@Override
	protected List<ApplBankBranch> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub		
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplBankBranch> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplBankBranchDest> abbdList = new ArrayList<>();
		for(ApplBankBranch abb : bList) {
			//System.out.println(abb.getBankCode());
			ApplBankBranchDest abbd = new ApplBankBranchDest();
			try {
				BeanUtils.copyProperties(abbd, abb);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			abbdList.add(abbd);
		}
		if(abbdList.size() > 0)
			service2.save(abbdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

	
}
