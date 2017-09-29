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
@Table(name="APPL_MST_RELIGION")
public class ApplMstReligionDest implements Serializable {

	@Id
	@Column(name="RELIGION_ID")
	private String religionId;
	@Column(name="RELIGION_DESC")
	private String religionDesc;
	@Column(name="RELIGION_SEQ")
	private Integer religionSeq;
	@Column(name="RELIGION_CREATED_BY")
	private String religionCreatedBy;
	@Column(name="RELIGION_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date religionCreatedDate;
	@Column(name="RELIGION_UPDATED_BY")
	private String religionUpdatedBy;
	@Column(name="RELIGION_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date religionUpdatedDate;
	
	public String getReligionId() {
		return religionId;
	}
	public void setReligionId(String religionId) {
		this.religionId = religionId;
	}
	public String getReligionDesc() {
		return religionDesc;
	}
	public void setReligionDesc(String religionDesc) {
		this.religionDesc = religionDesc;
	}
	public Integer getReligionSeq() {
		return religionSeq;
	}
	public void setReligionSeq(Integer religionSeq) {
		this.religionSeq = religionSeq;
	}
	public String getReligionCreatedBy() {
		return religionCreatedBy;
	}
	public void setReligionCreatedBy(String religionCreatedBy) {
		this.religionCreatedBy = religionCreatedBy;
	}
	public Date getReligionCreatedDate() {
		return religionCreatedDate;
	}
	public void setReligionCreatedDate(Date religionCreatedDate) {
		this.religionCreatedDate = religionCreatedDate;
	}
	public String getReligionUpdatedBy() {
		return religionUpdatedBy;
	}
	public void setReligionUpdatedBy(String religionUpdatedBy) {
		this.religionUpdatedBy = religionUpdatedBy;
	}
	public Date getReligionUpdatedDate() {
		return religionUpdatedDate;
	}
	public void setReligionUpdatedDate(Date religionUpdatedDate) {
		this.religionUpdatedDate = religionUpdatedDate;
	}
}
