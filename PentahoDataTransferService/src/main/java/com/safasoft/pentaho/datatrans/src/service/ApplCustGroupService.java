package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustGroup;

public interface ApplCustGroupService {

	List<ApplCustGroup> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
