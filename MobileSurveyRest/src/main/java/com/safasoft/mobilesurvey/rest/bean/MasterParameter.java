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
 * POJO table MASTER_PARAMETER
 * @created Nov 18, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_PARAMETER")
public class MasterParameter implements Serializable {

	@Id
	@Column(name="PAR_ID")
	private int parId;
	@Column(name="PAR_VALUE")
	private String parValue;
	@Column(name="START_DATE")
	private Date startDate;
	@Column(name="END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name="COY_ID")
	private MasterCompany company;
	@ManyToOne
	@JoinColumn(name="PARENT_PAR_ID")
	private MasterParentParameter parentParameter;
	
	public int getParId() {
		return parId;
	}
	public void setParId(int parId) {
		this.parId = parId;
	}
	public String getParValue() {
		return parValue;
	}
	public void setParValue(String parValue) {
		this.parValue = parValue;
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
	public MasterParentParameter getParentParameter() {
		return parentParameter;
	}
	public void setParentParameter(MasterParentParameter parentParameter) {
		this.parentParameter = parentParameter;
	}
}
