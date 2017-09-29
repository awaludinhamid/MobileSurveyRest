package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContCancelDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinContCancelDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinContCancel;
import com.safasoft.pentaho.datatrans.src.service.CfinContCancelService;

public class CfinContCancelRun extends
	BaseRun<CfinContCancel,CfinContCancelService,CfinContCancelDest,CfinContCancelDestService> {

	@Override
	protected List<CfinContCancel> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinContCancel> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinContCancelDest> cccdList = new ArrayList<>();
		for(CfinContCancel ccc : bList) {
			CfinContCancelDest cccd = new CfinContCancelDest();
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
