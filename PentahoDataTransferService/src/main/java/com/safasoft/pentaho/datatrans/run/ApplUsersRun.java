package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplUsersDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplUsersDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplUsers;
import com.safasoft.pentaho.datatrans.src.service.ApplUsersService;

public class ApplUsersRun extends
	BaseRun<ApplUsers,ApplUsersService,ApplUsersDest,ApplUsersDestService> {

	@Override
	protected List<ApplUsers> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplUsers> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplUsersDest> audList = new ArrayList<>();
		for(ApplUsers au : bList) {
			//System.out.println(abb.getBankCode());
			ApplUsersDest aud = new ApplUsersDest();
			try {
				BeanUtils.copyProperties(aud, au);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			audList.add(aud);
		}
		if(audList.size() > 0)
			service2.save(audList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
