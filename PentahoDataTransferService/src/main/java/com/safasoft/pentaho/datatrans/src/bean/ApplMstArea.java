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
@Table(name="APPL_MST_AREA",schema="APPL")
public class ApplMstArea implements Serializable {

	@Id
	@Column(name="AREA_ID")
	private String areaId;
	@Column(name="AREA_NAME")
	private String areaName;
	@Column(name="AREA_HEAD_ID")
	private Integer areaHeadId;
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
	@Column(name="AREA_STATUS")
	private String areaStatus;
	@Column(name="AREA_SURVEILANCE_ID")
	private Integer areaSurveilanceId;
	@Column(name="AREA_HEAD_REAL")
	private Integer areaHeadReal;
	@Column(name="AREA_LKP_LIVE")
	private String areaLkpLive;
	
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getAreaHeadId() {
		return areaHeadId;
	}
	public void setAreaHeadId(Integer areaHeadId) {
		this.areaHeadId = areaHeadId;
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
	public String getAreaStatus() {
		return areaStatus;
	}
	public void setAreaStatus(String areaStatus) {
		this.areaStatus = areaStatus;
	}
	public Integer getAreaSurveilanceId() {
		return areaSurveilanceId;
	}
	public void setAreaSurveilanceId(Integer areaSurveilanceId) {
		this.areaSurveilanceId = areaSurveilanceId;
	}
	public Integer getAreaHeadReal() {
		return areaHeadReal;
	}
	public void setAreaHeadReal(Integer areaHeadReal) {
		this.areaHeadReal = areaHeadReal;
	}
	public String getAreaLkpLive() {
		return areaLkpLive;
	}
	public void setAreaLkpLive(String areaLkpLive) {
		this.areaLkpLive = areaLkpLive;
	}
}
