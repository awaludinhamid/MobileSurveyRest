package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstOccupationDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstOccupationDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstOccupation;
import com.safasoft.pentaho.datatrans.src.service.ApplMstOccupationService;

public class ApplMstOccupationRun extends
	BaseRun<ApplMstOccupation,ApplMstOccupationService,ApplMstOccupationDest,ApplMstOccupationDestService> {

	@Override
	protected List<ApplMstOccupation> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstOccupation> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstOccupationDest> amodList = new ArrayList<>();
		for(ApplMstOccupation amo : bList) {
			ApplMstOccupationDest amod = new ApplMstOccupationDest();
			try {
				BeanUtils.copyProperties(amod, amo);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amodList.add(amod);
		}
		if(amodList.size() > 0)
			service2.save(amodList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
