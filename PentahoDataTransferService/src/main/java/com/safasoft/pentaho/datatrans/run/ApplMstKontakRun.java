package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKontakDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstKontakDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstKontak;
import com.safasoft.pentaho.datatrans.src.service.ApplMstKontakService;

public class ApplMstKontakRun extends
	BaseRun<ApplMstKontak,ApplMstKontakService,ApplMstKontakDest,ApplMstKontakDestService> {

	@Override
	protected List<ApplMstKontak> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstKontak> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstKontakDest> amkdList = new ArrayList<>();
		for(ApplMstKontak amk : bList) {
			ApplMstKontakDest amkd = new ApplMstKontakDest();
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
