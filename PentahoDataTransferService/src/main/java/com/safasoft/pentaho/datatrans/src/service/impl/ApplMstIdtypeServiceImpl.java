package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstIdtype;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstIdtypeDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstIdtypeService;

@Service("applMstIdtypeService")
@Transactional(readOnly=true)
public class ApplMstIdtypeServiceImpl implements ApplMstIdtypeService {

	@Autowired
	private ApplMstIdtypeDAO applMstIdtypeDAO;

	@Override
	public List<ApplMstIdtype> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstIdtypeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstIdtypeDAO.count();
	}
}
