package com.safasoft.mobilesurvey.rest.service;

import com.safasoft.mobilesurvey.rest.bean.MasterDistribution;

/**
 * SPI of distribution module
 * @created Dec 4, 2016
 * @author awal
 */
public interface MasterDistributionService {

	/**
	 * Get distribution by office
	 * @param officeId
	 * @return distribution object based on given office
	 */
	MasterDistribution getByOffice(int officeId);
}
