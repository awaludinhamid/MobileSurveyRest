package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinInterestTypeDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinInterestTypeDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinInterestType;
import com.safasoft.pentaho.datatrans.src.service.CfinInterestTypeService;

public class CfinInterestTypeRun extends
	BaseRun<CfinInterestType,CfinInterestTypeService,CfinInterestTypeDest,CfinInterestTypeDestService> {

	@Override
	protected List<CfinInterestType> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinInterestType> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinInterestTypeDest> citdList = new ArrayList<>();
		for(CfinInterestType cit : bList) {
			//System.out.println(cit.getBankCode());
			CfinInterestTypeDest citd = new CfinInterestTypeDest();
			try {
				BeanUtils.copyProperties(citd, cit);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			citdList.add(citd);
		}
		if(citdList.size() > 0)
			service2.save(citdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
