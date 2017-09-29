package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinArBebanDest;

public interface CfinArBebanDestService {

	List<CfinArBebanDest> save(List<CfinArBebanDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
