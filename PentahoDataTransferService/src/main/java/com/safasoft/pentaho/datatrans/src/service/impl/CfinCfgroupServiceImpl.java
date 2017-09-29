package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinCfgroup;
import com.safasoft.pentaho.datatrans.src.dao.CfinCfgroupDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinCfgroupService;

@Service("cfinCfgroupService")
@Transactional(readOnly=true)
public class CfinCfgroupServiceImpl implements CfinCfgroupService {

	@Autowired
	private CfinCfgroupDAO cfinCfgroupDAO;

	@Override
	public List<CfinCfgroup> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinCfgroupDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinCfgroupDAO.count();
	}
}
