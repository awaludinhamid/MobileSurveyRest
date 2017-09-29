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
@Table(name="CFIN_MST_RI_PRIO_HDRS")
public class CfinMstRiPrioHdrsDest implements Serializable {

	@Id
	@Column(name="PRIO_HDR_CODE")
	private String prioHdrCode;
	@Column(name="PRIO_HDR_SEQ")
	private Integer prioHdrSeq;
	@Column(name="PRIO_HDR_PCT_MAX")
	private Integer prioHdrPctMax;
	@Column(name="PRIO_HDR_CREATED_BY")
	private String prioHdrCreatedBy;
	@Column(name="PRIO_HDR_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date prioHdrCreatedDate;
	@Column(name="PRIO_HDR_LASTUPDATE_BY")
	private String prioHdrLastupdateBy;
	@Column(name="PRIO_HDR_LASTUPDATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date prioHdrLastupdateDate;
	
	public String getPrioHdrCode() {
		return prioHdrCode;
	}
	public void setPrioHdrCode(String prioHdrCode) {
		this.prioHdrCode = prioHdrCode;
	}
	public Integer getPrioHdrSeq() {
		return prioHdrSeq;
	}
	public void setPrioHdrSeq(Integer prioHdrSeq) {
		this.prioHdrSeq = prioHdrSeq;
	}
	public Integer getPrioHdrPctMax() {
		return prioHdrPctMax;
	}
	public void setPrioHdrPctMax(Integer prioHdrPctMax) {
		this.prioHdrPctMax = prioHdrPctMax;
	}
	public String getPrioHdrCreatedBy() {
		return prioHdrCreatedBy;
	}
	public void setPrioHdrCreatedBy(String prioHdrCreatedBy) {
		this.prioHdrCreatedBy = prioHdrCreatedBy;
	}
	public Date getPrioHdrCreatedDate() {
		return prioHdrCreatedDate;
	}
	public void setPrioHdrCreatedDate(Date prioHdrCreatedDate) {
		this.prioHdrCreatedDate = prioHdrCreatedDate;
	}
	public String getPrioHdrLastupdateBy() {
		return prioHdrLastupdateBy;
	}
	public void setPrioHdrLastupdateBy(String prioHdrLastupdateBy) {
		this.prioHdrLastupdateBy = prioHdrLastupdateBy;
	}
	public Date getPrioHdrLastupdateDate() {
		return prioHdrLastupdateDate;
	}
	public void setPrioHdrLastupdateDate(Date prioHdrLastupdateDate) {
		this.prioHdrLastupdateDate = prioHdrLastupdateDate;
	}
}
