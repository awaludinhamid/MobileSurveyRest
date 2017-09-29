package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstSourceofbookingDest;

public interface CfinMstSourceofbookingDestService {

	List<CfinMstSourceofbookingDest> save(List<CfinMstSourceofbookingDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
