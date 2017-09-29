package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterUser;
import com.safasoft.mobilesurvey.rest.dto.MasterUserDTO;
import com.safasoft.mobilesurvey.rest.dto.client.MasterUserDTOClient;

/**
 * SPI of user role module
 * @created Apr 14, 2016
 * @author awal
 */
public interface MasterUserService {

	/**
	 * Save given user
	 * @param user
	 * @return saved user
	 */
	MasterUser save(MasterUser user);
	
	/**
	 * Get user by id
	 * @param userId
	 * @return user object based on given id
	 */
	MasterUser getById(int userId);
	
	/**
	 * Get all user data
	 * @return list of all users
	 */
	List<MasterUser> getAll();

	/**
	 * Get user by code, password and IMEI no
	 * @param userCode
	 * @param userPassword
	 * @param userImei
	 * @return user object based on given code, password and IMEI no
	 */
	MasterUser getByUserPassAndImei(String userCode, String userPassword, String userImei);
	
	/**
	 * Get user by code, password and IMEI no
	 * @param userCode
	 * @param userPassword
	 * @param userImei
	 * @return user object based on given code, password and IMEI no in form of DTO
	 */
	MasterUserDTO getByUserPassAndImeiDTO(String userCode, String userPassword, String userImei);
	
	/**
	 * Get user by code, password and IMEI no
	 * @param userCode
	 * @param userPassword
	 * @param userImei
	 * @return user object based on given code, password and IMEI no in form of DTO client
	 */
	MasterUserDTOClient getByUserPassAndImeiDTOClient(String userCode, String userPassword, String userImei);
}
