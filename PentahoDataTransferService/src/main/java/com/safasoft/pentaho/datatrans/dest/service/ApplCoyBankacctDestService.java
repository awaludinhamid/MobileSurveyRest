package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyBankacctDest;

public interface ApplCoyBankacctDestService {

	List<ApplCoyBankacctDest> save(List<ApplCoyBankacctDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
