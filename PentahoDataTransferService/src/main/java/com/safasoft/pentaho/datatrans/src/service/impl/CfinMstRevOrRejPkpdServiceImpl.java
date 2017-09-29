package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRevOrRejPkpd;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstRevOrRejPkpdDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRevOrRejPkpdService;

@Service("cfinMstRevOrRejPkpdService")
@Transactional(readOnly=true)
public class CfinMstRevOrRejPkpdServiceImpl implements CfinMstRevOrRejPkpdService {

	@Autowired
	private CfinMstRevOrRejPkpdDAO cfinMstRevOrRejPkpdDAO;

	@Override
	public List<CfinMstRevOrRejPkpd> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRevOrRejPkpdDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstRevOrRejPkpdDAO.count();
	}
}
