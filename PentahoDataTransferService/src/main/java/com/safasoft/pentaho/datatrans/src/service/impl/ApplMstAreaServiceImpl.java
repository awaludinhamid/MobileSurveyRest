package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstArea;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstAreaDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstAreaService;

@Service("applMstAreaService")
@Transactional(readOnly=true)
public class ApplMstAreaServiceImpl implements ApplMstAreaService {

	@Autowired
	private ApplMstAreaDAO applMstAreaDAO;

	@Override
	public List<ApplMstArea> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstAreaDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstAreaDAO.count();
	}
}
