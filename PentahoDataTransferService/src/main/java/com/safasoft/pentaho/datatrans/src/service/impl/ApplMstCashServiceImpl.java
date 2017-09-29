package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCash;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstCashDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCashService;

@Service("applMstCashService")
@Transactional(readOnly=true)
public class ApplMstCashServiceImpl implements ApplMstCashService {

	@Autowired
	private ApplMstCashDAO applMstCashDAO;

	@Override
	public List<ApplMstCash> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstCashDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstCashDAO.count();
	}
}
