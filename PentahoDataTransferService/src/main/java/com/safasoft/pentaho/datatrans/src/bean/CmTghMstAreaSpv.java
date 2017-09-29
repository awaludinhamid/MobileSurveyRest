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
@Table(name="CM_TGH_MST_AREA_SPV",schema="SHCM")
public class CmTghMstAreaSpv implements Serializable {

  @Id
  @Column(name="ASPV_AREA_ID")
  private String aspvAreaId;                                                                         
  @Id
  @Column(name="ASPV_SPV_ID")
  private Double aspvSpvId;                                                                           
  @Id
  @Column(name="ASPV_COYOUTLET")
  private String aspvCoyoutlet;                                                                    
  @Column(name="ASPV_AREA_DESC")
  private String aspvAreaDesc;                                                                          
  @Column(name="ASPV_STATUS")
  private String aspvStatus;                                                                               
  @Column(name="ASPV_CREATED_BY")
  private String aspvCreatedBy;                                                                        
  @Column(name="ASPV_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date aspvCreatedDate;                                        
  @Column(name="ASPV_UPDATED_BY")
  private String aspvUpdatedBy;                                                                        
  @Column(name="ASPV_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date aspvUpdatedDate;                                        
  @Column(name="ASPV_TYPE")
  private String aspvType;
  
	public String getAspvAreaId() {
		return aspvAreaId;
	}
	public void setAspvAreaId(String aspvAreaId) {
		this.aspvAreaId = aspvAreaId;
	}
	public Double getAspvSpvId() {
		return aspvSpvId;
	}
	public void setAspvSpvId(Double aspvSpvId) {
		this.aspvSpvId = aspvSpvId;
	}
	public String getAspvCoyoutlet() {
		return aspvCoyoutlet;
	}
	public void setAspvCoyoutlet(String aspvCoyoutlet) {
		this.aspvCoyoutlet = aspvCoyoutlet;
	}
	public String getAspvAreaDesc() {
		return aspvAreaDesc;
	}
	public void setAspvAreaDesc(String aspvAreaDesc) {
		this.aspvAreaDesc = aspvAreaDesc;
	}
	public String getAspvStatus() {
		return aspvStatus;
	}
	public void setAspvStatus(String aspvStatus) {
		this.aspvStatus = aspvStatus;
	}
	public String getAspvCreatedBy() {
		return aspvCreatedBy;
	}
	public void setAspvCreatedBy(String aspvCreatedBy) {
		this.aspvCreatedBy = aspvCreatedBy;
	}
	public Date getAspvCreatedDate() {
		return aspvCreatedDate;
	}
	public void setAspvCreatedDate(Date aspvCreatedDate) {
		this.aspvCreatedDate = aspvCreatedDate;
	}
	public String getAspvUpdatedBy() {
		return aspvUpdatedBy;
	}
	public void setAspvUpdatedBy(String aspvUpdatedBy) {
		this.aspvUpdatedBy = aspvUpdatedBy;
	}
	public Date getAspvUpdatedDate() {
		return aspvUpdatedDate;
	}
	public void setAspvUpdatedDate(Date aspvUpdatedDate) {
		this.aspvUpdatedDate = aspvUpdatedDate;
	}
	public String getAspvType() {
		return aspvType;
	}
	public void setAspvType(String aspvType) {
		this.aspvType = aspvType;
	}
}