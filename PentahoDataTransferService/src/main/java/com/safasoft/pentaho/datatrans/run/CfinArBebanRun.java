package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinArBebanDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinArBebanDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinArBeban;
import com.safasoft.pentaho.datatrans.src.service.CfinArBebanService;

public class CfinArBebanRun extends
	BaseRun<CfinArBeban,CfinArBebanService,CfinArBebanDest,CfinArBebanDestService> {

	@Override
	protected List<CfinArBeban> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinArBeban> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinArBebanDest> cabdList = new ArrayList<>();
		for(CfinArBeban cab : bList) {
			CfinArBebanDest cabd = new CfinArBebanDest();
			try {
				BeanUtils.copyProperties(cabd, cab);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cabdList.add(cabd);
		}
		if(cabdList.size() > 0)
			service2.save(cabdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
