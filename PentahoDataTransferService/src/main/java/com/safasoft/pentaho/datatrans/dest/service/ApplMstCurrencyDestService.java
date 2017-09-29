package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCurrencyDest;

public interface ApplMstCurrencyDestService {

	List<ApplMstCurrencyDest> save(List<ApplMstCurrencyDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
