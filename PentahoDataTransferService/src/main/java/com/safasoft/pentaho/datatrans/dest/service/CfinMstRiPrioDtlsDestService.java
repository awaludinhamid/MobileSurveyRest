package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioDtlsDest;

public interface CfinMstRiPrioDtlsDestService {

	List<CfinMstRiPrioDtlsDest> save(List<CfinMstRiPrioDtlsDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
