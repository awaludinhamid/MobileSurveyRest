package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterTaskStatus;
import com.safasoft.mobilesurvey.rest.dto.MasterTaskStatusDTO;

/**
 * DAO table MASTER_TASK_STATUS
 * extends BaseDAO class
 * @see BaseDAO
 * @created Feb 8, 2017
 * @author awal
 */
@Repository("masterTaskStatusDAO")
public class MasterTaskStatusDAO extends BaseDAO<MasterTaskStatus> {

	/**
	 * Get all task status data
	 * @return list of task status
	 */
	@SuppressWarnings("unchecked")
	public List<MasterTaskStatusDTO> getAllDTO() {
		return sessionFactory.getCurrentSession().createQuery(
					"select tst.taskStatusId as taskStatusId, tst.taskStatusCode as taskStatusCode, tst.taskStatusName as taskStatusName " +
						"from " + domainClass.getName() + " tst")
						.setResultTransformer(Transformers.aliasToBean(MasterTaskStatusDTO.class))
						.list();
	}

  /**
   * Get task status by code
   * @param taskStatusCode
   * @return task status object based on the code
   */
	public MasterTaskStatus getByCode(String taskStatusCode) {
		return (MasterTaskStatus) sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " tst " +
						"where tst.taskStatusCode = :taskStatusCode")
					.setString("taskStatusCode", taskStatusCode)
					.uniqueResult();
	}
}
