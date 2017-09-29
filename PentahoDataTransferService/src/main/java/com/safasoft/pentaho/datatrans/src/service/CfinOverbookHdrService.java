package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinOverbookHdr;

public interface CfinOverbookHdrService {

	List<CfinOverbookHdr> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
