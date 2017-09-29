package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstVehicleDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstVehicleDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstVehicle;
import com.safasoft.pentaho.datatrans.src.service.CfinMstVehicleService;

public class CfinMstVehicleRun extends
	BaseRun<CfinMstVehicle,CfinMstVehicleService,CfinMstVehicleDest,CfinMstVehicleDestService> {

	@Override
	protected List<CfinMstVehicle> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstVehicle> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstVehicleDest> cmvdList = new ArrayList<>();
		for(CfinMstVehicle cmv : bList) {
			CfinMstVehicleDest cmvd = new CfinMstVehicleDest();
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
