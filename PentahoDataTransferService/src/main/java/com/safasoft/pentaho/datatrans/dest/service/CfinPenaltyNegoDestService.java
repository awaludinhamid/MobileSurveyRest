package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinPenaltyNegoDest;

public interface CfinPenaltyNegoDestService {

	List<CfinPenaltyNegoDest> save(List<CfinPenaltyNegoDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
