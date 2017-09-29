package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOverbookHdrDest;

public interface CfinOverbookHdrDestService {

	List<CfinOverbookHdrDest> save(List<CfinOverbookHdrDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
