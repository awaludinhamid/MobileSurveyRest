package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinContaddrTghDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinContaddrTghDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinContaddrTghDestService;

@Service("cfinContaddrTghDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinContaddrTghDestServiceImpl implements CfinContaddrTghDestService {

	@Autowired
	private CfinContaddrTghDestDAO cfinContaddrTghDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinContaddrTghDest> save(List<CfinContaddrTghDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinContaddrTghDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinContaddrTghDestDAO.truncateTable(tableName);
	}
}
