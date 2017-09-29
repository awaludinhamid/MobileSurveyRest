package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultImage;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultImage;

/**
 * DAO table MOBILE_TASK_RESULT_IMAGE
 * extends BaseDAO class
 * @see BaseDAO
 * @author awal
 * @created Feb 20, 2017
 */
@Repository("mobileTaskResultImageDAO")
public class MobileTaskResultImageDAO extends BaseDAO<MobileTaskResultImage> {
	
	/**
	 * Get result image data by company and task status
	 * @param coyCode company
	 * @param taskStatusCode task status
	 * @return list of result images based on given company and task status
	 */
	@SuppressWarnings("unchecked")
	public List<TaskResultImage> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		return sessionFactory.getCurrentSession().createQuery(
					"select img.imageId as imageId , img.image as image " +
						"from " + domainClass.getName() + " img " +
						"join img.taskResultDetailLists trdls " +
						"where trdls.taskResultDetail.taskResult.task.office.company.coyCode = :coyCode " +
							"and trdls.taskResultDetail.taskResult.task.taskStatus.taskStatusCode = :taskStatusCode")
					.setString("coyCode",coyCode)
					.setString("taskStatusCode", taskStatusCode)
					.setResultTransformer(Transformers.aliasToBean(TaskResultImage.class))
					.list();
	}
}
