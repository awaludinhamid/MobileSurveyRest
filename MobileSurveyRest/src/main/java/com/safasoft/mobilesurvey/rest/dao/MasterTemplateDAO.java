package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterTemplate;
import com.safasoft.mobilesurvey.rest.dto.MasterTemplateDTO;

/**
 * DAO table MASTER_TEMPLATE
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 15, 2017
 * @author awal
 */
@Repository("masterTemplateDAO")
public class MasterTemplateDAO extends BaseDAO<MasterTemplate> {

  /**
   * Get template data by company
   * @param coyId, company
   * @return list of templates based on given company
   */
	@SuppressWarnings("unchecked")
	public List<MasterTemplateDTO> getAllByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
				"select tmp.tempId as tempId, tmp.tempLabel as tempLabel, " +
						"tmp.company.coyId as coyId, tmp.company.coyCode as coyCode, tmp.company.coyName as coyName " +
						"from " + domainClass.getName() + " tmp " +
						"where tmp.company.coyId = :coyId " +
							"and current_date between tmp.startDate and tmp.endDate")
						.setInteger("coyId", coyId)
						.setResultTransformer(Transformers.aliasToBean(MasterTemplateDTO.class))
						.list();
	}

  /**
   * Get template by company and id
   * @param coyId, company
   * @param tempId, template
   * @return template object based on given company and id
   */
	public MasterTemplateDTO getByCoyAndIdDTO(int coyId, int tempId) {
		return (MasterTemplateDTO) sessionFactory.getCurrentSession().createQuery(
				"select tmp.tempId as tempId, tmp.tempLabel as tempLabel, " +
						"tmp.company.coyId as coyId, tmp.company.coyCode as coyCode, tmp.company.coyName as coyName " +
						"from " + domainClass.getName() + " tmp " +
						"where tmp.company.coyId = :coyId " +
							"and tmp.tempId = :tempId " +
							"and current_date between tmp.startDate and tmp.endDate")
						.setInteger("coyId", coyId)
						.setInteger("tempId", tempId)
						.setResultTransformer(Transformers.aliasToBean(MasterTemplateDTO.class))
						.uniqueResult();
	}
}
