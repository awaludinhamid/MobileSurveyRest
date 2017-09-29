package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstEducation;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstEducationDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstEducationService;

@Service("applMstEducationService")
@Transactional(readOnly=true)
public class ApplMstEducationServiceImpl implements ApplMstEducationService {

	@Autowired
	private ApplMstEducationDAO applMstEducationDAO;

	@Override
	public List<ApplMstEducation> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstEducationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstEducationDAO.count();
	}
}
