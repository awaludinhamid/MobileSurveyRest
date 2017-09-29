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
@Table(name="CFIN_OVERBOOK_HDR")
public class CfinOverbookHdrDest implements Serializable {

	@Id
	@Column(name="OVB_MEMO_NO")
	private String ovbMemoNo;
	@Column(name="OVB_TRX_FLOW")
	private String ovbTrxFlow;
	@Column(name="OVB_CREATED_BY")
	private String ovbCreatedBy;
	@Column(name="OVB_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ovbCreatedDate;
	@Column(name="OVB_APPRCANCEL_BY")
	private String ovbApprcancelBy;
	@Column(name="OVB_APPRCANCEL_DATE")
	@Temporal(TemporalType.DATE)
	private Date ovbApprcancelDate;
	@Column(name="OVB_DESC")
	private String ovbDesc;
	@Column(name="OVB_COYOUTLET_ID")
	private String ovbCoyoutletId;
	@Column(name="OVB_STATUS")
	private String ovbStatus;
	
	public String getOvbMemoNo() {
		return ovbMemoNo;
	}
	public void setOvbMemoNo(String ovbMemoNo) {
		this.ovbMemoNo = ovbMemoNo;
	}
	public String getOvbTrxFlow() {
		return ovbTrxFlow;
	}
	public void setOvbTrxFlow(String ovbTrxFlow) {
		this.ovbTrxFlow = ovbTrxFlow;
	}
	public String getOvbCreatedBy() {
		return ovbCreatedBy;
	}
	public void setOvbCreatedBy(String ovbCreatedBy) {
		this.ovbCreatedBy = ovbCreatedBy;
	}
	public Date getOvbCreatedDate() {
		return ovbCreatedDate;
	}
	public void setOvbCreatedDate(Date ovbCreatedDate) {
		this.ovbCreatedDate = ovbCreatedDate;
	}
	public String getOvbApprcancelBy() {
		return ovbApprcancelBy;
	}
	public void setOvbApprcancelBy(String ovbApprcancelBy) {
		this.ovbApprcancelBy = ovbApprcancelBy;
	}
	public Date getOvbApprcancelDate() {
		return ovbApprcancelDate;
	}
	public void setOvbApprcancelDate(Date ovbApprcancelDate) {
		this.ovbApprcancelDate = ovbApprcancelDate;
	}
	public String getOvbDesc() {
		return ovbDesc;
	}
	public void setOvbDesc(String ovbDesc) {
		this.ovbDesc = ovbDesc;
	}
	public String getOvbCoyoutletId() {
		return ovbCoyoutletId;
	}
	public void setOvbCoyoutletId(String ovbCoyoutletId) {
		this.ovbCoyoutletId = ovbCoyoutletId;
	}
	public String getOvbStatus() {
		return ovbStatus;
	}
	public void setOvbStatus(String ovbStatus) {
		this.ovbStatus = ovbStatus;
	}
}
