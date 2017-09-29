package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCarabayarDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCarabayarDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstCarabayar;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCarabayarService;

public class ApplMstCarabayarRun extends
	BaseRun<ApplMstCarabayar,ApplMstCarabayarService,ApplMstCarabayarDest,ApplMstCarabayarDestService>{

	@Override
	protected List<ApplMstCarabayar> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstCarabayar> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstCarabayarDest> amcdList = new ArrayList<>();
		for(ApplMstCarabayar amc : bList) {
			//System.out.println(abb.getBankCode());
			ApplMstCarabayarDest amcd = new ApplMstCarabayarDest();
			try {
				BeanUtils.copyProperties(amcd, amc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amcdList.add(amcd);
		}
		if(amcdList.size() > 0)
			service2.save(amcdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
