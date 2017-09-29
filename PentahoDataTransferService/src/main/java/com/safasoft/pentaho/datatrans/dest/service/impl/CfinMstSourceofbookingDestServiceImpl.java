package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstSourceofbookingDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstSourceofbookingDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstSourceofbookingDestService;

@Service("cfinMstSourceofbookingDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstSourceofbookingDestServiceImpl implements CfinMstSourceofbookingDestService {

	@Autowired
	private CfinMstSourceofbookingDestDAO cfinMstSourceofbookingDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstSourceofbookingDest> save(List<CfinMstSourceofbookingDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstSourceofbookingDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstSourceofbookingDestDAO.truncateTable(tableName);
	}
}
