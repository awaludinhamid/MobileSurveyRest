package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="CFIN_MST_REV_OR_REJ_PKPD",schema="CFIN")
public class CfinMstRevOrRejPkpd implements Serializable {

	@Id
	@Column(name="RORP_ID")
	private String rorpId;
	@Column(name="RORP_TYPE")
	private String rorpType;
	@Column(name="RORP_DESCRIPTION")
	private String rorpDescription;
	@Column(name="RORP_CREATED_BY")
	private String rorpCreatedBy;
	@Column(name="RORP_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date rorpCreatedDate;
	@Column(name="RORP_UPDATED_BY")
	private String rorpUpdatedBy;
	@Column(name="RORP_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date rorpUpdatedDate;
	
	public String getRorpId() {
		return rorpId;
	}
	public void setRorpId(String rorpId) {
		this.rorpId = rorpId;
	}
	public String getRorpType() {
		return rorpType;
	}
	public void setRorpType(String rorpType) {
		this.rorpType = rorpType;
	}
	public String getRorpDescription() {
		return rorpDescription;
	}
	public void setRorpDescription(String rorpDescription) {
		this.rorpDescription = rorpDescription;
	}
	public String getRorpCreatedBy() {
		return rorpCreatedBy;
	}
	public void setRorpCreatedBy(String rorpCreatedBy) {
		this.rorpCreatedBy = rorpCreatedBy;
	}
	public Date getRorpCreatedDate() {
		return rorpCreatedDate;
	}
	public void setRorpCreatedDate(Date rorpCreatedDate) {
		this.rorpCreatedDate = rorpCreatedDate;
	}
	public String getRorpUpdatedBy() {
		return rorpUpdatedBy;
	}
	public void setRorpUpdatedBy(String rorpUpdatedBy) {
		this.rorpUpdatedBy = rorpUpdatedBy;
	}
	public Date getRorpUpdatedDate() {
		return rorpUpdatedDate;
	}
	public void setRorpUpdatedDate(Date rorpUpdatedDate) {
		this.rorpUpdatedDate = rorpUpdatedDate;
	}
}
