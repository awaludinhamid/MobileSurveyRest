package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetailList;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailListDTO;

/**
 * SPI of result detail list module
 *
 * @author awal
 */
public interface MobileTaskResultDetailListService {

	/**
	 * Bulk save given result detail list data
	 * @param resultDetailListList
	 * @param numOfBulkRecord , number of record per batch
	 * @return list of saved result detail lists
	 */
	List<MobileTaskResultDetailList> save(List<MobileTaskResultDetailList> resultDetailListList, int numOfBulkRecord);

	/**
	 * Get result detail list data by result detail
	 * @param taskResultDetId result detail
	 * @return list of result detail lists based on given result detail 
	 */
	List<MobileTaskResultDetailListDTO> getByResultDetailDTO(int taskResultDetId);

	/**
	 * Get result detail list data by company and task status 
	 * @param coyCode company
	 * @param taskStatusCode task status
	 * @return list of result detail lists based on given company and task status
	 */
	List<TaskResultDetailList> getByCoyAndStatusResult(String coyCode, String taskStatusCode);
}
