package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_USER
 * @created Apr 4, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_USER")
public class MasterUser extends ActiveRecordAuditBean {

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
	@ManyToOne
	@JoinColumn(name="OFFICE_ID")
	private MasterOffice office;

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
	public MasterOffice getOffice() {
		return office;
	}
	public void setOffice(MasterOffice office) {
		this.office = office;
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
}
