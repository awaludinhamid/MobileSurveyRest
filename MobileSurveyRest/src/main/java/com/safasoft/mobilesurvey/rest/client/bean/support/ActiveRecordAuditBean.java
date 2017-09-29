package com.safasoft.mobilesurvey.rest.client.bean.support;

import java.sql.Date;

/**
 * POJO superclass for active function
 * @created Oct 14, 2016
 * @author awal
 */
public class ActiveRecordAuditBean extends RecordAuditBean {

	private Date startDate;
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
