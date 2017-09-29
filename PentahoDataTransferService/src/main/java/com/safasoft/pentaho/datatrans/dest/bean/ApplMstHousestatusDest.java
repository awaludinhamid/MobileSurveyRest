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
@Table(name="APPL_MST_HOUSESTATUS")
public class ApplMstHousestatusDest implements Serializable {

	@Id
	@Column(name="STATUS_ID")
	private String statusId;
	@Column(name="STATUS_DESC")
	private String statusDesc;
	@Column(name="STATUS_SEQ")
	private Integer statusSeq;
	@Column(name="STATUS_CREATED_BY")
	private String statusCreatedBy;
	@Column(name="STATUS_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date statusCreatedDate;
	@Column(name="STATUS_UPDATED_BY")
	private String statusUpdatedBy;
	@Column(name="STATUS_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date statusUpdatedDate;
	
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public Integer getStatusSeq() {
		return statusSeq;
	}
	public void setStatusSeq(Integer statusSeq) {
		this.statusSeq = statusSeq;
	}
	public String getStatusCreatedBy() {
		return statusCreatedBy;
	}
	public void setStatusCreatedBy(String statusCreatedBy) {
		this.statusCreatedBy = statusCreatedBy;
	}
	public Date getStatusCreatedDate() {
		return statusCreatedDate;
	}
	public void setStatusCreatedDate(Date statusCreatedDate) {
		this.statusCreatedDate = statusCreatedDate;
	}
	public String getStatusUpdatedBy() {
		return statusUpdatedBy;
	}
	public void setStatusUpdatedBy(String statusUpdatedBy) {
		this.statusUpdatedBy = statusUpdatedBy;
	}
	public Date getStatusUpdatedDate() {
		return statusUpdatedDate;
	}
	public void setStatusUpdatedDate(Date statusUpdatedDate) {
		this.statusUpdatedDate = statusUpdatedDate;
	}
}
