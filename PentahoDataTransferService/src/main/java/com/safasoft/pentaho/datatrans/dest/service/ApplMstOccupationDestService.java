package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstOccupationDest;

public interface ApplMstOccupationDestService {

	List<ApplMstOccupationDest> save(List<ApplMstOccupationDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
