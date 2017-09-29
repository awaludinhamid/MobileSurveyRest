package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustGroupDest;

public interface ApplCustGroupDestService {

	List<ApplCustGroupDest> save(List<ApplCustGroupDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
