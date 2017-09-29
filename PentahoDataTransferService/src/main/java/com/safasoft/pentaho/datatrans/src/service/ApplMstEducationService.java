package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstEducation;

public interface ApplMstEducationService {

	List<ApplMstEducation> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
