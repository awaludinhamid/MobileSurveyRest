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
@Table(name="HR_MSTORG_TYPE",schema="HRMS")
public class HrMstorgType implements Serializable {

  @Id
  @Column(name="ORG_TYPE_ID")
  private String orgTypeId;                                                                           
  @Column(name="ORG_TYPE_NAME")
  private String orgTypeName;                                                                            
  @Column(name="ORG_CREATED_BY")
  private String orgCreatedBy;                                                                          
  @Column(name="ORG_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date orgCreatedDate;                                          
  @Column(name="ORG_UPDATED_BY")
  private String orgUpdatedBy;                                                                          
  @Column(name="ORG_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date orgUpdatedDate;                                          
  @Column(name="ORG_STATUS")
  private String orgStatus;
  
	public String getOrgTypeId() {
		return orgTypeId;
	}
	public void setOrgTypeId(String orgTypeId) {
		this.orgTypeId = orgTypeId;
	}
	public String getOrgTypeName() {
		return orgTypeName;
	}
	public void setOrgTypeName(String orgTypeName) {
		this.orgTypeName = orgTypeName;
	}
	public String getOrgCreatedBy() {
		return orgCreatedBy;
	}
	public void setOrgCreatedBy(String orgCreatedBy) {
		this.orgCreatedBy = orgCreatedBy;
	}
	public Date getOrgCreatedDate() {
		return orgCreatedDate;
	}
	public void setOrgCreatedDate(Date orgCreatedDate) {
		this.orgCreatedDate = orgCreatedDate;
	}
	public String getOrgUpdatedBy() {
		return orgUpdatedBy;
	}
	public void setOrgUpdatedBy(String orgUpdatedBy) {
		this.orgUpdatedBy = orgUpdatedBy;
	}
	public Date getOrgUpdatedDate() {
		return orgUpdatedDate;
	}
	public void setOrgUpdatedDate(Date orgUpdatedDate) {
		this.orgUpdatedDate = orgUpdatedDate;
	}
	public String getOrgStatus() {
		return orgStatus;
	}
	public void setOrgStatus(String orgStatus) {
		this.orgStatus = orgStatus;
	}
}