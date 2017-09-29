package com.safasoft.mobilesurvey.rest.dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterParameter;
import com.safasoft.mobilesurvey.rest.dto.MasterParameterDTO;

/**
 * DAO table MASTER_PARAMETER
 * extends BaseDAO class
 * @see BaseDAO
 * @created Nov 18, 2016
 * @author awal
 */
@Repository("masterParameterDAO")
public class MasterParameterDAO extends BaseDAO<MasterParameter> {

	/**
	 * Get parameter data by company
	 * @param coyId company
	 * @return list of parameters based on given company
	 */
	@SuppressWarnings("unchecked")
	public List<MasterParameterDTO> getAllByCoyDTO(int coyId) {
		return sessionFactory.getCurrentSession().createQuery(
					"select par.parId as parId, par.parValue as parValue, " +
							"par.parentParameter.parentParCode as parCode, par.parentParameter.parentParDesc as parDesc, " +
							"par.parentParameter.parentParAppstype as parAppsType, par.parentParameter.parentParDatatype as parDataType, " +
							"par.parentParameter.parentParValue as parDefaultValue, " +
							"par.company.coyId as coyId, par.company.coyCode as coyCode, par.company.coyName as coyName " +
							"from " + domainClass.getName() + " par " +
							"where par.company.coyId = :coyId " +
								"and current_date between startDate and endDate")
							.setInteger("coyId", coyId)
							.setResultTransformer(Transformers.aliasToBean(MasterParameterDTO.class))
							.list();
	}
	
	/**
	 * Get parameter data by company, along with parent parameter value 
	 * @param coyId company
	 * @return list of parameters based on given company
	 */
	@SuppressWarnings("unchecked")
	public List<MasterParameterDTO> getByCoyDTO(int coyId)  {
		return sessionFactory.getCurrentSession().createSQLQuery(
				"select parentpar.parent_par_id as parId, par.par_value as parValue, " +
						"parentpar.parent_par_code as parCode, parentpar.parent_par_desc as parDesc, " +
						"parentpar.parent_par_appstype as parAppsType, parentpar.parent_par_datatype as parDataType, " +
						"parentpar.parent_par_value as parDefaultValue, " +
						"par.coy_id as coyId, par.coy_code as coyCode, par.coy_name as coyName " +
						"from master_parent_parameter parentpar " +
						"left join ( " +
							"select mp.*, coy.coy_code, coy.coy_name from master_parameter mp " +
							"join master_company coy " +
								"on (mp.coy_id = coy.coy_id and mp.coy_id = :coyId " +
									"and current_date between mp.start_date and mp.end_date)) par " +
						"on (par.parent_par_id = parentpar.parent_par_id)")
						.addScalar("parId")
						.addScalar("parValue")
						.addScalar("parCode")
						.addScalar("parDesc")
						.addScalar("parAppsType")
						.addScalar("parDataType")
						.addScalar("parDefaultValue")
						.addScalar("coyId")
						.addScalar("coyCode")
						.addScalar("coyName")
						.setInteger("coyId", coyId)
						.setResultTransformer(Transformers.aliasToBean(MasterParameterDTO.class))
						.list();
	}
}
