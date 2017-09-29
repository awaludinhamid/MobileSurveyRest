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
@Table(name="CFIN_TRN_RI_LKRI_HDR",schema="CFIN")
public class CfinTrnRiLkriHdr implements Serializable {

  @Id
  @Column(name="LKRIH_NO")
  private String lkrihNo;
  @Column(name="LKRIH_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkrihDate;
  @Column(name="LKRIH_STAT")
  private String lkrihStat;
  @Column(name="LKRIH_COYOUTLET")
  private String lkrihCoyoutlet;
  @Column(name="LKRIH_CREATED_BY")
  private String lkrihCreatedBy;
  @Column(name="LKRIH_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkrihCreatedDate;
  @Column(name="LKRIH_UPDATED_BY")
  private String lkrihUpdatedBy;
  @Column(name="LKRIH_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkrihUpdatedDate;
  @Column(name="LKRIH_APPROVED_BY")
  private String lkrihApprovedBy;
  @Column(name="LKRIH_APPROVED_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkrihApprovedDate;
  
	public String getLkrihNo() {
		return lkrihNo;
	}
	public void setLkrihNo(String lkrihNo) {
		this.lkrihNo = lkrihNo;
	}
	public Date getLkrihDate() {
		return lkrihDate;
	}
	public void setLkrihDate(Date lkrihDate) {
		this.lkrihDate = lkrihDate;
	}
	public String getLkrihStat() {
		return lkrihStat;
	}
	public void setLkrihStat(String lkrihStat) {
		this.lkrihStat = lkrihStat;
	}
	public String getLkrihCoyoutlet() {
		return lkrihCoyoutlet;
	}
	public void setLkrihCoyoutlet(String lkrihCoyoutlet) {
		this.lkrihCoyoutlet = lkrihCoyoutlet;
	}
	public String getLkrihCreatedBy() {
		return lkrihCreatedBy;
	}
	public void setLkrihCreatedBy(String lkrihCreatedBy) {
		this.lkrihCreatedBy = lkrihCreatedBy;
	}
	public Date getLkrihCreatedDate() {
		return lkrihCreatedDate;
	}
	public void setLkrihCreatedDate(Date lkrihCreatedDate) {
		this.lkrihCreatedDate = lkrihCreatedDate;
	}
	public String getLkrihUpdatedBy() {
		return lkrihUpdatedBy;
	}
	public void setLkrihUpdatedBy(String lkrihUpdatedBy) {
		this.lkrihUpdatedBy = lkrihUpdatedBy;
	}
	public Date getLkrihUpdatedDate() {
		return lkrihUpdatedDate;
	}
	public void setLkrihUpdatedDate(Date lkrihUpdatedDate) {
		this.lkrihUpdatedDate = lkrihUpdatedDate;
	}
	public String getLkrihApprovedBy() {
		return lkrihApprovedBy;
	}
	public void setLkrihApprovedBy(String lkrihApprovedBy) {
		this.lkrihApprovedBy = lkrihApprovedBy;
	}
	public Date getLkrihApprovedDate() {
		return lkrihApprovedDate;
	}
	public void setLkrihApprovedDate(Date lkrihApprovedDate) {
		this.lkrihApprovedDate = lkrihApprovedDate;
	}

}