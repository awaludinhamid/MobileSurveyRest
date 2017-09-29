package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstProvince;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstProvinceDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstProvinceService;

@Service("applMstProvinceService")
@Transactional(readOnly=true)
public class ApplMstProvinceServiceImpl implements ApplMstProvinceService {

	@Autowired
	private ApplMstProvinceDAO applMstProvinceDAO;

	@Override
	public List<ApplMstProvince> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstProvinceDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstProvinceDAO.count();
	}
}
