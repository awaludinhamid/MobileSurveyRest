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
@Table(name="APPL_MST_EDUCATION",schema="APPL")
public class ApplMstEducation implements Serializable {

	@Id
	@Column(name="EDU_ID")
	private String eduId;
	@Column(name="EDU_DESC")
	private String eduDesc;
	@Column(name="EDU_SEQ")
	private Integer eduSeq;
	@Column(name="EDU_CREATED_BY")
	private String eduCreatedBy;
	@Column(name="EDU_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date eduCreatedDate;
	@Column(name="EDU_UPDATED_BY")
	private String eduUpdatedBy;
	@Column(name="EDU_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date eduUpdatedDate;
	
	public String getEduId() {
		return eduId;
	}
	public void setEduId(String eduId) {
		this.eduId = eduId;
	}
	public String getEduDesc() {
		return eduDesc;
	}
	public void setEduDesc(String eduDesc) {
		this.eduDesc = eduDesc;
	}
	public Integer getEduSeq() {
		return eduSeq;
	}
	public void setEduSeq(Integer eduSeq) {
		this.eduSeq = eduSeq;
	}
	public String getEduCreatedBy() {
		return eduCreatedBy;
	}
	public void setEduCreatedBy(String eduCreatedBy) {
		this.eduCreatedBy = eduCreatedBy;
	}
	public Date getEduCreatedDate() {
		return eduCreatedDate;
	}
	public void setEduCreatedDate(Date eduCreatedDate) {
		this.eduCreatedDate = eduCreatedDate;
	}
	public String getEduUpdatedBy() {
		return eduUpdatedBy;
	}
	public void setEduUpdatedBy(String eduUpdatedBy) {
		this.eduUpdatedBy = eduUpdatedBy;
	}
	public Date getEduUpdatedDate() {
		return eduUpdatedDate;
	}
	public void setEduUpdatedDate(Date eduUpdatedDate) {
		this.eduUpdatedDate = eduUpdatedDate;
	}
}
