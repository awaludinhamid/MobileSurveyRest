package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContaddrTghDest;

public interface CfinContaddrTghDestService {

	List<CfinContaddrTghDest> save(List<CfinContaddrTghDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
