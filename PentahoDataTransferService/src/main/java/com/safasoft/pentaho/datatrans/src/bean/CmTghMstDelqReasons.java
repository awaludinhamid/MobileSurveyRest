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
@Table(name="CM_TGH_MST_DELQ_REASONS",schema="SHCM")
public class CmTghMstDelqReasons implements Serializable {

  @Id
  @Column(name="DELQ_CODE")
  private String delqCode;                                                                              
  @Id
  @Column(name="DELQ_TYPE")
  private String delqType;                                                                              
  @Column(name="DELQ_DESC")
  private String delqDesc;                                                                                   
  @Column(name="DELQ_STATUS")
  private String delqStatus;                                                                               
  @Column(name="DELQ_CREATED_BY")
  private String delqCreatedBy;                                                                        
  @Column(name="DELQ_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date delqCreatedTimestamp;                              
  @Column(name="DELQ_LASTUPDATE_BY")
  private String delqLastupdateBy;                                                                  
  @Column(name="DELQ_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date delqLastupdateTimestamp;                        
  @Column(name="DELQ_FLAG_LKS")
  private String delqFlagLks;
	public String getDelqCode() {
		return delqCode;
	}
	public void setDelqCode(String delqCode) {
		this.delqCode = delqCode;
	}
	public String getDelqType() {
		return delqType;
	}
	public void setDelqType(String delqType) {
		this.delqType = delqType;
	}
	public String getDelqDesc() {
		return delqDesc;
	}
	public void setDelqDesc(String delqDesc) {
		this.delqDesc = delqDesc;
	}
	public String getDelqStatus() {
		return delqStatus;
	}
	public void setDelqStatus(String delqStatus) {
		this.delqStatus = delqStatus;
	}
	public String getDelqCreatedBy() {
		return delqCreatedBy;
	}
	public void setDelqCreatedBy(String delqCreatedBy) {
		this.delqCreatedBy = delqCreatedBy;
	}
	public Date getDelqCreatedTimestamp() {
		return delqCreatedTimestamp;
	}
	public void setDelqCreatedTimestamp(Date delqCreatedTimestamp) {
		this.delqCreatedTimestamp = delqCreatedTimestamp;
	}
	public String getDelqLastupdateBy() {
		return delqLastupdateBy;
	}
	public void setDelqLastupdateBy(String delqLastupdateBy) {
		this.delqLastupdateBy = delqLastupdateBy;
	}
	public Date getDelqLastupdateTimestamp() {
		return delqLastupdateTimestamp;
	}
	public void setDelqLastupdateTimestamp(Date delqLastupdateTimestamp) {
		this.delqLastupdateTimestamp = delqLastupdateTimestamp;
	}
	public String getDelqFlagLks() {
		return delqFlagLks;
	}
	public void setDelqFlagLks(String delqFlagLks) {
		this.delqFlagLks = delqFlagLks;
	}
}