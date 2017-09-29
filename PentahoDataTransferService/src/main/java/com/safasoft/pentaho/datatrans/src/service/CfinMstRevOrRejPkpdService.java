package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRevOrRejPkpd;

public interface CfinMstRevOrRejPkpdService {

	List<CfinMstRevOrRejPkpd> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
