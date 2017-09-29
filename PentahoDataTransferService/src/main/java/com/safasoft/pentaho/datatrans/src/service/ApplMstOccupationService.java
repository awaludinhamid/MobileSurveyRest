package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstOccupation;

public interface ApplMstOccupationService {

	List<ApplMstOccupation> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
