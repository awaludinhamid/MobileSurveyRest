package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustcoyCatDest;

public interface ApplCustcoyCatDestService {

	List<ApplCustcoyCatDest> save(List<ApplCustcoyCatDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
