package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCompanyDataDest;

public interface ApplCompanyDataDestService {

	List<ApplCompanyDataDest> save(List<ApplCompanyDataDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
