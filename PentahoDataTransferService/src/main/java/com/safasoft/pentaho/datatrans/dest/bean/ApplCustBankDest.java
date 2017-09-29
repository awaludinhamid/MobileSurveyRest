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
@Table(name="APPL_CUST_BANK")
public class ApplCustBankDest implements Serializable {

	@Id
	@Column(name="CUST_ID")
	private String custId;
	@Id
	@Column(name="BANK_CODE")
	private String bankCode;
	@Id
	@Column(name="BANK_ACCT_NO")
	private String bankAcctNo;
	@Column(name="BANK_BRNAME")
	private String bankBrname;
	@Column(name="BANK_ACCT_NAME")
	private String bankAcctName;
	@Column(name="BANK_ACC_CURR")
	private String bankAcctCurr;
	@Column(name="BANK_ACCT_STS")
	private String bankAcctSts;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@Column(name="BANK_DISB_FLAG")
	private String bankDisbFlag;
	@Column(name="BANK_INCV_FLAG")
	private String bankIncvFlag;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankAcctNo() {
		return bankAcctNo;
	}
	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}
	public String getBankBrname() {
		return bankBrname;
	}
	public void setBankBrname(String bankBrname) {
		this.bankBrname = bankBrname;
	}
	public String getBankAcctName() {
		return bankAcctName;
	}
	public void setBankAcctName(String bankAcctName) {
		this.bankAcctName = bankAcctName;
	}
	public String getBankAcctCurr() {
		return bankAcctCurr;
	}
	public void setBankAcctCurr(String bankAcctCurr) {
		this.bankAcctCurr = bankAcctCurr;
	}
	public String getBankAcctSts() {
		return bankAcctSts;
	}
	public void setBankAcctSts(String bankAcctSts) {
		this.bankAcctSts = bankAcctSts;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getBankDisbFlag() {
		return bankDisbFlag;
	}
	public void setBankDisbFlag(String bankDisbFlag) {
		this.bankDisbFlag = bankDisbFlag;
	}
	public String getBankIncvFlag() {
		return bankIncvFlag;
	}
	public void setBankIncvFlag(String bankIncvFlag) {
		this.bankIncvFlag = bankIncvFlag;
	}
}
