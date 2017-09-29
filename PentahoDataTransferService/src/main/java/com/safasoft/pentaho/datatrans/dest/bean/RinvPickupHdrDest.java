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
@Table(name="RINV_PICKUP_HDR")
public class RinvPickupHdrDest implements Serializable {

  @Id
  @Column(name="PICKUP_NO")
  private String pickupNo;                                                                              
  @Column(name="PICKUP_DATE")
  @Temporal(TemporalType.DATE)
  private Date pickupDate;                                                   
  @Column(name="PICKUP_COYOUTLET_ID")
  private String pickupCoyoutletId;                                                                
  @Column(name="PICKUP_CREATED_BY")
  private String pickupCreatedBy;                                                                    
  @Column(name="PICKUP_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pickupCreatedDate;                                    
  @Column(name="PICKUP_PERSON_ID")
  private Double pickupPersonId;                                                                      
  @Column(name="PICKUP_UPDATED_BY")
  private String pickupUpdatedBy;                                                                    
  @Column(name="PICKUP_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pickupUpdatedDate;                                    
  @Column(name="PICKUP_LOCATION_ID")
  private String pickupLocationId;                                                                  
  @Column(name="PICKUP_LOCATION_TYPE")
  private String pickupLocationType;                                                              
  @Column(name="PICKUP_FINANCE_PROD")
  private String pickupFinanceProd;                                                                
  @Column(name="PICKUP_DESCRIPTION")
  private String pickupDescription;                                                                 
  @Column(name="PICKUP_SUKARELA")
  private String pickupSukarela;                                                                       
  @Column(name="PICKUP_CONDITION_UNIT")
  private String pickupConditionUnit;                                                            
  @Column(name="PICKUP_BASTK_NO")
  private String pickupBastkNo;                                                                        
  @Column(name="PICKUP_GRADE")
  private String pickupGrade;                                                                             
  @Column(name="PICKUP_STATUS")
  private String pickupStatus;                                                                           
  @Column(name="PICKUP_KET_BATAL")
  private String pickupKetBatal;
  
	public String getPickupNo() {
		return pickupNo;
	}
	public void setPickupNo(String pickupNo) {
		this.pickupNo = pickupNo;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getPickupCoyoutletId() {
		return pickupCoyoutletId;
	}
	public void setPickupCoyoutletId(String pickupCoyoutletId) {
		this.pickupCoyoutletId = pickupCoyoutletId;
	}
	public String getPickupCreatedBy() {
		return pickupCreatedBy;
	}
	public void setPickupCreatedBy(String pickupCreatedBy) {
		this.pickupCreatedBy = pickupCreatedBy;
	}
	public Date getPickupCreatedDate() {
		return pickupCreatedDate;
	}
	public void setPickupCreatedDate(Date pickupCreatedDate) {
		this.pickupCreatedDate = pickupCreatedDate;
	}
	public Double getPickupPersonId() {
		return pickupPersonId;
	}
	public void setPickupPersonId(Double pickupPersonId) {
		this.pickupPersonId = pickupPersonId;
	}
	public String getPickupUpdatedBy() {
		return pickupUpdatedBy;
	}
	public void setPickupUpdatedBy(String pickupUpdatedBy) {
		this.pickupUpdatedBy = pickupUpdatedBy;
	}
	public Date getPickupUpdatedDate() {
		return pickupUpdatedDate;
	}
	public void setPickupUpdatedDate(Date pickupUpdatedDate) {
		this.pickupUpdatedDate = pickupUpdatedDate;
	}
	public String getPickupLocationId() {
		return pickupLocationId;
	}
	public void setPickupLocationId(String pickupLocationId) {
		this.pickupLocationId = pickupLocationId;
	}
	public String getPickupLocationType() {
		return pickupLocationType;
	}
	public void setPickupLocationType(String pickupLocationType) {
		this.pickupLocationType = pickupLocationType;
	}
	public String getPickupFinanceProd() {
		return pickupFinanceProd;
	}
	public void setPickupFinanceProd(String pickupFinanceProd) {
		this.pickupFinanceProd = pickupFinanceProd;
	}
	public String getPickupDescription() {
		return pickupDescription;
	}
	public void setPickupDescription(String pickupDescription) {
		this.pickupDescription = pickupDescription;
	}
	public String getPickupSukarela() {
		return pickupSukarela;
	}
	public void setPickupSukarela(String pickupSukarela) {
		this.pickupSukarela = pickupSukarela;
	}
	public String getPickupConditionUnit() {
		return pickupConditionUnit;
	}
	public void setPickupConditionUnit(String pickupConditionUnit) {
		this.pickupConditionUnit = pickupConditionUnit;
	}
	public String getPickupBastkNo() {
		return pickupBastkNo;
	}
	public void setPickupBastkNo(String pickupBastkNo) {
		this.pickupBastkNo = pickupBastkNo;
	}
	public String getPickupGrade() {
		return pickupGrade;
	}
	public void setPickupGrade(String pickupGrade) {
		this.pickupGrade = pickupGrade;
	}
	public String getPickupStatus() {
		return pickupStatus;
	}
	public void setPickupStatus(String pickupStatus) {
		this.pickupStatus = pickupStatus;
	}
	public String getPickupKetBatal() {
		return pickupKetBatal;
	}
	public void setPickupKetBatal(String pickupKetBatal) {
		this.pickupKetBatal = pickupKetBatal;
	} 
}