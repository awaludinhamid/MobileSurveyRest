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
@Table(name="CFIN_MST_RI_PRIO_DTLS")
public class CfinMstRiPrioDtlsDest implements Serializable {

	@Id
	@Column(name="PRIO_DTL_CODE")
	private String prioDtlCode;
	@Id
	@Column(name="PRIO_DTL_BRANCH")
	private String prioDtlBranch;
	@Column(name="PRIO_DTL_CREATED_BY")
	private String prioDtlCreatedBy;
	@Column(name="PRIO_DTL_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date prioDtlCreatedDate;
	@Column(name="PRIO_DTL_LASTUPDATE_BY")
	private String prioDtlLastupdateBy;
	@Column(name="PRIO_DTL_LASTUPDATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date prioDtlLastupdateDate;
	
	public String getPrioDtlCode() {
		return prioDtlCode;
	}
	public void setPrioDtlCode(String prioDtlCode) {
		this.prioDtlCode = prioDtlCode;
	}
	public String getPrioDtlBranch() {
		return prioDtlBranch;
	}
	public void setPrioDtlBranch(String prioDtlBranch) {
		this.prioDtlBranch = prioDtlBranch;
	}
	public String getPrioDtlCreatedBy() {
		return prioDtlCreatedBy;
	}
	public void setPrioDtlCreatedBy(String prioDtlCreatedBy) {
		this.prioDtlCreatedBy = prioDtlCreatedBy;
	}
	public Date getPrioDtlCreatedDate() {
		return prioDtlCreatedDate;
	}
	public void setPrioDtlCreatedDate(Date prioDtlCreatedDate) {
		this.prioDtlCreatedDate = prioDtlCreatedDate;
	}
	public String getPrioDtlLastupdateBy() {
		return prioDtlLastupdateBy;
	}
	public void setPrioDtlLastupdateBy(String prioDtlLastupdateBy) {
		this.prioDtlLastupdateBy = prioDtlLastupdateBy;
	}
	public Date getPrioDtlLastupdateDate() {
		return prioDtlLastupdateDate;
	}
	public void setPrioDtlLastupdateDate(Date prioDtlLastupdateDate) {
		this.prioDtlLastupdateDate = prioDtlLastupdateDate;
	}
}
