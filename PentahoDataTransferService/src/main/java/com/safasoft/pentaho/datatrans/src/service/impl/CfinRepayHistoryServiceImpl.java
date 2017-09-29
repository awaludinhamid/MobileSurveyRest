package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinRepayHistory;
import com.safasoft.pentaho.datatrans.src.dao.CfinRepayHistoryDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinRepayHistoryService;

@Service("cfinRepayHistoryService")
@Transactional(readOnly=true)
public class CfinRepayHistoryServiceImpl implements CfinRepayHistoryService {

	@Autowired
	private CfinRepayHistoryDAO cfinRepayHistoryDAO;

	@Override
	public List<CfinRepayHistory> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinRepayHistoryDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinRepayHistoryDAO.count();
	}
}
