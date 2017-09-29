package com.safasoft.mobilesurvey.rest.dao;

import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterAbsence;

/**
 * DAO table MASTER_ABSENCE
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 26, 2017
 * @author awal
 */
@Repository("masterAbsenceDAO")
public class MasterAbsenceDAO extends BaseDAO<MasterAbsence> {

	/**
	 * Get number of absence by user
	 * @param userId
	 * @return count of absences based on given user
	 */
	public int countByUserToday(int userId) {
		return ((Long) sessionFactory.getCurrentSession().createQuery(
					"select count(*) from " + domainClass.getName() + " absc " +
							"where absc.user.userId = :userId " +
								"and current_date between absc.startDate and absc.endDate")
				.setInteger("userId", userId)
				.iterate().next()).intValue();
	}
}
