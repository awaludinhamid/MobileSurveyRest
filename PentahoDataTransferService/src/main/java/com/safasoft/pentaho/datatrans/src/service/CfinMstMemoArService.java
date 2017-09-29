package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstMemoAr;

public interface CfinMstMemoArService {

	List<CfinMstMemoAr> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
