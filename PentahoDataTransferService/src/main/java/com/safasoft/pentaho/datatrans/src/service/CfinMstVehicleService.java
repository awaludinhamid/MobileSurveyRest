package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstVehicle;

public interface CfinMstVehicleService {

	List<CfinMstVehicle> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
