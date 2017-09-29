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
@Table(name="APPL_MST_IDTYPE",schema="APPL")
public class ApplMstIdtype implements Serializable {

	@Id
	@Column(name="IDTYPE_ID")
	private String idtypeId;
	@Column(name="IDTYPE_DESC")
	private String idtypeDesc;
	@Column(name="IDTYPE_SEQ")
	private Integer idtypeSeq;
	@Column(name="IDTYPE_CREATED_BY")
	private String idtypeCreatedBy;
	@Column(name="IDTYPE_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date idtypeCreatedDate;
	@Column(name="IDTYPE_UPDATED_BY")
	private String idtypeUpdatedBy;
	@Column(name="IDTYPE_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date idtypeUpdatedDate;
	
	public String getIdtypeId() {
		return idtypeId;
	}
	public void setIdtypeId(String idtypeId) {
		this.idtypeId = idtypeId;
	}
	public String getIdtypeDesc() {
		return idtypeDesc;
	}
	public void setIdtypeDesc(String idtypeDesc) {
		this.idtypeDesc = idtypeDesc;
	}
	public Integer getIdtypeSeq() {
		return idtypeSeq;
	}
	public void setIdtypeSeq(Integer idtypeSeq) {
		this.idtypeSeq = idtypeSeq;
	}
	public String getIdtypeCreatedBy() {
		return idtypeCreatedBy;
	}
	public void setIdtypeCreatedBy(String idtypeCreatedBy) {
		this.idtypeCreatedBy = idtypeCreatedBy;
	}
	public Date getIdtypeCreatedDate() {
		return idtypeCreatedDate;
	}
	public void setIdtypeCreatedDate(Date idtypeCreatedDate) {
		this.idtypeCreatedDate = idtypeCreatedDate;
	}
	public String getIdtypeUpdatedBy() {
		return idtypeUpdatedBy;
	}
	public void setIdtypeUpdatedBy(String idtypeUpdatedBy) {
		this.idtypeUpdatedBy = idtypeUpdatedBy;
	}
	public Date getIdtypeUpdatedDate() {
		return idtypeUpdatedDate;
	}
	public void setIdtypeUpdatedDate(Date idtypeUpdatedDate) {
		this.idtypeUpdatedDate = idtypeUpdatedDate;
	}
}
