package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinOverbookDtl;
import com.safasoft.pentaho.datatrans.src.dao.CfinOverbookDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinOverbookDtlService;

@Service("cfinOverbookDtlService")
@Transactional(readOnly=true)
public class CfinOverbookDtlServiceImpl implements CfinOverbookDtlService {

	@Autowired
	private CfinOverbookDtlDAO cfinOverbookDtlDAO;

	@Override
	public List<CfinOverbookDtl> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinOverbookDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinOverbookDtlDAO.count();
	}
}
