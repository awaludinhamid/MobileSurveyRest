package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiParamDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiParamDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiParam;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiParamService;

public class CfinMstRiParamRun extends
	BaseRun<CfinMstRiParam,CfinMstRiParamService,CfinMstRiParamDest,CfinMstRiParamDestService> {

	@Override
	protected List<CfinMstRiParam> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstRiParam> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstRiParamDest> cmrdList = new ArrayList<>();
		for(CfinMstRiParam cmr : bList) {
			CfinMstRiParamDest cmrd = new CfinMstRiParamDest();
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
