package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstOccupation;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstOccupationDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstOccupationService;

@Service("applMstOccupationService")
@Transactional(readOnly=true)
public class ApplMstOccupationServiceImpl implements ApplMstOccupationService {

	@Autowired
	private ApplMstOccupationDAO applMstOccupationDAO;

	@Override
	public List<ApplMstOccupation> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstOccupationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstOccupationDAO.count();
	}
}
