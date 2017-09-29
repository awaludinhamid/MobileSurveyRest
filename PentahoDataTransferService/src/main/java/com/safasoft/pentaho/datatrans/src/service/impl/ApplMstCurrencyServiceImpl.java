package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCurrency;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstCurrencyDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCurrencyService;

@Service("applMstCurrencyService")
@Transactional(readOnly=true)
public class ApplMstCurrencyServiceImpl implements ApplMstCurrencyService {

	@Autowired
	private ApplMstCurrencyDAO applMstCurrencyDAO;

	@Override
	public List<ApplMstCurrency> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstCurrencyDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstCurrencyDAO.count();
	}
}
