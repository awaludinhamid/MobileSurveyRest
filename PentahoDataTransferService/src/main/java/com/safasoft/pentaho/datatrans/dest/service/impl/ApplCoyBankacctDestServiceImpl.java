package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyBankacctDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCoyBankacctDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCoyBankacctDestService;

@Service("applCoyBankacctDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCoyBankacctDestServiceImpl implements ApplCoyBankacctDestService {

	@Autowired
	private ApplCoyBankacctDestDAO applCoyBankacctDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCoyBankacctDest> save(List<ApplCoyBankacctDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCoyBankacctDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCoyBankacctDestDAO.truncateTable(tableName);
	}
}
