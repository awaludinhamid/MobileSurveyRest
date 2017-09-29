package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustindCatDest;

public interface ApplCustindCatDestService {

	List<ApplCustindCatDest> save(List<ApplCustindCatDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
