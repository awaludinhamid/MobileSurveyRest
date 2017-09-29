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
@Table(name="CM_TGH_MST_ACTION_PLAN",schema="SHCM")
public class CmTghMstActionPlan implements Serializable {

  @Id
  @Column(name="PLAN_CODE")
  private String planCode;                                                                              
  @Column(name="PLAN_DESC")
  private String planDesc;                                                                                   
  @Column(name="PLAN_STATUS")
  private String planStatus;                                                                               
  @Column(name="PLAN_CREATED_BY")
  private String planCreatedBy;                                                                        
  @Column(name="PLAN_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date planCreatedTimestamp;                              
  @Column(name="PLAN_LASTUPDATE_BY")
  private String planLastupdateBy;                                                                  
  @Column(name="PLAN_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date planLastupdateTimestamp;
  
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getPlanDesc() {
		return planDesc;
	}
	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getPlanCreatedBy() {
		return planCreatedBy;
	}
	public void setPlanCreatedBy(String planCreatedBy) {
		this.planCreatedBy = planCreatedBy;
	}
	public Date getPlanCreatedTimestamp() {
		return planCreatedTimestamp;
	}
	public void setPlanCreatedTimestamp(Date planCreatedTimestamp) {
		this.planCreatedTimestamp = planCreatedTimestamp;
	}
	public String getPlanLastupdateBy() {
		return planLastupdateBy;
	}
	public void setPlanLastupdateBy(String planLastupdateBy) {
		this.planLastupdateBy = planLastupdateBy;
	}
	public Date getPlanLastupdateTimestamp() {
		return planLastupdateTimestamp;
	}
	public void setPlanLastupdateTimestamp(Date planLastupdateTimestamp) {
		this.planLastupdateTimestamp = planLastupdateTimestamp;
	}
}