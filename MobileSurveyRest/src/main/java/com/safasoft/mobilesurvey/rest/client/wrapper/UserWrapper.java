package com.safasoft.mobilesurvey.rest.client.wrapper;

import java.util.List;

import com.safasoft.mobilesurvey.rest.client.bean.User;

/**
 * Class for container of User list
 * @created Oct 14, 2016
 * @author awal
 */
public class UserWrapper {

	private List<User> userList;
	
	public UserWrapper() {}
	public UserWrapper(List<User> userList) {
		this.userList = userList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
