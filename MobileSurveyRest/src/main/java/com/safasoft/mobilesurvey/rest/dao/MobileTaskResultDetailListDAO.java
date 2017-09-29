package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetailList;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailListDTO;

/**
 * DAO table MOBILE_TASK_RESULT_DETAIL_LIST
 * extends BaseDAO class
 * @see BaseDAO
 * @author awal
 * @created Feb 19, 2017
 */
@Repository("mobileTaskResultDetailListDAO")
public class MobileTaskResultDetailListDAO extends BaseDAO<MobileTaskResultDetailList> {

	/**
	 * Get result detail list data by result detail
	 * @param taskResultDetId result detail
	 * @return list of result detail lists based on given result detail 
	 */
	@SuppressWarnings("unchecked")
	public List<MobileTaskResultDetailListDTO> getByResultDetailDTO(int taskResultDetId) {
		return sessionFactory.getCurrentSession().createQuery(
					"select mtrdl.taskResultDetListId as taskResultDetListId, mtrdl.answerId as answerId, mtrdl.answerText as answerText, " +
						"mtrdl.oldAnswerId as oldAnswerId, mtrdl.oldAnswerText as oldAnswerText, mtrdl.editAnswerId as editAnswerId, " +
						"mtrdl.editAnswerText as editAnswerText, mtrdl.finAnswerId as finAnswerId, mtrdl.finAnswerText as finAnswerText, " +
						"mtrdl.flagFinAnswerUse as flagFinAnswerUse, " +
						"mtrdl.createdBy as createdBy, mtrdl.createdDate as createdDate, mtrdl.updatedBy as updatedBy, mtrdl.updatedDate as updatedDate, " +
						"mtrdl.taskResultDetail.taskResultDetId as taskResultDetId, " +
						"mtrdl.taskResultImage.imageId as imageId, mtrdl.taskResultImage.image as image " +
						"from " + domainClass.getName() + " mtrdl " +
						"where mtrdl.taskResultDetail.taskResultDetId = :taskResultDetId")
					.setInteger("taskResultDetId", taskResultDetId)
					.setResultTransformer(Transformers.aliasToBean(MobileTaskResultDetailListDTO.class))
					.list();
	}

	/**
	 * Get result detail list data by company and task status 
	 * @param coyCode company
	 * @param taskStatusCode task status
	 * @return list of result detail lists based on given company and task status
	 */
	@SuppressWarnings("unchecked")
	public List<TaskResultDetailList> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
					"select mtrdl.taskResultDetListId as taskResultDetListId, mtrdl.answerId as answerId, mtrdl.answerText as answerText, " +
						"mtrdl.oldAnswerId as oldAnswerId, mtrdl.oldAnswerText as oldAnswerText, mtrdl.editAnswerId as editAnswerId, " +
						"mtrdl.editAnswerText as editAnswerText, mtrdl.finAnswerId as finAnswerId, mtrdl.finAnswerText as finAnswerText, " +
						"mtrdl.flagFinAnswerUse as flagFinAnswerUse, " +
						"mtrdl.createdBy as createdBy, mtrdl.createdDate as createdDate, mtrdl.updatedBy as updatedBy, mtrdl.updatedDate as updatedDate, " +
						"mtrdl.taskResultDetail.taskResultDetId as taskResultDetId, " +
						"mtrdl.taskResultImage.imageId as imageId " +
						"from " + domainClass.getName() + " mtrdl " +
						"where mtrdl.taskResultDetail.taskResult.task.office.company.coyCode = :coyCode " +
							"and mtrdl.taskResultDetail.taskResult.task.taskStatus.taskStatusCode = :taskStatusCode")
					.setString("coyCode",coyCode)
					.setString("taskStatusCode", taskStatusCode)
					.setResultTransformer(Transformers.aliasToBean(TaskResultDetailList.class))
					.list();
	}
}
