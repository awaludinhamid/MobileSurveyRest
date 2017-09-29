package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstOrderType;

public interface ApplMstOrderTypeService {

	List<ApplMstOrderType> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
