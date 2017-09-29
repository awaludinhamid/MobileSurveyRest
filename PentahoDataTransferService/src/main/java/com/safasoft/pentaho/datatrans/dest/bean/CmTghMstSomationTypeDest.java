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
@Table(name="CM_TGH_MST_SOMATION_TYPE")
public class CmTghMstSomationTypeDest implements Serializable {

  @Id
  @Column(name="SOM_SEQN")
  private Double somSeqn;                                                                                
  @Column(name="SOM_OVD_DAYS")
  private Double somOvdDays;                                                                              
  @Column(name="SOM_TYPE")
  private String somType;                                                                                     
  @Column(name="SOM_CREATED_BY")
  private String somCreatedBy;                                                                          
  @Column(name="SOM_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date somCreatedDate;                                          
  @Column(name="SOM_UPDATED_BY")
  private String somUpdatedBy;                                                                          
  @Column(name="SOM_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date somUpdatedDate;
  
	public Double getSomSeqn() {
		return somSeqn;
	}
	public void setSomSeqn(Double somSeqn) {
		this.somSeqn = somSeqn;
	}
	public Double getSomOvdDays() {
		return somOvdDays;
	}
	public void setSomOvdDays(Double somOvdDays) {
		this.somOvdDays = somOvdDays;
	}
	public String getSomType() {
		return somType;
	}
	public void setSomType(String somType) {
		this.somType = somType;
	}
	public String getSomCreatedBy() {
		return somCreatedBy;
	}
	public void setSomCreatedBy(String somCreatedBy) {
		this.somCreatedBy = somCreatedBy;
	}
	public Date getSomCreatedDate() {
		return somCreatedDate;
	}
	public void setSomCreatedDate(Date somCreatedDate) {
		this.somCreatedDate = somCreatedDate;
	}
	public String getSomUpdatedBy() {
		return somUpdatedBy;
	}
	public void setSomUpdatedBy(String somUpdatedBy) {
		this.somUpdatedBy = somUpdatedBy;
	}
	public Date getSomUpdatedDate() {
		return somUpdatedDate;
	}
	public void setSomUpdatedDate(Date somUpdatedDate) {
		this.somUpdatedDate = somUpdatedDate;
	}
}