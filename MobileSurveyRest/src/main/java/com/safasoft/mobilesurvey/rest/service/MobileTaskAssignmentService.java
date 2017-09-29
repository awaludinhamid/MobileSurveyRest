package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskAssignment;
import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskAssignmentDTO;

/**
 * SPI of task module
 * @created Feb 2, 2017
 * @author awal
 */
public interface MobileTaskAssignmentService {

	/**
	 * Save given task
	 * @param task
	 * @return saved task
	 */
	MobileTaskAssignment save(MobileTaskAssignment task);
	
	/**
	 * Get task by id
	 * @param taskId
	 * @return task object based on given id
	 */
	MobileTaskAssignment getById(int taskId);
	
	/**
	 * Get task data by user
	 * @param userId
	 * @return list of tasks based on given user in form of DTO
	 */
	List<MobileTaskAssignmentDTO> getByUserDTO(int userId);

	/**
	 * Get task by id
	 * @param taskId
	 * @return task object based on given id in form of DTO
	 */
	MobileTaskAssignmentDTO getByIdDTO(int taskId);
	
	/**
	 * Get task data by company and status
	 * @param coyCode company
	 * @param taskStatusCode
	 * @return list of tasks based on given company and status
	 */
	List<MobileTaskAssignment> getByCoyAndStatus(String coyCode, String taskStatusCode);
	
	/**
	 * Bulk save given task data
	 * @param domain , list of tasks
	 * @param bulkRecord , number of record per batch
	 * @return list of saved tasks
	 */
	List<MobileTaskAssignment> save(List<MobileTaskAssignment> domain, int bulkRecord);
	
	/**
	 * Get task data by company and status
	 * @param coyCode company
	 * @param taskStatusCode
	 * @return list of tasks based on given company and status in form of DTO
	 */
	List<MobileTaskAssignmentDTO> getByCoyAndStatusDTO(String coyCode, String taskStatusCode);
	
	/**
	 * Get task data by company and status
	 * @param coyCode company
	 * @param taskStatusCode
	 * @return list of tasks based on given company and status in form of Order Task
	 */
	List<OrderTask> getByCoyAndStatusOrder(String coyCode, String taskStatusCode);
	
	/**
	 * Get task by order
	 * @param orderId
	 * @return task object based on given order
	 */
	MobileTaskAssignment getByOrder(String orderId);
	
	/**
	 * Get task data by office, status and limit
	 * @param officeId
	 * @param taskStatusCode
	 * @param limit , maximum record will be sent
	 * @return list of task based on given office, status and limit
	 */
	List<MobileTaskAssignmentDTO> getByOfficeTaskAndLimit(int officeId, String taskStatusCode, int limit);
	
	/**
	 * Get number of task data by user and task status code 
	 * @param userId
	 * @param taskStatusCode
	 * @return count of tasks based on given user and task status code
	 */
	int countByUserAndTask(int userId, String taskStatusCode);
	
	/**
	 * Get task data by office, zipcode, status and limit
	 * @param officeId
	 * @param zipcode
	 * @param taskStatusCode
	 * @param limit , maximum record will be sent
	 * @return list of task based on given office, zipcode, status and limit
	 */
	List<MobileTaskAssignmentDTO> getByOfficeZipcodeTaskAndLimit(int officeId, String zipcode, String taskStatusCode, int limit);
	
	/**
	 * Get number of task data by user and id which has status other than drop
	 * @param taskId
	 * @param userId
	 * @return count of tasks based on given user and id
	 */
	int countByCurrentTaskAndUser(int taskId, int userId);
}
