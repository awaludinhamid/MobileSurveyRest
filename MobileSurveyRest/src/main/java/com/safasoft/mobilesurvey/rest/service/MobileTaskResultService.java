package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResult;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResult;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDTO;

/**
 * SPI of result module
 * @created Feb 13, 2017
 * @author awal
 */
public interface MobileTaskResultService {

	/**
	 * Save given result
	 * @param result
	 * @return saved result
	 */
	MobileTaskResult save(MobileTaskResult result);

	/**
	 * Bulk save given result data
	 * @param resultList
	 * @param numOfBulkRecord , number of record per batch
	 * @return list of saved result
	 */
	List<MobileTaskResult> save(List<MobileTaskResult> resultList, int numOfBulkRecord);
	
	/**
	 * Get result by id
	 * @param taskResultId
	 * @return result object based on given id
	 */
	MobileTaskResult getById(int taskResultId);

	/**
	 * Get result data by given company
	 * @param coyId company
	 * @return list of companies based on given company
	 */
	List<MobileTaskResult> getByCoy(int coyId);

	/**
	 * Get result data by given company
	 * @param coyId company
	 * @return list of companies based on given company in form of DTO
	 */
	List<MobileTaskResultDTO> getByCoyDTO(int coyId);
	
	/**
	 * Get result data by given company and task status
	 * @param coyCode
	 * @param taskStatusCode
	 * @return list of companies based on given company and task status
	 */
	List<TaskResult> getByCoyAndStatusResult(String coyCode, String taskStatusCode);
}
