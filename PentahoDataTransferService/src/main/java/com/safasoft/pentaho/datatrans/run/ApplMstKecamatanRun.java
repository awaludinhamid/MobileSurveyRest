package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKecamatanDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstKecamatanDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstKecamatan;
import com.safasoft.pentaho.datatrans.src.service.ApplMstKecamatanService;

public class ApplMstKecamatanRun extends
	BaseRun<ApplMstKecamatan,ApplMstKecamatanService,ApplMstKecamatanDest,ApplMstKecamatanDestService>{

	@Override
	protected List<ApplMstKecamatan> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstKecamatan> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstKecamatanDest> amkdList = new ArrayList<>();
		for(ApplMstKecamatan amk : bList) {
			ApplMstKecamatanDest amkd = new ApplMstKecamatanDest();
			try {
				BeanUtils.copyProperties(amkd, amk);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			amkdList.add(amkd);
		}
		if(amkdList.size() > 0)
			service2.save(amkdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
