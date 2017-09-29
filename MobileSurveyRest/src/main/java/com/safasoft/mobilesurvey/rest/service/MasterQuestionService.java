package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterQuestion;
import com.safasoft.mobilesurvey.rest.dto.MasterQuestionDTO;

/**
 * SPI of question module
 * @created Jan 5, 2017
 * @author awal
 */
public interface MasterQuestionService {

	/**
	 * Get question by id
	 * @param questId question
	 * @return question object based on given id
	 */
	MasterQuestion getById(int questId);
	
	/**
	 * Get all question data
	 * @return list of all questions
	 */
	List<MasterQuestion> getAll();

  /**
   * Get question data by company
   * @param coyId, company
   * @return list of questions based on given company
   */
	List<MasterQuestionDTO> getAllByCoyDTO(int coyId);

  /**
   * Get question by company and id
   * @param coyId, company
   * @param questId, question
   * @return question object based on given company and id
   */
	MasterQuestionDTO getByCoyAndIdDTO(int coyId, int questId);
}
