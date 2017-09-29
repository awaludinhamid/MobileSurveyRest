package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplUsersDest;

public interface ApplUsersDestService {

	List<ApplUsersDest> save(List<ApplUsersDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
