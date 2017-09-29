package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinRepaySchd;

public interface CfinRepaySchdService {

	List<CfinRepaySchd> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
