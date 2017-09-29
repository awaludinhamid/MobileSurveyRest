package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstReligion;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstReligionDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstReligionService;

@Service("applMstReligionService")
@Transactional(readOnly=true)
public class ApplMstReligionServiceImpl implements ApplMstReligionService {

	@Autowired
	private ApplMstReligionDAO applMstReligionDAO;

	@Override
	public List<ApplMstReligion> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstReligionDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstReligionDAO.count();
	}
}
