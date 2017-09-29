package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstKabkota;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstKabkotaDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstKabkotaService;

@Service("applMstKabkotaService")
@Transactional(readOnly=true)
public class ApplMstKabkotaServiceImpl implements ApplMstKabkotaService {

	@Autowired
	private ApplMstKabkotaDAO applMstKabkotaDAO;

	@Override
	public List<ApplMstKabkota> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstKabkotaDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstKabkotaDAO.count();
	}
}
