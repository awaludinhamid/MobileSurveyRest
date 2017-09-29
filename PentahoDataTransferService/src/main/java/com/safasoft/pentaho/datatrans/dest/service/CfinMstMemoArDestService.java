package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstMemoArDest;

public interface CfinMstMemoArDestService {

	List<CfinMstMemoArDest> save(List<CfinMstMemoArDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
