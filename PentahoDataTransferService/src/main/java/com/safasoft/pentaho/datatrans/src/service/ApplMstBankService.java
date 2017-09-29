package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstBank;

public interface ApplMstBankService {

	List<ApplMstBank> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
