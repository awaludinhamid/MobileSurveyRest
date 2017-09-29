package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKecamatanDest;

public interface ApplMstKecamatanDestService {

	List<ApplMstKecamatanDest> save(List<ApplMstKecamatanDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
