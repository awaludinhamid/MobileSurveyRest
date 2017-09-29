package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiParam;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstRiParamDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiParamService;

@Service("cfinMstRiParamService")
@Transactional(readOnly=true)
public class CfinMstRiParamServiceImpl implements CfinMstRiParamService {

	@Autowired
	private CfinMstRiParamDAO cfinMstRiParamDAO;

	@Override
	public List<CfinMstRiParam> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiParamDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstRiParamDAO.count();
	}
}
