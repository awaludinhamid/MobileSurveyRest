package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinCfgroupDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinCfgroupDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinCfgroupDestService;

@Service("cfinCfgroupDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinCfgroupDestServiceImpl implements CfinCfgroupDestService {

	@Autowired
	private CfinCfgroupDestDAO cfinCfgroupDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinCfgroupDest> save(List<CfinCfgroupDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinCfgroupDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinCfgroupDestDAO.truncateTable(tableName);
	}
}
