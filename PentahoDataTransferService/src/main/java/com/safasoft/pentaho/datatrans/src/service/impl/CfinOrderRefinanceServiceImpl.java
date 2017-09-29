package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinOrderRefinance;
import com.safasoft.pentaho.datatrans.src.dao.CfinOrderRefinanceDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinOrderRefinanceService;

@Service("cfinOrderRefinanceService")
@Transactional(readOnly=true)
public class CfinOrderRefinanceServiceImpl implements CfinOrderRefinanceService {

	@Autowired
	private CfinOrderRefinanceDAO cfinOrderRefinanceDAO;

	@Override
	public List<CfinOrderRefinance> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinOrderRefinanceDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinOrderRefinanceDAO.count();
	}
}
