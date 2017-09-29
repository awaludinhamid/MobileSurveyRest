package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinCfgroupAccountDest;

public interface CfinCfgroupAccountDestService {

	List<CfinCfgroupAccountDest> save(List<CfinCfgroupAccountDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
