package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterUser;
import com.safasoft.mobilesurvey.rest.dao.MasterUserDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterUserDTO;
import com.safasoft.mobilesurvey.rest.dto.client.MasterUserDTOClient;
import com.safasoft.mobilesurvey.rest.service.MasterUserService;

/**	
 * User service implementation (see the service for usage info)
 * @created Apr 4, 2016
 * @author awal
 */
@Service("masterUserService")
@Transactional(readOnly=true)
public class MasterUserServiceImpl implements MasterUserService {

	@Autowired
	private MasterUserDAO masterUserDAO;// DAO injection
	
	public MasterUser getById(int userId) {
		// TODO Auto-generated method stub
		return masterUserDAO.getById(userId);
	}

	public List<MasterUser> getAll() {
		// TODO Auto-generated method stub
		return masterUserDAO.getAll();
	}

	public MasterUser getByUserPassAndImei(String userCode, String userPassword, String userImei) {
		// TODO Auto-generated method stub
		return masterUserDAO.getByUserPassAndImei(userCode, userPassword, userImei);
	}

	public MasterUserDTO getByUserPassAndImeiDTO(String userCode,String userPassword, String userImei) {
		// TODO Auto-generated method stub
		return masterUserDAO.getByUserPassAndImeiDTO(userCode, userPassword, userImei);
	}

	@Override
	public MasterUserDTOClient getByUserPassAndImeiDTOClient(String userCode, String userPassword, String userImei) {
		// TODO Auto-generated method stub
		return masterUserDAO.getByUserPassAndImeiDTOClient(userCode, userPassword, userImei);
	}

	@Override
	@Transactional(readOnly=false)
	public MasterUser save(MasterUser user) {
		// TODO Auto-generated method stub
		return masterUserDAO.save(user);
	}

}
