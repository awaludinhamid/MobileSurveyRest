package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinRepayHistory;

public interface CfinRepayHistoryService {

	List<CfinRepayHistory> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
