package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioritiesDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiPrioritiesDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPriorities;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiPrioritiesService;

public class CfinMstRiPrioritiesRun extends
	BaseRun<CfinMstRiPriorities,CfinMstRiPrioritiesService,CfinMstRiPrioritiesDest,CfinMstRiPrioritiesDestService> {

	@Override
	protected List<CfinMstRiPriorities> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstRiPriorities> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstRiPrioritiesDest> cmrdList = new ArrayList<>();
		for(CfinMstRiPriorities cmr : bList) {
			//System.out.println(cmr.getBankCode());
			CfinMstRiPrioritiesDest cmrd = new CfinMstRiPrioritiesDest();
			try {
				BeanUtils.copyProperties(cmrd, cmr);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmrdList.add(cmrd);
		}
		if(cmrdList.size() > 0)
			service2.save(cmrdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
