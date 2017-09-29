package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstProvince;

public interface ApplMstProvinceService {

	List<ApplMstProvince> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
