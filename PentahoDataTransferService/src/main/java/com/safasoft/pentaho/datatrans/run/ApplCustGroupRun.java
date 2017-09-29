package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustGroupDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustGroupDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCustGroup;
import com.safasoft.pentaho.datatrans.src.service.ApplCustGroupService;

public class ApplCustGroupRun extends
	BaseRun<ApplCustGroup,ApplCustGroupService,ApplCustGroupDest,ApplCustGroupDestService>{

	@Override
	protected List<ApplCustGroup> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCustGroup> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCustGroupDest> acgdList = new ArrayList<>();
		for(ApplCustGroup acg : bList) {
			//System.out.println(abb.getBankCode());
			ApplCustGroupDest acgd = new ApplCustGroupDest();
			try {
				BeanUtils.copyProperties(acgd, acg);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			acgdList.add(acgd);
		}
		if(acgdList.size() > 0)
			service2.save(acgdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
