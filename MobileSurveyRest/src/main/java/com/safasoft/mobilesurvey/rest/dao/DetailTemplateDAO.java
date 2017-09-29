package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.DetailTemplate;
import com.safasoft.mobilesurvey.rest.dto.DetailTemplateDTO;

/**
 * DAO table DETAIL_TEMPLATE
 * extends BaseDAO class
 * @see BaseDAO
 * @author awal
 * @created Mar 22, 2017
 */
@Repository("detailTemplateDAO")
public class DetailTemplateDAO extends BaseDAO<DetailTemplate> {

	/**
   * Get detail template by the template
	 * @param tempId template
	 * @return list of detail templates based on given template
	 */
	@SuppressWarnings("unchecked")
	public List<DetailTemplateDTO> getAllByTempDTO(int tempId) {
		return sessionFactory.getCurrentSession().createQuery(
				"select detmp.detailTempId as detailTempId, detmp.sort as sort, " +
						"detmp.template.tempId as tempId, detmp.template.tempLabel as tempLabel, " +
						"detmp.questionGroup.questGroupId as questGroupId, detmp.questionGroup.questGroupLabel as questGroupLabel " +
						"from " + domainClass.getName() + " detmp " +
						"where detmp.template.tempId = :tempId " +
							"and current_date between detmp.startDate and detmp.endDate")
						.setInteger("tempId", tempId)
						.setResultTransformer(Transformers.aliasToBean(DetailTemplateDTO.class))
						.list();
	}
	
	/**
	 * Get detail template by the template and id
	 * @param tempId template
	 * @param detailTempId detail template
	 * @return detail template object based on given template
	 */
	public DetailTemplateDTO getByTempAndIdDTO(int tempId, int detailTempId) {
		return (DetailTemplateDTO) sessionFactory.getCurrentSession().createQuery(
				"select detmp.detailTempId as detailTempId, detmp.sort as sort, " +
						"detmp.template.tempId as tempId, detmp.template.tempLabel as tempLabel, " +
						"detmp.questionGroup.questGroupId as questGroupId, detmp.questionGroup.questGroupLabel as questGroupLabel " +
						"from " + domainClass.getName() + " detmp " +
						"where detmp.template.tempId = :tempId " +
							"and detmp.detailTempId = :detailTempId " +
							"and current_date between detmp.startDate and detmp.endDate")
						.setInteger("tempId", tempId)
						.setInteger("detailTempId", detailTempId)
						.setResultTransformer(Transformers.aliasToBean(DetailTemplateDTO.class))
						.uniqueResult();
	}
}
