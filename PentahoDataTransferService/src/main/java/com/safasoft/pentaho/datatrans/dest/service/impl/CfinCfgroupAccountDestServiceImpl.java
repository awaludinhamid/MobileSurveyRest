package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinCfgroupAccountDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinCfgroupAccountDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinCfgroupAccountDestService;

@Service("cfinCfgroupAccountDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinCfgroupAccountDestServiceImpl implements CfinCfgroupAccountDestService {

	@Autowired
	private CfinCfgroupAccountDestDAO cfinCfgroupAccountDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinCfgroupAccountDest> save(List<CfinCfgroupAccountDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinCfgroupAccountDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinCfgroupAccountDestDAO.truncateTable(tableName);
	}
}
