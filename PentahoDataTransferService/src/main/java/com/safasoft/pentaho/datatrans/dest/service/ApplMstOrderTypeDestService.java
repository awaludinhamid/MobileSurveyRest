package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstOrderTypeDest;

public interface ApplMstOrderTypeDestService {

	List<ApplMstOrderTypeDest> save(List<ApplMstOrderTypeDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
