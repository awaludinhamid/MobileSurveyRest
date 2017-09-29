package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioritiesDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstRiPrioritiesDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiPrioritiesDestService;

@Service("cfinMstRiPrioritiesDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstRiPrioritiesDestServiceImpl implements CfinMstRiPrioritiesDestService {

	@Autowired
	private CfinMstRiPrioritiesDestDAO cfinMstRiPrioritiesDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstRiPrioritiesDest> save(List<CfinMstRiPrioritiesDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioritiesDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioritiesDestDAO.truncateTable(tableName);
	}
}
