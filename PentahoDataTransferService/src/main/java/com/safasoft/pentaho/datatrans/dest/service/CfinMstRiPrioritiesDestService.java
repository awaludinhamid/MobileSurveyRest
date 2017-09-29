package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioritiesDest;

public interface CfinMstRiPrioritiesDestService {

	List<CfinMstRiPrioritiesDest> save(List<CfinMstRiPrioritiesDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
