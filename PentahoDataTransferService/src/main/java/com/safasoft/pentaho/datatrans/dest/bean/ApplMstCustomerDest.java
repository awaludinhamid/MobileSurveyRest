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
@Table(name="APPL_MST_CUSTOMER")
public class ApplMstCustomerDest implements Serializable {

	@Id
	@Column(name="CUST_ID")
	private String custId;
	@Column(name="CUST_FULL_NAME")
	private String custFullName;
	@Column(name="CUST_ADDR")
	private String custAddr;
	@Column(name="CUST_ADDR_RT")
	private String custAddrRt;
	@Column(name="CUST_ADDR_RW")
	private String custAddrRw;
	@Column(name="CUST_ADDR_KEL")
	private String custAddrKel;
	@Column(name="CUST_ADDR_KEC")
	private String custAddrKec;
	@Column(name="CUST_ADDR_KABKOTA")
	private String custAddrKabkota;
	@Column(name="CUST_ADDR_PROV")
	private String custAddrProv;
	@Column(name="CUST_ADDR_ZIP")
	private String custAddrZip;
	@Column(name="CUST_TYPE")
	private String custType;
	@Column(name="CUST_FX1_AREA_PH")
	private String custFx1AreaPh;
	@Column(name="CUST_FX1_PHONE")
	private String custFx1Phone;
	@Column(name="CUST_TGH_ADDR")
	private String custTghAddr;
	@Column(name="CUST_TGH_RT")
	private String custTghRt;
	@Column(name="CUST_TGH_RW")
	private String custTghRw;
	@Column(name="CUST_TGH_KEL")
	private String custTghKel;
	@Column(name="CUST_TGH_KEC")
	private String custTghKec;
	@Column(name="CUST_TGH_KABKOTA")
	private String custTghKabkota;
	@Column(name="CUST_TGH_PROV")
	private String custTghProv;
	@Column(name="CUST_TGH_ZIP")
	private String custTghZip;
	@Column(name="CUST_SRT_ADDR")
	private String custSrtAddr;
	@Column(name="CUST_SRT_RT")
	private String custSrtRt;
	@Column(name="CUST_SRT_RW")
	private String custSrtRw;
	@Column(name="CUST_SRT_KEL")
	private String custSrtKel;
	@Column(name="CUST_SRT_KEC")
	private String custSrtKec;
	@Column(name="CUST_SRT_KABKOTA")
	private String custSrtKabkota;
	@Column(name="CUST_SRT_PROV")
	private String custSrtProv;
	@Column(name="CUST_SRT_ZIP")
	private String custSrtZip;
	@Column(name="CUST_NPWP_NO")
	private String custNpwpNo;
	@Column(name="CUST_NPWP_ADDR")
	private String custNpwpAddr;
	@Column(name="CUST_NPWP_RT")
	private String custNpwpRt;
	@Column(name="CUST_NPWP_RW")
	private String custNpwpRw;
	@Column(name="CUST_NPWP_KEL")
	private String custNpwpKel;
	@Column(name="CUST_NPWP_KEC")
	private String custNpwpKec;
	@Column(name="CUST_NPWP_KABKOTA")
	private String custNpwpKabkota;
	@Column(name="CUST_NPWP_PROV")
	private String custNpwpProv;
	@Column(name="CUST_NPWP_ZIP")
	private String custNpwpZip;
	@Column(name="CUST_CREATED_BY")
	private String custCreatedBy;
	@Column(name="CUST_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date custCreatedDate;
	@Column(name="CUST_UPDATED_BY")
	private String custUpdatedBy;
	@Column(name="CUST_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date custUpdatedDate;
	@Column(name="CUST_FAX_AREA_CODE")
	private String custFaxAreaCode;
	@Column(name="CUST_FAX_NO")
	private String custFaxNo;
	@Column(name="CUST_KTP")
	private String custKtp;
	@Column(name="CUST_TGH_SUBZIP")
	private String custTghSubzip;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustFullName() {
		return custFullName;
	}
	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getCustAddrRt() {
		return custAddrRt;
	}
	public void setCustAddrRt(String custAddrRt) {
		this.custAddrRt = custAddrRt;
	}
	public String getCustAddrRw() {
		return custAddrRw;
	}
	public void setCustAddrRw(String custAddrRw) {
		this.custAddrRw = custAddrRw;
	}
	public String getCustAddrKel() {
		return custAddrKel;
	}
	public void setCustAddrKel(String custAddrKel) {
		this.custAddrKel = custAddrKel;
	}
	public String getCustAddrKec() {
		return custAddrKec;
	}
	public void setCustAddrKec(String custAddrKec) {
		this.custAddrKec = custAddrKec;
	}
	public String getCustAddrKabkota() {
		return custAddrKabkota;
	}
	public void setCustAddrKabkota(String custAddrKabkota) {
		this.custAddrKabkota = custAddrKabkota;
	}
	public String getCustAddrProv() {
		return custAddrProv;
	}
	public void setCustAddrProv(String custAddrProv) {
		this.custAddrProv = custAddrProv;
	}
	public String getCustAddrZip() {
		return custAddrZip;
	}
	public void setCustAddrZip(String custAddrZip) {
		this.custAddrZip = custAddrZip;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCustFx1AreaPh() {
		return custFx1AreaPh;
	}
	public void setCustFx1AreaPh(String custFx1AreaPh) {
		this.custFx1AreaPh = custFx1AreaPh;
	}
	public String getCustFx1Phone() {
		return custFx1Phone;
	}
	public void setCustFx1Phone(String custFx1Phone) {
		this.custFx1Phone = custFx1Phone;
	}
	public String getCustTghAddr() {
		return custTghAddr;
	}
	public void setCustTghAddr(String custTghAddr) {
		this.custTghAddr = custTghAddr;
	}
	public String getCustTghRt() {
		return custTghRt;
	}
	public void setCustTghRt(String custTghRt) {
		this.custTghRt = custTghRt;
	}
	public String getCustTghRw() {
		return custTghRw;
	}
	public void setCustTghRw(String custTghRw) {
		this.custTghRw = custTghRw;
	}
	public String getCustTghKel() {
		return custTghKel;
	}
	public void setCustTghKel(String custTghKel) {
		this.custTghKel = custTghKel;
	}
	public String getCustTghKec() {
		return custTghKec;
	}
	public void setCustTghKec(String custTghKec) {
		this.custTghKec = custTghKec;
	}
	public String getCustTghKabkota() {
		return custTghKabkota;
	}
	public void setCustTghKabkota(String custTghKabkota) {
		this.custTghKabkota = custTghKabkota;
	}
	public String getCustTghProv() {
		return custTghProv;
	}
	public void setCustTghProv(String custTghProv) {
		this.custTghProv = custTghProv;
	}
	public String getCustTghZip() {
		return custTghZip;
	}
	public void setCustTghZip(String custTghZip) {
		this.custTghZip = custTghZip;
	}
	public String getCustSrtAddr() {
		return custSrtAddr;
	}
	public void setCustSrtAddr(String custSrtAddr) {
		this.custSrtAddr = custSrtAddr;
	}
	public String getCustSrtRt() {
		return custSrtRt;
	}
	public void setCustSrtRt(String custSrtRt) {
		this.custSrtRt = custSrtRt;
	}
	public String getCustSrtRw() {
		return custSrtRw;
	}
	public void setCustSrtRw(String custSrtRw) {
		this.custSrtRw = custSrtRw;
	}
	public String getCustSrtKel() {
		return custSrtKel;
	}
	public void setCustSrtKel(String custSrtKel) {
		this.custSrtKel = custSrtKel;
	}
	public String getCustSrtKec() {
		return custSrtKec;
	}
	public void setCustSrtKec(String custSrtKec) {
		this.custSrtKec = custSrtKec;
	}
	public String getCustSrtKabkota() {
		return custSrtKabkota;
	}
	public void setCustSrtKabkota(String custSrtKabkota) {
		this.custSrtKabkota = custSrtKabkota;
	}
	public String getCustSrtProv() {
		return custSrtProv;
	}
	public void setCustSrtProv(String custSrtProv) {
		this.custSrtProv = custSrtProv;
	}
	public String getCustSrtZip() {
		return custSrtZip;
	}
	public void setCustSrtZip(String custSrtZip) {
		this.custSrtZip = custSrtZip;
	}
	public String getCustNpwpNo() {
		return custNpwpNo;
	}
	public void setCustNpwpNo(String custNpwpNo) {
		this.custNpwpNo = custNpwpNo;
	}
	public String getCustNpwpAddr() {
		return custNpwpAddr;
	}
	public void setCustNpwpAddr(String custNpwpAddr) {
		this.custNpwpAddr = custNpwpAddr;
	}
	public String getCustNpwpRt() {
		return custNpwpRt;
	}
	public void setCustNpwpRt(String custNpwpRt) {
		this.custNpwpRt = custNpwpRt;
	}
	public String getCustNpwpRw() {
		return custNpwpRw;
	}
	public void setCustNpwpRw(String custNpwpRw) {
		this.custNpwpRw = custNpwpRw;
	}
	public String getCustNpwpKel() {
		return custNpwpKel;
	}
	public void setCustNpwpKel(String custNpwpKel) {
		this.custNpwpKel = custNpwpKel;
	}
	public String getCustNpwpKec() {
		return custNpwpKec;
	}
	public void setCustNpwpKec(String custNpwpKec) {
		this.custNpwpKec = custNpwpKec;
	}
	public String getCustNpwpKabkota() {
		return custNpwpKabkota;
	}
	public void setCustNpwpKabkota(String custNpwpKabkota) {
		this.custNpwpKabkota = custNpwpKabkota;
	}
	public String getCustNpwpProv() {
		return custNpwpProv;
	}
	public void setCustNpwpProv(String custNpwpProv) {
		this.custNpwpProv = custNpwpProv;
	}
	public String getCustNpwpZip() {
		return custNpwpZip;
	}
	public void setCustNpwpZip(String custNpwpZip) {
		this.custNpwpZip = custNpwpZip;
	}
	public String getCustCreatedBy() {
		return custCreatedBy;
	}
	public void setCustCreatedBy(String custCreatedBy) {
		this.custCreatedBy = custCreatedBy;
	}
	public Date getCustCreatedDate() {
		return custCreatedDate;
	}
	public void setCustCreatedDate(Date custCreatedDate) {
		this.custCreatedDate = custCreatedDate;
	}
	public String getCustUpdatedBy() {
		return custUpdatedBy;
	}
	public void setCustUpdatedBy(String custUpdatedBy) {
		this.custUpdatedBy = custUpdatedBy;
	}
	public Date getCustUpdatedDate() {
		return custUpdatedDate;
	}
	public void setCustUpdatedDate(Date custUpdatedDate) {
		this.custUpdatedDate = custUpdatedDate;
	}
	public String getCustFaxAreaCode() {
		return custFaxAreaCode;
	}
	public void setCustFaxAreaCode(String custFaxAreaCode) {
		this.custFaxAreaCode = custFaxAreaCode;
	}
	public String getCustFaxNo() {
		return custFaxNo;
	}
	public void setCustFaxNo(String custFaxNo) {
		this.custFaxNo = custFaxNo;
	}
	public String getCustKtp() {
		return custKtp;
	}
	public void setCustKtp(String custKtp) {
		this.custKtp = custKtp;
	}
	public String getCustTghSubzip() {
		return custTghSubzip;
	}
	public void setCustTghSubzip(String custTghSubzip) {
		this.custTghSubzip = custTghSubzip;
	}
}
