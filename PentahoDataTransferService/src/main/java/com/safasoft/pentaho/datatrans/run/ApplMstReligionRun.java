package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstReligionDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstReligionDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstReligion;
import com.safasoft.pentaho.datatrans.src.service.ApplMstReligionService;

public class ApplMstReligionRun extends
	BaseRun<ApplMstReligion,ApplMstReligionService,ApplMstReligionDest,ApplMstReligionDestService> {

	@Override
	protected List<ApplMstReligion> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstReligion> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstReligionDest> amrdList = new ArrayList<>();
		for(ApplMstReligion amr : bList) {
			ApplMstReligionDest amrd = new ApplMstReligionDest();
			try {
				BeanUtils.copyProperties(amrd, amr);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amrdList.add(amrd);
		}
		if(amrdList.size() > 0)
			service2.save(amrdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
