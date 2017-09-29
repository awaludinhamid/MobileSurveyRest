package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCompanyData;

public interface ApplCompanyDataService {

	List<ApplCompanyData> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
