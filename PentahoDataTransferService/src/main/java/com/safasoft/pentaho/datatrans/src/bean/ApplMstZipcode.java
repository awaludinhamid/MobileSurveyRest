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
@Table(name="APPL_MST_ZIPCODE",schema="APPL")
public class ApplMstZipcode implements Serializable {

	@Id
	@Column(name="ZIPCODE")
	private String zipcode;
	@Column(name="ZIP_DESC")
	private String zipDesc;
	@Column(name="ZIP_PROVINCE")
	private String zipProvince;
	@Column(name="ZIP_KABKOTA")
	private String zipKabkota;
	@Column(name="ZIP_CREATED_BY")
	private String zipCreatedBy;
	@Column(name="ZIP_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date zipCreatedDate;
	@Column(name="ZIP_UPDATED_BY")
	private String zipUpdatedBy;
	@Column(name="ZIP_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date zipUpdatedDate;
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getZipDesc() {
		return zipDesc;
	}
	public void setZipDesc(String zipDesc) {
		this.zipDesc = zipDesc;
	}
	public String getZipProvince() {
		return zipProvince;
	}
	public void setZipProvince(String zipProvince) {
		this.zipProvince = zipProvince;
	}
	public String getZipKabkota() {
		return zipKabkota;
	}
	public void setZipKabkota(String zipKabkota) {
		this.zipKabkota = zipKabkota;
	}
	public String getZipCreatedBy() {
		return zipCreatedBy;
	}
	public void setZipCreatedBy(String zipCreatedBy) {
		this.zipCreatedBy = zipCreatedBy;
	}
	public Date getZipCreatedDate() {
		return zipCreatedDate;
	}
	public void setZipCreatedDate(Date zipCreatedDate) {
		this.zipCreatedDate = zipCreatedDate;
	}
	public String getZipUpdatedBy() {
		return zipUpdatedBy;
	}
	public void setZipUpdatedBy(String zipUpdatedBy) {
		this.zipUpdatedBy = zipUpdatedBy;
	}
	public Date getZipUpdatedDate() {
		return zipUpdatedDate;
	}
	public void setZipUpdatedDate(Date zipUpdatedDate) {
		this.zipUpdatedDate = zipUpdatedDate;
	}
}
