package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstIdtype;

public interface ApplMstIdtypeService {

	List<ApplMstIdtype> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
