package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstIdtypeDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstIdtypeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstIdtypeDestService;

@Service("applMstIdtypeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstIdtypeDestServiceImpl implements ApplMstIdtypeDestService {

	@Autowired
	private ApplMstIdtypeDestDAO applMstIdtypeDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstIdtypeDest> save(List<ApplMstIdtypeDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstIdtypeDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstIdtypeDestDAO.truncateTable(tableName);
	}
}
