package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskAssignment;
import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskAssignmentDTO;

/**
 * DAO table MOBILE_TASK_ASSIGNMENT
 * extends BaseDAO class
 * @see BaseDAO
 * @created Feb 2, 2017
 * @author awal
 */
@Repository("mobileTaskAssignmentDAO")
public class MobileTaskAssignmentDAO extends BaseDAO<MobileTaskAssignment> {
	
	/**
	 * Get task data by user
	 * @param userId
	 * @return list of tasks based on given user
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskAssignment> getByUser(int userId) {
		return sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " task " +
						"where task.user.userId = :userId")
					.setInteger("userId", userId)
					.list();
	}
	
	/**
	 * Get task data by company and status
	 * @param coyCode company
	 * @param taskStatusCode
	 * @return list of tasks based on given company and status
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskAssignment> getByCoyAndStatus(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " task " +
						"where task.office.company.coyCode = :coyCode " +
							"and task.taskStatus.taskStatusCode = :taskStatusCode")
					.setString("coyCode", coyCode)
					.setString("taskStatusCode", taskStatusCode)
					.list();
	}
	
	/**
	 * Get task data by user
	 * @param userId
	 * @return list of tasks based on given user in form of DTO
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskAssignmentDTO> getByUserDTO(int userId) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mob.taskId as taskId, mob.orderId as orderId, mob.orderDate as orderDate, mob.customerId as customerId, " +
						"mob.customerName as customerName, mob.customerAddress as customerAddress, " +
						"mob.customerPhone as customerPhone, mob.customerZipcode as customerZipcode, mob.customerSubZipcode as customerSubZipcode, " +
						"mob.customerRt as customerRt, mob.customerRw as customerRw, mob.priority as priority, " +
						"mob.notes as notes, mob.verifyBy as verifyBy, mob.verifyDate as verifyDate, " +
						"mob.assignmentDate as assignmentDate, mob.retrieveDate as retrieveDate, mob.submitDate as submitDate, " +
						"mob.finalizationDate as finalizationDate, mob.receiveDate as receiveDate, mob.assignmentStatus as assignmentStatus, " +
						"mob.user.userId as userId, mob.user.userCode as userCode, mob.user.userName as userName, " +
						"mob.office.officeId as officeId, mob.office.officeCode as officeCode, mob.office.officeName as officeName, " +
						"mob.office.company.coyId as coyId, mob.office.company.coyCode as coyCode, mob.office.company.coyName as coyName, " +
						"mob.product.productId as productId, mob.product.productCode as productCode, mob.product.productName as productName, " +
						"mob.product.template.tempId as tempId, mob.product.template.tempLabel as tempLabel, " +
						"mob.taskStatus.taskStatusId as taskStatusId, mob.taskStatus.taskStatusCode as taskStatusCode, mob.taskStatus.taskStatusName as taskStatusName " +
						"from " + domainClass.getName() + " mob " +
						"where mob.user.userId = :userId " +
							"and mob.taskStatus.taskStatusCode in ('ASSG','RETR')")
						.setInteger("userId", userId)
						.setResultTransformer(Transformers.aliasToBean(MobileTaskAssignmentDTO.class))
						.list();
	}

	/**
	 * Get task by id
	 * @param taskId
	 * @return task object based on given id in form of DTO
	 */
	public MobileTaskAssignmentDTO getByIdDTO(int taskId) {
		return (MobileTaskAssignmentDTO) sessionFactory.getCurrentSession().createQuery(
				"select mob.taskId as taskId, mob.orderId as orderId, mob.orderDate as orderDate, mob.customerId as customerId, " +
						"mob.customerName as customerName, mob.customerAddress as customerAddress, " +
						"mob.customerPhone as customerPhone, mob.customerZipcode as customerZipcode, mob.customerSubZipcode as customerSubZipcode, " +
						"mob.customerRt as customerRt, mob.customerRw as customerRw, mob.priority as priority, " +
						"mob.notes as notes, mob.verifyBy as verifyBy, mob.verifyDate as verifyDate, " +
						"mob.assignmentDate as assignmentDate, mob.retrieveDate as retrieveDate, mob.submitDate as submitDate, " +
						"mob.finalizationDate as finalizationDate, mob.receiveDate as receiveDate, mob.assignmentStatus as assignmentStatus, " +
						"mob.user.userId as userId, mob.user.userCode as userCode, mob.user.userName as userName, " +
						"mob.office.officeId as officeId, mob.office.officeCode as officeCode, mob.office.officeName as officeName, " +
						"mob.office.company.coyId as coyId, mob.office.company.coyCode as coyCode, mob.office.company.coyName as coyName, " +
						"mob.product.productId as productId, mob.product.productCode as productCode, mob.product.productName as productName, " +
						"mob.product.template.tempId as tempId, mob.product.template.tempLabel as tempLabel, " +
						"mob.taskStatus.taskStatusId as taskStatusId, mob.taskStatus.taskStatusCode as taskStatusCode, mob.taskStatus.taskStatusName as taskStatusName " +
						"from " + domainClass.getName() + " mob " +
						"where mob.taskId = :taskId")
						.setInteger("taskId", taskId)
						.setResultTransformer(Transformers.aliasToBean(MobileTaskAssignmentDTO.class))
						.uniqueResult();
	}
	
