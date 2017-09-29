package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOrderRefinanceDest;

public interface CfinOrderRefinanceDestService {

	List<CfinOrderRefinanceDest> save(List<CfinOrderRefinanceDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
