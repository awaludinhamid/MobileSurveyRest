package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOverbookDtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinOverbookDtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinOverbookDtlDestService;

@Service("cfinOverbookDtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinOverbookDtlDestServiceImpl implements CfinOverbookDtlDestService {

	@Autowired
	private CfinOverbookDtlDestDAO cfinOverbookDtlDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinOverbookDtlDest> save(List<CfinOverbookDtlDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinOverbookDtlDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinOverbookDtlDestDAO.truncateTable(tableName);
	}
}
