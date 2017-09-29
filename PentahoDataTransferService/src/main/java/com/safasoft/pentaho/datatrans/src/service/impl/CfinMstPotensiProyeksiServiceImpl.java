package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstPotensiProyeksi;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstPotensiProyeksiDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstPotensiProyeksiService;

@Service("cfinMstPotensiProyeksiService")
@Transactional(readOnly=true)
public class CfinMstPotensiProyeksiServiceImpl implements CfinMstPotensiProyeksiService {

	@Autowired
	private CfinMstPotensiProyeksiDAO cfinMstPotensiProyeksiDAO;

	@Override
	public List<CfinMstPotensiProyeksi> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstPotensiProyeksiDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstPotensiProyeksiDAO.count();
	}
}
