package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstEducationDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstEducationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstEducationDestService;

@Service("applMstEducationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstEducationDestServiceImpl implements ApplMstEducationDestService {

	@Autowired
	private ApplMstEducationDestDAO applMstEducationDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstEducationDest> save(List<ApplMstEducationDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstEducationDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstEducationDestDAO.truncateTable(tableName);
	}
}
