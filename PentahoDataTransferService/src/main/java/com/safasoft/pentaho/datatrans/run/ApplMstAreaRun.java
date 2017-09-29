package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstAreaDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstAreaDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstArea;
import com.safasoft.pentaho.datatrans.src.service.ApplMstAreaService;

public class ApplMstAreaRun extends
	BaseRun<ApplMstArea,ApplMstAreaService,ApplMstAreaDest,ApplMstAreaDestService> {

	@Override
	protected List<ApplMstArea> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstArea> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstAreaDest> amadList = new ArrayList<>();
		for(ApplMstArea ama : bList) {
			//System.out.println(abb.getBankCode());
			ApplMstAreaDest amad = new ApplMstAreaDest();
			try {
				BeanUtils.copyProperties(amad, ama);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amadList.add(amad);
		}
		if(amadList.size() > 0)
			service2.save(amadList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
