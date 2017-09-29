package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinArBeban;
import com.safasoft.pentaho.datatrans.src.dao.CfinArBebanDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinArBebanService;

@Service("cfinArBebanService")
@Transactional(readOnly=true)
public class CfinArBebanServiceImpl implements CfinArBebanService {

	@Autowired
	private CfinArBebanDAO cfinArBebanDAO;

	@Override
	public List<CfinArBeban> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinArBebanDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinArBebanDAO.count();
	}
}
