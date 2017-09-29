package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustInd;

public interface ApplCustIndService {

	List<ApplCustInd> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
