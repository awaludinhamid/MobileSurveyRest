package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiPrioDtlsDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstRiPrioDtlsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiPrioDtlsDestService;

@Service("cfinMstRiPrioDtlsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstRiPrioDtlsDestServiceImpl implements CfinMstRiPrioDtlsDestService {

	@Autowired
	private CfinMstRiPrioDtlsDestDAO cfinMstRiPrioDtlsDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstRiPrioDtlsDest> save(List<CfinMstRiPrioDtlsDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioDtlsDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioDtlsDestDAO.truncateTable(tableName);
	}
}
