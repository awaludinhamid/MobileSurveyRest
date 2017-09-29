package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContCancelDest;

public interface CfinContCancelDestService {

	List<CfinContCancelDest> save(List<CfinContCancelDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
