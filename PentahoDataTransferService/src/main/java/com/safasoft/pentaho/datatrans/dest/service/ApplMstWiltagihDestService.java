package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstWiltagihDest;

public interface ApplMstWiltagihDestService {

	List<ApplMstWiltagihDest> save(List<ApplMstWiltagihDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
