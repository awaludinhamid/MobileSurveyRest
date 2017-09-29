package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCustomer;

public interface ApplMstCustomerService {

	List<ApplMstCustomer> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
