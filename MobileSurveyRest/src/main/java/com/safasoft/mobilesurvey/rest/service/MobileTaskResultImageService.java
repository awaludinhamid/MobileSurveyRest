package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultImage;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultImage;

/**
 * SPI of result image module
 *
 * @author awal
 */
public interface MobileTaskResultImageService {

	/**
	 * Save given result image
	 * @param taskresultImage
	 * @return saved result image
	 */
	MobileTaskResultImage save(MobileTaskResultImage taskresultImage);

	/**
	 * Bulk save given result image data
	 * @param resultList
	 * @param numOfBulkRecord , number of record per batch
	 * @return list of saved result image
	 */
	List<MobileTaskResultImage> save(List<MobileTaskResultImage> resultList, int numOfBulkRecord);
	
	/**
	 * Get result image by id
	 * @param imageId
	 * @return result image object based on given id
	 */
	MobileTaskResultImage getById(int imageId);
	
	/**
	 * Get result image data by company and task status
	 * @param coyCode company
	 * @param taskStatusCode task status
	 * @return list of result images based on given company and task status
	 */
	List<TaskResultImage> getByCoyAndStatusResult(String coyCode, String taskStatusCode);
}
