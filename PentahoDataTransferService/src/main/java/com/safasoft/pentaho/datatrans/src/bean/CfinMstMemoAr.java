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
@Table(name="CFIN_MST_MEMO_AR",schema="CFIN")
public class CfinMstMemoAr implements Serializable {

	@Id
	@Column(name="MEMO_TYPE")
	private String memoType;
	@Column(name="MEMO_ID")
	private String memoId;
	@Column(name="MEMO_DESC")
	private String memoDesc;
	@Column(name="MEMO_CREATED_BY")
	private String createdBy;
	@Column(name="MEMO_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="MEMO_UPDATED_BY")
	private String updatedBy;
	@Column(name="MEMO_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public String getMemoType() {
		return memoType;
	}
	public void setMemoType(String memoType) {
		this.memoType = memoType;
	}
	public String getMemoId() {
		return memoId;
	}
	public void setMemoId(String memoId) {
		this.memoId = memoId;
	}
	public String getMemoDesc() {
		return memoDesc;
	}
	public void setMemoDesc(String memoDesc) {
		this.memoDesc = memoDesc;
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
}
