package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCash;

public interface ApplMstCashService {

	List<ApplMstCash> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
