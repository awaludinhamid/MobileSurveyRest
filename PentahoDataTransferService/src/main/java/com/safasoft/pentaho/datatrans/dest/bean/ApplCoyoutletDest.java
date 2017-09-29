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
@Table(name="APPL_COYOUTLET")
public class ApplCoyoutletDest implements Serializable {

	@Id
	@Column(name="COYOUTLET_ID")
	private String coyoutletId;
	@Column(name="COYOUTLET_NAME")
	private String coyoutletName;
	@Column(name="COYOUTLET_STREET")
	private String coyoutletStreet;
	@Column(name="COYOUTLET_KEL")
	private String coyoutletKel;
	@Column(name="COYOUTLET_KEC")
	private String coyoutletKec;
	@Column(name="COYOUTLET_KABKOTA")
	private String coyoutletKabkota;
	@Column(name="COYOUTLET_KODEPOS")
	private String coyoutletKodepos;
	@Column(name="COYOUTLET_PROV")
	private String coyoutletProv;
	@Column(name="COYOUTLET_CREATED_BY")
	private String coyoutletCreatedBy;
	@Column(name="COYOUTLET_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date coyoutletCreatedDate;
	@Column(name="COYOUTLET_UPDATED_BY")
	private String coyoutletUpdatedBy;
	@Column(name="COYOUTLET_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date coyoutletUpdatedDate;
	@Column(name="COYOUTLET_BRHEAD_ID")
	private String coyoutletBrheadId;
	@Column(name="COYOUTLET_CRHEAD_ID")
	private String coyoutletCrheadId;
	@Column(name="COYOUTLET_COLHEAD_ID")
	private String coyoutletColheadId;
	@Column(name="COYOUTLET_TYPE")
	private String coyoutletType;
	@Column(name="COYOUTLET_AREA_ID")
	private String coyoutletAreaId;
	@Column(name="COYOUTLET_BRANCH")
	private String coyoutletBranch;
	@Column(name="COYOUTLET_STATUS")
	private String coyoutletStatus;
	@Column(name="COYOUTLET_GLPARENT")
	private String coyoutletGlParent;
	@Column(name="COYOUTLET_ID_WILAYAH")
	private String coyoutletIdWilayah;
	@Column(name="COYOUTLET_NICK_NAME")
	private String coyoutletNickName;
	@Column(name="COYOUTLET_PART")
	private Integer coyoutletPart;
	@Column(name="COYOUTLET_TYPE_ULT")
	private String coyoutletTypeUlt;
	@Column(name="COYOUTLET_SUB_ID_WILAYAH")
	private String coyoutletSubIdWilayah;
	
	public String getCoyoutletId() {
		return coyoutletId;
	}
	public void setCoyoutletId(String coyoutletId) {
		this.coyoutletId = coyoutletId;
	}
	public String getCoyoutletName() {
		return coyoutletName;
	}
	public void setCoyoutletName(String coyoutletName) {
		this.coyoutletName = coyoutletName;
	}
	public String getCoyoutletStreet() {
		return coyoutletStreet;
	}
	public void setCoyoutletStreet(String coyoutletStreet) {
		this.coyoutletStreet = coyoutletStreet;
	}
	public String getCoyoutletKel() {
		return coyoutletKel;
	}
	public void setCoyoutletKel(String coyoutletKel) {
		this.coyoutletKel = coyoutletKel;
	}
	public String getCoyoutletKec() {
		return coyoutletKec;
	}
	public void setCoyoutletKec(String coyoutletKec) {
		this.coyoutletKec = coyoutletKec;
	}
	public String getCoyoutletKabkota() {
		return coyoutletKabkota;
	}
	public void setCoyoutletKabkota(String coyoutletKabkota) {
		this.coyoutletKabkota = coyoutletKabkota;
	}
	public String getCoyoutletKodepos() {
		return coyoutletKodepos;
	}
	public void setCoyoutletKodepos(String coyoutletKodepos) {
		this.coyoutletKodepos = coyoutletKodepos;
	}
	public String getCoyoutletProv() {
		return coyoutletProv;
	}
	public void setCoyoutletProv(String coyoutletProv) {
		this.coyoutletProv = coyoutletProv;
	}
	public String getCoyoutletCreatedBy() {
		return coyoutletCreatedBy;
	}
	public void setCoyoutletCreatedBy(String coyoutletCreatedBy) {
		this.coyoutletCreatedBy = coyoutletCreatedBy;
	}
	public Date getCoyoutletCreatedDate() {
		return coyoutletCreatedDate;
	}
	public void setCoyoutletCreatedDate(Date coyoutletCreatedDate) {
		this.coyoutletCreatedDate = coyoutletCreatedDate;
	}
	public String getCoyoutletUpdatedBy() {
		return coyoutletUpdatedBy;
	}
	public void setCoyoutletUpdatedBy(String coyoutletUpdatedBy) {
		this.coyoutletUpdatedBy = coyoutletUpdatedBy;
	}
	public Date getCoyoutletUpdatedDate() {
		return coyoutletUpdatedDate;
	}
	public void setCoyoutletUpdatedDate(Date coyoutletUpdatedDate) {
		this.coyoutletUpdatedDate = coyoutletUpdatedDate;
	}
	public String getCoyoutletBrheadId() {
		return coyoutletBrheadId;
	}
	public void setCoyoutletBrheadId(String coyoutletBrheadId) {
		this.coyoutletBrheadId = coyoutletBrheadId;
	}
	public String getCoyoutletCrheadId() {
		return coyoutletCrheadId;
	}
	public void setCoyoutletCrheadId(String coyoutletCrheadId) {
		this.coyoutletCrheadId = coyoutletCrheadId;
	}
	public String getCoyoutletColheadId() {
		return coyoutletColheadId;
	}
	public void setCoyoutletColheadId(String coyoutletColheadId) {
		this.coyoutletColheadId = coyoutletColheadId;
	}
	public String getCoyoutletType() {
		return coyoutletType;
	}
	public void setCoyoutletType(String coyoutletType) {
		this.coyoutletType = coyoutletType;
	}
	public String getCoyoutletAreaId() {
		return coyoutletAreaId;
	}
	public void setCoyoutletAreaId(String coyoutletAreaId) {
		this.coyoutletAreaId = coyoutletAreaId;
	}
	public String getCoyoutletBranch() {
		return coyoutletBranch;
	}
	public void setCoyoutletBranch(String coyoutletBranch) {
		this.coyoutletBranch = coyoutletBranch;
	}
	public String getCoyoutletStatus() {
		return coyoutletStatus;
	}
	public void setCoyoutletStatus(String coyoutletStatus) {
		this.coyoutletStatus = coyoutletStatus;
	}
	public String getCoyoutletGlParent() {
		return coyoutletGlParent;
	}
	public void setCoyoutletGlParent(String coyoutletGlParent) {
		this.coyoutletGlParent = coyoutletGlParent;
	}
	public String getCoyoutletIdWilayah() {
		return coyoutletIdWilayah;
	}
	public void setCoyoutletIdWilayah(String coyoutletIdWilayah) {
		this.coyoutletIdWilayah = coyoutletIdWilayah;
	}
	public String getCoyoutletNickName() {
		return coyoutletNickName;
	}
	public void setCoyoutletNickName(String coyoutletNickName) {
		this.coyoutletNickName = coyoutletNickName;
	}
	public Integer getCoyoutletPart() {
		return coyoutletPart;
	}
	public void setCoyoutletPart(Integer coyoutletPart) {
		this.coyoutletPart = coyoutletPart;
	}
	public String getCoyoutletTypeUlt() {
		return coyoutletTypeUlt;
	}
	public void setCoyoutletTypeUlt(String coyoutletTypeUlt) {
		this.coyoutletTypeUlt = coyoutletTypeUlt;
	}
	public String getCoyoutletSubIdWilayah() {
		return coyoutletSubIdWilayah;
	}
	public void setCoyoutletSubIdWilayah(String coyoutletSubIdWilayah) {
		this.coyoutletSubIdWilayah = coyoutletSubIdWilayah;
	}
}
