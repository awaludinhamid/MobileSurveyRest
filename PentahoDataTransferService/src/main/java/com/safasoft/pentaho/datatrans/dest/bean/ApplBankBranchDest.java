package com.safasoft.pentaho.datatrans.dest.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="APPL_BANK_BRANCH")
public class ApplBankBranchDest implements Serializable {

	@Id
	@Column(name="BANK_CODE")
	private String bankCode;
	@Id
	@Column(name="BANK_BRANCH")
	private String bankBranch;
	@Column(name="BRANCH_NAME")
	private String bankName;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	private Date craetedDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="UPDATED_DATE")
	private Date updatedDate;
	@Column(name="BI_CODE")
	private String biCode;
	@Column(name="STATUS")
	private String status;
	@Column(name="ALAMAT")
	private String alamat;
	@Column(name="KOTA")
	private String kota;
	@Column(name="ZIPCODE")
	private String zipcode;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="PHONE1")
	private String phone1;
	@Column(name="PHONE2")
	private String phone2;
	@Column(name="FAX1")
	private String fax1;
	@Column(name="FAX2")
	private String fax2;
	@Column(name="CONTACT_PERSON1")
	private String contactPerson1;
	@Column(name="CONTACT_PERSON2")
	private String contactPerson2;
	@Column(name="AREA_PHONE1")
	private String areaPhone1;
	@Column(name="AREA_PHONE2")
	private String areaPhone2;
	@Column(name="AREA_FAX1")
	private String areaFax1;
	@Column(name="AREA_FAX2")
	private String areaFax2;
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCraetedDate() {
		return craetedDate;
	}
	public void setCraetedDate(Date craetedDate) {
		this.craetedDate = craetedDate;
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
	public String getBiCode() {
		return biCode;
	}
	public void setBiCode(String biCode) {
		this.biCode = biCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKota() {
		return kota;
	}
	public void setKota(String kota) {
		this.kota = kota;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getFax1() {
		return fax1;
	}
	public void setFax1(String fax1) {
		this.fax1 = fax1;
	}
	public String getFax2() {
		return fax2;
	}
	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}
	public String getContactPerson1() {
		return contactPerson1;
	}
	public void setContactPerson1(String contactPerson1) {
		this.contactPerson1 = contactPerson1;
	}
	public String getContactPerson2() {
		return contactPerson2;
	}
	public void setContactPerson2(String contactPerson2) {
		this.contactPerson2 = contactPerson2;
	}
	public String getAreaPhone1() {
		return areaPhone1;
	}
	public void setAreaPhone1(String areaPhone1) {
		this.areaPhone1 = areaPhone1;
	}
	public String getAreaPhone2() {
		return areaPhone2;
	}
	public void setAreaPhone2(String areaPhone2) {
		this.areaPhone2 = areaPhone2;
	}
	public String getAreaFax1() {
		return areaFax1;
	}
	public void setAreaFax1(String areaFax1) {
		this.areaFax1 = areaFax1;
	}
	public String getAreaFax2() {
		return areaFax2;
	}
	public void setAreaFax2(String areaFax2) {
		this.areaFax2 = areaFax2;
	}		
}
