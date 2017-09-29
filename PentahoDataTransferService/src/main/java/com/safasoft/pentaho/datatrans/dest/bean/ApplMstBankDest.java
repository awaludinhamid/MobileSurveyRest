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
@Table(name="APPL_MST_BANK")
public class ApplMstBankDest implements Serializable {

	@Id
	@Column(name="BANK_CODE")
	private String bankCode;
	@Column(name="BANK_NAME_SHORT")
	private String bankNameShort;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="UPDATED_BY")
	private String uodatedBy;
	@Column(name="UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@Column(name="BANK_NAME_FULL")
	private String bankNameFull;
	@Column(name="TEXT_E_BUSS_CODE")
	private String textEBussCode;
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankNameShort() {
		return bankNameShort;
	}
	public void setBankNameShort(String bankNameShort) {
		this.bankNameShort = bankNameShort;
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
	public String getUodatedBy() {
		return uodatedBy;
	}
	public void setUodatedBy(String uodatedBy) {
		this.uodatedBy = uodatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getBankNameFull() {
		return bankNameFull;
	}
	public void setBankNameFull(String bankNameFull) {
		this.bankNameFull = bankNameFull;
	}
	public String getTextEBussCode() {
		return textEBussCode;
	}
	public void setTextEBussCode(String textEBussCode) {
		this.textEBussCode = textEBussCode;
	}
}
