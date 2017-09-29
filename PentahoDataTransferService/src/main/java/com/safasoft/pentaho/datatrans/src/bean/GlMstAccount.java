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
@Table(name="GL_MST_ACCOUNT",schema="FINA")
public class GlMstAccount implements Serializable {

  @Id
  @Column(name="GLACCT_CODE")
  private String glacctCode;
  @Column(name="GLACCT_DESCRIPTION")
  private String glacctDescription;
  @Column(name="GLACCT_ACCT_TYPE")
  private String glacctAcctType;
  @Column(name="GLACCT_ACCT_SUMM")
  private String glacctAcctSumm;
  @Column(name="GLACCT_ACCT_ENABLE")
  private String glacctAcctEnable;
  @Column(name="GLACCT_ACCT_FLAG")
  private String glacctAcctFlag;
  @Column(name="GLACCT_ACCT_DEFAULT")
  private String glacctAcctDefault;
  @Column(name="GLACCT_ACCT_PARENT")
  private String glacctAcctParent;
  @Column(name="GLACCT_CREATED_BY")
  private String glacctCreatedBy;
  @Column(name="GLACCT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date glacctCreatedDate;
  @Column(name="GLACCT_UPDATED_BY")
  private String glacctUpdatedBy;
  @Column(name="GLACCT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date glacctUpdatedDate;
  @Column(name="GLACCT_RPT_FLAG")
  private String glacctRptFlag;
  @Column(name="GLACCT_SEGMENT1_ALLOW")
  private String glacctSegment1Allow;
  
	public String getGlacctCode() {
		return glacctCode;
	}
	public void setGlacctCode(String glacctCode) {
		this.glacctCode = glacctCode;
	}
	public String getGlacctDescription() {
		return glacctDescription;
	}
	public void setGlacctDescription(String glacctDescription) {
		this.glacctDescription = glacctDescription;
	}
	public String getGlacctAcctType() {
		return glacctAcctType;
	}
	public void setGlacctAcctType(String glacctAcctType) {
		this.glacctAcctType = glacctAcctType;
	}
	public String getGlacctAcctSumm() {
		return glacctAcctSumm;
	}
	public void setGlacctAcctSumm(String glacctAcctSumm) {
		this.glacctAcctSumm = glacctAcctSumm;
	}
	public String getGlacctAcctEnable() {
		return glacctAcctEnable;
	}
	public void setGlacctAcctEnable(String glacctAcctEnable) {
		this.glacctAcctEnable = glacctAcctEnable;
	}
	public String getGlacctAcctFlag() {
		return glacctAcctFlag;
	}
	public void setGlacctAcctFlag(String glacctAcctFlag) {
		this.glacctAcctFlag = glacctAcctFlag;
	}
	public String getGlacctAcctDefault() {
		return glacctAcctDefault;
	}
	public void setGlacctAcctDefault(String glacctAcctDefault) {
		this.glacctAcctDefault = glacctAcctDefault;
	}
	public String getGlacctAcctParent() {
		return glacctAcctParent;
	}
	public void setGlacctAcctParent(String glacctAcctParent) {
		this.glacctAcctParent = glacctAcctParent;
	}
	public String getGlacctCreatedBy() {
		return glacctCreatedBy;
	}
	public void setGlacctCreatedBy(String glacctCreatedBy) {
		this.glacctCreatedBy = glacctCreatedBy;
	}
	public Date getGlacctCreatedDate() {
		return glacctCreatedDate;
	}
	public void setGlacctCreatedDate(Date glacctCreatedDate) {
		this.glacctCreatedDate = glacctCreatedDate;
	}
	public String getGlacctUpdatedBy() {
		return glacctUpdatedBy;
	}
	public void setGlacctUpdatedBy(String glacctUpdatedBy) {
		this.glacctUpdatedBy = glacctUpdatedBy;
	}
	public Date getGlacctUpdatedDate() {
		return glacctUpdatedDate;
	}
	public void setGlacctUpdatedDate(Date glacctUpdatedDate) {
		this.glacctUpdatedDate = glacctUpdatedDate;
	}
	public String getGlacctRptFlag() {
		return glacctRptFlag;
	}
	public void setGlacctRptFlag(String glacctRptFlag) {
		this.glacctRptFlag = glacctRptFlag;
	}
	public String getGlacctSegment1Allow() {
		return glacctSegment1Allow;
	}
	public void setGlacctSegment1Allow(String glacctSegment1Allow) {
		this.glacctSegment1Allow = glacctSegment1Allow;
	}

}