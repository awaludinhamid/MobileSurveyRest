package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustGroupDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCustGroupDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustGroupDestService;

@Service("applCustGroupDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCustGroupDestServiceImpl implements ApplCustGroupDestService {

	@Autowired
	ApplCustGroupDestDAO applCustGroupDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCustGroupDest> save(List<ApplCustGroupDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCustGroupDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCustGroupDestDAO.truncateTable(tableName);
	}
}
