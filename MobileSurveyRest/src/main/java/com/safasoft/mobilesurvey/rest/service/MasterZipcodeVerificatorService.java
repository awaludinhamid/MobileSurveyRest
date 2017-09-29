package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterZipcodeVerificator;

/**
 * SPI of zipcode-verificator module
 * @created Jan 23, 2017
 * @author awal
 */
public interface MasterZipcodeVerificatorService {

	/**
	 * Get zipcode-verificator data by verificator
	 * @param verificatorId
	 * @return list of zipcode-verificator  based on given verificator 
	 */
	List<MasterZipcodeVerificator> getByVerificator(int verificatorId);
}
