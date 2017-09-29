package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstVmktpriceDest;

public interface CfinMstVmktpriceDestService {

	List<CfinMstVmktpriceDest> save(List<CfinMstVmktpriceDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
