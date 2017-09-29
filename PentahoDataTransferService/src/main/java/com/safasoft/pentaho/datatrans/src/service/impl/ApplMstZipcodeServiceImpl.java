package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstZipcode;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstZipcodeDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstZipcodeService;

@Service("applMstZipcodeService")
@Transactional(readOnly=true)
public class ApplMstZipcodeServiceImpl implements ApplMstZipcodeService {

	@Autowired
	private ApplMstZipcodeDAO applMstZipcodeDAO;

	@Override
	public List<ApplMstZipcode> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstZipcodeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstZipcodeDAO.count();
	}
}
