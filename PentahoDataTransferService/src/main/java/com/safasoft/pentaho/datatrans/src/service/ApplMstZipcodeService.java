package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstZipcode;

public interface ApplMstZipcodeService {

	List<ApplMstZipcode> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
