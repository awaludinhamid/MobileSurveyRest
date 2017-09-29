package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinContaddrTgh;
import com.safasoft.pentaho.datatrans.src.dao.CfinContaddrTghDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinContaddrTghService;

@Service("cfinContaddrTghService")
@Transactional(readOnly=true)
public class CfinContaddrTghServiceImpl implements CfinContaddrTghService {

	@Autowired
	private CfinContaddrTghDAO cfinContaddrTghDAO;

	@Override
	public List<CfinContaddrTgh> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinContaddrTghDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinContaddrTghDAO.count();
	}
}
