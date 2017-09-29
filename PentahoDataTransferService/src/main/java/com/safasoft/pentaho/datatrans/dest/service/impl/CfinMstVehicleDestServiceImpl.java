package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstVehicleDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstVehicleDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstVehicleDestService;

@Service("cfinMstVehicleDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstVehicleDestServiceImpl implements CfinMstVehicleDestService {

	@Autowired
	private CfinMstVehicleDestDAO cfinMstVehicleDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinMstVehicleDest> save(List<CfinMstVehicleDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstVehicleDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinMstVehicleDestDAO.truncateTable(tableName);
	}
}
