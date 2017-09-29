package com.safasoft.pentaho.datatrans.src.bean;

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
@Table(name="CFIN_INTEREST_TYPE",schema="CFIN")
public class CfinInterestType implements Serializable {

	@Id
	@Column(name="INT_TYPE_ID")
	private String intTypeId;
	@Column(name="INT_TYPE_DESC")
	private String intTypeDesc;
	@Column(name="INT_CREATED_BY")
	private String intCreatedBy;
	@Column(name="INT_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date intCreatedDate;
	@Column(name="INT_UPDATED_BY")
	private String intUpdatedBy;
	@Column(name="INT_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date intUpdatedDate;
	public String getIntTypeId() {
		return intTypeId;
	}
	public void setIntTypeId(String intTypeId) {
		this.intTypeId = intTypeId;
	}
	public String getIntTypeDesc() {
		return intTypeDesc;
	}
	public void setIntTypeDesc(String intTypeDesc) {
		this.intTypeDesc = intTypeDesc;
	}
	public String getIntCreatedBy() {
		return intCreatedBy;
	}
	public void setIntCreatedBy(String intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}
	public Date getIntCreatedDate() {
		return intCreatedDate;
	}
	public void setIntCreatedDate(Date intCreatedDate) {
		this.intCreatedDate = intCreatedDate;
	}
	public String getIntUpdatedBy() {
		return intUpdatedBy;
	}
	public void setIntUpdatedBy(String intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}
	public Date getIntUpdatedDate() {
		return intUpdatedDate;
	}
	public void setIntUpdatedDate(Date intUpdatedDate) {
		this.intUpdatedDate = intUpdatedDate;
	}
}