	/**
	 * Get task data by company and status
	 * @param coyCode company
	 * @param taskStatusCode
	 * @return list of tasks based on given company and status in form of DTO
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskAssignmentDTO> getByCoyAndStatusDTO(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mob.taskId as taskId, mob.orderId as orderId, mob.orderDate as orderDate, mob.customerId as customerId, " +
						"mob.customerName as customerName, mob.customerAddress as customerAddress, " +
						"mob.customerPhone as customerPhone, mob.customerZipcode as customerZipcode, mob.customerSubZipcode as customerSubZipcode, " +
						"mob.customerRt as customerRt, mob.customerRw as customerRw, mob.priority as priority, " +
						"mob.notes as notes, mob.verifyBy as verifyBy, mob.verifyDate as verifyDate, " +
						"mob.assignmentDate as assignmentDate, mob.retrieveDate as retrieveDate, mob.submitDate as submitDate, " +
						"mob.finalizationDate as finalizationDate, mob.receiveDate as receiveDate, mob.assignmentStatus as assignmentStatus, " +
						"mob.createdBy as createdBy, mob.createdDate as createdDate, mob.updatedBy as updatedBy, mob.updatedDate as updatedDate, " +
						"mob.user.userId as userId, mob.user.userCode as userCode, mob.user.userName as userName, " +
						"mob.office.officeId as officeId, mob.office.officeCode as officeCode, mob.office.officeName as officeName, " +
						"mob.office.company.coyId as coyId, mob.office.company.coyCode as coyCode, mob.office.company.coyName as coyName, " +
						"mob.product.productId as productId, mob.product.productCode as productCode, mob.product.productName as productName, " +
						"mob.product.template.tempId as tempId, mob.product.template.tempLabel as tempLabel, " +
						"mob.taskStatus.taskStatusId as taskStatusId, mob.taskStatus.taskStatusCode as taskStatusCode, mob.taskStatus.taskStatusName as taskStatusName " +
						"from " + domainClass.getName() + " mob " +
						"where mob.office.company.coyCode = :coyCode " +
							"and mob.taskStatus.taskStatusCode = :taskStatusCode")
						.setString("coyCode", coyCode)
						.setString("taskStatusCode", taskStatusCode)
						.setResultTransformer(Transformers.aliasToBean(MobileTaskAssignmentDTO.class))
						.list();
	}
	
	/**
	 * Get task data by company and status
	 * @param coyCode company
	 * @param taskStatusCode
	 * @return list of tasks based on given company and status in form of Order Task
	 */
	@SuppressWarnings("unchecked")
	public List<OrderTask> getByCoyAndStatusOrder(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mob.orderId as orderId, mob.orderDate as orderDate, mob.customerId as customerId, " +
						"mob.customerName as customerName, mob.customerAddress as customerAddress, " +
						"mob.customerPhone as customerPhone, mob.customerZipcode as customerZipcode, mob.customerSubZipcode as customerSubZipcode, " +
						"mob.customerRt as customerRt, mob.customerRw as customerRw, mob.priority as priority, " +
						"mob.notes as notes, mob.verifyBy as verifyBy, mob.verifyDate as verifyDate, " +
						"mob.assignmentDate as assignmentDate, mob.retrieveDate as retrieveDate, mob.submitDate as submitDate, " +
						"mob.finalizationDate as finalizationDate, mob.receiveDate as receiveDate, " +
						"mob.createdBy as createdBy, mob.createdDate as createdDate, mob.updatedBy as updatedBy, mob.updatedDate as updatedDate, " +
						"cast(mob.user.userId as string) as userId, " +
						"cast(mob.office.officeId as string) as officeId, " +
						"cast(mob.product.productId as string) as productId, " +
						"cast(mob.taskStatus.taskStatusId as string) as taskStatusId " +
						"from " + domainClass.getName() + " mob " +
						"where mob.office.company.coyCode = :coyCode " +
							"and mob.taskStatus.taskStatusCode = :taskStatusCode")
						.setString("coyCode", coyCode)
						.setString("taskStatusCode", taskStatusCode)
						.setResultTransformer(Transformers.aliasToBean(OrderTask.class))
						.list();
	}
	
	/**
	 * Get task by order
	 * @param orderId
	 * @return task object based on given order
	 */
	public MobileTaskAssignment getByOrder(String orderId) {
		return (MobileTaskAssignment) sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " task " +
						"where task.orderId = :orderId")
					.setString("orderId", orderId)
					.uniqueResult();
	}
	
	/**
	 * Get task data by office, status and limit
	 * @param officeId
	 * @param taskStatusCode
	 * @param limit , maximum record will be sent
	 * @return list of task based on given office, status and limit
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskAssignmentDTO> getByOfficeTaskAndLimit(int officeId, String taskStatusCode, int limit) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mob.taskId as taskId, mob.orderId as orderId, mob.orderDate as orderDate, mob.customerId as customerId, " +
						"mob.customerName as customerName, mob.customerAddress as customerAddress, " +
						"mob.customerPhone as customerPhone, mob.customerZipcode as customerZipcode, mob.customerSubZipcode as customerSubZipcode, " +
						"mob.customerRt as customerRt, mob.customerRw as customerRw, mob.priority as priority, " +
						"mob.notes as notes, mob.verifyBy as verifyBy, mob.verifyDate as verifyDate, " +
						"mob.assignmentDate as assignmentDate, mob.retrieveDate as retrieveDate, mob.submitDate as submitDate, " +
						"mob.finalizationDate as finalizationDate, mob.receiveDate as receiveDate, mob.assignmentStatus as assignmentStatus, " +
						"mob.user.userId as userId, mob.user.userCode as userCode, mob.user.userName as userName, " +
						"mob.office.officeId as officeId, mob.office.officeCode as officeCode, mob.office.officeName as officeName, " +
						"mob.office.company.coyId as coyId, mob.office.company.coyCode as coyCode, mob.office.company.coyName as coyName, " +
						"mob.product.productId as productId, mob.product.productCode as productCode, mob.product.productName as productName, " +
						"mob.product.template.tempId as tempId, mob.product.template.tempLabel as tempLabel, " +
						"mob.taskStatus.taskStatusId as taskStatusId, mob.taskStatus.taskStatusCode as taskStatusCode, mob.taskStatus.taskStatusName as taskStatusName " +
						"from " + domainClass.getName() + " mob " +
						"left join mob.user usr " +
						"where mob.office.officeId = :officeId " +
							"and usr.userId is null " +
							"and mob.taskStatus.taskStatusCode = :taskStatusCode")
						.setInteger("officeId", officeId)
						.setString("taskStatusCode", taskStatusCode)
						.setMaxResults(limit)
						.setResultTransformer(Transformers.aliasToBean(MobileTaskAssignmentDTO.class))
						.list();
	}
	
	/**
	 * Get task data by office, zipcode, status and limit
	 * @param officeId
	 * @param zipcode
	 * @param taskStatusCode
	 * @param limit , maximum record will be sent
	 * @return list of task based on given office, zipcode, status and limit
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskAssignmentDTO> getByOfficeZipcodeTaskAndLimit(int officeId, String zipcode, String taskStatusCode, int limit) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mob.taskId as taskId, mob.orderId as orderId, mob.orderDate as orderDate, mob.customerId as customerId, " +
						"mob.customerName as customerName, mob.customerAddress as customerAddress, " +
						"mob.customerPhone as customerPhone, mob.customerZipcode as customerZipcode, mob.customerSubZipcode as customerSubZipcode, " +
						"mob.customerRt as customerRt, mob.customerRw as customerRw, mob.priority as priority, " +
						"mob.notes as notes, mob.verifyBy as verifyBy, mob.verifyDate as verifyDate, " +
						"mob.assignmentDate as assignmentDate, mob.retrieveDate as retrieveDate, mob.submitDate as submitDate, " +
						"mob.finalizationDate as finalizationDate, mob.receiveDate as receiveDate, mob.assignmentStatus as assignmentStatus, " +
						"mob.user.userId as userId, mob.user.userCode as userCode, mob.user.userName as userName, " +
						"mob.office.officeId as officeId, mob.office.officeCode as officeCode, mob.office.officeName as officeName, " +
						"mob.office.company.coyId as coyId, mob.office.company.coyCode as coyCode, mob.office.company.coyName as coyName, " +
						"mob.product.productId as productId, mob.product.productCode as productCode, mob.product.productName as productName, " +
						"mob.product.template.tempId as tempId, mob.product.template.tempLabel as tempLabel, " +
						"mob.taskStatus.taskStatusId as taskStatusId, mob.taskStatus.taskStatusCode as taskStatusCode, mob.taskStatus.taskStatusName as taskStatusName " +
						"from " + domainClass.getName() + " mob " +
						"left join mob.user usr " +
						"where mob.office.officeId = :officeId " +
							"and usr.userId is null " +
							"and mob.taskStatus.taskStatusCode = :taskStatusCode " +
							"and mob.customerZipcode = :zipcode")
						.setInteger("officeId", officeId)
						.setString("taskStatusCode", taskStatusCode)
						.setString("zipcode", zipcode)
						.setMaxResults(limit)
						.setResultTransformer(Transformers.aliasToBean(MobileTaskAssignmentDTO.class))
						.list();
	}
	
	/**
	 * Get number of task data by user and task status code 
	 * @param userId
	 * @param taskStatusCode
	 * @return count of tasks based on given user and task status code
	 */
	public int countByUserAndTask(int userId, String taskStatusCode) {
		return ((Long) sessionFactory.getCurrentSession().createQuery(
					"select count (*) from " + domainClass.getName() + " task " +
						"where task.user.userId = :userId " +
							"and task.taskStatus.taskStatusCode = :taskStatusCode")
					.setInteger("userId", userId)
					.setString("taskStatusCode", taskStatusCode)
					.iterate().next()).intValue();
	}
	
	/**
	 * Get number of task data by user and id which has status other than drop
	 * @param taskId
	 * @param userId
	 * @return count of tasks based on given user and id
	 */
	public int countByCurrentTaskAndUser(int taskId, int userId) {
		return ((Long) sessionFactory.getCurrentSession().createQuery(
					"select count (*) from " + domainClass.getName() + " task " +
						"where task.taskId = :taskId " +
							"and task.user.userId = :userId " +
							"and task.taskStatus.taskStatusCode != 'DROP'")
					.setInteger("taskId", taskId)
					.setInteger("userId", userId)
					.iterate().next()).intValue();
	}
}
