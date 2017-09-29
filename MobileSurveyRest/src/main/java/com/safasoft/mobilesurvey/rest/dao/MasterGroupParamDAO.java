package com.safasoft.mobilesurvey.rest.dao;

import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterGroupParam;

/**
 * DAO table MASTER_GROUP_PARAM
 * extends BaseDAO class
 * @see BaseDAO
 * @created Dec 4, 2016
 * @author awal
 */
@Repository("masterGroupParamDAO")
public class MasterGroupParamDAO extends BaseDAO<MasterGroupParam> {

	/**
	 * Get group parameter by code
	 * @param groupParamCode
	 * @return group parameter based on given code
	 */
	public MasterGroupParam getByGroupParamCode(String groupParamCode) {
		return (MasterGroupParam) sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " gpar " +
						//"left join gpar.detailGroupParams dgp " +
						"where gpar.groupParamCode = :groupParamCode")
					.setString("groupParamCode", groupParamCode)
					.uniqueResult();
	}
}
