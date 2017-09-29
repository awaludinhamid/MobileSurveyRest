package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContCustindDest;

public interface CfinContCustindDestService {

	List<CfinContCustindDest> save(List<CfinContCustindDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
