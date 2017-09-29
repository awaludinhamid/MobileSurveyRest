package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinContCancel;

public interface CfinContCancelService {

	List<CfinContCancel> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
