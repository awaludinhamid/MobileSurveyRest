package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstVmktprice;

public interface CfinMstVmktpriceService {

	List<CfinMstVmktprice> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
