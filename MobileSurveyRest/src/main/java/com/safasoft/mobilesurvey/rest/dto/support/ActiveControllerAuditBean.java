package com.safasoft.mobilesurvey.rest.dto.support;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * DTO superclass for active function
 * @created Oct 14, 2016
 * @author awal
 */
public class ActiveControllerAuditBean extends ControllerAuditBean {

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
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
}
