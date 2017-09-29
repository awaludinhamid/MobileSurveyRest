package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterProduct;
import com.safasoft.mobilesurvey.rest.dto.MasterProductDTO;

/**
 * DAO table MASTER_PRODUCT
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 5, 2017
 * @author awal
 */
@Repository("masterProductDAO")
public class MasterProductDAO extends BaseDAO<MasterProduct> {

	/**
	 * Get product data by company
	 * @param coyId company
	 * @return list of products based on given company
	 */
	@SuppressWarnings("unchecked")
	public List<MasterProductDTO> getAllByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
				"select prod.productId as productId, prod.productCode as productCode, prod.productName as productName, prod.isAutoSurvey as isAutoSurvey, " +
						"prod.template.tempId as tempId, prod.template.tempCode as tempCode, prod.template.tempLabel as tempLabel, " +
						"prod.template.company.coyId as coyId, prod.template.company.coyCode as coyCode, prod.template.company.coyName as coyName " +
						"from " + domainClass.getName() + " prod " +
						"where prod.template.company.coyId = :coyId " +
							"and current_date between prod.startDate and prod.endDate")
						.setInteger("coyId", coyId)
						.setResultTransformer(Transformers.aliasToBean(MasterProductDTO.class))
						.list();
	}
	
	/**
	 * Get product data by company and id
	 * @param coyId company
	 * @param productId
	 * @return product object based on given company and id
	 */
	public MasterProductDTO getByCoyAndIdDTO(int coyId, int productId) {
		return (MasterProductDTO) sessionFactory.getCurrentSession().createQuery(
				"select prod.productId as productId, prod.productCode as productCode, prod.productName as productName, " +
						"prod.template.tempId as tempId, prod.template.tempCode as tempCode, prod.template.tempLabel as tempLabel, " +
						"prod.template.company.coyId as coyId, prod.template.company.coyCode as coyCode, prod.template.company.coyName as coyName " +
						"from " + domainClass.getName() + " prod " +
						"where prod.template.company.coyId = :coyId " +
							"and prod.productId = :productId " +
							"and current_date between prod.startDate and prod.endDate")
						.setInteger("coyId", coyId)
						.setInteger("productId", productId)
						.setResultTransformer(Transformers.aliasToBean(MasterProductDTO.class))
						.uniqueResult();
	}
}
