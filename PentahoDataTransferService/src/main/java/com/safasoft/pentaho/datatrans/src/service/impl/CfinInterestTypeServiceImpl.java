package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinInterestType;
import com.safasoft.pentaho.datatrans.src.dao.CfinInterestTypeDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinInterestTypeService;

@Service("cfinInterestTypeService")
@Transactional(readOnly=true)
public class CfinInterestTypeServiceImpl implements CfinInterestTypeService {

	@Autowired
	private CfinInterestTypeDAO cfinInterestTypeDAO;

	@Override
	public List<CfinInterestType> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinInterestTypeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinInterestTypeDAO.count();
	}
}
