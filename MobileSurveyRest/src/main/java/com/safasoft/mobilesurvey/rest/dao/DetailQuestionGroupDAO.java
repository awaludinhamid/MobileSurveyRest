package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.DetailQuestionGroup;
import com.safasoft.mobilesurvey.rest.dto.DetailQuestionGroupDTO;

/**
 * DAO table DETAIL_QUESTION_GROUP
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 11, 2017
 * @author awal
 */
@Repository("detailQuestionGroupDAO")
public class DetailQuestionGroupDAO extends BaseDAO<DetailQuestionGroup> {


  /**
   * Get detail question by the group
   * @param questGroupId, group
   * @return list of detail question based on given group
   */
	@SuppressWarnings("unchecked")
	public List<DetailQuestionGroupDTO> getAllByQuestGroupDTO(int questGroupId) {
		return sessionFactory.getCurrentSession().createQuery(
					"select detque.detailQuestGroupId as detailQuestGroupId, detque.sort as sort, " +
							"detque.questionGroup.questGroupId as questGroupId, detque.questionGroup.questGroupLabel as questGroupLabel, " +
							"detque.question.questId as questId, detque.question.questLabel as questLabel, detque.question.maxLength as maxLength, " +
							"detque.question.isMandatory as isMandatory " +
							"from " + domainClass.getName() + " detque " +
							"where detque.questionGroup.questGroupId = :questGroupId " +
								"and current_date between detque.startDate and detque.endDate")
							.setInteger("questGroupId", questGroupId)
							.setResultTransformer(Transformers.aliasToBean(DetailQuestionGroupDTO.class))
							.list();
	}


  /**
   * Get detail question by the group and id
   * @param questGroupId, group
   * @param detailQuestGroupId, detail question
   * @return detail question object based on given group and id
   */
	public DetailQuestionGroupDTO getByQuestGroupAndIdDTO(int questGroupId, int detailQuestGroupId) {
		return (DetailQuestionGroupDTO) sessionFactory.getCurrentSession().createQuery(
					"select detque.detailQuestGroupId as detailQuestGroupId, detque.sort as sort, " +
							"detque.questionGroup.questGroupId as questGroupId, detque.questionGroup.questGroupLabel as questGroupLabel, " +
							"detque.question.questId as questId, detque.question.questLabel as questLabel, detque.question.maxLength as maxLength, " +
							"detque.question.isMandatory as isMandatory " +
							"from " + domainClass.getName() + " detque " +
							"where detque.questionGroup.questGroupId = :questGroupId " +
								"and detque.detailQuestGroupId = :detailQuestGroupId " +
								"and current_date between detque.startDate and detque.endDate")
							.setInteger("questGroupId", questGroupId)
							.setInteger("detailQuestGroupId", detailQuestGroupId)
							.setResultTransformer(Transformers.aliasToBean(DetailQuestionGroupDTO.class))
							.uniqueResult();
	}
}
