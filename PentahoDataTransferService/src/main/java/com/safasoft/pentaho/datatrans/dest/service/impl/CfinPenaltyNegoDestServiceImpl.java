package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinPenaltyNegoDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinPenaltyNegoDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinPenaltyNegoDestService;

@Service("cfinPenaltyNegoDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinPenaltyNegoDestServiceImpl implements CfinPenaltyNegoDestService {

	@Autowired
	private CfinPenaltyNegoDestDAO cfinPenaltyNegoDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinPenaltyNegoDest> save(List<CfinPenaltyNegoDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinPenaltyNegoDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinPenaltyNegoDestDAO.truncateTable(tableName);
	}
}
