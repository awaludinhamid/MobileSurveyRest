package com.safasoft.mobilesurvey.rest.bean.support;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * POJO superclass for active function
 * @created Oct 14, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class ActiveRecordAuditBean extends RecordAuditBean {

	@Column(name="START_DATE",insertable=false,updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@Column(name="END_DATE",insertable=false,updatable=false)
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
