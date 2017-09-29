package com.safasoft.mobilesurvey.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterOffice;
import com.safasoft.mobilesurvey.rest.dao.MasterOfficeDAO;
import com.safasoft.mobilesurvey.rest.service.MasterOfficeService;

/**	
 * Office service implementation (see the service for usage info)
 * @created Nov 3, 2016
 * @author awal
 */
@Service("masterOfficeService")
@Transactional(readOnly=true)
public class MasterOfficeServiceImpl implements MasterOfficeService {

	@Autowired
	private MasterOfficeDAO masterOfficeDAO;// DAO injection

	@Override
	public MasterOffice getById(int officeId) {
		// TODO Auto-generated method stub
		return masterOfficeDAO.getById(officeId);
	}
}
