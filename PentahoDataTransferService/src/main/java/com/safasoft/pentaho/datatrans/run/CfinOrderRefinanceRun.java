package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOrderRefinanceDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinOrderRefinanceDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinOrderRefinance;
import com.safasoft.pentaho.datatrans.src.service.CfinOrderRefinanceService;

public class CfinOrderRefinanceRun extends
	BaseRun<CfinOrderRefinance,CfinOrderRefinanceService,CfinOrderRefinanceDest,CfinOrderRefinanceDestService> {

	@Override
	protected List<CfinOrderRefinance> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinOrderRefinance> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinOrderRefinanceDest> cordList = new ArrayList<>();
		for(CfinOrderRefinance cor : bList) {
			CfinOrderRefinanceDest cord = new CfinOrderRefinanceDest();
			try {
				BeanUtils.copyProperties(cord, cor);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cordList.add(cord);
		}
		if(cordList.size() > 0)
			service2.save(cordList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
