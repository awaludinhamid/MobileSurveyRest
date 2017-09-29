package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstVmktpriceDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstVmktpriceDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstVmktprice;
import com.safasoft.pentaho.datatrans.src.service.CfinMstVmktpriceService;

public class CfinMstVmktpriceRun extends
	BaseRun<CfinMstVmktprice,CfinMstVmktpriceService,CfinMstVmktpriceDest,CfinMstVmktpriceDestService>{

	@Override
	protected List<CfinMstVmktprice> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstVmktprice> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstVmktpriceDest> cmvdList = new ArrayList<>();
		for(CfinMstVmktprice cmv : bList) {
			CfinMstVmktpriceDest cmvd = new CfinMstVmktpriceDest();
			try {
				BeanUtils.copyProperties(cmvd, cmv);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmvdList.add(cmvd);
		}
		if(cmvdList.size() > 0)
			service2.save(cmvdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
