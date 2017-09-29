package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstProvinceDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplMstProvinceDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstProvinceDestService;

@Service("applMstProvinceDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplMstProvinceDestServiceImpl implements ApplMstProvinceDestService {

	@Autowired
	private ApplMstProvinceDestDAO applMstProvinceDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplMstProvinceDest> save(List<ApplMstProvinceDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applMstProvinceDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applMstProvinceDestDAO.truncateTable(tableName);
	}
}
