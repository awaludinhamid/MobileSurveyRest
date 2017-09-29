package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCompanyData;
import com.safasoft.pentaho.datatrans.src.dao.ApplCompanyDataDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCompanyDataService;

@Service("applCompanyDataService")
@Transactional(readOnly=true)
public class ApplCompanyDataServiceImpl implements ApplCompanyDataService {

	@Autowired
	private ApplCompanyDataDAO applCompanyDataDAO;

	@Override
	public List<ApplCompanyData> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applCompanyDataDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applCompanyDataDAO.count();
	}
}
