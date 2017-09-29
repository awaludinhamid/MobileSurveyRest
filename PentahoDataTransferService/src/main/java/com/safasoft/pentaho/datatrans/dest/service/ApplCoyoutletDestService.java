package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyoutletDest;

public interface ApplCoyoutletDestService {

	List<ApplCoyoutletDest> save(List<ApplCoyoutletDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
