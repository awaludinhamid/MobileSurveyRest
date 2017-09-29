package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKabkotaDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstKabkotaDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstKabkota;
import com.safasoft.pentaho.datatrans.src.service.ApplMstKabkotaService;

public class ApplMstKabkotaRun extends
	BaseRun<ApplMstKabkota,ApplMstKabkotaService,ApplMstKabkotaDest,ApplMstKabkotaDestService> {

	@Override
	protected List<ApplMstKabkota> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstKabkota> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstKabkotaDest> amkdList = new ArrayList<>();
		for(ApplMstKabkota amk : bList) {
			ApplMstKabkotaDest amkd = new ApplMstKabkotaDest();
			try {
				BeanUtils.copyProperties(amkd, amk);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amkdList.add(amkd);
		}
		if(amkdList.size() > 0)
			service2.save(amkdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
