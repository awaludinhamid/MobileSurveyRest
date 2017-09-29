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
@Table(name="CFIN_MST_PARAM_PROYEKSI",schema="CFIN")
public class CfinMstParamProyeksi implements Serializable {

	@Id
	@Column(name="PP_PARAM_ID")
	private Integer ppParamId;
	@Column(name="PP_PARAM_DESCRIPTION")
	private String ppParamDescription;
	@Column(name="PP_CREATED_BY")
	private String ppCreatedBy;
	@Column(name="PP_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ppCreatedDate;
	@Column(name="PP_UPDATED_BY")
	private String ppUpdatedBy;
	@Column(name="PP_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ppUpdatedDate;
	
	public Integer getPpParamId() {
		return ppParamId;
	}
	public void setPpParamId(Integer ppParamId) {
		this.ppParamId = ppParamId;
	}
	public String getPpParamDescription() {
		return ppParamDescription;
	}
	public void setPpParamDescription(String ppParamDescription) {
		this.ppParamDescription = ppParamDescription;
	}
	public String getPpCreatedBy() {
		return ppCreatedBy;
	}
	public void setPpCreatedBy(String ppCreatedBy) {
		this.ppCreatedBy = ppCreatedBy;
	}
	public Date getPpCreatedDate() {
		return ppCreatedDate;
	}
	public void setPpCreatedDate(Date ppCreatedDate) {
		this.ppCreatedDate = ppCreatedDate;
	}
	public String getPpUpdatedBy() {
		return ppUpdatedBy;
	}
	public void setPpUpdatedBy(String ppUpdatedBy) {
		this.ppUpdatedBy = ppUpdatedBy;
	}
	public Date getPpUpdatedDate() {
		return ppUpdatedDate;
	}
	public void setPpUpdatedDate(Date ppUpdatedDate) {
		this.ppUpdatedDate = ppUpdatedDate;
	}
}
