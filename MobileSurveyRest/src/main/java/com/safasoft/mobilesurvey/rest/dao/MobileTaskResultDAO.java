package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResult;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResult;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDTO;

/**
 * DAO table MOBILE_TASK_RESULT
 * extends BaseDAO class
 * @see BaseDAO
 * @created Feb 13, 2017
 * @author awal
 */
@Repository("mobileTaskResultDAO")
public class MobileTaskResultDAO extends BaseDAO<MobileTaskResult> {

	/**
	 * Get result data by given company
	 * @param coyId company
	 * @return list of companies based on given company
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskResult> getByCoy(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " mtr " +
						"join fetch mtr.taskResultDetails " +
						"where mtr.task.office.company.coyId = :coyId")
				.setInteger("coyId", coyId)
				.list();
	}

	/**
	 * Get result data by given company
	 * @param coyId company
	 * @return list of companies based on given company in form of DTO
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskResultDTO> getByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mtr.taskResultId as taskResultId, mtr.mcc as mcc, mtr.mnc as mnc, mtr.lac as lac, mtr.cellId as cellId, mtr.isGps as isGps, " +
					"mtr.gpsLatitude as gpsLatitude, mtr.gpsLongitude as gpsLongitude, mtr.accuracy as accuracy, " +
					"mtr.createdBy as createdBy, mtr.createdDate as createdDate, mtr.updatedBy as updatedBy, mtr.updatedDate as updatedDate, " +
					"mtr.task.taskId as taskId, mtr.task.assignmentDate as assignmentDate, mtr.task.retrieveDate as retrieveDate, " +
					"mtr.task.submitDate as submitDate, mtr.task.taskStatus.taskStatusId as taskStatusId, " +
					"mtr.task.user.userId as userId, mtr.task.user.userCode as userCode " +
					"from " + domainClass.getName() + " mtr " +
					"where mtr.task.office.company.coyId = :coyId")
				.setInteger("coyId", coyId)
				.setResultTransformer(Transformers.aliasToBean(MobileTaskResultDTO.class))
				.list();
	}
	
	/**
	 * Get result data by given company and task status
	 * @param coyCode
	 * @param taskStatusCode
	 * @return list of companies based on given company and task status
	 */
	@SuppressWarnings("unchecked")
	public List<TaskResult> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
				"select mtr.taskResultId as taskResultId, mtr.mcc as mcc, mtr.mnc as mnc, mtr.lac as lac, mtr.cellId as cellId, mtr.isGps as isGps, " +
					"mtr.gpsLatitude as gpsLatitude, mtr.gpsLongitude as gpsLongitude, mtr.accuracy as accuracy, " +
					"mtr.createdBy as createdBy, mtr.createdDate as createdDate, mtr.updatedBy as updatedBy, mtr.updatedDate as updatedDate, " +
					"mtr.task.taskId as taskId  " +
					"from " + domainClass.getName() + " mtr " +
					"where mtr.task.office.company.coyCode = :coyCode " +
						"and mtr.task.taskStatus.taskStatusCode = :taskStatusCode")
				.setString("coyCode", coyCode)
				.setString("taskStatusCode", taskStatusCode)
				.setResultTransformer(Transformers.aliasToBean(TaskResult.class))
				.list();
	}
}
