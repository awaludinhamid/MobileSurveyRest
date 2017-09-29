package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCoyBankacct;

public interface ApplCoyBankacctService {

	List<ApplCoyBankacct> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
