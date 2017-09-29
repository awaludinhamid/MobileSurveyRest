package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetail;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetail;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailDTO;

/**
 * SPI of result detail module
 *
 * @author awal
 */
public interface MobileTaskResultDetailService {

	/**
	 * Bulk save given result detail data
	 * @param resultDetailList
	 * @param numOfBulkRecord , number of record per batch
	 * @return list of saved result details
	 */
	List<MobileTaskResultDetail> save(List<MobileTaskResultDetail> resultDetailList, int numOfBulkRecord);
	
	/**
	 * Get result detail by id
	 * @param taskResultDetailId
	 * @return result detail object based on given id
	 */
	MobileTaskResultDetail getById(int taskResultDetailId);
	
	/**
	 * Get result detail data by result
	 * @param taskResultId result
	 * @return list of result details based on given result
	 */
	List<MobileTaskResultDetailDTO> getByResultDTO(int taskResultId);

	/**
	 * Get result detail data by company and task status
	 * @param coyCode company
	 * @param taskStatusCode task status
	 * @return list of result details based on given company and task status 
	 */
	List<TaskResultDetail> getByCoyAndStatusResult(String coyCode, String taskStatusCode);
}
