package com.safasoft.mobilesurvey.rest.service;

/**
 * SPI of absence module
 * @created Jan 26, 2017
 * @author awal
 */
public interface MasterAbsenceService {

	/**
	 * Get number of absence by user
	 * @param userId
	 * @return count of absences based on given user
	 */
	int countByUserToday(int userId);
}
