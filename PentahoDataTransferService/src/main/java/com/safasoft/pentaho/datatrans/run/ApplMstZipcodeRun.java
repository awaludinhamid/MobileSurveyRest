package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstZipcodeDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstZipcodeDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstZipcode;
import com.safasoft.pentaho.datatrans.src.service.ApplMstZipcodeService;

public class ApplMstZipcodeRun extends
 BaseRun<ApplMstZipcode,ApplMstZipcodeService,ApplMstZipcodeDest,ApplMstZipcodeDestService> {

	@Override
	protected List<ApplMstZipcode> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstZipcode> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstZipcodeDest> amzdList = new ArrayList<>();
		for(ApplMstZipcode amz : bList) {
			ApplMstZipcodeDest amzd = new ApplMstZipcodeDest();
			try {
				BeanUtils.copyProperties(amzd, amz);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amzdList.add(amzd);
		}
		if(amzdList.size() > 0)
			service2.save(amzdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
