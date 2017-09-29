package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCoyBankacct;
import com.safasoft.pentaho.datatrans.src.dao.ApplCoyBankacctDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCoyBankacctService;

@Service("applCoyBankacctService")
@Transactional(readOnly=true)
public class ApplCoyBankacctServiceImpl implements ApplCoyBankacctService {

	@Autowired
	private ApplCoyBankacctDAO applCoyBankacctDAO;

	@Override
	public List<ApplCoyBankacct> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applCoyBankacctDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applCoyBankacctDAO.count();
	}
}
