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
@Table(name="CM_MST_PIT_STOP")
public class CmMstPitStopDest implements Serializable {

  @Id
  @Column(name="PIT_STOP_ID")
  private String pitStopId;                                                                           
  @Column(name="PIT_STOP_NAME")
  private String pitStopName;                                                                            
  @Column(name="PIT_STOP_BEGIN")
  private Double pitStopBegin;                                                                          
  @Column(name="PIT_STOP_END")
  private Double pitStopEnd;                                                                              
  @Column(name="CREATED_BY")
  private String createdBy;                                                                                 
  @Column(name="CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date createdDate;                                                 
  @Column(name="UPDATED_BY")
  private String updatedBy;                                                                                 
  @Column(name="UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date updatedDate;
  
	public String getPitStopId() {
		return pitStopId;
	}
	public void setPitStopId(String pitStopId) {
		this.pitStopId = pitStopId;
	}
	public String getPitStopName() {
		return pitStopName;
	}
	public void setPitStopName(String pitStopName) {
		this.pitStopName = pitStopName;
	}
	public Double getPitStopBegin() {
		return pitStopBegin;
	}
	public void setPitStopBegin(Double pitStopBegin) {
		this.pitStopBegin = pitStopBegin;
	}
	public Double getPitStopEnd() {
		return pitStopEnd;
	}
	public void setPitStopEnd(Double pitStopEnd) {
		this.pitStopEnd = pitStopEnd;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}