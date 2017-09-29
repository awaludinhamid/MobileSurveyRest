package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterZipcodeVerificator;

/**
 * DAO table MASTER_ZIPCODE_VERIFICATOR
 * extends BaseDAO class
 * @see BaseDAO
 * @created Jan 23, 2017
 * @author awal
 */
@Repository("masterZipcodeVerificatorDAO")
public class MasterZipcodeVerificatorDAO extends BaseDAO<MasterZipcodeVerificator> {

	/**
	 * Get zipcode-verificator data by verificator
	 * @param verificatorId
	 * @return list of zipcode-verificator  based on given verificator 
	 */
	@SuppressWarnings("unchecked")
	public List<MasterZipcodeVerificator> getByVerificator(int verificatorId) {
		return sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " zipver " +
						"where zipver.verificator.userId = :verificatorId")
				.setInteger("verificatorId", verificatorId)
				.list();
	}
}
