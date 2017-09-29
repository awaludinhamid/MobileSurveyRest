package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstOrderTypeDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstOrderTypeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstOrderTypeDestService;

@Service("applMstOrderTypeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstOrderTypeDestServiceImpl implements ApplMstOrderTypeDestService {

	@Autowired
	private ApplMstOrderTypeDestDAO applMstOrderTypeDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstOrderTypeDest> save(List<ApplMstOrderTypeDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstOrderTypeDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstOrderTypeDestDAO.truncateTable(tableName);
	}
}
