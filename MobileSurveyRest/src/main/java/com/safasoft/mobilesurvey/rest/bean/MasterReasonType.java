package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MASTER_REASON_TYPE
 * @created Jan 26, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_REASON_TYPE")
public class MasterReasonType extends RecordAuditBean {

	@Id
	@Column(name="REASON_TYPE_ID")
	private int reasonTypeId;
	@Column(name="REASON_TYPE_NAME")
	private String reasonTypeName;
	
	public int getReasonTypeId() {
		return reasonTypeId;
	}
	public void setReasonTypeId(int reasonTypeId) {
		this.reasonTypeId = reasonTypeId;
	}
	public String getReasonTypeName() {
		return reasonTypeName;
	}
	public void setReasonTypeName(String reasonTypeName) {
		this.reasonTypeName = reasonTypeName;
	}
}
