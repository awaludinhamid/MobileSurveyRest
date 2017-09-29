package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstParamProyeksiDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstParamProyeksiDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstParamProyeksiDestService;

@Service("cfinMstParamProyeksiDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstParamProyeksiDestServiceImpl implements CfinMstParamProyeksiDestService {

	@Autowired
	private CfinMstParamProyeksiDestDAO cfinMstParamProyeksiDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstParamProyeksiDest> save(List<CfinMstParamProyeksiDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstParamProyeksiDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstParamProyeksiDestDAO.count();
	}
}
