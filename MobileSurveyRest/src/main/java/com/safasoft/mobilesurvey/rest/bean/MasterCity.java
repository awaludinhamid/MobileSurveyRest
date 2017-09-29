package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_CITY
 * @created Dec 16, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_CITY")
public class MasterCity extends ActiveRecordAuditBean {

	@Id
	@Column(name="CITY_ID")
	private int cityId;
	@Column(name="CITY_CODE")
	private String cityCode;
	@Column(name="CITY_NAME")
	private String cityName;
	@ManyToOne
	@JoinColumn(name="PROV_ID")
	private MasterProvinsi provinsi;
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public MasterProvinsi getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(MasterProvinsi provinsi) {
		this.provinsi = provinsi;
	}
}
