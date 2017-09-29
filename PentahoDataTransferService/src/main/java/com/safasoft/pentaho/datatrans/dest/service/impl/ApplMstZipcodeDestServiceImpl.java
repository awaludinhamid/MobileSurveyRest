package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstZipcodeDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstZipcodeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstZipcodeDestService;

@Service("applMstZipcodeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstZipcodeDestServiceImpl implements ApplMstZipcodeDestService {

	@Autowired
	private ApplMstZipcodeDestDAO applMstZipcodeDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstZipcodeDest> save(List<ApplMstZipcodeDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstZipcodeDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstZipcodeDestDAO.count();
	}
}
