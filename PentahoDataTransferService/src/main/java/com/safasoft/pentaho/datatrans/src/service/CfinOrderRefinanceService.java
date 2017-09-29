package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinOrderRefinance;

public interface CfinOrderRefinanceService {

	List<CfinOrderRefinance> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
