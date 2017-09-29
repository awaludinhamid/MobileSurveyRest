package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCashDest;

public interface ApplMstCashDestService {

	List<ApplMstCashDest> save(List<ApplMstCashDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
