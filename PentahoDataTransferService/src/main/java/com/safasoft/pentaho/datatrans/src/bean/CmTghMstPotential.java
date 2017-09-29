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
@Table(name="CM_TGH_MST_POTENTIAL",schema="SHCM")
public class CmTghMstPotential implements Serializable {

  @Id
  @Column(name="PTN_CODE")
  private Double ptnCode;                                                                                
  @Id
  @Column(name="PTN_TYPE")
  private String ptnType;                                                                                
  @Column(name="PTN_DESC")
  private String ptnDesc;                                                                                     
  @Column(name="PTN_PRSNTSI_POTENSI")
  private Double ptnPrsntsiPotensi;                                                                
  @Column(name="PTN_CREATED_BY")
  private String ptnCreatedBy;                                                                          
  @Column(name="PTN_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date ptnCreatedDate;                                          
  @Column(name="PTN_UPDATED_BY")
  private String ptnUpdatedBy;                                                                          
  @Column(name="PTN_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date ptnUpdatedDate;                                          
  @Column(name="PTN_STATUS")
  private String ptnStatus;
  
	public Double getPtnCode() {
		return ptnCode;
	}
	public void setPtnCode(Double ptnCode) {
		this.ptnCode = ptnCode;
	}
	public String getPtnType() {
		return ptnType;
	}
	public void setPtnType(String ptnType) {
		this.ptnType = ptnType;
	}
	public String getPtnDesc() {
		return ptnDesc;
	}
	public void setPtnDesc(String ptnDesc) {
		this.ptnDesc = ptnDesc;
	}
	public Double getPtnPrsntsiPotensi() {
		return ptnPrsntsiPotensi;
	}
	public void setPtnPrsntsiPotensi(Double ptnPrsntsiPotensi) {
		this.ptnPrsntsiPotensi = ptnPrsntsiPotensi;
	}
	public String getPtnCreatedBy() {
		return ptnCreatedBy;
	}
	public void setPtnCreatedBy(String ptnCreatedBy) {
		this.ptnCreatedBy = ptnCreatedBy;
	}
	public Date getPtnCreatedDate() {
		return ptnCreatedDate;
	}
	public void setPtnCreatedDate(Date ptnCreatedDate) {
		this.ptnCreatedDate = ptnCreatedDate;
	}
	public String getPtnUpdatedBy() {
		return ptnUpdatedBy;
	}
	public void setPtnUpdatedBy(String ptnUpdatedBy) {
		this.ptnUpdatedBy = ptnUpdatedBy;
	}
	public Date getPtnUpdatedDate() {
		return ptnUpdatedDate;
	}
	public void setPtnUpdatedDate(Date ptnUpdatedDate) {
		this.ptnUpdatedDate = ptnUpdatedDate;
	}
	public String getPtnStatus() {
		return ptnStatus;
	}
	public void setPtnStatus(String ptnStatus) {
		this.ptnStatus = ptnStatus;
	}
}