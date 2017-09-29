package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinContaddrTgh;

public interface CfinContaddrTghService {

	List<CfinContaddrTgh> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
