package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstReligion;

public interface ApplMstReligionService {

	List<ApplMstReligion> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
