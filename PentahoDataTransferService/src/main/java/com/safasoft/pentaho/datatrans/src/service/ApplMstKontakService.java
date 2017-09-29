package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstKontak;

public interface ApplMstKontakService {

	List<ApplMstKontak> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
