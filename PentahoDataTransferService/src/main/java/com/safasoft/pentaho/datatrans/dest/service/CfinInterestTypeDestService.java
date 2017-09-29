package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinInterestTypeDest;

public interface CfinInterestTypeDestService {

	List<CfinInterestTypeDest> save(List<CfinInterestTypeDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
