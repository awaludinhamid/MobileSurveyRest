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
@Table(name="RINV_OUT_DTL")
public class RinvOutDtlDest implements Serializable {

  @Id
  @Column(name="OUT_MEMO_NO")
  private String outMemoNo;                                                                           
  @Id
  @Column(name="OUT_INVT_ID")
  private String outInvtId;                                                                           
  @Column(name="OUT_CREATED_BY")
  private String outCreatedBy;                                                                          
  @Column(name="OUT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date outCreatedDate;                                          
  @Column(name="OUT_UPDATED_BY")
  private String outUpdatedBy;                                                                          
  @Column(name="OUT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date outUpdatedDate;
  
	public String getOutMemoNo() {
		return outMemoNo;
	}
	public void setOutMemoNo(String outMemoNo) {
		this.outMemoNo = outMemoNo;
	}
	public String getOutInvtId() {
		return outInvtId;
	}
	public void setOutInvtId(String outInvtId) {
		this.outInvtId = outInvtId;
	}
	public String getOutCreatedBy() {
		return outCreatedBy;
	}
	public void setOutCreatedBy(String outCreatedBy) {
		this.outCreatedBy = outCreatedBy;
	}
	public Date getOutCreatedDate() {
		return outCreatedDate;
	}
	public void setOutCreatedDate(Date outCreatedDate) {
		this.outCreatedDate = outCreatedDate;
	}
	public String getOutUpdatedBy() {
		return outUpdatedBy;
	}
	public void setOutUpdatedBy(String outUpdatedBy) {
		this.outUpdatedBy = outUpdatedBy;
	}
	public Date getOutUpdatedDate() {
		return outUpdatedDate;
	}
	public void setOutUpdatedDate(Date outUpdatedDate) {
		this.outUpdatedDate = outUpdatedDate;
	} 
}