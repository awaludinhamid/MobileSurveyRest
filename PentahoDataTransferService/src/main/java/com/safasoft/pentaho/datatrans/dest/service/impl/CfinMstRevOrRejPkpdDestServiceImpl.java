package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRevOrRejPkpdDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstRevOrRejPkpdDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRevOrRejPkpdDestService;

@Service("cfinMstRevOrRejPkpdDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstRevOrRejPkpdDestServiceImpl implements CfinMstRevOrRejPkpdDestService {

	@Autowired
	private CfinMstRevOrRejPkpdDestDAO cfinMstRevOrRejPkpdDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstRevOrRejPkpdDest> save(List<CfinMstRevOrRejPkpdDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRevOrRejPkpdDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstRevOrRejPkpdDestDAO.truncateTable(tableName);
	}
}
