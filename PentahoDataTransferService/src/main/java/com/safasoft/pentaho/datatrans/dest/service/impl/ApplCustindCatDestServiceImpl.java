package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCustindCatDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCustindCatDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCustindCatDestService;

@Service("applCustindCatDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCustindCatDestServiceImpl implements ApplCustindCatDestService {

	@Autowired
	private ApplCustindCatDestDAO applCustindCatDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplCustindCatDest> save(List<ApplCustindCatDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applCustindCatDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applCustindCatDestDAO.truncateTable(tableName);
	}
}
