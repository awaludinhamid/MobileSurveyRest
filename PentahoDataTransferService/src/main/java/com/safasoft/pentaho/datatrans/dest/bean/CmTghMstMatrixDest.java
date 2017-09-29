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
@Table(name="CM_TGH_MST_MATRIX")
public class CmTghMstMatrixDest implements Serializable {

  @Id
  @Column(name="DELQ_CODE")
  private String delqCode;                                                                              
  @Id
  @Column(name="CLASS_CODE")
  private String classCode;                                                                            
  @Id
  @Column(name="PTL_CODE")
  private String ptlCode;                                                                                
  @Id
  @Column(name="PTL_TYPE")
  private String ptlType;                                                                                
  @Column(name="PLT_SEQ")
  private Double pltSeq;                                                                                       
  @Column(name="PTL_DESC")
  private String ptlDesc;                                                                                     
  @Column(name="PTL_STATUS")
  private String ptlStatus;                                                                                 
  @Column(name="PTL_CREATED_BY")
  private String ptlCreatedBy;                                                                          
  @Column(name="PTL_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date ptlCreatedTimestamp;                                
  @Column(name="PTL_LASTUPDATE_BY")
  private String ptlLastupdateBy;                                                                    
  @Column(name="PTL_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date ptlLastupdateTimestamp;
  
	public String getDelqCode() {
		return delqCode;
	}
	public void setDelqCode(String delqCode) {
		this.delqCode = delqCode;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getPtlCode() {
		return ptlCode;
	}
	public void setPtlCode(String ptlCode) {
		this.ptlCode = ptlCode;
	}
	public String getPtlType() {
		return ptlType;
	}
	public void setPtlType(String ptlType) {
		this.ptlType = ptlType;
	}
	public Double getPltSeq() {
		return pltSeq;
	}
	public void setPltSeq(Double pltSeq) {
		this.pltSeq = pltSeq;
	}
	public String getPtlDesc() {
		return ptlDesc;
	}
	public void setPtlDesc(String ptlDesc) {
		this.ptlDesc = ptlDesc;
	}
	public String getPtlStatus() {
		return ptlStatus;
	}
	public void setPtlStatus(String ptlStatus) {
		this.ptlStatus = ptlStatus;
	}
	public String getPtlCreatedBy() {
		return ptlCreatedBy;
	}
	public void setPtlCreatedBy(String ptlCreatedBy) {
		this.ptlCreatedBy = ptlCreatedBy;
	}
	public Date getPtlCreatedTimestamp() {
		return ptlCreatedTimestamp;
	}
	public void setPtlCreatedTimestamp(Date ptlCreatedTimestamp) {
		this.ptlCreatedTimestamp = ptlCreatedTimestamp;
	}
	public String getPtlLastupdateBy() {
		return ptlLastupdateBy;
	}
	public void setPtlLastupdateBy(String ptlLastupdateBy) {
		this.ptlLastupdateBy = ptlLastupdateBy;
	}
	public Date getPtlLastupdateTimestamp() {
		return ptlLastupdateTimestamp;
	}
	public void setPtlLastupdateTimestamp(Date ptlLastupdateTimestamp) {
		this.ptlLastupdateTimestamp = ptlLastupdateTimestamp;
	}
}