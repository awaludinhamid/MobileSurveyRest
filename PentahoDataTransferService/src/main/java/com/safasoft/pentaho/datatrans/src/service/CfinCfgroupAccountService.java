package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinCfgroupAccount;

public interface CfinCfgroupAccountService {

	List<CfinCfgroupAccount> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
