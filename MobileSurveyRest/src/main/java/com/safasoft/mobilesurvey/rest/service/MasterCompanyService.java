package com.safasoft.mobilesurvey.rest.service;

import com.safasoft.mobilesurvey.rest.bean.MasterCompany;

/**
 * SPI of company module
 * @created Oct 12, 2016
 * @author awal
 */
public interface MasterCompanyService {

	/**
	 * Get company by code
	 * @param coyCode company code
	 * @return company object based on given code
	 */
	MasterCompany getByCode(String coyCode);
}
