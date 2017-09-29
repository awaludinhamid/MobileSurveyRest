package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContCustindDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinContCustindDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinContCustindDestService;

@Service("cfinContCustindDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinContCustindDestServiceImpl implements CfinContCustindDestService {

	@Autowired
	private CfinContCustindDestDAO cfinContCustindDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinContCustindDest> save(List<CfinContCustindDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinContCustindDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinContCustindDestDAO.truncateTable(tableName);
	}
}
