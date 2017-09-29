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
@Table(name="APPL_MST_KECAMATAN",schema="APPL")
public class ApplMstKecamatan implements Serializable {

	@Id
	@Column(name="PROVINCE")
	private String province;
	@Id
	@Column(name="KABKOTA")
	private String kabkota;
	@Id
	@Column(name="NAMA_KEC")
	private String namaKec;
	@Column(name="SEQ")
	private Integer seq;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getKabkota() {
		return kabkota;
	}
	public void setKabkota(String kabkota) {
		this.kabkota = kabkota;
	}
	public String getNamaKec() {
		return namaKec;
	}
	public void setNamaKec(String namaKec) {
		this.namaKec = namaKec;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
