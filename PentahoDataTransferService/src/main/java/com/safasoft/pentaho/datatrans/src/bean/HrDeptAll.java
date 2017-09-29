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
@Table(name="HR_DEPT_ALL",schema="HRMS")
public class HrDeptAll implements Serializable {

  @Id
  @Column(name="DEPT_ID")
  private String deptId;                                                                                  
  @Column(name="DEPT_NAME")
  private String deptName;                                                                                   
  @Column(name="DEPT_CREATED_BY")
  private String deptCreatedBy;                                                                        
  @Column(name="DEPT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date deptCreatedDate;                                        
  @Column(name="DEPT_UPDATED_BY")
  private String deptUpdatedBy;                                                                        
  @Column(name="DEPT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date deptUpdatedDate;                                        
  @Column(name="DEPT_ORG_TYPE")
  private String deptOrgType;                                                                            
  @Column(name="DEPT_PARENT_ID")
  private String deptParentId;                                                                          
  @Column(name="DEPT_FROMDATE")
  @Temporal(TemporalType.DATE)
  private Date deptFromdate;                                               
  @Column(name="DEPT_TODATE")
  @Temporal(TemporalType.DATE)
  private Date deptTodate;                                                   
  @Column(name="COYOUTLET_ID")
  private String coyoutletId;
  
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptCreatedBy() {
		return deptCreatedBy;
	}
	public void setDeptCreatedBy(String deptCreatedBy) {
		this.deptCreatedBy = deptCreatedBy;
	}
	public Date getDeptCreatedDate() {
		return deptCreatedDate;
	}
	public void setDeptCreatedDate(Date deptCreatedDate) {
		this.deptCreatedDate = deptCreatedDate;
	}
	public String getDeptUpdatedBy() {
		return deptUpdatedBy;
	}
	public void setDeptUpdatedBy(String deptUpdatedBy) {
		this.deptUpdatedBy = deptUpdatedBy;
	}
	public Date getDeptUpdatedDate() {
		return deptUpdatedDate;
	}
	public void setDeptUpdatedDate(Date deptUpdatedDate) {
		this.deptUpdatedDate = deptUpdatedDate;
	}
	public String getDeptOrgType() {
		return deptOrgType;
	}
	public void setDeptOrgType(String deptOrgType) {
		this.deptOrgType = deptOrgType;
	}
	public String getDeptParentId() {
		return deptParentId;
	}
	public void setDeptParentId(String deptParentId) {
		this.deptParentId = deptParentId;
	}
	public Date getDeptFromdate() {
		return deptFromdate;
	}
	public void setDeptFromdate(Date deptFromdate) {
		this.deptFromdate = deptFromdate;
	}
	public Date getDeptTodate() {
		return deptTodate;
	}
	public void setDeptTodate(Date deptTodate) {
		this.deptTodate = deptTodate;
	}
	public String getCoyoutletId() {
		return coyoutletId;
	}
	public void setCoyoutletId(String coyoutletId) {
		this.coyoutletId = coyoutletId;
	}
}