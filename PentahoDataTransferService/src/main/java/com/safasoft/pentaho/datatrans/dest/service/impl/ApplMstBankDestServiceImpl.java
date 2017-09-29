package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstBankDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstBankDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstBankDestService;

@Service("applMstBankDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstBankDestServiceImpl implements ApplMstBankDestService {

	@Autowired
	private ApplMstBankDestDAO applMstBankDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstBankDest> save(List<ApplMstBankDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstBankDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstBankDestDAO.truncateTable(tableName);
	}
}
