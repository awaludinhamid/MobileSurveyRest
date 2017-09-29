package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPrioHdrs;

public interface CfinMstRiPrioHdrsService {

	List<CfinMstRiPrioHdrs> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
