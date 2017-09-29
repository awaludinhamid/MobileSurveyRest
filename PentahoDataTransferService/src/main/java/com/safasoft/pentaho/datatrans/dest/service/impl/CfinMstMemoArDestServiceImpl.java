package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstMemoArDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstMemoArDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstMemoArDestService;

@Service("cfinMstMemoArDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstMemoArDestServiceImpl implements CfinMstMemoArDestService {

	@Autowired
	private CfinMstMemoArDestDAO cfinMstMemoArDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstMemoArDest> save(List<CfinMstMemoArDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstMemoArDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstMemoArDestDAO.truncateTable(tableName);
	}
}
