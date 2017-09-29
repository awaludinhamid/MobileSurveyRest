package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstHousestatus;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstHousestatusDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstHousestatusService;

@Service("applMstHousestatusService")
@Transactional(readOnly=true)
public class ApplMstHousestatusServiceImpl implements ApplMstHousestatusService {

	@Autowired
	private ApplMstHousestatusDAO applMstHousestatusDAO;

	@Override
	public List<ApplMstHousestatus> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstHousestatusDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstHousestatusDAO.count();
	}
}
