package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstObjectDest;

public interface CfinMstObjectDestService {

	List<CfinMstObjectDest> save(List<CfinMstObjectDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
