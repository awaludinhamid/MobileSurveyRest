package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstVehicle;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstVehicleDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstVehicleService;

@Service("cfinMstVehicleService")
@Transactional(readOnly=true)
public class CfinMstVehicleServiceImpl implements CfinMstVehicleService {

	@Autowired
	private CfinMstVehicleDAO cfinMstVehicleDAO;

	@Override
	public List<CfinMstVehicle> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinMstVehicleDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinMstVehicleDAO.count();
	}
}
