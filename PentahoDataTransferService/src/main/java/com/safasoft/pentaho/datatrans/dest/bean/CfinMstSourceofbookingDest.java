package com.safasoft.pentaho.datatrans.dest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="CFIN_MST_SOURCEOFBOOKING")
public class CfinMstSourceofbookingDest implements Serializable {

	@Id
	@Column(name="SOB_ID")
	private String sobId;
	@Column(name="SOB_NAME")
	private String sobName;
	@Column(name="SOB_STATUS")
	private String sobStatus;
	@Column(name="SOB_CREATED_BY")
	private String sobCreatedBy;
	@Column(name="SOB_CREATED_DATE")
	private Date sobCreatedDate;
	@Column(name="SOB_UPDATED_BY")
	private String sobUpdatedBy;
	@Column(name="SOB_UPDATED_DATE")
	private Date sobUpdatedDate;
	
	public String getSobId() {
		return sobId;
	}
	public void setSobId(String sobId) {
		this.sobId = sobId;
	}
	public String getSobName() {
		return sobName;
	}
	public void setSobName(String sobName) {
		this.sobName = sobName;
	}
	public String getSobStatus() {
		return sobStatus;
	}
	public void setSobStatus(String sobStatus) {
		this.sobStatus = sobStatus;
	}
	public String getSobCreatedBy() {
		return sobCreatedBy;
	}
	public void setSobCreatedBy(String sobCreatedBy) {
		this.sobCreatedBy = sobCreatedBy;
	}
	public Date getSobCreatedDate() {
		return sobCreatedDate;
	}
	public void setSobCreatedDate(Date sobCreatedDate) {
		this.sobCreatedDate = sobCreatedDate;
	}
	public String getSobUpdatedBy() {
		return sobUpdatedBy;
	}
	public void setSobUpdatedBy(String sobUpdatedBy) {
		this.sobUpdatedBy = sobUpdatedBy;
	}
	public Date getSobUpdatedDate() {
		return sobUpdatedDate;
	}
	public void setSobUpdatedDate(Date sobUpdatedDate) {
		this.sobUpdatedDate = sobUpdatedDate;
	}
}
