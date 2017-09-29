package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstKabkota;

public interface ApplMstKabkotaService {

	List<ApplMstKabkota> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
