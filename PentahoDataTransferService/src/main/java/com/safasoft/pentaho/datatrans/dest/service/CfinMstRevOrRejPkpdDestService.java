package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRevOrRejPkpdDest;

public interface CfinMstRevOrRejPkpdDestService {

	List<CfinMstRevOrRejPkpdDest> save(List<CfinMstRevOrRejPkpdDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
