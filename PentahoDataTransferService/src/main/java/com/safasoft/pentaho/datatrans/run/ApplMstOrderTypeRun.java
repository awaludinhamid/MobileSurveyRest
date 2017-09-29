package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstOrderTypeDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstOrderTypeDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstOrderType;
import com.safasoft.pentaho.datatrans.src.service.ApplMstOrderTypeService;

public class ApplMstOrderTypeRun extends
	BaseRun<ApplMstOrderType,ApplMstOrderTypeService,ApplMstOrderTypeDest,ApplMstOrderTypeDestService> {

	@Override
	protected List<ApplMstOrderType> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstOrderType> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstOrderTypeDest> amotdList = new ArrayList<>();
		for(ApplMstOrderType amot : bList) {
			ApplMstOrderTypeDest amotd = new ApplMstOrderTypeDest();
			try {
				BeanUtils.copyProperties(amotd, amot);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amotdList.add(amotd);
		}
		if(amotdList.size() > 0)
			service2.save(amotdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
