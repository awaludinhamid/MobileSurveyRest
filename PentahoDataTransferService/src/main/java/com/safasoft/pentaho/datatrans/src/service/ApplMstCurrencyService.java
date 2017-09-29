package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCurrency;

public interface ApplMstCurrencyService {

	List<ApplMstCurrency> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
