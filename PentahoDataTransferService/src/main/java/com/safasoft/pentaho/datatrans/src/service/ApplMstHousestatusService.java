package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstHousestatus;

public interface ApplMstHousestatusService {

	List<ApplMstHousestatus> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
