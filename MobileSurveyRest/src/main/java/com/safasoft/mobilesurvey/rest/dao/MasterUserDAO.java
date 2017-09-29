package com.safasoft.mobilesurvey.rest.dao;

import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.safasoft.mobilesurvey.rest.bean.MasterUser;
import com.safasoft.mobilesurvey.rest.dto.MasterUserDTO;
import com.safasoft.mobilesurvey.rest.dto.client.MasterUserDTOClient;

/**
 * DAO table MASTER_USER
 * extends BaseDAO class
 * @see BaseDAO
 * @created Apr 4, 2016
 * @author awal
 */
@Repository("masterUserDAO")
public class MasterUserDAO extends BaseDAO<MasterUser> {

	/**
	 * Get user by code, password and IMEI no
	 * @param userCode
	 * @param userPassword
	 * @param userImei
	 * @return user object based on given code, password and IMEI no
	 */
	public MasterUser getByUserPassAndImei(String userCode, String userPassword, String userImei) {
		return (MasterUser) sessionFactory.getCurrentSession().createQuery(
				"from " + domainClass.getName() + " " +
					"where userCode = :userCode " +
						"and userPassword = :userPassword " +
						"and userImei = :userImei " +
						"and current_date between startDate and endDate")
						.setString("userCode", userCode)
						.setString("userPassword", userPassword)
						.setString("userImei", userImei)
						.uniqueResult();
	}
	
	/**
	 * Get user by code, password and IMEI no
	 * @param userCode
	 * @param userPassword
	 * @param userImei
	 * @return user object based on given code, password and IMEI no in form of DTO
	 */
	public MasterUserDTO getByUserPassAndImeiDTO(String userCode, String userPassword, String userImei) {
		return (MasterUserDTO) sessionFactory.getCurrentSession().createQuery(
				"select usr.userId as userId, usr.userCode as userCode, usr.userName as userName, usr.userImei as userImei, " +
					"usr.userEmail as userEmail, usr.userPassword as userPassword, usr.isVerif as isVerif, " +
					"usr.startDate as startDate, usr.endDate as endDate, " +
					"usr.createdBy as createdBy, usr.createdDate as createdDate, usr.updatedBy as updatedBy, usr.updatedDate as updatedDate, " +
					"usr.office.officeId as officeId, usr.office.officeCode as officeCode, usr.office.officeName as officeName, " +
					"usr.office.company.coyId as coyId, usr.office.company.coyCode as coyCode, usr.office.company.coyName as coyName " +
					"from " + domainClass.getName() + " usr " +
					"where userCode = :userCode " +
						"and userPassword = :userPassword " +
						"and userImei = :userImei " +
						"and current_date between startDate and endDate")
						.setString("userCode", userCode)
						.setString("userPassword", userPassword)
						.setString("userImei", userImei)
						.setResultTransformer(Transformers.aliasToBean(MasterUserDTO.class))
						.uniqueResult();
	}
	
	/**
	 * Get user by code, password and IMEI no
	 * @param userCode
	 * @param userPassword
	 * @param userImei
	 * @return user object based on given code, password and IMEI no in form of DTO client
	 */
	public MasterUserDTOClient getByUserPassAndImeiDTOClient(String userCode, String userPassword, String userImei) {
		return (MasterUserDTOClient) sessionFactory.getCurrentSession().createQuery(
				"select usr.userId as userId, usr.userCode as userCode, usr.userName as userName, usr.userImei as userImei, " +
					"usr.userEmail as userEmail, usr.userPassword as userPassword, usr.isVerif as isVerif, usr.office.officeId as officeId, " +
					"usr.startDate as startDate, usr.endDate as endDate, " +
					"usr.createdBy as createdBy, usr.createdDate as createdDate, usr.updatedBy as updatedBy, usr.updatedDate as updatedDate " +
					"from " + domainClass.getName() + " usr " +
					"where userCode = :userCode " +
						"and userPassword = :userPassword " +
						"and userImei = :userImei " +
						"and current_date between startDate and endDate")
						.setString("userCode", userCode)
						.setString("userPassword", userPassword)
						.setString("userImei", userImei)
						.setResultTransformer(Transformers.aliasToBean(MasterUserDTOClient.class))
						.uniqueResult();		
	}
}
