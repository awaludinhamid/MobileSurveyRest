package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiParamDest;

public interface CfinMstRiParamDestService {

	List<CfinMstRiParamDest> save(List<CfinMstRiParamDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
