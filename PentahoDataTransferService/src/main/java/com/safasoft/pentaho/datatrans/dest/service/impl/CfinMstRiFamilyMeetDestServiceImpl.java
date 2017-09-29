package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiFamilyMeetDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstRiFamilyMeetDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiFamilyMeetDestService;

@Service("cfinMstRiFamilyMeetDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstRiFamilyMeetDestServiceImpl implements CfinMstRiFamilyMeetDestService {

	@Autowired
	private CfinMstRiFamilyMeetDestDAO cfinMstRiFamilyMeetDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstRiFamilyMeetDest> save(List<CfinMstRiFamilyMeetDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiFamilyMeetDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstRiFamilyMeetDestDAO.count();
	}
}
