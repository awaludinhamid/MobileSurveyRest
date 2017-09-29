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
@Table(name="CFIN_MST_RI_PARAM")
public class CfinMstRiParamDest implements Serializable {

	@Id
	@Column(name="RIP_FLAG")
	private String ripFlag;
	@Column(name="RIP_FLAG_DESC")
	private String ripFlagDesc;
	@Column(name="RIP_CATEGORY")
	private String ripCategory;
	@Column(name="RIP_NEXT_VISIT")
	private Integer ripNextVisit;
	@Column(name="RIP_MAX_PROMISE")
	private Integer ripMaxPromise;
	@Column(name="RIP_FLAG_CODE")
	private String ripFlagCode;
	@Column(name="RIP_SCRIPT")
	private String ripScript;
	@Column(name="RIP_STATUS")
	private String ripStatus;
	@Column(name="RIP_CREATED_BY")
	private String ripCreatedBy;
	@Column(name="RIP_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ripCreatedDate;
	@Column(name="RIP_UPDATED_BY")
	private String ripUpdatedBy;
	@Column(name="RIP_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ripUpdatedDate;
	
	public String getRipFlag() {
		return ripFlag;
	}
	public void setRipFlag(String ripFlag) {
		this.ripFlag = ripFlag;
	}
	public String getRipFlagDesc() {
		return ripFlagDesc;
	}
	public void setRipFlagDesc(String ripFlagDesc) {
		this.ripFlagDesc = ripFlagDesc;
	}
	public String getRipCategory() {
		return ripCategory;
	}
	public void setRipCategory(String ripCategory) {
		this.ripCategory = ripCategory;
	}
	public Integer getRipNextVisit() {
		return ripNextVisit;
	}
	public void setRipNextVisit(Integer ripNextVisit) {
		this.ripNextVisit = ripNextVisit;
	}
	public Integer getRipMaxPromise() {
		return ripMaxPromise;
	}
	public void setRipMaxPromise(Integer ripMaxPromise) {
		this.ripMaxPromise = ripMaxPromise;
	}
	public String getRipFlagCode() {
		return ripFlagCode;
	}
	public void setRipFlagCode(String ripFlagCode) {
		this.ripFlagCode = ripFlagCode;
	}
	public String getRipScript() {
		return ripScript;
	}
	public void setRipScript(String ripScript) {
		this.ripScript = ripScript;
	}
	public String getRipStatus() {
		return ripStatus;
	}
	public void setRipStatus(String ripStatus) {
		this.ripStatus = ripStatus;
	}
	public String getRipCreatedBy() {
		return ripCreatedBy;
	}
	public void setRipCreatedBy(String ripCreatedBy) {
		this.ripCreatedBy = ripCreatedBy;
	}
	public Date getRipCreatedDate() {
		return ripCreatedDate;
	}
	public void setRipCreatedDate(Date ripCreatedDate) {
		this.ripCreatedDate = ripCreatedDate;
	}
	public String getRipUpdatedBy() {
		return ripUpdatedBy;
	}
	public void setRipUpdatedBy(String ripUpdatedBy) {
		this.ripUpdatedBy = ripUpdatedBy;
	}
	public Date getRipUpdatedDate() {
		return ripUpdatedDate;
	}
	public void setRipUpdatedDate(Date ripUpdatedDate) {
		this.ripUpdatedDate = ripUpdatedDate;
	}
}
