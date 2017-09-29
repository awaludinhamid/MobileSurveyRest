package com.safasoft.pentaho.datatrans.dest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="APPL_USERS")
public class ApplUsersDest implements Serializable {

	@Id
	@Column(name="USER_ID")
	private String userId;
	@Column(name="USER_NAME")
	private String userNamed;
	@Column(name="USER_PASSWORD")
	private String userPassword;
	@Column(name="USER_CREATED")
	@Temporal(TemporalType.DATE)
	private Date userCreated;
	@Column(name="USER_CREATED_BY")
	private String userCreatedBy;
	@Column(name="USER_UPDATED")
	@Temporal(TemporalType.DATE)
	private Date userUpdated;
	@Column(name="USER_UPDATE_BY")
	private String userUpdateBy;
	@Column(name="USER_PERSON_ID")
	private Integer userPersonId;
	@Column(name="USER_START_DATE")
	@Temporal(TemporalType.DATE)
	private Date userStartDate;
	@Column(name="USER_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date userEndDate;
	@Column(name="USER_DESCRIPTION")
	private String userDescription;
	@Column(name="USER_LAST_LOGON")
	@Temporal(TemporalType.DATE)
	private Date userLastLogon;
	@Column(name="USER_LAST_PASSWORD")
	@Temporal(TemporalType.DATE)
	private Date userLastPassword;
	@Column(name="USER_PASS_LIFESPAN")
	private Integer userPassLifespan;
	@Column(name="USER_PASS_NEED_CHG")
	private String userPassNeedChg;
	@Column(name="USER_ENABLE_STS")
	private String userEnableSts;
	@Column(name="USER_COYOUTLET")
	private String userCoyoutlet;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNamed() {
		return userNamed;
	}
	public void setUserNamed(String userNamed) {
		this.userNamed = userNamed;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getUserCreated() {
		return userCreated;
	}
	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}
	public String getUserCreatedBy() {
		return userCreatedBy;
	}
	public void setUserCreatedBy(String userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}
	public Date getUserUpdated() {
		return userUpdated;
	}
	public void setUserUpdated(Date userUpdated) {
		this.userUpdated = userUpdated;
	}
	public String getUserUpdateBy() {
		return userUpdateBy;
	}
	public void setUserUpdateBy(String userUpdateBy) {
		this.userUpdateBy = userUpdateBy;
	}
	public Integer getUserPersonId() {
		return userPersonId;
	}
	public void setUserPersonId(Integer userPersonId) {
		this.userPersonId = userPersonId;
	}
	public Date getUserStartDate() {
		return userStartDate;
	}
	public void setUserStartDate(Date userStartDate) {
		this.userStartDate = userStartDate;
	}
	public Date getUserEndDate() {
		return userEndDate;
	}
	public void setUserEndDate(Date userEndDate) {
		this.userEndDate = userEndDate;
	}
	public String getUserDescription() {
		return userDescription;
	}
	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	public Date getUserLastLogon() {
		return userLastLogon;
	}
	public void setUserLastLogon(Date userLastLogon) {
		this.userLastLogon = userLastLogon;
	}
	public Date getUserLastPassword() {
		return userLastPassword;
	}
	public void setUserLastPassword(Date userLastPassword) {
		this.userLastPassword = userLastPassword;
	}
	public Integer getUserPassLifespan() {
		return userPassLifespan;
	}
	public void setUserPassLifespan(Integer userPassLifespan) {
		this.userPassLifespan = userPassLifespan;
	}
	public String getUserPassNeedChg() {
		return userPassNeedChg;
	}
	public void setUserPassNeedChg(String userPassNeedChg) {
		this.userPassNeedChg = userPassNeedChg;
	}
	public String getUserEnableSts() {
		return userEnableSts;
	}
	public void setUserEnableSts(String userEnableSts) {
		this.userEnableSts = userEnableSts;
	}
	public String getUserCoyoutlet() {
		return userCoyoutlet;
	}
	public void setUserCoyoutlet(String userCoyoutlet) {
		this.userCoyoutlet = userCoyoutlet;
	}
}
