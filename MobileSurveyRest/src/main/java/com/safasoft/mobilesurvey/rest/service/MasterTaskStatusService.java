package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterTaskStatus;
import com.safasoft.mobilesurvey.rest.dto.MasterTaskStatusDTO;

/**
 * SPI of task status module
 * @created Feb 8, 2017
 * @author awal
 */
public interface MasterTaskStatusService {

	/**
	 * Get all task status data
	 * @return list of all task status
	 */
	List<MasterTaskStatus> getAll();

	/**
	 * Get all task status data
	 * @return list of all task status in form of DTO
	 */
	List<MasterTaskStatusDTO> getAllDTO();

	/**
	 * Get task status by id
	 * @param taskStatusId question
	 * @return task status object based on given id
	 */
	MasterTaskStatus getById(int taskStatusId);

  /**
   * Get task status by code
   * @param taskStatusCode
   * @return task status object based on the code
   */
	MasterTaskStatus getByCode(String taskStatusCode);
}
