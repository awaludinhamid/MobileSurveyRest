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
@Table(name="CFIN_PENALTY_NEGO",schema="CFIN")
public class CfinPenaltyNego implements Serializable {

	@Id
	@Column(name="PNEGO_MEMO_NO")
	private String pnegoMemoNo;
	@Column(name="PNEGO_COYOUTLET_ID")
	private String pnegoCoyoutletId;
	@Column(name="PNEGO_STATUS")
	private String pnegoStatus;
	@Column(name="PNEGO_CONTRACT_NO")
	private String pnegoContractNo;
	@Column(name="PNEGO_AMT_BEFORE")
	private Integer pnegoAmtBefore;
	@Column(name="PNEGO_AMT_AFTER")
	private Integer pnegoAmtAfter;
	@Column(name="PNEGO_CREATED_BY")
	private String pnegoCreatedBy;
	@Column(name="PNEGO_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date pnegoCreatedDate;
	@Column(name="PNEGO_APPROVED_BY")
	private String pnegoApprovedBy;
	@Column(name="PNEGO_APPROVED_DATE")
	@Temporal(TemporalType.DATE)
	private Date pnegoApprovedDate;
	@Column(name="PNEGO_CANCEL_BY")
	private String pnegoCancelBy;
	@Column(name="PNEGO_CANCEL_DATE")
	@Temporal(TemporalType.DATE)
	private Date pnegoCancelDate;
	@Column(name="PNEGO_DESC")
	private String pnegoDesc;
	@Column(name="PNEGO_COUNT_RESENDMAIL")
	private Integer pnegoCountResendmail;
	@Column(name="PNEGO_UPDATED_BY")
	private String pnegoUpdatedBy;
	@Column(name="PNEGO_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date pnegoUpdatedDate;
	@Column(name="PNEGO_REASON_REVREJ")
	private String pnegoReasonRevrej;
	@Column(name="PNEGO_OUTS_AMT_AFT_BAL")
	private Integer pnegoOutsPaidAftBal;
	@Column(name="PNEGO_TTL_AMT_PAID_AFT_BAL")
	private Integer pnegoTtlAmtPaidAftBal;
	
	public String getPnegoMemoNo() {
		return pnegoMemoNo;
	}
	public void setPnegoMemoNo(String pnegoMemoNo) {
		this.pnegoMemoNo = pnegoMemoNo;
	}
	public String getPnegoCoyoutletId() {
		return pnegoCoyoutletId;
	}
	public void setPnegoCoyoutletId(String pnegoCoyoutletId) {
		this.pnegoCoyoutletId = pnegoCoyoutletId;
	}
	public String getPnegoStatus() {
		return pnegoStatus;
	}
	public void setPnegoStatus(String pnegoStatus) {
		this.pnegoStatus = pnegoStatus;
	}
	public String getPnegoContractNo() {
		return pnegoContractNo;
	}
	public void setPnegoContractNo(String pnegoContractNo) {
		this.pnegoContractNo = pnegoContractNo;
	}
	public Integer getPnegoAmtBefore() {
		return pnegoAmtBefore;
	}
	public void setPnegoAmtBefore(Integer pnegoAmtBefore) {
		this.pnegoAmtBefore = pnegoAmtBefore;
	}
	public Integer getPnegoAmtAfter() {
		return pnegoAmtAfter;
	}
	public void setPnegoAmtAfter(Integer pnegoAmtAfter) {
		this.pnegoAmtAfter = pnegoAmtAfter;
	}
	public String getPnegoCreatedBy() {
		return pnegoCreatedBy;
	}
	public void setPnegoCreatedBy(String pnegoCreatedBy) {
		this.pnegoCreatedBy = pnegoCreatedBy;
	}
	public Date getPnegoCreatedDate() {
		return pnegoCreatedDate;
	}
	public void setPnegoCreatedDate(Date pnegoCreatedDate) {
		this.pnegoCreatedDate = pnegoCreatedDate;
	}
	public String getPnegoApprovedBy() {
		return pnegoApprovedBy;
	}
	public void setPnegoApprovedBy(String pnegoApprovedBy) {
		this.pnegoApprovedBy = pnegoApprovedBy;
	}
	public Date getPnegoApprovedDate() {
		return pnegoApprovedDate;
	}
	public void setPnegoApprovedDate(Date pnegoApprovedDate) {
		this.pnegoApprovedDate = pnegoApprovedDate;
	}
	public String getPnegoCancelBy() {
		return pnegoCancelBy;
	}
	public void setPnegoCancelBy(String pnegoCancelBy) {
		this.pnegoCancelBy = pnegoCancelBy;
	}
	public Date getPnegoCancelDate() {
		return pnegoCancelDate;
	}
	public void setPnegoCancelDate(Date pnegoCancelDate) {
		this.pnegoCancelDate = pnegoCancelDate;
	}
	public String getPnegoDesc() {
		return pnegoDesc;
	}
	public void setPnegoDesc(String pnegoDesc) {
		this.pnegoDesc = pnegoDesc;
	}
	public Integer getPnegoCountResendmail() {
		return pnegoCountResendmail;
	}
	public void setPnegoCountResendmail(Integer pnegoCountResendmail) {
		this.pnegoCountResendmail = pnegoCountResendmail;
	}
	public String getPnegoUpdatedBy() {
		return pnegoUpdatedBy;
	}
	public void setPnegoUpdatedBy(String pnegoUpdatedBy) {
		this.pnegoUpdatedBy = pnegoUpdatedBy;
	}
	public Date getPnegoUpdatedDate() {
		return pnegoUpdatedDate;
	}
	public void setPnegoUpdatedDate(Date pnegoUpdatedDate) {
		this.pnegoUpdatedDate = pnegoUpdatedDate;
	}
	public String getPnegoReasonRevrej() {
		return pnegoReasonRevrej;
	}
	public void setPnegoReasonRevrej(String pnegoReasonRevrej) {
		this.pnegoReasonRevrej = pnegoReasonRevrej;
	}
	public Integer getPnegoOutsPaidAftBal() {
		return pnegoOutsPaidAftBal;
	}
	public void setPnegoOutsPaidAftBal(Integer pnegoOutsPaidAftBal) {
		this.pnegoOutsPaidAftBal = pnegoOutsPaidAftBal;
	}
	public Integer getPnegoTtlAmtPaidAftBal() {
		return pnegoTtlAmtPaidAftBal;
	}
	public void setPnegoTtlAmtPaidAftBal(Integer pnegoTtlAmtPaidAftBal) {
		this.pnegoTtlAmtPaidAftBal = pnegoTtlAmtPaidAftBal;
	}
}
