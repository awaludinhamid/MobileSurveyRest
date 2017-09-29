package com.safasoft.pentaho.datatrans.dest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="APPL_MST_OCCUPATION")
public class ApplMstOccupationDest implements Serializable {

	@Id
	@Column(name="OCCUPATION_ID")
	private String occupationId;
	@Column(name="OCCUPATION_DESC")
	private String occupationDesc;
	@Column(name="OCCUPATION_SEQ")
	private Integer occupationSeq;
	@Column(name="OCCUPATION_CREATED_BY")
	private String occupationCreatedBy;
	@Column(name="OCCUPATION_CREATED_DATE")
	private Date occupationCreatedDate;
	@Column(name="OCCUPATION_UPDATED_BY")
	private String occupationUpdatedBy;
	@Column(name="OCCUPATION_UPDATED_DATE")
	private Date occupationUpdatedDate;
	@Column(name="OCCUPATION_GROUP")
	private String occupationGroup;
	
	public String getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(String occupationId) {
		this.occupationId = occupationId;
	}
	public String getOccupationDesc() {
		return occupationDesc;
	}
	public void setOccupationDesc(String occupationDesc) {
		this.occupationDesc = occupationDesc;
	}
	public Integer getOccupationSeq() {
		return occupationSeq;
	}
	public void setOccupationSeq(Integer occupationSeq) {
		this.occupationSeq = occupationSeq;
	}
	public String getOccupationCreatedBy() {
		return occupationCreatedBy;
	}
	public void setOccupationCreatedBy(String occupationCreatedBy) {
		this.occupationCreatedBy = occupationCreatedBy;
	}
	public Date getOccupationCreatedDate() {
		return occupationCreatedDate;
	}
	public void setOccupationCreatedDate(Date occupationCreatedDate) {
		this.occupationCreatedDate = occupationCreatedDate;
	}
	public String getOccupationUpdatedBy() {
		return occupationUpdatedBy;
	}
	public void setOccupationUpdatedBy(String occupationUpdatedBy) {
		this.occupationUpdatedBy = occupationUpdatedBy;
	}
	public Date getOccupationUpdatedDate() {
		return occupationUpdatedDate;
	}
	public void setOccupationUpdatedDate(Date occupationUpdatedDate) {
		this.occupationUpdatedDate = occupationUpdatedDate;
	}
	public String getOccupationGroup() {
		return occupationGroup;
	}
	public void setOccupationGroup(String occupationGroup) {
		this.occupationGroup = occupationGroup;
	}
}
