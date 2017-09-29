package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinCfgroupDest;

public interface CfinCfgroupDestService {

	List<CfinCfgroupDest> save(List<CfinCfgroupDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
