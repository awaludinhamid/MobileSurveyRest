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
@Table(name="CM_TGH_MST_CLASSIFICATIONS",schema="SHCM")
public class CmTghMstClassifications implements Serializable {

  @Id
  @Column(name="CLASS_CODE")
  private String classCode;                                                                            
  @Id
  @Column(name="CLASS_TYPE")
  private String classType;                                                                            
  @Column(name="CLASS_DESC")
  private String classDesc;                                                                                 
  @Column(name="CLASS_STATUS")
  private String classStatus;                                                                             
  @Column(name="CLASS_CREATED_BY")
  private String classCreatedBy;                                                                      
  @Column(name="CLASS_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date classCreatedTimestamp;                            
  @Column(name="CLASS_LASTUPDATE_BY")
  private String classLastupdateBy;                                                                
  @Column(name="CLASS_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date classLastupdateTimestamp;
  
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getClassDesc() {
		return classDesc;
	}
	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}
	public String getClassStatus() {
		return classStatus;
	}
	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	public String getClassCreatedBy() {
		return classCreatedBy;
	}
	public void setClassCreatedBy(String classCreatedBy) {
		this.classCreatedBy = classCreatedBy;
	}
	public Date getClassCreatedTimestamp() {
		return classCreatedTimestamp;
	}
	public void setClassCreatedTimestamp(Date classCreatedTimestamp) {
		this.classCreatedTimestamp = classCreatedTimestamp;
	}
	public String getClassLastupdateBy() {
		return classLastupdateBy;
	}
	public void setClassLastupdateBy(String classLastupdateBy) {
		this.classLastupdateBy = classLastupdateBy;
	}
	public Date getClassLastupdateTimestamp() {
		return classLastupdateTimestamp;
	}
	public void setClassLastupdateTimestamp(Date classLastupdateTimestamp) {
		this.classLastupdateTimestamp = classLastupdateTimestamp;
	}
}