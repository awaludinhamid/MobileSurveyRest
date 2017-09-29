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
@Table(name="HR_MST_POSITION",schema="HRMS")
public class HrMstPosition implements Serializable {

  @Id
  @Column(name="POSITION_ID")
  private String positionId;                                                                          
  @Column(name="POSITION_NAME")
  private String positionName;                                                                           
  @Column(name="POSITION_CREATED_BY")
  private String positionCreatedBy;                                                                
  @Column(name="POSITION_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date positionCreatedDate;                                
  @Column(name="POSITION_UPDATED_BY")
  private String positionUpdatedBy;                                                                
  @Column(name="POSITION_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date positionUpdatedDate;                                
  @Column(name="POSITION_FROMDATE")
  @Temporal(TemporalType.DATE)
  private Date positionFromdate;                                       
  @Column(name="POSITION_TODATE")
  @Temporal(TemporalType.DATE)
  private Date positionTodate;                                           
  @Column(name="POSITION_DEPT_ID")
  private String positionDeptId;                                                                      
  @Column(name="POSITION_JOB_ID")
  private String positionJobId;
  
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getPositionCreatedBy() {
		return positionCreatedBy;
	}
	public void setPositionCreatedBy(String positionCreatedBy) {
		this.positionCreatedBy = positionCreatedBy;
	}
	public Date getPositionCreatedDate() {
		return positionCreatedDate;
	}
	public void setPositionCreatedDate(Date positionCreatedDate) {
		this.positionCreatedDate = positionCreatedDate;
	}
	public String getPositionUpdatedBy() {
		return positionUpdatedBy;
	}
	public void setPositionUpdatedBy(String positionUpdatedBy) {
		this.positionUpdatedBy = positionUpdatedBy;
	}
	public Date getPositionUpdatedDate() {
		return positionUpdatedDate;
	}
	public void setPositionUpdatedDate(Date positionUpdatedDate) {
		this.positionUpdatedDate = positionUpdatedDate;
	}
	public Date getPositionFromdate() {
		return positionFromdate;
	}
	public void setPositionFromdate(Date positionFromdate) {
		this.positionFromdate = positionFromdate;
	}
	public Date getPositionTodate() {
		return positionTodate;
	}
	public void setPositionTodate(Date positionTodate) {
		this.positionTodate = positionTodate;
	}
	public String getPositionDeptId() {
		return positionDeptId;
	}
	public void setPositionDeptId(String positionDeptId) {
		this.positionDeptId = positionDeptId;
	}
	public String getPositionJobId() {
		return positionJobId;
	}
	public void setPositionJobId(String positionJobId) {
		this.positionJobId = positionJobId;
	}
}