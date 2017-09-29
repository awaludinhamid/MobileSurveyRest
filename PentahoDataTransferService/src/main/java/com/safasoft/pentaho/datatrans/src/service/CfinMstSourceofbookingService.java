package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstSourceofbooking;

public interface CfinMstSourceofbookingService {

	List<CfinMstSourceofbooking> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
