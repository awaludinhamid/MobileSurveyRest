package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinCfgroupDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinCfgroupDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinCfgroup;
import com.safasoft.pentaho.datatrans.src.service.CfinCfgroupService;

public class CfinCfgroupRun extends
	BaseRun<CfinCfgroup,CfinCfgroupService,CfinCfgroupDest,CfinCfgroupDestService> {

	@Override
	protected List<CfinCfgroup> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinCfgroup> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinCfgroupDest> ccdList = new ArrayList<>();
		for(CfinCfgroup cc : bList) {
			CfinCfgroupDest ccd = new CfinCfgroupDest();
			try {
				BeanUtils.copyProperties(ccd, cc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			ccdList.add(ccd);
		}
		if(ccdList.size() > 0)
			service2.save(ccdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
