package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOverbookHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinOverbookHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinOverbookHdrDestService;

@Service("cfinOverbookHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinOverbookHdrDestServiceImpl implements CfinOverbookHdrDestService {

	@Autowired
	private CfinOverbookHdrDestDAO cfinOverbookHdrDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinOverbookHdrDest> save(List<CfinOverbookHdrDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinOverbookHdrDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinOverbookHdrDestDAO.truncateTable(tableName);
	}
}
