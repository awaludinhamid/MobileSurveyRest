package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRevOrRejPkpdDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRevOrRejPkpdDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstRevOrRejPkpd;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRevOrRejPkpdService;

public class CfinMstRevOrRejPkpdRun extends
	BaseRun<CfinMstRevOrRejPkpd,CfinMstRevOrRejPkpdService,CfinMstRevOrRejPkpdDest,CfinMstRevOrRejPkpdDestService> {

	@Override
	protected List<CfinMstRevOrRejPkpd> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstRevOrRejPkpd> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstRevOrRejPkpdDest> crrdList = new ArrayList<>();
		for(CfinMstRevOrRejPkpd crr : bList) {
			CfinMstRevOrRejPkpdDest crrd = new CfinMstRevOrRejPkpdDest();
			try {
				BeanUtils.copyProperties(crrd, crr);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			crrdList.add(crrd);
		}
		if(crrdList.size() > 0)
			service2.save(crrdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
