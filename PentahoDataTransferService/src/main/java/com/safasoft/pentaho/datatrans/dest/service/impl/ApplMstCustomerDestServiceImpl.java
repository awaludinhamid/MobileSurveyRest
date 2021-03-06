package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCustomerDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstCustomerDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCustomerDestService;

@Service("applMstCustomerDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstCustomerDestServiceImpl implements ApplMstCustomerDestService {

	@Autowired
	private ApplMstCustomerDestDAO applMstCustomerDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstCustomerDest> save(List<ApplMstCustomerDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstCustomerDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstCustomerDestDAO.truncateTable(tableName);
	}
}
