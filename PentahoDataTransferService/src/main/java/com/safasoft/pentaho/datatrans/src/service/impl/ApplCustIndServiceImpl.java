package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustInd;
import com.safasoft.pentaho.datatrans.src.dao.ApplCustIndDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCustIndService;

@Service("applCustIndService")
@Transactional(readOnly=true)
public class ApplCustIndServiceImpl implements ApplCustIndService {

	@Autowired
	private ApplCustIndDAO applCustIndDAO;

	@Override
	public List<ApplCustInd> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applCustIndDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applCustIndDAO.count();
	}
}
