package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCarabayarDest;

public interface ApplMstCarabayarDestService {

	List<ApplMstCarabayarDest> save(List<ApplMstCarabayarDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
