package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplBankBranchDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplBankBranchDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplBankBranchDestService;

@Service("applBankBranchDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplBankBranchDestServiceImpl implements ApplBankBranchDestService {

	@Autowired
	private ApplBankBranchDestDAO applBankBranchDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplBankBranchDest> save(List<ApplBankBranchDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applBankBranchDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applBankBranchDestDAO.truncateTable(tableName);
	}
}
