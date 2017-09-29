package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstReligionDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstReligionDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstReligionDestService;

@Service("applMstReligionDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstReligionDestServiceImpl implements ApplMstReligionDestService {

	@Autowired
	private ApplMstReligionDestDAO applMstReligionDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstReligionDest> save(List<ApplMstReligionDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstReligionDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstReligionDestDAO.count();
	}
}
