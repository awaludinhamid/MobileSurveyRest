package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustcoyCatDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCustcoyCatDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustcoyCatDestService;

@Service("applCustcoyCatDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCustcoyCatDestServiceImpl implements ApplCustcoyCatDestService {

	@Autowired
	private ApplCustcoyCatDestDAO applCustcoyCatDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCustcoyCatDest> save(List<ApplCustcoyCatDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCustcoyCatDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCustcoyCatDestDAO.truncateTable(tableName);
	}
}
