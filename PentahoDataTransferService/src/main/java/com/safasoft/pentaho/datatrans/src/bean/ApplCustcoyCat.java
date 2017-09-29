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
@Table(name="APPL_CUSTCOY_CAT",schema="APPL")
public class ApplCustcoyCat implements Serializable {

	@Id
	@Column(name="COYCAT_ID")
	private String coycatId;
	@Column(name="COYCAT_DESC")
	private String coycatDesc;
	@Column(name="COYCAT_SEQ")
	private Integer coycatSeq;
	@Column(name="COYCAT_CREATED_BY")
	private String coycatCreatedBy;
	@Column(name="COYCAT_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date coycatCreatedDate;
	@Column(name="COYCAT_UPDATED_BY")
	private String coycatUpdatedBy;
	@Column(name="COYCAT_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date coycatUpdatedDate;
	
	public String getCoycatId() {
		return coycatId;
	}
	public void setCoycatId(String coycatId) {
		this.coycatId = coycatId;
	}
	public String getCoycatDesc() {
		return coycatDesc;
	}
	public void setCoycatDesc(String coycatDesc) {
		this.coycatDesc = coycatDesc;
	}
	public Integer getCoycatSeq() {
		return coycatSeq;
	}
	public void setCoycatSeq(Integer coycatSeq) {
		this.coycatSeq = coycatSeq;
	}
	public String getCoycatCreatedBy() {
		return coycatCreatedBy;
	}
	public void setCoycatCreatedBy(String coycatCreatedBy) {
		this.coycatCreatedBy = coycatCreatedBy;
	}
	public Date getCoycatCreatedDate() {
		return coycatCreatedDate;
	}
	public void setCoycatCreatedDate(Date coycatCreatedDate) {
		this.coycatCreatedDate = coycatCreatedDate;
	}
	public String getCoycatUpdatedBy() {
		return coycatUpdatedBy;
	}
	public void setCoycatUpdatedBy(String coycatUpdatedBy) {
		this.coycatUpdatedBy = coycatUpdatedBy;
	}
	public Date getCoycatUpdatedDate() {
		return coycatUpdatedDate;
	}
	public void setCoycatUpdatedDate(Date coycatUpdatedDate) {
		this.coycatUpdatedDate = coycatUpdatedDate;
	}
}
