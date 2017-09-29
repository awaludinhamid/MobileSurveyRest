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
@Table(name="CFIN_CFGROUP")
public class CfinCfgroupDest implements Serializable {

	@Id
	@Column(name="BUSS_UNT_SHORTNAME")
	private String bussUnitShortname;
	@Column(name="BUSS_UNT_NAME")
	private String bussUnitName;
	@Column(name="BUSS_UNT_OBJT_FLAG")
	private String bussUnitObjtFlag;
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
	@Column(name="MAX_OBJECT")
	private Integer maxObject;
	@Column(name="PLATFORM")
	private String platform;
	@Column(name="BUSS_UNT_STATUS")
	private String bussUntStatus;
	@Column(name="PO_VALID_DAYS")
	private Integer poValidDays;
	@Column(name="PCT_PEN_NON_MNRN")
	private Double pctPenNonMnrn;
	@Column(name="PCT_PEN_MNRN")
	private Double pctPenMnrn;
	@Column(name="PEN_TOLERANCE")
	private Integer penTolerance;
	@Column(name="PCT_ADM_TERM")
	private Double pctAdmTerm;
	@Column(name="MIN_PENALTY")
	private Integer minPenalty;
	@Column(name="COLL_FEE")
	private Integer collFee;
	@Column(name="MAX_NEGO_PLUNAS")
	private Integer maxNegoPlunas;
	@Column(name="CEIL_AMT")
	private Integer ceilAmt;
	
	public String getBussUnitShortname() {
		return bussUnitShortname;
	}
	public void setBussUnitShortname(String bussUnitShortname) {
		this.bussUnitShortname = bussUnitShortname;
	}
	public String getBussUnitName() {
		return bussUnitName;
	}
	public void setBussUnitName(String bussUnitName) {
		this.bussUnitName = bussUnitName;
	}
	public String getBussUnitObjtFlag() {
		return bussUnitObjtFlag;
	}
	public void setBussUnitObjtFlag(String bussUnitObjtFlag) {
		this.bussUnitObjtFlag = bussUnitObjtFlag;
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
	public Integer getMaxObject() {
		return maxObject;
	}
	public void setMaxObject(Integer maxObject) {
		this.maxObject = maxObject;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getBussUntStatus() {
		return bussUntStatus;
	}
	public void setBussUntStatus(String bussUntStatus) {
		this.bussUntStatus = bussUntStatus;
	}
	public Integer getPoValidDays() {
		return poValidDays;
	}
	public void setPoValidDays(Integer poValidDays) {
		this.poValidDays = poValidDays;
	}
	public Double getPctPenNonMnrn() {
		return pctPenNonMnrn;
	}
	public void setPctPenNonMnrn(Double pctPenNonMnrn) {
		this.pctPenNonMnrn = pctPenNonMnrn;
	}
	public Double getPctPenMnrn() {
		return pctPenMnrn;
	}
	public void setPctPenMnrn(Double pctPenMnrn) {
		this.pctPenMnrn = pctPenMnrn;
	}
	public Integer getPenTolerance() {
		return penTolerance;
	}
	public void setPenTolerance(Integer penTolerance) {
		this.penTolerance = penTolerance;
	}
	public Double getPctAdmTerm() {
		return pctAdmTerm;
	}
	public void setPctAdmTerm(Double pctAdmTerm) {
		this.pctAdmTerm = pctAdmTerm;
	}
	public Integer getMinPenalty() {
		return minPenalty;
	}
	public void setMinPenalty(Integer minPenalty) {
		this.minPenalty = minPenalty;
	}
	public Integer getCollFee() {
		return collFee;
	}
	public void setCollFee(Integer collFee) {
		this.collFee = collFee;
	}
	public Integer getMaxNegoPlunas() {
		return maxNegoPlunas;
	}
	public void setMaxNegoPlunas(Integer maxNegoPlunas) {
		this.maxNegoPlunas = maxNegoPlunas;
	}
	public Integer getCeilAmt() {
		return ceilAmt;
	}
	public void setCeilAmt(Integer ceilAmt) {
		this.ceilAmt = ceilAmt;
	}
}
