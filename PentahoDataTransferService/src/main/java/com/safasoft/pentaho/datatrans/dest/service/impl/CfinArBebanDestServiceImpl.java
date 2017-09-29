package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinArBebanDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinArBebanDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinArBebanDestService;

@Service("cfinArBebanDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinArBebanDestServiceImpl implements CfinArBebanDestService {

	@Autowired
	private CfinArBebanDestDAO cfinArBebanDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinArBebanDest> save(List<CfinArBebanDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinArBebanDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinArBebanDestDAO.truncateTable(tableName);
	}
}
