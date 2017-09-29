package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContaddrTghDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinContaddrTghDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinContaddrTgh;
import com.safasoft.pentaho.datatrans.src.service.CfinContaddrTghService;

public class CfinContaddrTghRun extends
	BaseRun<CfinContaddrTgh,CfinContaddrTghService,CfinContaddrTghDest,CfinContaddrTghDestService> {

	@Override
	protected List<CfinContaddrTgh> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinContaddrTgh> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinContaddrTghDest> cctdList = new ArrayList<>();
		for(CfinContaddrTgh cct : bList) {
			CfinContaddrTghDest cctd = new CfinContaddrTghDest();
			try {
				BeanUtils.copyProperties(cctd, cct);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cctdList.add(cctd);
		}
		if(cctdList.size() > 0)
			service2.save(cctdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
