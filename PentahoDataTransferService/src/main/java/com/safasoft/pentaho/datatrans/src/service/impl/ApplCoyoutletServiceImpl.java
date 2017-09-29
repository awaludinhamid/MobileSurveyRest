package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCoyoutlet;
import com.safasoft.pentaho.datatrans.src.dao.ApplCoyoutletDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCoyoutletService;

@Service("applCoyoutletService")
@Transactional(readOnly=true)
public class ApplCoyoutletServiceImpl implements ApplCoyoutletService {

	@Autowired
	private ApplCoyoutletDAO applCoyoutletDAO;

	@Override
	public List<ApplCoyoutlet> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applCoyoutletDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applCoyoutletDAO.count();
	}
}
