package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPriorities;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstRiPrioritiesDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiPrioritiesService;

@Service("cfinMstRiPrioritiesService")
@Transactional(readOnly=true)
public class CfinMstRiPrioritiesServiceImpl implements CfinMstRiPrioritiesService {

	@Autowired
	private CfinMstRiPrioritiesDAO cfinMstRiPrioritiesDAO;

	@Override
	public List<CfinMstRiPriorities> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiPrioritiesDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstRiPrioritiesDAO.count();
	}
}
