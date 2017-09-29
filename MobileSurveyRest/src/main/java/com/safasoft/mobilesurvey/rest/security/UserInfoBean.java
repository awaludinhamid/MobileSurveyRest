package com.safasoft.mobilesurvey.rest.security;

import java.util.Calendar;

/**
 * POJO for user info
 * Used for user authentication process
 * @created Aug 13, 2016
 * @author awal
 */
public class UserInfoBean {

	private int userId;
	private Calendar timeIn;//verify this when validate user session expiring
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Calendar getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(Calendar timeIn) {
		this.timeIn = timeIn;
	}
}
