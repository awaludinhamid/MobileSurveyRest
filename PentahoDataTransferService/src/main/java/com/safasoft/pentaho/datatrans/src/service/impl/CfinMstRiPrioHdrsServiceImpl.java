package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPrioHdrs;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstRiPrioHdrsDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiPrioHdrsService;

@Service("cfinMstRiPrioHdrsService")
@Transactional(readOnly=true)
public class CfinMstRiPrioHdrsServiceImpl implements CfinMstRiPrioHdrsService {

	@Autowired
	private CfinMstRiPrioHdrsDAO cfinMstRiPrioHdrsDAO;

	@Override
	public List<CfinMstRiPrioHdrs> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioHdrsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstRiPrioHdrsDAO.count();
	}
}
