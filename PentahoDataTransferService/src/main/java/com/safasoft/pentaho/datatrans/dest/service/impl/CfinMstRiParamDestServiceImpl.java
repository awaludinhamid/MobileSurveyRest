package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiParamDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstRiParamDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiParamDestService;

@Service("cfinMstRiParamDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstRiParamDestServiceImpl implements CfinMstRiParamDestService {

	@Autowired
	private CfinMstRiParamDestDAO cfinMstRiParamDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstRiParamDest> save(List<CfinMstRiParamDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiParamDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstRiParamDestDAO.truncateTable(tableName);
	}
}
