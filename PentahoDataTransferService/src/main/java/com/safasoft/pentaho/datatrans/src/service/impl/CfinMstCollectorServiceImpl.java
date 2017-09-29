package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstCollector;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstCollectorDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstCollectorService;

@Service("cfinMstCollectorService")
@Transactional(readOnly=true)
public class CfinMstCollectorServiceImpl implements CfinMstCollectorService {

	@Autowired
	private CfinMstCollectorDAO cfinMstCollectorDAO;

	@Override
	public List<CfinMstCollector> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstCollectorDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstCollectorDAO.count();
	}
}
