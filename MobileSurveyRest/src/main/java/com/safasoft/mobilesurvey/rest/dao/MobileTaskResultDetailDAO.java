package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetail;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetail;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailDTO;

/**
 * DAO table MOBILE_TASK_RESULT_DETAIL
 * extends BaseDAO class
 * @see BaseDAO
 * @author awal
 * @created Feb 20, 2017
 */
@Repository("mobileTaskResultDetailDAO")
public class MobileTaskResultDetailDAO extends BaseDAO<MobileTaskResultDetail> {

	/**
	 * Get result detail data by result
	 * @param taskResultId result
	 * @return list of result details based on given result
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskResultDetailDTO> getByResultDTO(int taskResultId) {
		return sessionFactory.getCurrentSession().createQuery(
					"select mtrd.taskResultDetId as taskResultDetId, " +
						"mtrd.createdBy as createdBy, mtrd.createdDate as createdDate, mtrd.updatedBy as updatedBy, mtrd.updatedDate as updatedDate, " +
						"mtrd.taskResult.taskResultId as taskResultId, " +
						"mtrd.question.questId as questId " +
						"from " + domainClass.getName() + " mtrd " +
						"where mtrd.taskResult.taskResultId = :taskResultId")
				.setInteger("taskResultId",taskResultId)
				.setResultTransformer(Transformers.aliasToBean(MobileTaskResultDetailDTO.class))
				.list();
	}

	/**
	 * Get result detail data by company and task status
	 * @param coyCode company
	 * @param taskStatusCode task status
	 * @return list of result details based on given company and task status 
	 */
	@SuppressWarnings("unchecked")
	public List<TaskResultDetail> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
					"select mtrd.taskResultDetId as taskResultDetId, " +
						"mtrd.createdBy as createdBy, mtrd.createdDate as createdDate, mtrd.updatedBy as updatedBy, mtrd.updatedDate as updatedDate, " +
						"mtrd.taskResult.taskResultId as taskResultId, " +
						"mtrd.question.questId as questId " +
						"from " + domainClass.getName() + " mtrd " +
						"where mtrd.taskResult.task.office.company.coyCode = :coyCode " +
						"and mtrd.taskResult.task.taskStatus.taskStatusCode = :taskStatusCode")
				.setString("coyCode",coyCode)
				.setString("taskStatusCode", taskStatusCode)
				.setResultTransformer(Transformers.aliasToBean(TaskResultDetail.class))
				.list();
	}
}
