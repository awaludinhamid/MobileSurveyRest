package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterParentParameter;
import com.safasoft.mobilesurvey.rest.dto.MasterParameterDTO;

/**
 * DAO table MASTER_PARENT_PARAMETER
 * extends BaseDAO class
 * @see BaseDAO
 * @author awal
 * @created Mar 14, 2017
 */
@Repository("masterParentParameterDAO")
public class MasterParentParameterDAO extends BaseDAO<MasterParentParameter> {

	/**
	 * Get parent parameter data by company
	 * @param coyId company
	 * @return list of parent parameters based on given company
	 */
	@SuppressWarnings("unchecked")
	public List<MasterParentParameter> getByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
				"select parparent.parentParId as parId, par.parValue as parValue, " +
				"par.parentParameter.parentParCode as parCode, par.parentParameter.parentParDesc as parDesc, " +
				"par.parentParameter.parentParAppstype as parAppsType, par.parentParameter.parentParDatatype as parDataType, " +
				"par.parentParameter.parentParValue as parDefaultValue, " +
				"par.company.coyId as coyId, par.company.coyCode as coyCode, par.company.coyName as coyName " +
				"from " + domainClass.getName() + " parparent " +
				"left join fetch parparent.parameters par " +
				"where par.company.coyId = :coyId")
				.setInteger("coyId", coyId)
				.setResultTransformer(Transformers.aliasToBean(MasterParameterDTO.class))
				.list();
	}
}
