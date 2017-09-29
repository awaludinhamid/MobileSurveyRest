package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstCollector;

public interface CfinMstCollectorService {

	List<CfinMstCollector> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
