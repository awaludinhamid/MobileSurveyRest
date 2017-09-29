package com.safasoft.mobilesurvey.rest.service;

import com.safasoft.mobilesurvey.rest.bean.MobileUserLocation;

/**
 * SPI of user location module
 * @created Feb 13, 2017
 * @author awal
 */
public interface MobileUserLocationService {

	/**
	 * Save given user location
	 * @param userLoc
	 * @return saved user location
	 */
	MobileUserLocation save(MobileUserLocation userLoc);

	/**
	 * Get user location data by user
	 * @param userId
	 * @return list of user locations based on given user
	 */
	MobileUserLocation getByUser(int userId);
}
