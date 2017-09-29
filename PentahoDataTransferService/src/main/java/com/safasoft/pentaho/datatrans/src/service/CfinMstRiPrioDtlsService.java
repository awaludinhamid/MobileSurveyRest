package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPrioDtls;

public interface CfinMstRiPrioDtlsService {

	List<CfinMstRiPrioDtls> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
