package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContCustindDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinContCustindDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinContCustind;
import com.safasoft.pentaho.datatrans.src.service.CfinContCustindService;

public class CfinContCustindRun extends
	BaseRun<CfinContCustind,CfinContCustindService,CfinContCustindDest,CfinContCustindDestService> {

	@Override
	protected List<CfinContCustind> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinContCustind> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinContCustindDest> cccdList = new ArrayList<>();
		for(CfinContCustind ccc : bList) {
			CfinContCustindDest cccd = new CfinContCustindDest();
			try {
				BeanUtils.copyProperties(cccd, ccc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cccdList.add(cccd);
		}
		if(cccdList.size() > 0)
			service2.save(cccdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
