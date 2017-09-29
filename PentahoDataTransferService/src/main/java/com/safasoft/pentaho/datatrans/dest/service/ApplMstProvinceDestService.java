package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstProvinceDest;

public interface ApplMstProvinceDestService {

	List<ApplMstProvinceDest> save(List<ApplMstProvinceDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
