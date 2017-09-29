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
@Table(name="CFIN_MST_OBJECT")
public class CfinMstObjectDest implements Serializable {

	@Id
	@Column(name="OBJECT_ID")
	private String objectId;
	@Column(name="OBJECT_NAME")
	private String objectName;
	@Column(name="OBJECT_TYPE_FLAG")
	private String objectTypeFlag;
	@Column(name="OBJECT_CREATED_BY")
	private String objectCreatedBy;
	@Column(name="OBJECT_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date objectCreatedDate;
	@Column(name="OBJECT_UPDATED_BY")
	private String objectUpdatedBy;
	@Column(name="OBJECT_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date objectUpdatedDate;
	@Column(name="OBJECT_STATUS")
	private String objectStatus;
	
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public String getObjectTypeFlag() {
		return objectTypeFlag;
	}
	public void setObjectTypeFlag(String objectTypeFlag) {
		this.objectTypeFlag = objectTypeFlag;
	}
	public String getObjectCreatedBy() {
		return objectCreatedBy;
	}
	public void setObjectCreatedBy(String objectCreatedBy) {
		this.objectCreatedBy = objectCreatedBy;
	}
	public Date getObjectCreatedDate() {
		return objectCreatedDate;
	}
	public void setObjectCreatedDate(Date objectCreatedDate) {
		this.objectCreatedDate = objectCreatedDate;
	}
	public String getObjectUpdatedBy() {
		return objectUpdatedBy;
	}
	public void setObjectUpdatedBy(String objectUpdatedBy) {
		this.objectUpdatedBy = objectUpdatedBy;
	}
	public Date getObjectUpdatedDate() {
		return objectUpdatedDate;
	}
	public void setObjectUpdatedDate(Date objectUpdatedDate) {
		this.objectUpdatedDate = objectUpdatedDate;
	}
	public String getObjectStatus() {
		return objectStatus;
	}
	public void setObjectStatus(String objectStatus) {
		this.objectStatus = objectStatus;
	}
}
