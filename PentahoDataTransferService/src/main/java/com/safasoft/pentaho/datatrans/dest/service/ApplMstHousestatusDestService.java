package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstHousestatusDest;

public interface ApplMstHousestatusDestService {

	List<ApplMstHousestatusDest> save(List<ApplMstHousestatusDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
