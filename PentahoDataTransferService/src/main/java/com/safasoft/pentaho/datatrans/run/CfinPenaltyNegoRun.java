package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinPenaltyNegoDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinPenaltyNegoDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinPenaltyNego;
import com.safasoft.pentaho.datatrans.src.service.CfinPenaltyNegoService;

public class CfinPenaltyNegoRun extends
	BaseRun<CfinPenaltyNego,CfinPenaltyNegoService,CfinPenaltyNegoDest,CfinPenaltyNegoDestService> {

	@Override
	protected List<CfinPenaltyNego> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinPenaltyNego> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinPenaltyNegoDest> cpndList = new ArrayList<>();
		for(CfinPenaltyNego cpn : bList) {
			CfinPenaltyNegoDest cpnd = new CfinPenaltyNegoDest();
			try {
				BeanUtils.copyProperties(cpnd, cpn);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cpndList.add(cpnd);
		}
		if(cpndList.size() > 0)
			service2.save(cpndList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
