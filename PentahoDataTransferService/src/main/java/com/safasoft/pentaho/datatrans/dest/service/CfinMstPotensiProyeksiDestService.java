package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstPotensiProyeksiDest;

public interface CfinMstPotensiProyeksiDestService {

	List<CfinMstPotensiProyeksiDest> save(List<CfinMstPotensiProyeksiDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
