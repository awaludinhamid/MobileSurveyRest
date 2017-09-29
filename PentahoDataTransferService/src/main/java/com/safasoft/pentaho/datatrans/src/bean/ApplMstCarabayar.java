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
@Table(name="APPL_MST_CARABAYAR",schema="APPL")
public class ApplMstCarabayar implements Serializable {

	@Id
	@Column(name="CARABYR_ID")
	private String carabyrId;
	@Column(name="CARABYR_DESC")
	private String carabyrDesc;
	@Column(name="CARABYR_CREATED_BY")
	private String carabyrCreatedBy;
	@Column(name="CARABYR_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date carabyrCreatedDate;
	@Column(name="CARABYR_UPDATED_BY")
	private String carabyrUpdatedBy;
	@Column(name="CARABYR_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date carabyrUpdatedDate;
	@Column(name="CARABYR_SEQN")
	private Integer carabyrSeqn;
	@Column(name="CARABYR_DEFAULT")
	private String carabyrDefault;
	@Column(name="CARABYR_STATUS")
	private String carabyrStatus;
	
	public String getCarabyrId() {
		return carabyrId;
	}
	public void setCarabyrId(String carabyrId) {
		this.carabyrId = carabyrId;
	}
	public String getCarabyrDesc() {
		return carabyrDesc;
	}
	public void setCarabyrDesc(String carabyrDesc) {
		this.carabyrDesc = carabyrDesc;
	}
	public String getCarabyrCreatedBy() {
		return carabyrCreatedBy;
	}
	public void setCarabyrCreatedBy(String carabyrCreatedBy) {
		this.carabyrCreatedBy = carabyrCreatedBy;
	}
	public Date getCarabyrCreatedDate() {
		return carabyrCreatedDate;
	}
	public void setCarabyrCreatedDate(Date carabyrCreatedDate) {
		this.carabyrCreatedDate = carabyrCreatedDate;
	}
	public String getCarabyrUpdatedBy() {
		return carabyrUpdatedBy;
	}
	public void setCarabyrUpdatedBy(String carabyrUpdatedBy) {
		this.carabyrUpdatedBy = carabyrUpdatedBy;
	}
	public Date getCarabyrUpdatedDate() {
		return carabyrUpdatedDate;
	}
	public void setCarabyrUpdatedDate(Date carabyrUpdatedDate) {
		this.carabyrUpdatedDate = carabyrUpdatedDate;
	}
	public Integer getCarabyrSeqn() {
		return carabyrSeqn;
	}
	public void setCarabyrSeqn(Integer carabyrSeqn) {
		this.carabyrSeqn = carabyrSeqn;
	}
	public String getCarabyrDefault() {
		return carabyrDefault;
	}
	public void setCarabyrDefault(String carabyrDefault) {
		this.carabyrDefault = carabyrDefault;
	}
	public String getCarabyrStatus() {
		return carabyrStatus;
	}
	public void setCarabyrStatus(String carabyrStatus) {
		this.carabyrStatus = carabyrStatus;
	}
}
