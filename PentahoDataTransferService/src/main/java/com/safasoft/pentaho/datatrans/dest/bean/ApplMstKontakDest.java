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
@Table(name="APPL_MST_KONTAK")
public class ApplMstKontakDest implements Serializable {

	@Id
	@Column(name="KONTAK_ID")
	private String kontakId;
	@Column(name="KONTAK_DESC")
	private String kontakDesc;
	@Column(name="KONTAK_CREATED_BY")
	private String kontakCreatedBy;
	@Column(name="KONTAK_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date kontakCreatedDate;
	@Column(name="KONTAK_SEQ")
	private Integer kontakSeq;
	@Column(name="KONTAK_UPDATED_BY")
	private String kontakUpdatedBy;
	@Column(name="KONTAK_UPDATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date kontakUpdateDate;
	
	public String getKontakId() {
		return kontakId;
	}
	public void setKontakId(String kontakId) {
		this.kontakId = kontakId;
	}
	public String getKontakDesc() {
		return kontakDesc;
	}
	public void setKontakDesc(String kontakDesc) {
		this.kontakDesc = kontakDesc;
	}
	public String getKontakCreatedBy() {
		return kontakCreatedBy;
	}
	public void setKontakCreatedBy(String kontakCreatedBy) {
		this.kontakCreatedBy = kontakCreatedBy;
	}
	public Date getKontakCreatedDate() {
		return kontakCreatedDate;
	}
	public void setKontakCreatedDate(Date kontakCreatedDate) {
		this.kontakCreatedDate = kontakCreatedDate;
	}
	public Integer getKontakSeq() {
		return kontakSeq;
	}
	public void setKontakSeq(Integer kontakSeq) {
		this.kontakSeq = kontakSeq;
	}
	public String getKontakUpdatedBy() {
		return kontakUpdatedBy;
	}
	public void setKontakUpdatedBy(String kontakUpdatedBy) {
		this.kontakUpdatedBy = kontakUpdatedBy;
	}
	public Date getKontakUpdateDate() {
		return kontakUpdateDate;
	}
	public void setKontakUpdateDate(Date kontakUpdateDate) {
		this.kontakUpdateDate = kontakUpdateDate;
	}
}
