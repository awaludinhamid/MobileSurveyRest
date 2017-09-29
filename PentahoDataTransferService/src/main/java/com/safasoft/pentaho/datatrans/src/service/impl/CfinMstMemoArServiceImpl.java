package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstMemoAr;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstMemoArDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstMemoArService;

@Service("cfinMstMemoArService")
@Transactional(readOnly=true)
public class CfinMstMemoArServiceImpl implements CfinMstMemoArService {

	@Autowired
	private CfinMstMemoArDAO cfinMstMemoArDAO;

	@Override
	public List<CfinMstMemoAr> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstMemoArDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstMemoArDAO.count();
	}
}
