package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstPotensiProyeksiDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstPotensiProyeksiDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstPotensiProyeksi;
import com.safasoft.pentaho.datatrans.src.service.CfinMstPotensiProyeksiService;

public class CfinMstPotensiProyeksiRun extends
BaseRun<CfinMstPotensiProyeksi,CfinMstPotensiProyeksiService,CfinMstPotensiProyeksiDest,CfinMstPotensiProyeksiDestService> {

	@Override
	protected List<CfinMstPotensiProyeksi> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstPotensiProyeksi> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstPotensiProyeksiDest> cppdList = new ArrayList<>();
		for(CfinMstPotensiProyeksi cpp : bList) {
			CfinMstPotensiProyeksiDest cppd = new CfinMstPotensiProyeksiDest();
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
