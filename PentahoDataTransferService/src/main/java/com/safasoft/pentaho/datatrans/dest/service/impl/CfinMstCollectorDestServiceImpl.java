package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstCollectorDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstCollectorDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstCollectorDestService;

@Service("cfinMstCollectorDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstCollectorDestServiceImpl implements CfinMstCollectorDestService {

	@Autowired
	private CfinMstCollectorDestDAO cfinMstCollectorDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstCollectorDest> save(List<CfinMstCollectorDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstCollectorDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstCollectorDestDAO.truncateTable(tableName);
	}
}
