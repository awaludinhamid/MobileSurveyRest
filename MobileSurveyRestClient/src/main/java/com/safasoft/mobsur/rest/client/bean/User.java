package com.safasoft.mobsur.rest.client.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobsur.rest.client.bean.support.ActiveRecordAuditBean;

@SuppressWarnings("serial")
@Entity
@Table(name="MBS_USER")
public class User extends ActiveRecordAuditBean {

	@Id
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_CODE")
	private String userCode;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_PASSWORD")
	private String userPassword;
	@Column(name="USER_IMEI")
	private String userImei;
	@Column(name="USER_EMAIL")
	private String userEmail;
	@Column(name="IS_VERIF")
	private String isVerif;
	@Column(name="OFFICE_ID")
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
