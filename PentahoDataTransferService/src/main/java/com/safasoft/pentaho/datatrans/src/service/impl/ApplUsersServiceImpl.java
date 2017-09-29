package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplUsers;
import com.safasoft.pentaho.datatrans.src.dao.ApplUsersDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplUsersService;

@Service("applUsersService")
@Transactional(readOnly=true)
public class ApplUsersServiceImpl implements ApplUsersService {

	@Autowired
	private ApplUsersDAO applUsersDAO;

	@Override
	public List<ApplUsers> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applUsersDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applUsersDAO.count();
	}
}
