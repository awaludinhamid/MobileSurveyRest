package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinRepaySchdDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinRepaySchdDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinRepaySchd;
import com.safasoft.pentaho.datatrans.src.service.CfinRepaySchdService;

public class CfinRepaySchdRun extends
	BaseRun<CfinRepaySchd,CfinRepaySchdService,CfinRepaySchdDest,CfinRepaySchdDestService> {

	@Override
	protected List<CfinRepaySchd> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinRepaySchd> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinRepaySchdDest> crsdList = new ArrayList<>();
		for(CfinRepaySchd crs : bList) {
			//System.out.println(crs.getBankCode());
			CfinRepaySchdDest crsd = new CfinRepaySchdDest();
			try {
				BeanUtils.copyProperties(crsd, crs);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			crsdList.add(crsd);
		}
		if(crsdList.size() > 0)
			service2.save(crsdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
