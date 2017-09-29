package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstCollectorDest;

public interface CfinMstCollectorDestService {

	List<CfinMstCollectorDest> save(List<CfinMstCollectorDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
