package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplBankBranchDest;

public interface ApplBankBranchDestService {

	List<ApplBankBranchDest> save(List<ApplBankBranchDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
