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
@Table(name="FIN_MST_PPHCODE")
public class FinMstPphcodeDest implements Serializable {

  @Id
  @Column(name="PPH_CODE")
  private String pphCode;
  @Column(name="PPH_DESC")
  private String pphDesc;
  @Column(name="PPH_RATE_TYPE")
  private String pphRateType;
  @Column(name="PPH_PCT_RATE")
  private Double pphPctRate;
  @Column(name="PPH_TRXDTL_CODE")
  private String pphTrxdtlCode;
  @Column(name="PPH_CREATED_BY")
  private String pphCreatedBy;
  @Column(name="PPH_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pphCreatedDate;
  @Column(name="PPH_UPDATED_BY")
  private String pphUpdatedBy;
  @Column(name="PPH_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pphUpdatedDate;
  @Column(name="PPH_PROGRESS_NO")
  private Integer pphProgressNo;
  @Column(name="PPH_START_DATE")
  @Temporal(TemporalType.DATE)
  private Date pphStartDate;
  @Column(name="PPH_END_DATE")
  @Temporal(TemporalType.DATE)
  private Date pphEndDate;
  
	public String getPphCode() {
		return pphCode;
	}
	public void setPphCode(String pphCode) {
		this.pphCode = pphCode;
	}
	public String getPphDesc() {
		return pphDesc;
	}
	public void setPphDesc(String pphDesc) {
		this.pphDesc = pphDesc;
	}
	public String getPphRateType() {
		return pphRateType;
	}
	public void setPphRateType(String pphRateType) {
		this.pphRateType = pphRateType;
	}
	public Double getPphPctRate() {
		return pphPctRate;
	}
	public void setPphPctRate(Double pphPctRate) {
		this.pphPctRate = pphPctRate;
	}
	public String getPphTrxdtlCode() {
		return pphTrxdtlCode;
	}
	public void setPphTrxdtlCode(String pphTrxdtlCode) {
		this.pphTrxdtlCode = pphTrxdtlCode;
	}
	public String getPphCreatedBy() {
		return pphCreatedBy;
	}
	public void setPphCreatedBy(String pphCreatedBy) {
		this.pphCreatedBy = pphCreatedBy;
	}
	public Date getPphCreatedDate() {
		return pphCreatedDate;
	}
	public void setPphCreatedDate(Date pphCreatedDate) {
		this.pphCreatedDate = pphCreatedDate;
	}
	public String getPphUpdatedBy() {
		return pphUpdatedBy;
	}
	public void setPphUpdatedBy(String pphUpdatedBy) {
		this.pphUpdatedBy = pphUpdatedBy;
	}
	public Date getPphUpdatedDate() {
		return pphUpdatedDate;
	}
	public void setPphUpdatedDate(Date pphUpdatedDate) {
		this.pphUpdatedDate = pphUpdatedDate;
	}
	public Integer getPphProgressNo() {
		return pphProgressNo;
	}
	public void setPphProgressNo(Integer pphProgressNo) {
		this.pphProgressNo = pphProgressNo;
	}
	public Date getPphStartDate() {
		return pphStartDate;
	}
	public void setPphStartDate(Date pphStartDate) {
		this.pphStartDate = pphStartDate;
	}
	public Date getPphEndDate() {
		return pphEndDate;
	}
	public void setPphEndDate(Date pphEndDate) {
		this.pphEndDate = pphEndDate;
	}

}