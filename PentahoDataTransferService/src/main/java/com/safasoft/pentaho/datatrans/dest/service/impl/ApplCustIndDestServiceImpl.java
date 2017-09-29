package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustIndDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCustIndDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustIndDestService;

@Service("applCustIndDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCustIndDestServiceImpl implements ApplCustIndDestService {

	@Autowired
	private ApplCustIndDestDAO applCustIndDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCustIndDest> save(List<ApplCustIndDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCustIndDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCustIndDestDAO.truncateTable(tableName);
	}
}
