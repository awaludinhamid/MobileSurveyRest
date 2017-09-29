package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstVehicleDest;

public interface CfinMstVehicleDestService {

	List<CfinMstVehicleDest> save(List<CfinMstVehicleDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
