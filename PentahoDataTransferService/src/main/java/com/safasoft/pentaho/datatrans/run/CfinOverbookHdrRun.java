package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOverbookHdrDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinOverbookHdrDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinOverbookHdr;
import com.safasoft.pentaho.datatrans.src.service.CfinOverbookHdrService;

public class CfinOverbookHdrRun extends
	BaseRun<CfinOverbookHdr,CfinOverbookHdrService,CfinOverbookHdrDest,CfinOverbookHdrDestService> {

	@Override
	protected List<CfinOverbookHdr> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinOverbookHdr> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinOverbookHdrDest> cohdList = new ArrayList<>();
		for(CfinOverbookHdr coh : bList) {
			CfinOverbookHdrDest cohd = new CfinOverbookHdrDest();
			try {
				BeanUtils.copyProperties(cohd, coh);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cohdList.add(cohd);
		}
		if(cohdList.size() > 0)
			service2.save(cohdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
