package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKabkotaDest;

public interface ApplMstKabkotaDestService {

	List<ApplMstKabkotaDest> save(List<ApplMstKabkotaDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
