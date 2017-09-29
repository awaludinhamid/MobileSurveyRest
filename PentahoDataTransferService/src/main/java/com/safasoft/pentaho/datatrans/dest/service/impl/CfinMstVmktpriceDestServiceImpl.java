package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstVmktpriceDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstVmktpriceDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstVmktpriceDestService;

@Service("cfinMstVmktpriceDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstVmktpriceDestServiceImpl implements CfinMstVmktpriceDestService {

	@Autowired
	private CfinMstVmktpriceDestDAO cfinMstVmktpriceDestServiceDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstVmktpriceDest> save(List<CfinMstVmktpriceDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstVmktpriceDestServiceDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstVmktpriceDestServiceDAO.truncateTable(tableName);
	}
}
