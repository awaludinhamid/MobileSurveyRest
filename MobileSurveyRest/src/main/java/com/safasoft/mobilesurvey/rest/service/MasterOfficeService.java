package com.safasoft.mobilesurvey.rest.service;

import com.safasoft.mobilesurvey.rest.bean.MasterOffice;

/**
 * SPI of office module
 * @created Nov 3, 2016
 * @author awal
 */
public interface MasterOfficeService {

	/**
	 * Get office by id
	 * @param officeId
	 * @return office object based on given id
	 */
	MasterOffice getById(int officeId);
}
