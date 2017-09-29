package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstAreaDest;

public interface ApplMstAreaDestService {

	List<ApplMstAreaDest> save(List<ApplMstAreaDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
