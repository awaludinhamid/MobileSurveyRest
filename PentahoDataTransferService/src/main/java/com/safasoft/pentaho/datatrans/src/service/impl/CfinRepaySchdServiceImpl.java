package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinRepaySchd;
import com.safasoft.pentaho.datatrans.src.dao.CfinRepaySchdDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinRepaySchdService;

@Service("cfinRepaySchdService")
@Transactional(readOnly=true)
public class CfinRepaySchdServiceImpl implements CfinRepaySchdService {
	
	@Autowired
	private CfinRepaySchdDAO cfinRepaySchdDAO;

	@Override
	public List<CfinRepaySchd> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinRepaySchdDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinRepaySchdDAO.count();
	}

}
