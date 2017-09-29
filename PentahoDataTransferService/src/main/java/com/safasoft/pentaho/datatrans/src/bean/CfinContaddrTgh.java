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
@Table(name="CFIN_CONTADDR_TGH",schema="CFIN")
public class CfinContaddrTgh implements Serializable {

	@Id
	@Column(name="CONT_TGH_NO")
	private String contTghNo;
	@Column(name="CONT_CUST_TGH_ADDR")
	private String contTghTghAddr;
	@Column(name="CONT_CUST_TGH_RT")
	private String contTghTghRt;
	@Column(name="CONT_CUST_TGH_RW")
	private String contTghTghRw;
	@Column(name="CONT_CUST_TGH_KEL")
	private String contTghTghKel;
	@Column(name="CONT_CUST_TGH_KEC")
	private String contTghTghKec;
	@Column(name="CONT_CUST_TGH_KABKOTA")
	private String contTghTghKabkota;
	@Column(name="CONT_CUST_TGH_PROV")
	private String contTghTghProv;
	@Column(name="CONT_CUST_TGH_ZIP")
	private String contTghTghZip;
	@Column(name="CONT_CUST_TGH_SUBZIP")
	private String contTghTghSubzip;
	@Column(name="CONT_TGH_CREATED_BY")
	private String contTghCreatedBy;
	@Column(name="CONT_TGH_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date contTghCreatedDate;
	@Column(name="CONT_TGH_UPDATED_BY")
	private String contTghUpdatedBy;
	@Column(name="CONT_TGH_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date contTghUpdatedDate;
	
	public String getContTghNo() {
		return contTghNo;
	}
	public void setContTghNo(String contTghNo) {
		this.contTghNo = contTghNo;
	}
	public String getContTghTghAddr() {
		return contTghTghAddr;
	}
	public void setContTghTghAddr(String contTghTghAddr) {
		this.contTghTghAddr = contTghTghAddr;
	}
	public String getContTghTghRt() {
		return contTghTghRt;
	}
	public void setContTghTghRt(String contTghTghRt) {
		this.contTghTghRt = contTghTghRt;
	}
	public String getContTghTghRw() {
		return contTghTghRw;
	}
	public void setContTghTghRw(String contTghTghRw) {
		this.contTghTghRw = contTghTghRw;
	}
	public String getContTghTghKel() {
		return contTghTghKel;
	}
	public void setContTghTghKel(String contTghTghKel) {
		this.contTghTghKel = contTghTghKel;
	}
	public String getContTghTghKec() {
		return contTghTghKec;
	}
	public void setContTghTghKec(String contTghTghKec) {
		this.contTghTghKec = contTghTghKec;
	}
	public String getContTghTghKabkota() {
		return contTghTghKabkota;
	}
	public void setContTghTghKabkota(String contTghTghKabkota) {
		this.contTghTghKabkota = contTghTghKabkota;
	}
	public String getContTghTghProv() {
		return contTghTghProv;
	}
	public void setContTghTghProv(String contTghTghProv) {
		this.contTghTghProv = contTghTghProv;
	}
	public String getContTghTghZip() {
		return contTghTghZip;
	}
	public void setContTghTghZip(String contTghTghZip) {
		this.contTghTghZip = contTghTghZip;
	}
	public String getContTghTghSubzip() {
		return contTghTghSubzip;
	}
	public void setContTghTghSubzip(String contTghTghSubzip) {
		this.contTghTghSubzip = contTghTghSubzip;
	}
	public String getContTghCreatedBy() {
		return contTghCreatedBy;
	}
	public void setContTghCreatedBy(String contTghCreatedBy) {
		this.contTghCreatedBy = contTghCreatedBy;
	}
	public Date getContTghCreatedDate() {
		return contTghCreatedDate;
	}
	public void setContTghCreatedDate(Date contTghCreatedDate) {
		this.contTghCreatedDate = contTghCreatedDate;
	}
	public String getContTghUpdatedBy() {
		return contTghUpdatedBy;
	}
	public void setContTghUpdatedBy(String contTghUpdatedBy) {
		this.contTghUpdatedBy = contTghUpdatedBy;
	}
	public Date getContTghUpdatedDate() {
		return contTghUpdatedDate;
	}
	public void setContTghUpdatedDate(Date contTghUpdatedDate) {
		this.contTghUpdatedDate = contTghUpdatedDate;
	}
}
