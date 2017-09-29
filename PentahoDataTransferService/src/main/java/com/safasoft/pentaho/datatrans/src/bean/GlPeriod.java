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
@Table(name="GL_PERIOD",schema="FINA")
public class GlPeriod implements Serializable {

  @Id
  @Column(name="PERIOD_NAME")
  private String periodName;
  @Column(name="PERIOD_STATUS")
  private String periodStatus;
  @Column(name="PERIOD_YEAR")
  private Integer periodYear;
  @Column(name="PERIOD_NUM")
  private Integer periodNum;
  @Column(name="PERIOD_START_DATE")
  @Temporal(TemporalType.DATE)
  private Date periodStartDate;
  @Column(name="PERIOD_END_DATE")
  @Temporal(TemporalType.DATE)
  private Date periodEndDate;
  @Column(name="PERIOD_CREATED_BY")
  private String periodCreatedBy;
  @Column(name="PERIOD_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date periodCreatedDate;
  @Column(name="PERIOD_UPDATED_BY")
  private String periodUpdatedBy;
  @Column(name="PERIOD_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date periodUpdatedDate;
  
	public String getPeriodName() {
		return periodName;
	}
	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}
	public String getPeriodStatus() {
		return periodStatus;
	}
	public void setPeriodStatus(String periodStatus) {
		this.periodStatus = periodStatus;
	}
	public Integer getPeriodYear() {
		return periodYear;
	}
	public void setPeriodYear(Integer periodYear) {
		this.periodYear = periodYear;
	}
	public Integer getPeriodNum() {
		return periodNum;
	}
	public void setPeriodNum(Integer periodNum) {
		this.periodNum = periodNum;
	}
	public Date getPeriodStartDate() {
		return periodStartDate;
	}
	public void setPeriodStartDate(Date periodStartDate) {
		this.periodStartDate = periodStartDate;
	}
	public Date getPeriodEndDate() {
		return periodEndDate;
	}
	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}
	public String getPeriodCreatedBy() {
		return periodCreatedBy;
	}
	public void setPeriodCreatedBy(String periodCreatedBy) {
		this.periodCreatedBy = periodCreatedBy;
	}
	public Date getPeriodCreatedDate() {
		return periodCreatedDate;
	}
	public void setPeriodCreatedDate(Date periodCreatedDate) {
		this.periodCreatedDate = periodCreatedDate;
	}
	public String getPeriodUpdatedBy() {
		return periodUpdatedBy;
	}
	public void setPeriodUpdatedBy(String periodUpdatedBy) {
		this.periodUpdatedBy = periodUpdatedBy;
	}
	public Date getPeriodUpdatedDate() {
		return periodUpdatedDate;
	}
	public void setPeriodUpdatedDate(Date periodUpdatedDate) {
		this.periodUpdatedDate = periodUpdatedDate;
	}

}