package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstBank;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstBankDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstBankService;

@Service("applMstBankService")
@Transactional(readOnly=true)
public class ApplMstBankServiceImpl implements ApplMstBankService {

	@Autowired
	private ApplMstBankDAO applMstBankDAO;

	@Override
	public List<ApplMstBank> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstBankDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstBankDAO.count();
	}
}
