package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustBank;
import com.safasoft.pentaho.datatrans.src.dao.ApplCustBankDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCustBankService;

@Service("applCustBankService")
@Transactional(readOnly=true)
public class ApplCustBankServiceImpl implements ApplCustBankService {

	@Autowired
	private ApplCustBankDAO applCustBankDAO;

	@Override
	public List<ApplCustBank> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applCustBankDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applCustBankDAO.count();
	}
}
