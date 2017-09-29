package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstParamProyeksiDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstParamProyeksiDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstParamProyeksi;
import com.safasoft.pentaho.datatrans.src.service.CfinMstParamProyeksiService;

public class CfinMstParamProyeksiRun extends
	BaseRun<CfinMstParamProyeksi,CfinMstParamProyeksiService,CfinMstParamProyeksiDest,CfinMstParamProyeksiDestService> {

	@Override
	protected List<CfinMstParamProyeksi> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstParamProyeksi> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstParamProyeksiDest> cppdList = new ArrayList<>();
		for(CfinMstParamProyeksi cpp : bList) {
			CfinMstParamProyeksiDest cppd = new CfinMstParamProyeksiDest();
			try {
				BeanUtils.copyProperties(cppd, cpp);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cppdList.add(cppd);
		}
		if(cppdList.size() > 0)
			service2.save(cppdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
