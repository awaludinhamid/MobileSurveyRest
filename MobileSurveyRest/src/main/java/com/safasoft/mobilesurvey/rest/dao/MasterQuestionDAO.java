package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterQuestion;
import com.safasoft.mobilesurvey.rest.dto.MasterQuestionDTO;

/**
 * DAO table MASTER_QUESTION
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 5, 2017
 * @author awal
 */
@Repository("masterQuestionDAO")
public class MasterQuestionDAO extends BaseDAO<MasterQuestion> {

  /**
   * Get question data by company
   * @param coyId, company
   * @return list of questions based on given company
   */
	@SuppressWarnings("unchecked")
	public List<MasterQuestionDTO> getAllByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
					"select que.questId as questId, que.questLabel as questLabel, que.maxLength as maxLength, que.isMandatory as isMandatory, " +
							"que.answerType.answerTypeId as answerTypeId, que.answerType.answerTypeName as answerTypeName, " +
							"que.optionAnswer.optionAnswerId as optionAnswerId, que.optionAnswer.optionAnswerName as optionAnswerName, que.optionAnswer.tableName as tableName, " +
							"gpr.groupParamId as groupParamId, gpr.groupParamCode as groupParamCode, gpr.groupParamName as groupParamName, " +
							"que.company.coyId as coyId, que.company.coyCode as coyCode, que.company.coyName as coyName " +
							"from " + domainClass.getName() + " que " +
							"left join que.optionAnswer.groupParam gpr " +
							"where que.company.coyId = :coyId " +
								"and current_date between que.startDate and que.endDate")
							.setInteger("coyId", coyId)
							.setResultTransformer(Transformers.aliasToBean(MasterQuestionDTO.class))
							.list();
	}

  /**
   * Get question by company and id
   * @param coyId, company
   * @param questId, question
   * @return question object based on given company and id
   */
	public MasterQuestionDTO getByCoyAndIdDTO(int coyId, int questId) {
		return (MasterQuestionDTO) sessionFactory.getCurrentSession().createQuery(
					"select que.questId as questId, que.questLabel as questLabel, que.maxLength as maxLength, que.isMandatory as isMandatory, " +
							"que.answerType.answerTypeId as answerTypeId, que.answerType.answerTypeName as answerTypeName, " +
							"que.optionAnswer.optionAnswerId as optionAnswerId, que.optionAnswer.optionAnswerName as optionAnswerName, que.optionAnswer.tableName as tableName, " +
							"gpr.groupParamId as groupParamId, gpr.groupParamCode as groupParamCode, gpr.groupParamName as groupParamName, " +
							"que.company.coyId as coyId, que.company.coyCode as coyCode, que.company.coyName as coyName " +
							"from " + domainClass.getName() + " que " +
							"left join que.optionAnswer.groupParam gpr " +
							"where que.company.coyId = :coyId " +
								"and que.questId = :questId " +
								"and current_date between que.startDate and que.endDate")
							.setInteger("coyId", coyId)
							.setInteger("questId", questId)
							.setResultTransformer(Transformers.aliasToBean(MasterQuestionDTO.class))
							.uniqueResult();
	}

}
