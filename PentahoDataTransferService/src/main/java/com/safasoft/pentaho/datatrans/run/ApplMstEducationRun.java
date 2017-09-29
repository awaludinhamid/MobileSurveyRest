package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstEducationDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstEducationDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstEducation;
import com.safasoft.pentaho.datatrans.src.service.ApplMstEducationService;

public class ApplMstEducationRun extends
	BaseRun<ApplMstEducation,ApplMstEducationService,ApplMstEducationDest,ApplMstEducationDestService> {

	@Override
	protected List<ApplMstEducation> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstEducation> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstEducationDest> amedList = new ArrayList<>();
		for(ApplMstEducation ame : bList) {
			ApplMstEducationDest amed = new ApplMstEducationDest();
			try {
				BeanUtils.copyProperties(amed, ame);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amedList.add(amed);
		}
		if(amedList.size() > 0)
			service2.save(amedList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
