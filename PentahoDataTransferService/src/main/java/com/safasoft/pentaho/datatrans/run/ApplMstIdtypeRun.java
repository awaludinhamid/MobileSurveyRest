package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstIdtypeDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstIdtypeDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstIdtype;
import com.safasoft.pentaho.datatrans.src.service.ApplMstIdtypeService;

public class ApplMstIdtypeRun extends
	BaseRun<ApplMstIdtype,ApplMstIdtypeService,ApplMstIdtypeDest,ApplMstIdtypeDestService> {

	@Override
	protected List<ApplMstIdtype> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstIdtype> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstIdtypeDest> amidList = new ArrayList<>();
		for(ApplMstIdtype ami : bList) {
			ApplMstIdtypeDest amid = new ApplMstIdtypeDest();
			try {
				BeanUtils.copyProperties(amid, ami);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amidList.add(amid);
		}
		if(amidList.size() > 0)
			service2.save(amidList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
