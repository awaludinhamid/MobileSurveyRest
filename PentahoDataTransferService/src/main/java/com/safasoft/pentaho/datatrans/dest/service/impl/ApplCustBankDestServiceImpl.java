package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustBankDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCustBankDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustBankDestService;

@Service("applCustBankDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCustBankDestServiceImpl implements ApplCustBankDestService {

	@Autowired
	private ApplCustBankDestDAO applCustBankDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCustBankDest> save(List<ApplCustBankDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCustBankDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCustBankDestDAO.truncateTable(tableName);
	}
}
