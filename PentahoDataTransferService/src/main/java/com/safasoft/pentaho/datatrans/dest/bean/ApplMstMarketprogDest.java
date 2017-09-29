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
@Table(name="APPL_MST_MARKETPROG")
public class ApplMstMarketprogDest implements Serializable {

  @Id
  @Column(name="MKTPROD_CODE")
  private String mktprodCode;
  @Column(name="MKTPROD_DESC")
  private String mktprodDesc;
  @Column(name="MKTPROD_FIN_PROD")
  private String mktprodFinProd;
  @Column(name="MKTPROD_SYARIAH_FLAG")
  private String mktprodSyariahFlag;
  @Column(name="MKTPROD_STARTDATE")
  @Temporal(TemporalType.DATE)
  private Date mktprodStartdate;
  @Column(name="MKTPROD_ENDDATE")
  @Temporal(TemporalType.DATE)
  private Date mktprodEnddate;
  @Column(name="MKTPROD_CREATED_BY")
  private String mktprodCreatedBy;
  @Column(name="MKTPROD_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date mktprodCreatedDate;
  @Column(name="MKTPROD_UPDATED_BY")
  private String mktprodUpdatedBy;
  @Column(name="MKTPROD_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date mktprodUpdatedDate;
  
	public String getMktprodCode() {
		return mktprodCode;
	}
	public void setMktprodCode(String mktprodCode) {
		this.mktprodCode = mktprodCode;
	}
	public String getMktprodDesc() {
		return mktprodDesc;
	}
	public void setMktprodDesc(String mktprodDesc) {
		this.mktprodDesc = mktprodDesc;
	}
	public String getMktprodFinProd() {
		return mktprodFinProd;
	}
	public void setMktprodFinProd(String mktprodFinProd) {
		this.mktprodFinProd = mktprodFinProd;
	}
	public String getMktprodSyariahFlag() {
		return mktprodSyariahFlag;
	}
	public void setMktprodSyariahFlag(String mktprodSyariahFlag) {
		this.mktprodSyariahFlag = mktprodSyariahFlag;
	}
	public Date getMktprodStartdate() {
		return mktprodStartdate;
	}
	public void setMktprodStartdate(Date mktprodStartdate) {
		this.mktprodStartdate = mktprodStartdate;
	}
	public Date getMktprodEnddate() {
		return mktprodEnddate;
	}
	public void setMktprodEnddate(Date mktprodEnddate) {
		this.mktprodEnddate = mktprodEnddate;
	}
	public String getMktprodCreatedBy() {
		return mktprodCreatedBy;
	}
	public void setMktprodCreatedBy(String mktprodCreatedBy) {
		this.mktprodCreatedBy = mktprodCreatedBy;
	}
	public Date getMktprodCreatedDate() {
		return mktprodCreatedDate;
	}
	public void setMktprodCreatedDate(Date mktprodCreatedDate) {
		this.mktprodCreatedDate = mktprodCreatedDate;
	}
	public String getMktprodUpdatedBy() {
		return mktprodUpdatedBy;
	}
	public void setMktprodUpdatedBy(String mktprodUpdatedBy) {
		this.mktprodUpdatedBy = mktprodUpdatedBy;
	}
	public Date getMktprodUpdatedDate() {
		return mktprodUpdatedDate;
	}
	public void setMktprodUpdatedDate(Date mktprodUpdatedDate) {
		this.mktprodUpdatedDate = mktprodUpdatedDate;
	}

}