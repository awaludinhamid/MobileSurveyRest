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
@Table(name="RINV_RECEIVED_DTL",schema="COLL")
public class RinvReceivedDtl implements Serializable {

  @Id
  @Column(name="RINV_MEMO_NO")
  private String rinvMemoNo;                                                                         
  @Id
  @Column(name="RINV_INVT_ID")
  private String rinvInvtId;                                                                         
  @Column(name="RINV_CREATED_BY")
  private String rinvCreatedBy;                                                                        
  @Column(name="RINV_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date rinvCreatedDate;                                        
  @Column(name="RINV_UPDATED_BY")
  private String rinvUpdatedBy;                                                                        
  @Column(name="RINV_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date rinvUpdatedDate;
  
	public String getRinvMemoNo() {
		return rinvMemoNo;
	}
	public void setRinvMemoNo(String rinvMemoNo) {
		this.rinvMemoNo = rinvMemoNo;
	}
	public String getRinvInvtId() {
		return rinvInvtId;
	}
	public void setRinvInvtId(String rinvInvtId) {
		this.rinvInvtId = rinvInvtId;
	}
	public String getRinvCreatedBy() {
		return rinvCreatedBy;
	}
	public void setRinvCreatedBy(String rinvCreatedBy) {
		this.rinvCreatedBy = rinvCreatedBy;
	}
	public Date getRinvCreatedDate() {
		return rinvCreatedDate;
	}
	public void setRinvCreatedDate(Date rinvCreatedDate) {
		this.rinvCreatedDate = rinvCreatedDate;
	}
	public String getRinvUpdatedBy() {
		return rinvUpdatedBy;
	}
	public void setRinvUpdatedBy(String rinvUpdatedBy) {
		this.rinvUpdatedBy = rinvUpdatedBy;
	}
	public Date getRinvUpdatedDate() {
		return rinvUpdatedDate;
	}
	public void setRinvUpdatedDate(Date rinvUpdatedDate) {
		this.rinvUpdatedDate = rinvUpdatedDate;
	}
}