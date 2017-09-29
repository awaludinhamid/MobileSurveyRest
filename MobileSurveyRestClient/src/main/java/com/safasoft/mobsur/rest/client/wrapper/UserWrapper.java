package com.safasoft.mobsur.rest.client.wrapper;

import java.util.List;

import com.safasoft.mobsur.rest.client.bean.User;

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
