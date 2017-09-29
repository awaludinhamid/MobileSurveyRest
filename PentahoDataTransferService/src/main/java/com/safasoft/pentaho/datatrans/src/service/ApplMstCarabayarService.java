package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCarabayar;

public interface ApplMstCarabayarService {

	List<ApplMstCarabayar> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
