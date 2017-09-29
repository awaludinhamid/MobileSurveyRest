package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiFamilyMeet;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstRiFamilyMeetDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiFamilyMeetService;

@Service("cfinMstRiFamilyMeetService")
@Transactional(readOnly=true)
public class CfinMstRiFamilyMeetServiceImpl implements CfinMstRiFamilyMeetService {

	@Autowired
	private CfinMstRiFamilyMeetDAO cfinMstRiFamilyMeetDAO;

	@Override
	public List<CfinMstRiFamilyMeet> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstRiFamilyMeetDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstRiFamilyMeetDAO.count();
	}
}
