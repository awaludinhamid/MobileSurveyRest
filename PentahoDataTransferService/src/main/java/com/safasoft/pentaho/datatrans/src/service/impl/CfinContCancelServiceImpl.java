package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinContCancel;
import com.safasoft.pentaho.datatrans.src.dao.CfinContCancelDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinContCancelService;

@Service("cfinContCancelService")
@Transactional(readOnly=true)
public class CfinContCancelServiceImpl implements CfinContCancelService {

	@Autowired
	private CfinContCancelDAO cfinContCancelDAO;

	@Override
	public List<CfinContCancel> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinContCancelDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinContCancelDAO.count();
	}
}
