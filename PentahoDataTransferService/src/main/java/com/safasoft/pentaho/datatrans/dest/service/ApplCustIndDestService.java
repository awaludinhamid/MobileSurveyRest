package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustIndDest;

public interface ApplCustIndDestService {

	List<ApplCustIndDest> save(List<ApplCustIndDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
