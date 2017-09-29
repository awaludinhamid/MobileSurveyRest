package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterQuestionGroup;
import com.safasoft.mobilesurvey.rest.dto.MasterQuestionGroupDTO;

/**
 * DAO table MASTER_QUESTION_GROUP
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 10, 2017
 * @author awal
 */
@Repository("masterQuestionGroupDAO")
public class MasterQuestionGroupDAO extends BaseDAO<MasterQuestionGroup> {

  /**
   * Get question group data by company
   * @param coyId, company
   * @return list of question groups based on given company
   */
	@SuppressWarnings("unchecked")
	public List<MasterQuestionGroupDTO> getAllByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
					"select quegr.questGroupId as questGroupId, quegr.questGroupLabel as questGroupLabel, " +
							"quegr.company.coyId as coyId, quegr.company.coyCode as coyCode, quegr.company.coyName as coyName " +
							"from " + domainClass.getName() + " quegr " +
							"where quegr.company.coyId = :coyId " +
								"and current_date between quegr.startDate and quegr.endDate")
							.setInteger("coyId", coyId)
							.setResultTransformer(Transformers.aliasToBean(MasterQuestionGroupDTO.class))
							.list();
	}

  /**
   * Get question by company and id
   * @param coyId, company
   * @param questGroupId, question group
   * @return question object based on given company and id
   */
	public MasterQuestionGroupDTO getByCoyAndIdDTO(int coyId, int questGroupId) {
		return (MasterQuestionGroupDTO) sessionFactory.getCurrentSession().createQuery(
					"select quegr.questGroupId as questGroupId, quegr.questGroupLabel as questGroupLabel, " +
							"quegr.company.coyId as coyId, quegr.company.coyCode as coyCode, quegr.company.coyName as coyName " +
							"from " + domainClass.getName() + " quegr " +
							"where quegr.company.coyId = :coyId " +
								"and quegr.questGroupId = :questGroupId " +
								"and current_date between quegr.startDate and quegr.endDate")
							.setInteger("coyId", coyId)
							.setInteger("questGroupId", questGroupId)
							.setResultTransformer(Transformers.aliasToBean(MasterQuestionGroupDTO.class))
							.uniqueResult();
	}
}
