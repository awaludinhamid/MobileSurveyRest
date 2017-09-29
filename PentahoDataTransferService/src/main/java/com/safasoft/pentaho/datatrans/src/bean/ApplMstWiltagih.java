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
@Table(name="APPL_MST_WILTAGIH",schema="APPL")
public class ApplMstWiltagih implements Serializable {

	@Id
	@Column(name="TGH_ZIPCODE")
	private String tghZipcode;
	@Id
	@Column(name="TGH_SUBZIPCODE")
	private String tghSubzipcode;
	@Id
	@Column(name="TGH_COYOUTLET_ID")
	private String tghCoyoutletId;
	@Column(name="TGH_SUBZIPDESC")
	private String tghSubzipdesc;
	@Column(name="TGH_CREATED_BY")
	private String tghCreatedBy;
	@Column(name="TGH_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date tghCreatedDate;
	@Column(name="TGH_UPDATED_BY")
	private String tghUpdatedBy;
	@Column(name="TGH_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date tghUpdatedDate;
	@Column(name="TGH_KECAMATAN")
	private String tghKecamatan;
	@Column(name="TGH_KELURAHAN")
	private String tghKelurahan;
	@Column(name="TGH_STATUS")
	private String tghStatus;
	
	public String getTghZipcode() {
		return tghZipcode;
	}
	public void setTghZipcode(String tghZipcode) {
		this.tghZipcode = tghZipcode;
	}
	public String getTghSubzipcode() {
		return tghSubzipcode;
	}
	public void setTghSubzipcode(String tghSubzipcode) {
		this.tghSubzipcode = tghSubzipcode;
	}
	public String getTghCoyoutletId() {
		return tghCoyoutletId;
	}
	public void setTghCoyoutletId(String tghCoyoutletId) {
		this.tghCoyoutletId = tghCoyoutletId;
	}
	public String getTghSubzipdesc() {
		return tghSubzipdesc;
	}
	public void setTghSubzipdesc(String tghSubzipdesc) {
		this.tghSubzipdesc = tghSubzipdesc;
	}
	public String getTghCreatedBy() {
		return tghCreatedBy;
	}
	public void setTghCreatedBy(String tghCreatedBy) {
		this.tghCreatedBy = tghCreatedBy;
	}
	public Date getTghCreatedDate() {
		return tghCreatedDate;
	}
	public void setTghCreatedDate(Date tghCreatedDate) {
		this.tghCreatedDate = tghCreatedDate;
	}
	public String getTghUpdatedBy() {
		return tghUpdatedBy;
	}
	public void setTghUpdatedBy(String tghUpdatedBy) {
		this.tghUpdatedBy = tghUpdatedBy;
	}
	public Date getTghUpdatedDate() {
		return tghUpdatedDate;
	}
	public void setTghUpdatedDate(Date tghUpdatedDate) {
		this.tghUpdatedDate = tghUpdatedDate;
	}
	public String getTghKecamatan() {
		return tghKecamatan;
	}
	public void setTghKecamatan(String tghKecamatan) {
		this.tghKecamatan = tghKecamatan;
	}
	public String getTghKelurahan() {
		return tghKelurahan;
	}
	public void setTghKelurahan(String tghKelurahan) {
		this.tghKelurahan = tghKelurahan;
	}
	public String getTghStatus() {
		return tghStatus;
	}
	public void setTghStatus(String tghStatus) {
		this.tghStatus = tghStatus;
	}
}
