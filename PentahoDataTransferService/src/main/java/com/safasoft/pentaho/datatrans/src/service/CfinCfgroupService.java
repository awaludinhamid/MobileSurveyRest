package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinCfgroup;

public interface CfinCfgroupService {

	List<CfinCfgroup> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
