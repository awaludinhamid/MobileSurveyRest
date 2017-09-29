package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.dto.MasterTemplateDTO;

/**
 * SPI of template module
 * @created Jan 15, 2017
 * @author awal
 */
public interface MasterTemplateService {

  /**
   * Get template data by company
   * @param coyId, company
   * @return list of templates based on given company
   */
	List<MasterTemplateDTO> getAllByCoyDTO(int coyId);

  /**
   * Get template by company and id
   * @param coyId, company
   * @param tempId, template
   * @return template object based on given company and id
   */
	MasterTemplateDTO getByCoyAndIdDTO(int coyId, int tempId);
}
