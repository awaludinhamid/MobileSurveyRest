package com.safasoft.mobilesurvey.rest.dao;

import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MobileUserLocation;

/**
 * DAO table MOBILE_USER_LOCATION
 * extends BaseDAO class
 * @see BaseDAO
 * @author awal
 * @created Feb 20, 2017
 */
@Repository("mobileUserLocationDAO")
public class MobileUserLocationDAO extends BaseDAO<MobileUserLocation> {

	/**
	 * Get user location data by user
	 * @param userId
	 * @return list of user locations based on given user
	 */
	public MobileUserLocation getByUser(int userId) {
		return (MobileUserLocation) sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " mul " +
						"where user.userId = :userId")
				.setInteger("userId", userId)
				.uniqueResult();
	}
}
