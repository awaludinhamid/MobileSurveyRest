package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstObject;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstObjectDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstObjectService;

@Service("cfinMstObjectService")
@Transactional(readOnly=true)
public class CfinMstObjectServiceImpl implements CfinMstObjectService {
	
	@Autowired
	private CfinMstObjectDAO cfinMstObjectDAO;

	@Override
	public List<CfinMstObject> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstObjectDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstObjectDAO.count();
	}

}
