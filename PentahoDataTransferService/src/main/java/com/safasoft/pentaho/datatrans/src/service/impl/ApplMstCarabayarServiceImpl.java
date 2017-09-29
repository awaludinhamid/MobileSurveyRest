package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstCarabayar;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstCarabayarDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstCarabayarService;

@Service("applMstCarabayarService")
@Transactional(readOnly=true)
public class ApplMstCarabayarServiceImpl implements ApplMstCarabayarService {

	@Autowired
	private ApplMstCarabayarDAO applMstCarabayarDAO;

	@Override
	public List<ApplMstCarabayar> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstCarabayarDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstCarabayarDAO.count();
	}
}
