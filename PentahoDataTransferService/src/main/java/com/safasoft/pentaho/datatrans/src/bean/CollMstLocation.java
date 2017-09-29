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
@Table(name="COLL_MST_LOCATION",schema="COLL")
public class CollMstLocation implements Serializable {

                       
  @Id
  @Column(name="LOCA_TYPE")
  private String locaType;                                                                              
  @Column(name="LOCA_DESC")
  private String locaDesc;                                                                                   
  @Column(name="LOCA_STATUS")
  private String locaStatus;                                                                               
  @Column(name="LOCA_USAGE")
  private String locaUsage;                                                                                 
  @Column(name="LOCA_LOV")
  private String locaLov;                                                                                     
  @Column(name="LOCA_BPKB_FLAG")
  private String locaBpkbFlag;                                                                          
  @Column(name="LOCA_INVT_FLAG")
  private String locaInvtFlag;                                                                          
  @Column(name="LOCA_CREATED_BY")
  private String locaCreatedBy;                                                                        
  @Column(name="LOCA_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date locaCreatedDate;                                        
  @Column(name="LOCA_UPDATED_BY")
  private String locaUpdatedBy;                                                                        
  @Column(name="LOCA_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date locaUpdatedDate;                                        
  @Column(name="LOCA_QUERY")
  private String locaQuery;
  
	public String getLocaType() {
		return locaType;
	}
	public void setLocaType(String locaType) {
		this.locaType = locaType;
	}
	public String getLocaDesc() {
		return locaDesc;
	}
	public void setLocaDesc(String locaDesc) {
		this.locaDesc = locaDesc;
	}
	public String getLocaStatus() {
		return locaStatus;
	}
	public void setLocaStatus(String locaStatus) {
		this.locaStatus = locaStatus;
	}
	public String getLocaUsage() {
		return locaUsage;
	}
	public void setLocaUsage(String locaUsage) {
		this.locaUsage = locaUsage;
	}
	public String getLocaLov() {
		return locaLov;
	}
	public void setLocaLov(String locaLov) {
		this.locaLov = locaLov;
	}
	public String getLocaBpkbFlag() {
		return locaBpkbFlag;
	}
	public void setLocaBpkbFlag(String locaBpkbFlag) {
		this.locaBpkbFlag = locaBpkbFlag;
	}
	public String getLocaInvtFlag() {
		return locaInvtFlag;
	}
	public void setLocaInvtFlag(String locaInvtFlag) {
		this.locaInvtFlag = locaInvtFlag;
	}
	public String getLocaCreatedBy() {
		return locaCreatedBy;
	}
	public void setLocaCreatedBy(String locaCreatedBy) {
		this.locaCreatedBy = locaCreatedBy;
	}
	public Date getLocaCreatedDate() {
		return locaCreatedDate;
	}
	public void setLocaCreatedDate(Date locaCreatedDate) {
		this.locaCreatedDate = locaCreatedDate;
	}
	public String getLocaUpdatedBy() {
		return locaUpdatedBy;
	}
	public void setLocaUpdatedBy(String locaUpdatedBy) {
		this.locaUpdatedBy = locaUpdatedBy;
	}
	public Date getLocaUpdatedDate() {
		return locaUpdatedDate;
	}
	public void setLocaUpdatedDate(Date locaUpdatedDate) {
		this.locaUpdatedDate = locaUpdatedDate;
	}
	public String getLocaQuery() {
		return locaQuery;
	}
	public void setLocaQuery(String locaQuery) {
		this.locaQuery = locaQuery;
	}                                                                                 

}