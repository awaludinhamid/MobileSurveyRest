package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstCurrencyDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstCurrencyDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstCurrencyDestService;

@Service("applMstCurrencyDestService")
@Transactional(readOnly=true, value="transactionManager2")
public class ApplMstCurrencyDestServcieImpl implements ApplMstCurrencyDestService {

	@Autowired
	private ApplMstCurrencyDestDAO applMstCurrencyDestDAO;

	@Override
	@Transactional(readOnly=false, value="transactionManager2")
	public List<ApplMstCurrencyDest> save(List<ApplMstCurrencyDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstCurrencyDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstCurrencyDestDAO.truncateTable(tableName);
	}
}
