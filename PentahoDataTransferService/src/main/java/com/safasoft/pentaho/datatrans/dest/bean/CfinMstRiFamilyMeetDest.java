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
@Table(name="CFIN_MST_RI_FAMILY_MEET")
public class CfinMstRiFamilyMeetDest implements Serializable {

	@Id
	@Column(name="RIFM_CODE")
	private Integer rifmCode;
	@Column(name="RIFM_DESC")
	private String rifmDesc;
	@Column(name="RIFM_CREATED_BY")
	private String rifmCreatedBy;
	@Column(name="RIFM_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date rifmCreatedDate;
	@Column(name="RIFM_UPDATED_BY")
	private String rifmUpdatedBy;
	@Column(name="RIFM_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date rifmUpdatedDate;
	@Column(name="RIFM_STAT")
	private String rifmStat;
	
	public Integer getRifmCode() {
		return rifmCode;
	}
	public void setRifmCode(Integer rifmCode) {
		this.rifmCode = rifmCode;
	}
	public String getRifmDesc() {
		return rifmDesc;
	}
	public void setRifmDesc(String rifmDesc) {
		this.rifmDesc = rifmDesc;
	}
	public String getRifmCreatedBy() {
		return rifmCreatedBy;
	}
	public void setRifmCreatedBy(String rifmCreatedBy) {
		this.rifmCreatedBy = rifmCreatedBy;
	}
	public Date getRifmCreatedDate() {
		return rifmCreatedDate;
	}
	public void setRifmCreatedDate(Date rifmCreatedDate) {
		this.rifmCreatedDate = rifmCreatedDate;
	}
	public String getRifmUpdatedBy() {
		return rifmUpdatedBy;
	}
	public void setRifmUpdatedBy(String rifmUpdatedBy) {
		this.rifmUpdatedBy = rifmUpdatedBy;
	}
	public Date getRifmUpdatedDate() {
		return rifmUpdatedDate;
	}
	public void setRifmUpdatedDate(Date rifmUpdatedDate) {
		this.rifmUpdatedDate = rifmUpdatedDate;
	}
	public String getRifmStat() {
		return rifmStat;
	}
	public void setRifmStat(String rifmStat) {
		this.rifmStat = rifmStat;
	}
}
