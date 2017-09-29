package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCustomer;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstCustomerDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCustomerService;

@Service("applMstCustomerService")
@Transactional(readOnly=true)
public class ApplMstCustomerServiceImpl implements ApplMstCustomerService {

	@Autowired
	private ApplMstCustomerDAO applMstCustomerDAO;

	@Override
	public List<ApplMstCustomer> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstCustomerDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstCustomerDAO.count();
	}
}
