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
@Table(name="HR_PEOPLE_ASSIGNMENT",schema="HRMS")
public class HrPeopleAssignment implements Serializable {

  @Id
  @Column(name="ASS_ID")
  private Double assId;                                                                                    
  @Column(name="ASS_PERSON_ID")
  private Double assPersonId;                                                                            
  @Column(name="ASS_POSITION_ID")
  private String assPositionId;                                                                        
  @Column(name="ASS_FROMDATE")
  @Temporal(TemporalType.DATE)
  private Date assFromdate;                                                 
  @Column(name="ASS_TODATE")
  @Temporal(TemporalType.DATE)
  private Date assTodate;                                                     
  @Column(name="ASS_CURRGRADE_SEG1")
  private String assCurrgradeSeg1;                                                                  
  @Column(name="ASS_CURRGRADE_SEG2")
  private String assCurrgradeSeg2;                                                                  
  @Column(name="ASS_CURRGRADE_SEG3")
  private String assCurrgradeSeg3;                                                                  
  @Column(name="ASS_CURRGRADE_SEG4")
  private String assCurrgradeSeg4;                                                                  
  @Column(name="ASS_DEPT_ID")
  private String assDeptId;                                                                                
  @Column(name="ASS_JOB_ID")
  private String assJobId;                                                                                  
  @Column(name="ASS_CURRLOC_COYOUTLET")
  private String assCurrlocCoyoutlet;                                                            
  @Column(name="ASS_CREATED_BY")
  private String assCreatedBy;                                                                          
  @Column(name="ASS_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date assCreatedDate;                                          
  @Column(name="ASS_UPDATED_BY")
  private String assUpdatedBy;                                                                          
  @Column(name="ASS_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date assUpdatedDate;                                          
  @Column(name="ASS_SUPERVISOR_ID")
  private Double assSupervisorId;                                                                    
  @Column(name="ASS_PROCESS_FLAG")
  private String assProcessFlag;                                                                      
  @Column(name="ASS_MUTASI_ID")
  private String assMutasiId;
  
	public Double getAssId() {
		return assId;
	}
	public void setAssId(Double assId) {
		this.assId = assId;
	}
	public Double getAssPersonId() {
		return assPersonId;
	}
	public void setAssPersonId(Double assPersonId) {
		this.assPersonId = assPersonId;
	}
	public String getAssPositionId() {
		return assPositionId;
	}
	public void setAssPositionId(String assPositionId) {
		this.assPositionId = assPositionId;
	}
	public Date getAssFromdate() {
		return assFromdate;
	}
	public void setAssFromdate(Date assFromdate) {
		this.assFromdate = assFromdate;
	}
	public Date getAssTodate() {
		return assTodate;
	}
	public void setAssTodate(Date assTodate) {
		this.assTodate = assTodate;
	}
	public String getAssCurrgradeSeg1() {
		return assCurrgradeSeg1;
	}
	public void setAssCurrgradeSeg1(String assCurrgradeSeg1) {
		this.assCurrgradeSeg1 = assCurrgradeSeg1;
	}
	public String getAssCurrgradeSeg2() {
		return assCurrgradeSeg2;
	}
	public void setAssCurrgradeSeg2(String assCurrgradeSeg2) {
		this.assCurrgradeSeg2 = assCurrgradeSeg2;
	}
	public String getAssCurrgradeSeg3() {
		return assCurrgradeSeg3;
	}
	public void setAssCurrgradeSeg3(String assCurrgradeSeg3) {
		this.assCurrgradeSeg3 = assCurrgradeSeg3;
	}
	public String getAssCurrgradeSeg4() {
		return assCurrgradeSeg4;
	}
	public void setAssCurrgradeSeg4(String assCurrgradeSeg4) {
		this.assCurrgradeSeg4 = assCurrgradeSeg4;
	}
	public String getAssDeptId() {
		return assDeptId;
	}
	public void setAssDeptId(String assDeptId) {
		this.assDeptId = assDeptId;
	}
	public String getAssJobId() {
		return assJobId;
	}
	public void setAssJobId(String assJobId) {
		this.assJobId = assJobId;
	}
	public String getAssCurrlocCoyoutlet() {
		return assCurrlocCoyoutlet;
	}
	public void setAssCurrlocCoyoutlet(String assCurrlocCoyoutlet) {
		this.assCurrlocCoyoutlet = assCurrlocCoyoutlet;
	}
	public String getAssCreatedBy() {
		return assCreatedBy;
	}
	public void setAssCreatedBy(String assCreatedBy) {
		this.assCreatedBy = assCreatedBy;
	}
	public Date getAssCreatedDate() {
		return assCreatedDate;
	}
	public void setAssCreatedDate(Date assCreatedDate) {
		this.assCreatedDate = assCreatedDate;
	}
	public String getAssUpdatedBy() {
		return assUpdatedBy;
	}
	public void setAssUpdatedBy(String assUpdatedBy) {
		this.assUpdatedBy = assUpdatedBy;
	}
	public Date getAssUpdatedDate() {
		return assUpdatedDate;
	}
	public void setAssUpdatedDate(Date assUpdatedDate) {
		this.assUpdatedDate = assUpdatedDate;
	}
	public Double getAssSupervisorId() {
		return assSupervisorId;
	}
	public void setAssSupervisorId(Double assSupervisorId) {
		this.assSupervisorId = assSupervisorId;
	}
	public String getAssProcessFlag() {
		return assProcessFlag;
	}
	public void setAssProcessFlag(String assProcessFlag) {
		this.assProcessFlag = assProcessFlag;
	}
	public String getAssMutasiId() {
		return assMutasiId;
	}
	public void setAssMutasiId(String assMutasiId) {
		this.assMutasiId = assMutasiId;
	}
}