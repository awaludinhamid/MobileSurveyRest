package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * POJO table MASTER_TEMPLATE
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_TEMPLATE")
public class MasterTemplate implements Serializable {

	@Id
	@Column(name="TEMP_ID")
	private int tempId;
	@Column(name="TEMP_CODE")
	private String tempCode;
	@Column(name="TEMP_LABEL")
	private String tempLabel;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name="COY_ID")
	private MasterCompany company;
	
	public int getTempId() {
		return tempId;
	}
	public void setTempId(int tempId) {
		this.tempId = tempId;
	}
	public String getTempCode() {
		return tempCode;
	}
	public void setTempCode(String tempCode) {
		this.tempCode = tempCode;
	}
	public String getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public MasterCompany getCompany() {
		return company;
	}
	public void setCompany(MasterCompany company) {
		this.company = company;
	}
	
}
