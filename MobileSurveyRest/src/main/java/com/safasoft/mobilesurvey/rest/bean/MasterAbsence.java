package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_ABSENCE
 * @created Jan 26, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_ABSENCE")
public class MasterAbsence extends ActiveRecordAuditBean {

	@Id
	@Column(name="ABSENCE_ID")
	private int absenceId;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private MasterUser user;
	@ManyToOne
	@JoinColumn(name="REASON_TYPE_ID")
	private MasterReasonType reasonType;
	
	public int getAbsenceId() {
		return absenceId;
	}
	public void setAbsenceId(int absenceId) {
		this.absenceId = absenceId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MasterUser getUser() {
		return user;
	}
	public void setUserId(MasterUser user) {
		this.user = user;
	}
	public MasterReasonType getReasonType() {
		return reasonType;
	}
	public void setReasonType(MasterReasonType reasonType) {
		this.reasonType = reasonType;
	}
}
