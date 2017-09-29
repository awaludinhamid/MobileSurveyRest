package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinInterestTypeDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinInterestTypeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinInterestTypeDestService;

@Service("cfinInterestTypeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinInterestTypeDestServiceImpl implements CfinInterestTypeDestService {

	@Autowired
	private CfinInterestTypeDestDAO cfinInterestTypeDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinInterestTypeDest> save(List<CfinInterestTypeDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinInterestTypeDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinInterestTypeDestDAO.truncateTable(tableName);
	}
}
