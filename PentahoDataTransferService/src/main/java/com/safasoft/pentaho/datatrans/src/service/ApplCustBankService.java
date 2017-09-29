package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustBank;

public interface ApplCustBankService {

	List<ApplCustBank> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
