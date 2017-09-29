package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstCollectorDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstCollectorDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstCollector;
import com.safasoft.pentaho.datatrans.src.service.CfinMstCollectorService;

public class CfinMstCollectorRun extends
	BaseRun<CfinMstCollector,CfinMstCollectorService,CfinMstCollectorDest,CfinMstCollectorDestService> {

	@Override
	protected List<CfinMstCollector> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstCollector> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstCollectorDest> cmcdList = new ArrayList<>();
		for(CfinMstCollector cmc : bList) {
			//System.out.println(cmc.getBankCode());
			CfinMstCollectorDest cmcd = new CfinMstCollectorDest();
			try {
				BeanUtils.copyProperties(cmcd, cmc);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmcdList.add(cmcd);
		}
		if(cmcdList.size() > 0)
			service2.save(cmcdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
