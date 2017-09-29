package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinRepayHistoryDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinRepayHistoryDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinRepayHistoryDestService;

@Service("cfinRepayHistoryDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinRepayHistoryDestServiceImpl implements CfinRepayHistoryDestService {

	@Autowired
	private CfinRepayHistoryDestDAO cfinRepayHistoryDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinRepayHistoryDest> save(List<CfinRepayHistoryDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinRepayHistoryDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinRepayHistoryDestDAO.truncateTable(tableName);
	}
}
