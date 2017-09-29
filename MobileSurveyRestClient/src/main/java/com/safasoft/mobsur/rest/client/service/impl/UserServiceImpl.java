package com.safasoft.mobsur.rest.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobsur.rest.client.bean.User;
import com.safasoft.mobsur.rest.client.dao.UserDAO;
import com.safasoft.mobsur.rest.client.service.UserService;

@Service("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional(readOnly=false)
	public User save(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}
}
