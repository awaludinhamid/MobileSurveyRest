package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustcoyCat;

public interface ApplCustcoyCatService {

	List<ApplCustcoyCat> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
