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
@Table(name="CFIN_MST_RI_PRIORITIES",schema="CFIN")
public class CfinMstRiPriorities implements Serializable {

	@Id
	@Column(name="PRIO_CODE")
	private String prioCode;
	@Column(name="PRIO_DESC")
	private String prioDesc;
	@Column(name="PRIO_SCRIPT")
	private String prioScript;
	@Column(name="PRIO_SPECIAL")
	private String prioSpecial;
	@Column(name="PRIO_STATUS")
	private String prioStatus;
	@Column(name="PRIO_CREATED_BY")
	private String prioCreatedBy;
	@Column(name="PRIO_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date prioCreatedDate;
	@Column(name="PRIO_LASTUPDATE_BY")
	private String prioLastupdateBy;
	@Column(name="PRIO_LASTUPDATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date prioLastupdateDate;
	
	public String getPrioCode() {
		return prioCode;
	}
	public void setPrioCode(String prioCode) {
		this.prioCode = prioCode;
	}
	public String getPrioDesc() {
		return prioDesc;
	}
	public void setPrioDesc(String prioDesc) {
		this.prioDesc = prioDesc;
	}
	public String getPrioScript() {
		return prioScript;
	}
	public void setPrioScript(String prioScript) {
		this.prioScript = prioScript;
	}
	public String getPrioSpecial() {
		return prioSpecial;
	}
	public void setPrioSpecial(String prioSpecial) {
		this.prioSpecial = prioSpecial;
	}
	public String getPrioStatus() {
		return prioStatus;
	}
	public void setPrioStatus(String prioStatus) {
		this.prioStatus = prioStatus;
	}
	public String getPrioCreatedBy() {
		return prioCreatedBy;
	}
	public void setPrioCreatedBy(String prioCreatedBy) {
		this.prioCreatedBy = prioCreatedBy;
	}
	public Date getPrioCreatedDate() {
		return prioCreatedDate;
	}
	public void setPrioCreatedDate(Date prioCreatedDate) {
		this.prioCreatedDate = prioCreatedDate;
	}
	public String getPrioLastupdateBy() {
		return prioLastupdateBy;
	}
	public void setPrioLastupdateBy(String prioLastupdateBy) {
		this.prioLastupdateBy = prioLastupdateBy;
	}
	public Date getPrioLastupdateDate() {
		return prioLastupdateDate;
	}
	public void setPrioLastupdateDate(Date prioLastupdateDate) {
		this.prioLastupdateDate = prioLastupdateDate;
	}
}
