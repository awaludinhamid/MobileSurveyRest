package com.safasoft.mobilesurvey.rest.client.bean;

import com.safasoft.mobilesurvey.rest.client.bean.support.ActiveRecordAuditBean;

/**
 * POJO for User entity
 * @created Jan 9, 2017
 * @author awal
 */
public class User extends ActiveRecordAuditBean {

	private int userId;
	private String userCode;
	private String userName;
	private String userPassword;
	private String userImei;
	private String userEmail;
	private String isVerif;
	private int officeId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserImei() {
		return userImei;
	}
	public void setUserImei(String userImei) {
		this.userImei = userImei;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getIsVerif() {
		return isVerif;
	}
	public void setIsVerif(String isVerif) {
		this.isVerif = isVerif;
	}
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	
}
