package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_ZIPCODE
 * @created Nov 26, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_ZIPCODE")
public class MasterZipcode extends ActiveRecordAuditBean {

	@Id
	@Column(name="ZIPCODE_ID")
	private int zipcodeId;
	@Column(name="ZIPCODE_CODE")
	private String zipcodeCode;
	@Column(name="ZIPCODE_DESC")
	private String zipcodeDesc;
	@ManyToOne
	@JoinColumn(name="CITY_ID")
	private MasterCity city;
	
	public int getZipcodeId() {
		return zipcodeId;
	}
	public void setZipcodeId(int zipcodeId) {
		this.zipcodeId = zipcodeId;
	}
	public String getZipcodeCode() {
		return zipcodeCode;
	}
	public void setZipcodeCode(String zipcodeCode) {
		this.zipcodeCode = zipcodeCode;
	}
	public String getZipcodeDesc() {
		return zipcodeDesc;
	}
	public void setZipcodeDesc(String zipcodeDesc) {
		this.zipcodeDesc = zipcodeDesc;
	}
	public MasterCity getCity() {
		return city;
	}
	public void setCity(MasterCity city) {
		this.city = city;
	}
}
