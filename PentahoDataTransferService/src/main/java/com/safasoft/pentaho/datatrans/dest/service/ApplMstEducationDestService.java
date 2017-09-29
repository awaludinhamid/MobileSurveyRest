package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstEducationDest;

public interface ApplMstEducationDestService {

	List<ApplMstEducationDest> save(List<ApplMstEducationDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
