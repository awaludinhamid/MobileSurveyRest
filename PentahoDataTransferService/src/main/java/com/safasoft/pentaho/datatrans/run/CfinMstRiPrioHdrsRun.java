package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioHdrsDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiPrioHdrsDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPrioHdrs;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiPrioHdrsService;

public class CfinMstRiPrioHdrsRun extends
	BaseRun<CfinMstRiPrioHdrs,CfinMstRiPrioHdrsService,CfinMstRiPrioHdrsDest,CfinMstRiPrioHdrsDestService> {

	@Override
	protected List<CfinMstRiPrioHdrs> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstRiPrioHdrs> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstRiPrioHdrsDest> cmrdList = new ArrayList<>();
		for(CfinMstRiPrioHdrs cmr : bList) {
			CfinMstRiPrioHdrsDest cmrd = new CfinMstRiPrioHdrsDest();
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
