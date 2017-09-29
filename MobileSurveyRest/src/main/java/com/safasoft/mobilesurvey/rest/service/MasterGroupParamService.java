package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterGroupParam;

/**
 * SPI of group parameter module
 * @created Dec 4, 2016
 * @author awal
 */
public interface MasterGroupParamService {

	/**
	 * Get all group parameter data
	 * @return list of all group parameters
	 */
	List<MasterGroupParam> getAll();

	/**
	 * Get group parameter by code
	 * @param groupParamCode
	 * @return group parameter based on given code
	 */
	MasterGroupParam getByGroupParamCode(String groupParamCode);
}
