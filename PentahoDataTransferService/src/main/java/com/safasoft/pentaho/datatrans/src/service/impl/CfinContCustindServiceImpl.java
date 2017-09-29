package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinContCustind;
import com.safasoft.pentaho.datatrans.src.dao.CfinContCustindDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinContCustindService;

@Service("cfinContCustindService")
@Transactional(readOnly=true)
public class CfinContCustindServiceImpl implements CfinContCustindService {

	@Autowired
	private CfinContCustindDAO cfinContCustindDAO;

	@Override
	public List<CfinContCustind> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinContCustindDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinContCustindDAO.count();
	}
}
