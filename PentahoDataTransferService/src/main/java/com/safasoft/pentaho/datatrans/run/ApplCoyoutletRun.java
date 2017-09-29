package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyoutletDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCoyoutletDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCoyoutlet;
import com.safasoft.pentaho.datatrans.src.service.ApplCoyoutletService;

public class ApplCoyoutletRun extends
	BaseRun<ApplCoyoutlet,ApplCoyoutletService,ApplCoyoutletDest,ApplCoyoutletDestService> {

	@Override
	protected List<ApplCoyoutlet> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCoyoutlet> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCoyoutletDest> acdList = new ArrayList<>();
		for(ApplCoyoutlet ac : bList) {
			//System.out.println(abb.getBankCode());
			ApplCoyoutletDest acd = new ApplCoyoutletDest();
			try {
				BeanUtils.copyProperties(acd, ac);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			acdList.add(acd);
		}
		if(acdList.size() > 0)
			service2.save(acdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
