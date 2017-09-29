package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstSourceofbooking;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstSourceofbookingDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstSourceofbookingService;

@Service("cfinMstSourceofbookingService")
@Transactional(readOnly=true)
public class CfinMstSourceofbookingServiceImpl implements CfinMstSourceofbookingService {

	@Autowired
	private CfinMstSourceofbookingDAO cfinMstSourceofbookingDAO;

	@Override
	public List<CfinMstSourceofbooking> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstSourceofbookingDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstSourceofbookingDAO.count();
	}
}
