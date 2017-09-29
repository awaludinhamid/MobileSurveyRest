package com.safasoft.mobilesurvey.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MobileUserLocation;
import com.safasoft.mobilesurvey.rest.dao.MobileUserLocationDAO;
import com.safasoft.mobilesurvey.rest.service.MobileUserLocationService;

/**	
 * User location service implementation (see the service for usage info)
 * @created Feb 13, 2017
 * @author awal
 */
@Service("mobileUserLocationService")
@Transactional(readOnly=true)
public class MobileUserLocationServiceImpl implements MobileUserLocationService {

	@Autowired
	private MobileUserLocationDAO mobileUserLocationDAO;// DAO injection

	@Override
	@Transactional(readOnly=false)
	public MobileUserLocation save(MobileUserLocation userLoc) {
		// TODO Auto-generated method stub
		return mobileUserLocationDAO.save(userLoc);
	}

	@Override
	public MobileUserLocation getByUser(int userId) {
		// TODO Auto-generated method stub
		return mobileUserLocationDAO.getByUser(userId);
	}
}
