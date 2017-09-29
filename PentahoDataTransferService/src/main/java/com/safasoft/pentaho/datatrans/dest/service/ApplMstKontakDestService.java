package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKontakDest;

public interface ApplMstKontakDestService {

	List<ApplMstKontakDest> save(List<ApplMstKontakDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
