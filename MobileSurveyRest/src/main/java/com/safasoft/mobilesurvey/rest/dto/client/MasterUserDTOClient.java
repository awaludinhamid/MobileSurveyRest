package com.safasoft.mobilesurvey.rest.dto.client;

import com.safasoft.mobilesurvey.rest.dto.support.ActiveControllerAuditBean;

/**
 * DTO table MASTER_USER on client side
 * @created Nov 18, 2016
 * @author awal
 */
public class MasterUserDTOClient extends ActiveControllerAuditBean {

	private int userId;
	private String userCode;
	private String userName;
	private String userImei;
	private String userEmail;
	private String userPassword;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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
