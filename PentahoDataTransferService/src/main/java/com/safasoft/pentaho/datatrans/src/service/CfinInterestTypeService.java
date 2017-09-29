package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinInterestType;

public interface CfinInterestTypeService {

	List<CfinInterestType> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
