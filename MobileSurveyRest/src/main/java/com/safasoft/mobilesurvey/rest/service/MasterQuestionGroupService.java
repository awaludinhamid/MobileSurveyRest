package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.dto.MasterQuestionGroupDTO;

/**
 * SPI of question group module
 * @created Jan 10, 2017
 * @author awal
 */
public interface MasterQuestionGroupService {

  /**
   * Get question group data by company
   * @param coyId, company
   * @return list of question groups based on given company
   */
	List<MasterQuestionGroupDTO> getAllByCoyDTO(int coyId);

  /**
   * Get question by company and id
   * @param coyId, company
   * @param questGroupId, question group
   * @return question object based on given company and id
   */
	MasterQuestionGroupDTO getByCoyAndIdDTO(int coyId, int questGroupId);
}
