package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCoyoutlet;

public interface ApplCoyoutletService {

	List<ApplCoyoutlet> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
