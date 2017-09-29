package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstKecamatanDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstKecamatanDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstKecamatanDestService;

@Service("applMstKecamatanDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstKecamatanDestServiceImpl implements ApplMstKecamatanDestService {

	@Autowired
	private ApplMstKecamatanDestDAO applMstKecamatanDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstKecamatanDest> save(List<ApplMstKecamatanDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstKecamatanDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstKecamatanDestDAO.truncateTable(tableName);
	}
}
