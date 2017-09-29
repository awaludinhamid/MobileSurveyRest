package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinCfgroupAccount;
import com.safasoft.pentaho.datatrans.src.dao.CfinCfgroupAccountDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinCfgroupAccountService;

@Service("cfinCfgroupAccountService")
@Transactional(readOnly=true)
public class CfinCfgroupAccountServiceImpl implements CfinCfgroupAccountService {

	@Autowired
	private CfinCfgroupAccountDAO cfinCfgroupAccountDAO;

	@Override
	public List<CfinCfgroupAccount> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinCfgroupAccountDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinCfgroupAccountDAO.count();
	}
}
