package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOverbookDtlDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinOverbookDtlDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinOverbookDtl;
import com.safasoft.pentaho.datatrans.src.service.CfinOverbookDtlService;

public class CfinOverbookDtlRun extends
	BaseRun<CfinOverbookDtl,CfinOverbookDtlService,CfinOverbookDtlDest,CfinOverbookDtlDestService> {

	@Override
	protected List<CfinOverbookDtl> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinOverbookDtl> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinOverbookDtlDest> coddList = new ArrayList<>();
		for(CfinOverbookDtl cod : bList) {
			CfinOverbookDtlDest codd = new CfinOverbookDtlDest();
			try {
				BeanUtils.copyProperties(codd, cod);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			coddList.add(codd);
		}
		if(coddList.size() > 0)
			service2.save(coddList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
