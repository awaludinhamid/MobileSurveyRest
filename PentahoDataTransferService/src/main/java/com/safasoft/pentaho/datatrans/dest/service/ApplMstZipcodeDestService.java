package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstZipcodeDest;

public interface ApplMstZipcodeDestService {

	List<ApplMstZipcodeDest> save(List<ApplMstZipcodeDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
