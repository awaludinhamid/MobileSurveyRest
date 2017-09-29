package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.dto.DetailTemplateDTO;

/**
 * SPI of detail template module
 * @author awal
 */
public interface DetailTemplateService {

	/**
   * Get detail template by the template
	 * @param tempId template
	 * @return list of detail templates based on given template
	 */
	List<DetailTemplateDTO> getAllByTempDTO(int tempId);
	
	/**
	 * Get detail template by the template and id
	 * @param tempId template
	 * @param detailTempId detail template
	 * @return detail template object based on given template
	 */
	DetailTemplateDTO getByTempAndIdDTO(int tempId, int detailTempId);
}
