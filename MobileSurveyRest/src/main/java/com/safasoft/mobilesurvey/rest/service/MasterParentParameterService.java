package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterParentParameter;

/**
 * SPI of parent parameter module
 *
 * @author awal
 */
public interface MasterParentParameterService {

	/**
	 * Get parent parameter data by company
	 * @param coyId company
	 * @return list of parent parameters based on given company
	 */
	public List<MasterParentParameter> getByCoyDTO(int coyId);
}
