package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCompanyDataDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCompanyDataDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCompanyDataDestService;

@Service("applCompanyDataDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCompanyDataDestServiceImpl implements ApplCompanyDataDestService {

	@Autowired
	private ApplCompanyDataDestDAO applCompanyDataDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCompanyDataDest> save(List<ApplCompanyDataDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCompanyDataDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCompanyDataDestDAO.truncateTable(tableName);
	}
}
