package com.safasoft.mobilesurvey.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterCompany;
import com.safasoft.mobilesurvey.rest.dao.MasterCompanyDAO;
import com.safasoft.mobilesurvey.rest.service.MasterCompanyService;

/**
 * Company service implementation (see the service for usage info)
 * @created Oct 12, 2016
 * @author awal
 */
@Service("masterCompanyService")
@Transactional(readOnly=true)
public class MasterCompanyServiceImpl implements MasterCompanyService {

	@Autowired
	private MasterCompanyDAO masterCompanyDAO;// DAO injection

	@Override
	public MasterCompany getByCode(String coyCode) {
		// TODO Auto-generated method stub
		return masterCompanyDAO.getByCode(coyCode);
	}
}
