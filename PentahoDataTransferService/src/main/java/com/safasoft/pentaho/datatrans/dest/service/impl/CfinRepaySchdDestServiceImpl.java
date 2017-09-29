package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinRepaySchdDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinRepaySchdDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinRepaySchdDestService;

@Service("cfinRepaySchdDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinRepaySchdDestServiceImpl implements CfinRepaySchdDestService {

	@Autowired
	private CfinRepaySchdDestDAO cfinRepaySchdDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinRepaySchdDest> save(List<CfinRepaySchdDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinRepaySchdDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinRepaySchdDestDAO.truncateTable(tableName);
	}
}
