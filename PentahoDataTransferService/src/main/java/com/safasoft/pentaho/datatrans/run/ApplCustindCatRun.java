package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustindCatDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustindCatDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCustindCat;
import com.safasoft.pentaho.datatrans.src.service.ApplCustindCatService;

public class ApplCustindCatRun extends
	BaseRun<ApplCustindCat,ApplCustindCatService,ApplCustindCatDest,ApplCustindCatDestService>{

	@Override
	protected List<ApplCustindCat> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCustindCat> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCustindCatDest> accdList = new ArrayList<>();
		for(ApplCustindCat acc : bList) {
			//System.out.println(abb.getBankCode());
			ApplCustindCatDest accd = new ApplCustindCatDest();
			try {
				BeanUtils.copyProperties(accd, acc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			accdList.add(accd);
		}
		if(accdList.size() > 0)
			service2.save(accdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
