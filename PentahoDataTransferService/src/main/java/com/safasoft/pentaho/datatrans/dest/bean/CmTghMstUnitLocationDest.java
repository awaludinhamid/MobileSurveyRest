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
@Table(name="CM_TGH_MST_UNIT_LOCATION")
public class CmTghMstUnitLocationDest implements Serializable {

  @Id
  @Column(name="LOC_CODE")
  private String locCode;                                                                                
  @Column(name="LOC_DESC")
  private String locDesc;                                                                                     
  @Column(name="LOC_STATUS")
  private String locStatus;                                                                                 
  @Column(name="LOC_CREATED_BY")
  private String locCreatedBy;                                                                          
  @Column(name="LOC_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date locCreatedTimestamp;                                
  @Column(name="LOC_UPDATE_BY")
  private String locUpdateBy;                                                                            
  @Column(name="LOC_UPDATE_DATE")
  @Temporal(TemporalType.DATE)
  private Date locUpdateDate;
  
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	public String getLocDesc() {
		return locDesc;
	}
	public void setLocDesc(String locDesc) {
		this.locDesc = locDesc;
	}
	public String getLocStatus() {
		return locStatus;
	}
	public void setLocStatus(String locStatus) {
		this.locStatus = locStatus;
	}
	public String getLocCreatedBy() {
		return locCreatedBy;
	}
	public void setLocCreatedBy(String locCreatedBy) {
		this.locCreatedBy = locCreatedBy;
	}
	public Date getLocCreatedTimestamp() {
		return locCreatedTimestamp;
	}
	public void setLocCreatedTimestamp(Date locCreatedTimestamp) {
		this.locCreatedTimestamp = locCreatedTimestamp;
	}
	public String getLocUpdateBy() {
		return locUpdateBy;
	}
	public void setLocUpdateBy(String locUpdateBy) {
		this.locUpdateBy = locUpdateBy;
	}
	public Date getLocUpdateDate() {
		return locUpdateDate;
	}
	public void setLocUpdateDate(Date locUpdateDate) {
		this.locUpdateDate = locUpdateDate;
	}
}