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
@Table(name="APPL_CUSTIND_CAT")
public class ApplCustindCatDest implements Serializable {

	@Id
	@Column(name="INDCAT_ID")
	private String indcatId;
	@Column(name="INDCAT_DESC")
	private String indcatDesc;
	@Column(name="INDCAT_SEQ")
	private Integer indcatSeq;
	@Column(name="INDCAT_CREATED_BY")
	private String indcatCreatedBy;
	@Column(name="INDCAT_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date indcatCreatedDate;
	@Column(name="INDCAT_UPDATED_BY")
	private String indcatUpdatedBy;
	@Column(name="INDCAT_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date indcatUpdatedDate;
	
	public String getIndcatId() {
		return indcatId;
	}
	public void setIndcatId(String indcatId) {
		this.indcatId = indcatId;
	}
	public String getIndcatDesc() {
		return indcatDesc;
	}
	public void setIndcatDesc(String indcatDesc) {
		this.indcatDesc = indcatDesc;
	}
	public Integer getIndcatSeq() {
		return indcatSeq;
	}
	public void setIndcatSeq(Integer indcatSeq) {
		this.indcatSeq = indcatSeq;
	}
	public String getIndcatCreatedBy() {
		return indcatCreatedBy;
	}
	public void setIndcatCreatedBy(String indcatCreatedBy) {
		this.indcatCreatedBy = indcatCreatedBy;
	}
	public Date getIndcatCreatedDate() {
		return indcatCreatedDate;
	}
	public void setIndcatCreatedDate(Date indcatCreatedDate) {
		this.indcatCreatedDate = indcatCreatedDate;
	}
	public String getIndcatUpdatedBy() {
		return indcatUpdatedBy;
	}
	public void setIndcatUpdatedBy(String indcatUpdatedBy) {
		this.indcatUpdatedBy = indcatUpdatedBy;
	}
	public Date getIndcatUpdatedDate() {
		return indcatUpdatedDate;
	}
	public void setIndcatUpdatedDate(Date indcatUpdatedDate) {
		this.indcatUpdatedDate = indcatUpdatedDate;
	}
}
