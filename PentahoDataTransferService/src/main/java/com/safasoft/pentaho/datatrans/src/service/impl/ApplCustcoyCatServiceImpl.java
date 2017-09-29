package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustcoyCat;
import com.safasoft.pentaho.datatrans.src.dao.ApplCustcoyCatDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCustcoyCatService;

@Service("applCustcoyCatService")
@Transactional(readOnly=true)
public class ApplCustcoyCatServiceImpl implements ApplCustcoyCatService {

	@Autowired
	private ApplCustcoyCatDAO applCustcoyCatDAO;

	@Override
	public List<ApplCustcoyCat> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applCustcoyCatDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applCustcoyCatDAO.count();
	}
}
