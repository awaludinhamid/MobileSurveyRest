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
@Table(name="CM_TGH_MST_AREA_ZONA")
public class CmTghMstAreaZonaDest implements Serializable {

  @Id
  @Column(name="ZON_ZONA_ID")
  private String zonZonaId;                                                                           
  @Id
  @Column(name="ZON_COYOUTLET_ID")
  private String zonCoyoutletId;                                                                 
  @Id
  @Column(name="ZON_AREA_ID")
  private String zonAreaId;                                                                           
  @Id
  @Column(name="ZON_CYCLE")
  private String zonCycle;                                                                              
  @Id
  @Column(name="ZON_COLL_ID")
  private Integer zonCollId;                                                                          
  @Column(name="ZON_ZONA_DESC")
  private String zonZonaDesc;                                                                            
  @Column(name="ZON_STATUS")
  private String zonStatus;                                                                                 
  @Column(name="ZON_CREATED_BY")
  private String zonCreatedBy;                                                                          
  @Column(name="ZON_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date zonCreatedDate;                                          
  @Column(name="ZON_UPDATED_BY")
  private String zonUpdatedBy;                                                                          
  @Column(name="ZON_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date zonUpdatedDate;
	public String getZonZonaId() {
		return zonZonaId;
	}
	public void setZonZonaId(String zonZonaId) {
		this.zonZonaId = zonZonaId;
	}
	public String getZonCoyoutletId() {
		return zonCoyoutletId;
	}
	public void setZonCoyoutletId(String zonCoyoutletId) {
		this.zonCoyoutletId = zonCoyoutletId;
	}
	public String getZonAreaId() {
		return zonAreaId;
	}
	public void setZonAreaId(String zonAreaId) {
		this.zonAreaId = zonAreaId;
	}
	public String getZonCycle() {
		return zonCycle;
	}
	public void setZonCycle(String zonCycle) {
		this.zonCycle = zonCycle;
	}
	public Integer getZonCollId() {
		return zonCollId;
	}
	public void setZonCollId(Integer zonCollId) {
		this.zonCollId = zonCollId;
	}
	public String getZonZonaDesc() {
		return zonZonaDesc;
	}
	public void setZonZonaDesc(String zonZonaDesc) {
		this.zonZonaDesc = zonZonaDesc;
	}
	public String getZonStatus() {
		return zonStatus;
	}
	public void setZonStatus(String zonStatus) {
		this.zonStatus = zonStatus;
	}
	public String getZonCreatedBy() {
		return zonCreatedBy;
	}
	public void setZonCreatedBy(String zonCreatedBy) {
		this.zonCreatedBy = zonCreatedBy;
	}
	public Date getZonCreatedDate() {
		return zonCreatedDate;
	}
	public void setZonCreatedDate(Date zonCreatedDate) {
		this.zonCreatedDate = zonCreatedDate;
	}
	public String getZonUpdatedBy() {
		return zonUpdatedBy;
	}
	public void setZonUpdatedBy(String zonUpdatedBy) {
		this.zonUpdatedBy = zonUpdatedBy;
	}
	public Date getZonUpdatedDate() {
		return zonUpdatedDate;
	}
	public void setZonUpdatedDate(Date zonUpdatedDate) {
		this.zonUpdatedDate = zonUpdatedDate;
	} 
}