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
@Table(name="CM_TGH_MST_PITSTOP",schema="SHCM")
public class CmTghMstPitstop implements Serializable {

  @Id
  @Column(name="PITSTOP_ID")
  private String pitstopId;                                                                            
  @Id
  @Column(name="PITSTOP_SPS_MONTH")
  private String pitstopSpsMonth;                                                               
  @Column(name="PITSTOP_NAME")
  private String pitstopName;                                                                             
  @Column(name="PITSTOP_BEGIN")
  private Double pitstopBegin;                                                                           
  @Column(name="PITSTOP_END")
  private Double pitstopEnd;                                                                               
  @Column(name="PITSTOP_MONTH")
  private String pitstopMonth;                                                                           
  @Column(name="PITSTOP_CREATED_BY")
  private String pitstopCreatedBy;                                                                  
  @Column(name="PITSTOP_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pitstopCreatedDate;                                  
  @Column(name="PITSTOP_UPDATED_BY")
  private String pitstopUpdatedBy;                                                                  
  @Column(name="PITSTOP_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pitstopUpdatedDate;                                  
  @Column(name="PITSTOP_STATUS")
  private String pitstopStatus;                                                                         
  @Column(name="PITSTOP_LST_MONTH")
  private String pitstopLstMonth;                                                                    
  @Column(name="PITSTOP_BEGIN_TMP")
  private Double pitstopBeginTmp;                                                                    
  @Column(name="PITSTOP_END_TMP")
  private Double pitstopEndTmp;                                                                        
  @Column(name="PITSTOP_LOCK_PROMISE")
  private String pitstopLockPromise;
  
	public String getPitstopId() {
		return pitstopId;
	}
	public void setPitstopId(String pitstopId) {
		this.pitstopId = pitstopId;
	}
	public String getPitstopSpsMonth() {
		return pitstopSpsMonth;
	}
	public void setPitstopSpsMonth(String pitstopSpsMonth) {
		this.pitstopSpsMonth = pitstopSpsMonth;
	}
	public String getPitstopName() {
		return pitstopName;
	}
	public void setPitstopName(String pitstopName) {
		this.pitstopName = pitstopName;
	}
	public Double getPitstopBegin() {
		return pitstopBegin;
	}
	public void setPitstopBegin(Double pitstopBegin) {
		this.pitstopBegin = pitstopBegin;
	}
	public Double getPitstopEnd() {
		return pitstopEnd;
	}
	public void setPitstopEnd(Double pitstopEnd) {
		this.pitstopEnd = pitstopEnd;
	}
	public String getPitstopMonth() {
		return pitstopMonth;
	}
	public void setPitstopMonth(String pitstopMonth) {
		this.pitstopMonth = pitstopMonth;
	}
	public String getPitstopCreatedBy() {
		return pitstopCreatedBy;
	}
	public void setPitstopCreatedBy(String pitstopCreatedBy) {
		this.pitstopCreatedBy = pitstopCreatedBy;
	}
	public Date getPitstopCreatedDate() {
		return pitstopCreatedDate;
	}
	public void setPitstopCreatedDate(Date pitstopCreatedDate) {
		this.pitstopCreatedDate = pitstopCreatedDate;
	}
	public String getPitstopUpdatedBy() {
		return pitstopUpdatedBy;
	}
	public void setPitstopUpdatedBy(String pitstopUpdatedBy) {
		this.pitstopUpdatedBy = pitstopUpdatedBy;
	}
	public Date getPitstopUpdatedDate() {
		return pitstopUpdatedDate;
	}
	public void setPitstopUpdatedDate(Date pitstopUpdatedDate) {
		this.pitstopUpdatedDate = pitstopUpdatedDate;
	}
	public String getPitstopStatus() {
		return pitstopStatus;
	}
	public void setPitstopStatus(String pitstopStatus) {
		this.pitstopStatus = pitstopStatus;
	}
	public String getPitstopLstMonth() {
		return pitstopLstMonth;
	}
	public void setPitstopLstMonth(String pitstopLstMonth) {
		this.pitstopLstMonth = pitstopLstMonth;
	}
	public Double getPitstopBeginTmp() {
		return pitstopBeginTmp;
	}
	public void setPitstopBeginTmp(Double pitstopBeginTmp) {
		this.pitstopBeginTmp = pitstopBeginTmp;
	}
	public Double getPitstopEndTmp() {
		return pitstopEndTmp;
	}
	public void setPitstopEndTmp(Double pitstopEndTmp) {
		this.pitstopEndTmp = pitstopEndTmp;
	}
	public String getPitstopLockPromise() {
		return pitstopLockPromise;
	}
	public void setPitstopLockPromise(String pitstopLockPromise) {
		this.pitstopLockPromise = pitstopLockPromise;
	}
}