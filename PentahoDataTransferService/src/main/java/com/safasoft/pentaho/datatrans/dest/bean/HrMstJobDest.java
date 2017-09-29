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
@Table(name="HR_MST_JOB")
public class HrMstJobDest implements Serializable {

  @Id
  @Column(name="JOB_ID")
  private String jobId;
  @Column(name="JOB_DESC")
  private String jobDesc;
  @Column(name="JOB_CREATED_BY")
  private String jobCreatedBy;
  @Column(name="JOB_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date jobCreatedDate;
  @Column(name="JOB_UPDATED_BY")
  private String jobUpdatedBy;
  @Column(name="JOB_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date jobUpdatedDate;
  @Column(name="JOB_CS_FLAG")
  private String jobCsFlag;
  @Column(name="JOB_SURVEYOR_FLAG")
  private String jobSurveyorFlag;
  @Column(name="JOB_COLLECTOR_FLAG")
  private String jobCollectorFlag;
  @Column(name="JOB_EKSEKUTOR_FLAG")
  private String jobEksekutorFlag;
  @Column(name="JOB_FROMDATE")
  @Temporal(TemporalType.DATE)
  private Date jobFromdate;
  @Column(name="JOB_TODATE")
  @Temporal(TemporalType.DATE)
  private Date jobTodate;
  @Column(name="JOB_SCOPE")
  private Double jobScope;
  
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getJobCreatedBy() {
		return jobCreatedBy;
	}
	public void setJobCreatedBy(String jobCreatedBy) {
		this.jobCreatedBy = jobCreatedBy;
	}
	public Date getJobCreatedDate() {
		return jobCreatedDate;
	}
	public void setJobCreatedDate(Date jobCreatedDate) {
		this.jobCreatedDate = jobCreatedDate;
	}
	public String getJobUpdatedBy() {
		return jobUpdatedBy;
	}
	public void setJobUpdatedBy(String jobUpdatedBy) {
		this.jobUpdatedBy = jobUpdatedBy;
	}
	public Date getJobUpdatedDate() {
		return jobUpdatedDate;
	}
	public void setJobUpdatedDate(Date jobUpdatedDate) {
		this.jobUpdatedDate = jobUpdatedDate;
	}
	public String getJobCsFlag() {
		return jobCsFlag;
	}
	public void setJobCsFlag(String jobCsFlag) {
		this.jobCsFlag = jobCsFlag;
	}
	public String getJobSurveyorFlag() {
		return jobSurveyorFlag;
	}
	public void setJobSurveyorFlag(String jobSurveyorFlag) {
		this.jobSurveyorFlag = jobSurveyorFlag;
	}
	public String getJobCollectorFlag() {
		return jobCollectorFlag;
	}
	public void setJobCollectorFlag(String jobCollectorFlag) {
		this.jobCollectorFlag = jobCollectorFlag;
	}
	public String getJobEksekutorFlag() {
		return jobEksekutorFlag;
	}
	public void setJobEksekutorFlag(String jobEksekutorFlag) {
		this.jobEksekutorFlag = jobEksekutorFlag;
	}
	public Date getJobFromdate() {
		return jobFromdate;
	}
	public void setJobFromdate(Date jobFromdate) {
		this.jobFromdate = jobFromdate;
	}
	public Date getJobTodate() {
		return jobTodate;
	}
	public void setJobTodate(Date jobTodate) {
		this.jobTodate = jobTodate;
	}
	public Double getJobScope() {
		return jobScope;
	}
	public void setJobScope(Double jobScope) {
		this.jobScope = jobScope;
	}

}