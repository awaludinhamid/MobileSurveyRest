package com.safasoft.mobsur.rest.client.bean.support;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("serial")
@MappedSuperclass
public class ActiveRecordAuditBean extends RecordAuditBean {

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="START_DATE")
	private Date startDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="END_DATE")
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
