package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinContCustind;

public interface CfinContCustindService {

	List<CfinContCustind> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
