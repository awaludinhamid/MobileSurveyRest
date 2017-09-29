package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.dto.DetailQuestionGroupDTO;

/**
 * SPI of detail question group module
 * @created Jan 11, 2017
 * @author awal
 */
public interface DetailQuestionGroupService {

  /**
   * Get detail question by the group
   * @param questGroupId, group
   * @return list of detail question based on given group
   */
	List<DetailQuestionGroupDTO> getAllByQuestGroupDTO(int questGroupId);
	

  /**
   * Get detail question by the group and id
   * @param questGroupId, group
   * @param detailQuestGroupId, detail question
   * @return detail question object based on given group and id
   */
	DetailQuestionGroupDTO getByQuestGroupAndIdDTO(int questGroupId, int detailQuestGroupId);
}
