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
@Table(name="CFIN_MST_COLLECTOR",schema="CFIN")
public class CfinMstCollector implements Serializable {

	@Id
	@Column(name="COLL_ZIPCODE")
	private String collZipcode;
	@Id
	@Column(name="COLL_SUBZIP")
	private String collSubzip;
	@Id
	@Column(name="COLL_OUTLET_ID")
	private String collOutletId;
	@Column(name="COLL_ID")
	private Integer collId;
	@Column(name="COLL_CREATED_BY")
	private String collCreatedBy;
	@Column(name="COLL_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date collCreatedDate;
	@Column(name="COLL_UPDATED_BY")
	private String collUpdatedBy;
	@Column(name="COLL_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date collUpdatedDate;
	
	public String getCollZipcode() {
		return collZipcode;
	}
	public void setCollZipcode(String collZipcode) {
		this.collZipcode = collZipcode;
	}
	public String getCollSubzip() {
		return collSubzip;
	}
	public void setCollSubzip(String collSubzip) {
		this.collSubzip = collSubzip;
	}
	public String getCollOutletId() {
		return collOutletId;
	}
	public void setCollOutletId(String collOutletId) {
		this.collOutletId = collOutletId;
	}
	public Integer getCollId() {
		return collId;
	}
	public void setCollId(Integer collId) {
		this.collId = collId;
	}
	public String getCollCreatedBy() {
		return collCreatedBy;
	}
	public void setCollCreatedBy(String collCreatedBy) {
		this.collCreatedBy = collCreatedBy;
	}
	public Date getCollCreatedDate() {
		return collCreatedDate;
	}
	public void setCollCreatedDate(Date collCreatedDate) {
		this.collCreatedDate = collCreatedDate;
	}
	public String getCollUpdatedBy() {
		return collUpdatedBy;
	}
	public void setCollUpdatedBy(String collUpdatedBy) {
		this.collUpdatedBy = collUpdatedBy;
	}
	public Date getCollUpdatedDate() {
		return collUpdatedDate;
	}
	public void setCollUpdatedDate(Date collUpdatedDate) {
		this.collUpdatedDate = collUpdatedDate;
	}
}
