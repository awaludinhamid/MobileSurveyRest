package com.safasoft.mobilesurvey.rest.dto.support;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * DTO superclass for audit function
 * @created Oct 14, 2016
 * @author awal
 */
public class ControllerAuditBean {

	private String createdBy;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdDate;
	private String updatedBy;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedDate;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
}
