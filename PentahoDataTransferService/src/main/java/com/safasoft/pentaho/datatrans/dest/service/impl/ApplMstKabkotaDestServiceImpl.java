package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKabkotaDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstKabkotaDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstKabkotaDestService;

@Service("applMstKabkotaDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstKabkotaDestServiceImpl implements ApplMstKabkotaDestService {

	@Autowired
	private ApplMstKabkotaDestDAO applMstKabkotaDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstKabkotaDest> save(List<ApplMstKabkotaDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstKabkotaDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstKabkotaDestDAO.truncateTable(tableName);
	}
}
