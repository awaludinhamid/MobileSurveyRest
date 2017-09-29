package com.safasoft.mobilesurvey.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterDistribution;
import com.safasoft.mobilesurvey.rest.dao.MasterDistributionDAO;
import com.safasoft.mobilesurvey.rest.service.MasterDistributionService;

/**
 * Distribution service implementation (see the service for usage info)
 * @created Dec 4, 2016
 * @author awal
 */
@Service("MasterDistributionService")
@Transactional(readOnly=true)
public class MasterDistributionServiceImpl implements MasterDistributionService {

	@Autowired
	private MasterDistributionDAO masterDistributionDAO;// DAO injection

	@Override
	public MasterDistribution getByOffice(int officeId) {
		// TODO Auto-generated method stub
		return masterDistributionDAO.getByOffice(officeId);
	}
}
