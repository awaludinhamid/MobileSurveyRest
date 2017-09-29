package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.dto.MasterParameterDTO;

/**
 * SPI of parameter module
 * @created Nov 18, 2016
 * @author awal
 */
public interface MasterParameterService {

	/**
	 * Get parameter data by company
	 * @param coyId company
	 * @return list of parameters based on given company
	 */
	List<MasterParameterDTO> getAllByCoyDTO(int coyId);

	/**
	 * Get parameter data by company, along with parent parameter value 
	 * @param coyId company
	 * @return list of parameters based on given company
	 */
	List<MasterParameterDTO> getByCoyDTO(int coyId);
}
