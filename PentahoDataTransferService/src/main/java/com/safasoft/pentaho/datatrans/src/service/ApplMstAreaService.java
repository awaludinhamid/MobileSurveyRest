package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstArea;

public interface ApplMstAreaService {

	List<ApplMstArea> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
