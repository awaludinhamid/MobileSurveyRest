package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinOverbookDtl;

public interface CfinOverbookDtlService {

	List<CfinOverbookDtl> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
