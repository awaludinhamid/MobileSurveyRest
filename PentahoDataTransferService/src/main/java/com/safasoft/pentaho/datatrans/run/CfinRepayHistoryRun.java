package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinRepayHistoryDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinRepayHistoryDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinRepayHistory;
import com.safasoft.pentaho.datatrans.src.service.CfinRepayHistoryService;

public class CfinRepayHistoryRun extends
	BaseRun<CfinRepayHistory,CfinRepayHistoryService,CfinRepayHistoryDest,CfinRepayHistoryDestService> {

	@Override
	protected List<CfinRepayHistory> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinRepayHistory> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinRepayHistoryDest> crhdList = new ArrayList<>();
		for(CfinRepayHistory crh : bList) {
			CfinRepayHistoryDest crhd = new CfinRepayHistoryDest();
			try {
				BeanUtils.copyProperties(crhd, crh);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			crhdList.add(crhd);
		}
		if(crhdList.size() > 0)
			service2.save(crhdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
