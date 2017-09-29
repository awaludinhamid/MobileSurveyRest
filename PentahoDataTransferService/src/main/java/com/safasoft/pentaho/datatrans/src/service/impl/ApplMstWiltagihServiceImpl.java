package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstWiltagih;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstWiltagihDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstWiltagihService;

@Service("applMstWiltagihService")
@Transactional(readOnly=true)
public class ApplMstWiltagihServiceImpl implements ApplMstWiltagihService {

	@Autowired
	private ApplMstWiltagihDAO applMstWiltagihDAO;

	@Override
	public List<ApplMstWiltagih> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstWiltagihDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstWiltagihDAO.count();
	}
}
