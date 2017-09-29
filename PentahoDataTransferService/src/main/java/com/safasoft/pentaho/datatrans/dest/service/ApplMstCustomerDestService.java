package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCustomerDest;

public interface ApplMstCustomerDestService {

	List<ApplMstCustomerDest> save(List<ApplMstCustomerDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
