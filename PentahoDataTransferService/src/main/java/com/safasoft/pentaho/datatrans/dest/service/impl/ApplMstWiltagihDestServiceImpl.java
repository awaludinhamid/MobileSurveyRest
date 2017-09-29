package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstWiltagihDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstWiltagihDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstWiltagihDestService;

@Service("applMstWiltagihDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstWiltagihDestServiceImpl implements ApplMstWiltagihDestService {

	@Autowired
	ApplMstWiltagihDestDAO applMstWiltagihDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstWiltagihDest> save(List<ApplMstWiltagihDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstWiltagihDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstWiltagihDestDAO.truncateTable(tableName);
	}
}
