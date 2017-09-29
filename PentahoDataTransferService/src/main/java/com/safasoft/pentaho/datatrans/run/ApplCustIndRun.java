package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustIndDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustIndDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplCustInd;
import com.safasoft.pentaho.datatrans.src.service.ApplCustIndService;

public class ApplCustIndRun extends
	BaseRun<ApplCustInd,ApplCustIndService,ApplCustIndDest,ApplCustIndDestService>{

	@Override
	protected List<ApplCustInd> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplCustInd> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplCustIndDest> acidList = new ArrayList<>();
		for(ApplCustInd aci : bList) {
			//System.out.println(abb.getBankCode());
			ApplCustIndDest acid = new ApplCustIndDest();
			try {
				BeanUtils.copyProperties(acid, aci);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			acidList.add(acid);
		}
		if(acidList.size() > 0)
			service2.save(acidList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
