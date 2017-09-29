package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstKecamatan;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstKecamatanDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstKecamatanService;

@Service("applMstKecamatanService")
@Transactional(readOnly=true)
public class ApplMstKecamatanServiceImpl implements ApplMstKecamatanService {

	@Autowired
	private ApplMstKecamatanDAO applMstKecamatanDAO;

	@Override
	public List<ApplMstKecamatan> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return applMstKecamatanDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return applMstKecamatanDAO.count();
	}
}
