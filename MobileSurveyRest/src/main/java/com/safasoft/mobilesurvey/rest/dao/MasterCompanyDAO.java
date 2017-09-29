package com.safasoft.mobilesurvey.rest.dao;

import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterCompany;

/**
 * DAO table MASTER_COMPANY
 * extends BaseDAO class
 * @see BaseDAO
 * @created Oct 12, 2016
 * @author awal
 */
@Repository("masterCompanyDAO")
public class MasterCompanyDAO extends BaseDAO<MasterCompany> {

	/**
	 * Get company by code
	 * @param coyCode company code
	 * @return company object based on given code
	 */
	public MasterCompany getByCode(String coyCode) {
		return (MasterCompany) sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " coy " +
						"where coy.coyCode = :coyCode")
					.setString("coyCode", coyCode)
					.uniqueResult();
	}
}
