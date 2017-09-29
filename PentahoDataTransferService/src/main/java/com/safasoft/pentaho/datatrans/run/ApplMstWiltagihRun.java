package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstWiltagihDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstWiltagihDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstWiltagih;
import com.safasoft.pentaho.datatrans.src.service.ApplMstWiltagihService;

public class ApplMstWiltagihRun extends
	BaseRun<ApplMstWiltagih,ApplMstWiltagihService,ApplMstWiltagihDest,ApplMstWiltagihDestService> {

	@Override
	protected List<ApplMstWiltagih> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstWiltagih> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstWiltagihDest> amwdList = new ArrayList<>();
		for(ApplMstWiltagih amw : bList) {
			ApplMstWiltagihDest amwd = new ApplMstWiltagihDest();
			try {
				BeanUtils.copyProperties(amwd, amw);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amwdList.add(amwd);
		}
		if(amwdList.size() > 0)
			service2.save(amwdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
