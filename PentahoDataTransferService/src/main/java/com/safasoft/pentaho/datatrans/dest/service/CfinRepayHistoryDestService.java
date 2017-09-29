package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinRepayHistoryDest;

public interface CfinRepayHistoryDestService {

	List<CfinRepayHistoryDest> save(List<CfinRepayHistoryDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
