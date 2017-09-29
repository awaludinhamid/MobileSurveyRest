package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstParamProyeksiDest;

public interface CfinMstParamProyeksiDestService {

	List<CfinMstParamProyeksiDest> save(List<CfinMstParamProyeksiDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
