package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_PROVINSI
 * @created Dec 16, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_PROVINSI")
public class MasterProvinsi extends ActiveRecordAuditBean {

	@Id
	@Column(name="PROV_ID")
	private int provId;
	@Column(name="PROV_CODE")
	private String provCode;
	@Column(name="PROV_NAME")
	private String provName;
	
	public int getProvId() {
		return provId;
	}
	public void setProvId(int provId) {
		this.provId = provId;
	}
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getProvName() {
		return provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}
}
