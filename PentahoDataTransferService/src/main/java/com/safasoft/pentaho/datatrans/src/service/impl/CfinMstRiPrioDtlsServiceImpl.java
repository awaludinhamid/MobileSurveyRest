package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPrioDtls;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstRiPrioDtlsDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiPrioDtlsService;

@Service("cfinMstRiPrioDtlsService")
@Transactional(readOnly=true)
public class CfinMstRiPrioDtlsServiceImpl implements CfinMstRiPrioDtlsService {

	@Autowired
	private CfinMstRiPrioDtlsDAO cfinMstRiPrioDtlsDAO;

	@Override
	public List<CfinMstRiPrioDtls> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioDtlsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstRiPrioDtlsDAO.count();
	}
}
