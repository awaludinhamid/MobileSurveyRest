package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MASTER_ZIPCODE_VERIFICATOR
 * @created Jan 23, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_ZIPCODE_VERIFICATOR")
public class MasterZipcodeVerificator extends RecordAuditBean {

	@Id
	@Column(name="ZIPCODE_VERIF_ID")
	private int zipcodeVerifId;
	@Column(name="SUB_ZIPCODE")
	private String subZipcode;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToOne
	@JoinColumn(name="ZIPCODE_ID")
	private MasterZipcode zipcode;
	@ManyToOne
	@JoinColumn(name="VERIFICATOR_ID")
	private MasterUser verificator;
	
	public int getZipcodeVerifId() {
		return zipcodeVerifId;
	}
	public void setZipcodeVerifId(int zipcodeVerifId) {
		this.zipcodeVerifId = zipcodeVerifId;
	}
	public String getSubZipcode() {
		return subZipcode;
	}
	public void setSubZipcode(String subZipcode) {
		this.subZipcode = subZipcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MasterZipcode getZipcode() {
		return zipcode;
	}
	public void setZipcode(MasterZipcode zipcode) {
		this.zipcode = zipcode;
	}
	public MasterUser getVerificator() {
		return verificator;
	}
	public void setVerificator(MasterUser verificator) {
		this.verificator = verificator;
	}
}
