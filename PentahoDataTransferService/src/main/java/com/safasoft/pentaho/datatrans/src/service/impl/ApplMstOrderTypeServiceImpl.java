package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstOrderType;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstOrderTypeDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstOrderTypeService;

@Service("applMstOrderTypeService")
@Transactional(readOnly=true)
public class ApplMstOrderTypeServiceImpl implements ApplMstOrderTypeService {

	@Autowired
	private ApplMstOrderTypeDAO applMstOrderTypeDAO;

	@Override
	public List<ApplMstOrderType> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstOrderTypeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstOrderTypeDAO.count();
	}
}
