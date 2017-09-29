package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstKontak;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstKontakDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstKontakService;

@Service("applMstKontakService")
@Transactional(readOnly=true)
public class ApplMstKontakServiceImpl implements ApplMstKontakService {

	@Autowired
	private ApplMstKontakDAO applMstKontakDAO;

	@Override
	public List<ApplMstKontak> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstKontakDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstKontakDAO.count();
	}
}
