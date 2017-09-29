package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstVmktprice;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstVmktpriceDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstVmktpriceService;

@Service("cfinMstVmktpriceService")
@Transactional(readOnly=true)
public class CfinMstVmktpriceServiceImpl implements CfinMstVmktpriceService {

	@Autowired
	private CfinMstVmktpriceDAO cfinMstVmktpriceDAO;

	@Override
	public List<CfinMstVmktprice> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstVmktpriceDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstVmktpriceDAO.count();
	}
}
