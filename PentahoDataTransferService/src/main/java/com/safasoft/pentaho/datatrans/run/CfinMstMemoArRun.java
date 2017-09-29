package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstMemoArDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstMemoArDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstMemoAr;
import com.safasoft.pentaho.datatrans.src.service.CfinMstMemoArService;

public class CfinMstMemoArRun extends
	BaseRun<CfinMstMemoAr,CfinMstMemoArService,CfinMstMemoArDest,CfinMstMemoArDestService> {

	@Override
	protected List<CfinMstMemoAr> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstMemoAr> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstMemoArDest> cmmdList = new ArrayList<>();
		for(CfinMstMemoAr cmm : bList) {
			CfinMstMemoArDest cmmd = new CfinMstMemoArDest();
			try {
				BeanUtils.copyProperties(cmmd, cmm);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmmdList.add(cmmd);
		}
		if(cmmdList.size() > 0)
			service2.save(cmmdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
