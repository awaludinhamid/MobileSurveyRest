package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstOccupationDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstOccupationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstOccupationDestService;

@Service("applMstOccupationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstOccupationDestServiceImpl implements ApplMstOccupationDestService {

	@Autowired
	private ApplMstOccupationDestDAO applMstOccupationDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstOccupationDest> save(List<ApplMstOccupationDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstOccupationDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstOccupationDestDAO.truncateTable(tableName);
	}
}
