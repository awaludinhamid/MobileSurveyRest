package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstHousestatusDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstHousestatusDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstHousestatusDestService;

@Service("applMstHousestatusDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstHousestatusDestServiceImpl implements ApplMstHousestatusDestService {

	@Autowired
	private ApplMstHousestatusDestDAO applMstHousestatusDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstHousestatusDest> save(List<ApplMstHousestatusDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstHousestatusDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstHousestatusDestDAO.truncateTable(tableName);
	}
}
