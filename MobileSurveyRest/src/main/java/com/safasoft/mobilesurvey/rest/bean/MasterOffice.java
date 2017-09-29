package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO table MASTER_OFFICE
 * @created Nov 3, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_OFFICE")
public class MasterOffice implements Serializable {

	@Id
	@Column(name="OFFICE_ID")
	private int officeId;
	@Column(name="OFFICE_CODE")
	private String officeCode;
	@Column(name="OFFICE_NAME")
	private String officeName;
	@ManyToOne
	@JoinColumn(name="COY_ID")
	private MasterCompany company;
	
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public MasterCompany getCompany() {
		return company;
	}
	public void setCompany(MasterCompany company) {
		this.company = company;
	}
}
