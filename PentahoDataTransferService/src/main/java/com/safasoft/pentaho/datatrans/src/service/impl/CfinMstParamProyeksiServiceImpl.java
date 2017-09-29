package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstParamProyeksi;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstParamProyeksiDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstParamProyeksiService;

@Service("cfinMstParamProyeksiService")
@Transactional(readOnly=true)
public class CfinMstParamProyeksiServiceImpl implements CfinMstParamProyeksiService {

	@Autowired
	private CfinMstParamProyeksiDAO cfinMstParamProyeksiDAO;

	@Override
	public List<CfinMstParamProyeksi> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstParamProyeksiDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstParamProyeksiDAO.count();
	}
}
