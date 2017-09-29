package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstHousestatusDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstHousestatusDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstHousestatus;
import com.safasoft.pentaho.datatrans.src.service.ApplMstHousestatusService;

public class ApplMstHousestatusRun extends
	BaseRun<ApplMstHousestatus,ApplMstHousestatusService,ApplMstHousestatusDest,ApplMstHousestatusDestService> {

	@Override
	protected List<ApplMstHousestatus> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstHousestatus> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstHousestatusDest> amhdList = new ArrayList<>();
		for(ApplMstHousestatus amh : bList) {
			ApplMstHousestatusDest amhd = new ApplMstHousestatusDest();
			try {
				BeanUtils.copyProperties(amhd, amh);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amhdList.add(amhd);
		}
		if(amhdList.size() > 0)
			service2.save(amhdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
