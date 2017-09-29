package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinCfgroupAccountDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinCfgroupAccountDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinCfgroupAccount;
import com.safasoft.pentaho.datatrans.src.service.CfinCfgroupAccountService;

public class CfinCfgroupAccountRun extends
	BaseRun<CfinCfgroupAccount,CfinCfgroupAccountService,CfinCfgroupAccountDest,CfinCfgroupAccountDestService> {

	@Override
	protected List<CfinCfgroupAccount> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinCfgroupAccount> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinCfgroupAccountDest> ccadList = new ArrayList<>();
		for(CfinCfgroupAccount cca : bList) {
			CfinCfgroupAccountDest ccad = new CfinCfgroupAccountDest();
			try {
				BeanUtils.copyProperties(ccad, cca);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			ccadList.add(ccad);
		}
		if(ccadList.size() > 0)
			service2.save(ccadList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
