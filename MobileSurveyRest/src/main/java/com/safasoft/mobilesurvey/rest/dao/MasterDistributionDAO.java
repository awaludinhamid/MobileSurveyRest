package com.safasoft.mobilesurvey.rest.dao;

import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterDistribution;

/**
 * DAO table MASTER_DISTRIBUTION 
 * extends BaseDAO class
 * @see BaseDAO
 * @created Dec 4, 2016
 * @author awal
 */
@Repository("masterDistributionDAO")
public class MasterDistributionDAO extends BaseDAO<MasterDistribution> {

	/**
	 * Get distribution by office
	 * @param officeId
	 * @return distribution object based on given office
	 */
	public MasterDistribution getByOffice(int officeId) {
		return (MasterDistribution) sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " dis " +
						"where dis.office.officeId = :officeId")
				.setInteger("officeId", officeId)
				.uniqueResult();
	}
}
