package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioHdrsDest;

public interface CfinMstRiPrioHdrsDestService {

	List<CfinMstRiPrioHdrsDest> save(List<CfinMstRiPrioHdrsDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
