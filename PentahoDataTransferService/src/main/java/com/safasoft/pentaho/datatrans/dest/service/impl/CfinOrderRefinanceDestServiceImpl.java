package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinOrderRefinanceDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinOrderRefinanceDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinOrderRefinanceDestService;

@Service("cfinOrderRefinanceDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinOrderRefinanceDestServiceImpl implements CfinOrderRefinanceDestService {

	@Autowired
	private CfinOrderRefinanceDestDAO cfinOrderRefinanceDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinOrderRefinanceDest> save(List<CfinOrderRefinanceDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinOrderRefinanceDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinOrderRefinanceDestDAO.truncateTable(tableName);
	}
}
