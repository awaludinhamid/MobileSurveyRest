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
@Table(name="HR_MST_BENEFIT_TYPE",schema="HRMS")
public class HrMstBenefitType implements Serializable {

  @Id
  @Column(name="BT_SEQN")
  private Double btSeqn;                                                                                  
  @Column(name="BT_BENEFIT_TYPE")
  private String btBenefitType;                                                                        
  @Column(name="BT_CATEGORY")
  private String btCategory;                                                                               
  @Column(name="BT_STATUS")
  private String btStatus;                                                                                   
  @Column(name="BT_CREATED_BY")
  private String btCreatedBy;                                                                            
  @Column(name="BT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date btCreatedDate;                                            
  @Column(name="BT_UPDATED_BY")
  private String btUpdatedBy;                                                                            
  @Column(name="BT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date btUpdatedDate;
  
	public Double getBtSeqn() {
		return btSeqn;
	}
	public void setBtSeqn(Double btSeqn) {
		this.btSeqn = btSeqn;
	}
	public String getBtBenefitType() {
		return btBenefitType;
	}
	public void setBtBenefitType(String btBenefitType) {
		this.btBenefitType = btBenefitType;
	}
	public String getBtCategory() {
		return btCategory;
	}
	public void setBtCategory(String btCategory) {
		this.btCategory = btCategory;
	}
	public String getBtStatus() {
		return btStatus;
	}
	public void setBtStatus(String btStatus) {
		this.btStatus = btStatus;
	}
	public String getBtCreatedBy() {
		return btCreatedBy;
	}
	public void setBtCreatedBy(String btCreatedBy) {
		this.btCreatedBy = btCreatedBy;
	}
	public Date getBtCreatedDate() {
		return btCreatedDate;
	}
	public void setBtCreatedDate(Date btCreatedDate) {
		this.btCreatedDate = btCreatedDate;
	}
	public String getBtUpdatedBy() {
		return btUpdatedBy;
	}
	public void setBtUpdatedBy(String btUpdatedBy) {
		this.btUpdatedBy = btUpdatedBy;
	}
	public Date getBtUpdatedDate() {
		return btUpdatedDate;
	}
	public void setBtUpdatedDate(Date btUpdatedDate) {
		this.btUpdatedDate = btUpdatedDate;
	}
}