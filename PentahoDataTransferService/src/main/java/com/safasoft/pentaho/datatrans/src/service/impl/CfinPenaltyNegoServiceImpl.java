package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinPenaltyNego;
import com.safasoft.pentaho.datatrans.src.dao.CfinPenaltyNegoDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinPenaltyNegoService;

@Service("cfinPenaltyNegoService")
@Transactional(readOnly=true)
public class CfinPenaltyNegoServiceImpl implements CfinPenaltyNegoService {

	@Autowired
	private CfinPenaltyNegoDAO cfinPenaltyNegoDAO;

	@Override
	public List<CfinPenaltyNego> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinPenaltyNegoDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinPenaltyNegoDAO.count();
	}
}
