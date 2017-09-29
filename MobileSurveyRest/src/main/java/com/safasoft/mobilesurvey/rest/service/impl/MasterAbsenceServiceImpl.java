package com.safasoft.mobilesurvey.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.dao.MasterAbsenceDAO;
import com.safasoft.mobilesurvey.rest.service.MasterAbsenceService;

/**
 * Absence service implementation (see the service for usage info)
 * @created Jan 26, 2017
 * @author awal
 */
@Service("masterAbsenceService")
@Transactional(readOnly=true)
public class MasterAbsenceServiceImpl implements MasterAbsenceService {

	@Autowired
	private MasterAbsenceDAO masterAbsenceDAO;

	@Override
	public int countByUserToday(int userId) {
		// TODO Auto-generated method stub
		return masterAbsenceDAO.countByUserToday(userId);
	}
}
