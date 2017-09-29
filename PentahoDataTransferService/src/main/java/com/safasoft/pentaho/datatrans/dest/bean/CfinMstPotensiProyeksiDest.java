package com.safasoft.pentaho.datatrans.dest.bean;

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
@Table(name="CFIN_MST_POTENSI_PROYEKSI")
public class CfinMstPotensiProyeksiDest implements Serializable {

	@Id
	@Column(name="POP_POTENSI_ID")
	private Integer popPotensiId;
	@Column(name="POP_POTENSI_DESCRIPTION")
	private String popPotensiDescription;
	@Column(name="POP_CREATED_BY")
	private String popCreatedBy;
	@Column(name="POP_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date popCreatedDate;
	@Column(name="POP_UPDATED_BY")
	private String popUpdatedBy;
	@Column(name="POP_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date popUpdatedDate;
	
	public Integer getPopPotensiId() {
		return popPotensiId;
	}
	public void setPopPotensiId(Integer popPotensiId) {
		this.popPotensiId = popPotensiId;
	}
	public String getPopPotensiDescription() {
		return popPotensiDescription;
	}
	public void setPopPotensiDescription(String popPotensiDescription) {
		this.popPotensiDescription = popPotensiDescription;
	}
	public String getPopCreatedBy() {
		return popCreatedBy;
	}
	public void setPopCreatedBy(String popCreatedBy) {
		this.popCreatedBy = popCreatedBy;
	}
	public Date getPopCreatedDate() {
		return popCreatedDate;
	}
	public void setPopCreatedDate(Date popCreatedDate) {
		this.popCreatedDate = popCreatedDate;
	}
	public String getPopUpdatedBy() {
		return popUpdatedBy;
	}
	public void setPopUpdatedBy(String popUpdatedBy) {
		this.popUpdatedBy = popUpdatedBy;
	}
	public Date getPopUpdatedDate() {
		return popUpdatedDate;
	}
	public void setPopUpdatedDate(Date popUpdatedDate) {
		this.popUpdatedDate = popUpdatedDate;
	}
}
