package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstIdtypeDest;

public interface ApplMstIdtypeDestService {

	List<ApplMstIdtypeDest> save(List<ApplMstIdtypeDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
