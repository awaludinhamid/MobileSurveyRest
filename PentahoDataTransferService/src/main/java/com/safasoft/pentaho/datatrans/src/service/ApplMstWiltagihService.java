package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstWiltagih;

public interface ApplMstWiltagihService {

	List<ApplMstWiltagih> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
