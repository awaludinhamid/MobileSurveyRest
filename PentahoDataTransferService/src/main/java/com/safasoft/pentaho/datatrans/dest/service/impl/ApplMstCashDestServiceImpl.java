package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCashDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstCashDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCashDestService;

@Service("applMstCashDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstCashDestServiceImpl implements ApplMstCashDestService {

	@Autowired
	private ApplMstCashDestDAO applMstCashDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstCashDest> save(List<ApplMstCashDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstCashDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstCashDestDAO.truncateTable(tableName);
	}
}
