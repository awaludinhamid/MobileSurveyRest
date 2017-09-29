package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustBankDest;

public interface ApplCustBankDestService {

	List<ApplCustBankDest> save(List<ApplCustBankDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
