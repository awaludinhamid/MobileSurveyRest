package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyoutletDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCoyoutletDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCoyoutletDestService;

@Service("applCoyoutletDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCoyoutletDestServiceImpl implements ApplCoyoutletDestService {

	@Autowired
	private ApplCoyoutletDestDAO applCoyoutletDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCoyoutletDest> save(List<ApplCoyoutletDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCoyoutletDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCoyoutletDestDAO.truncateTable(tableName);
	}
}
