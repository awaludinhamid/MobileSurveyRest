package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplBankBranch;

public interface ApplBankBranchService {

	List<ApplBankBranch> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
