package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOverbookDtlDest;

public interface CfinOverbookDtlDestService {

	List<CfinOverbookDtlDest> save(List<CfinOverbookDtlDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
