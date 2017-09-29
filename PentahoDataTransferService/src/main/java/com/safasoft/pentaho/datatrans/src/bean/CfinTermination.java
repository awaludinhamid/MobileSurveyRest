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
@Table(name="CFIN_TERMINATION",schema="CFIN")
public class CfinTermination implements Serializable {

  @Id
  @Column(name="TERM_MEMO_NO")
  private String termMemoNo;
  @Column(name="TERM_COYOUTLET_ID")
  private String termCoyoutletId;
  @Column(name="TERM_DATE")
  @Temporal(TemporalType.DATE)
  private Date termDate;
  @Column(name="TERM_TYPE")
  private String termType;
  @Column(name="TERM_CONTRACT_NO")
  private String termContractNo;
  @Column(name="TERM_STATUS")
  private String termStatus;
  @Column(name="TERM_DESC")
  private String termDesc;
  @Column(name="TERM_CREATED_BY")
  private String termCreatedBy;
  @Column(name="TERM_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date termCreatedDate;
  @Column(name="TERM_APPRCANCEL_BY")
  private String termApprcancelBy;
  @Column(name="TERM_APPRCANCEL_DATE")
  @Temporal(TemporalType.DATE)
  private Date termApprcancelDate;
  @Column(name="TERM_RECEIVED_DATE")
  @Temporal(TemporalType.DATE)
  private Date termReceivedDate;
  @Column(name="TERM_RECEIVED_NO")
  private String termReceivedNo;
  @Column(name="TERM_OVDANGS")
  private Integer termOvdangs;
  @Column(name="TERM_OVDANGS_PAID")
  private Integer termOvdangsPaid;
  @Column(name="TERM_OVDPEN")
  private Integer termOvdpen;
  @Column(name="TERM_OVDPEN_PAID")
  private Integer termOvdpenPaid;
  @Column(name="TERM_CURR_PKK")
  private Integer termCurrPkk;
  @Column(name="TERM_CURR_PKK_PAID")
  private Integer termCurrPkkPaid;
  @Column(name="TERM_TERMADMIN")
  private Integer termTermadmin;
  @Column(name="TERM_TERMADMIN_PAID")
  private Integer termTermadminPaid;
  @Column(name="TERM_OUTSCOLLFEE")
  private Integer termOutscollfee;
  @Column(name="TERM_OUTSCOLLFEE_PAID")
  private Integer termOutscollfeePaid;
  @Column(name="TERM_DANSOS")
  private Integer termDansos;
  @Column(name="TERM_DANSOS_PAID")
  private Integer termDansosPaid;
  @Column(name="TERM_BIAYA")
  private Integer termBiaya;
  @Column(name="TERM_BIAYA_PAID")
  private Integer termBiayaPaid;
  @Column(name="TERM_BNGBERJALAN")
  private Integer termBngberjalan;
  @Column(name="TERM_BNGBERJALAN_PAID")
  private Integer termBngberjalanPaid;
  @Column(name="TERM_WAIVED_INT")
  private Integer termWaivedInt;
  @Column(name="TERM_INST_NO")
  private Integer termInstNo;
  @Column(name="TERM_CURR_BUNGA")
  private Integer termCurrBunga;
  @Column(name="TERM_OVD_PKK")
  private Integer termOvdPkk;
  @Column(name="TERM_CONTCANCEL_FLAG")
  private String termContcancelFlag;
  @Column(name="TERM_UPDATED_BY")
  private String termUpdatedBy;
  @Column(name="TERM_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date termUpdatedDate;
  @Column(name="TERM_COUNT_RESENDMAIL")
  private Integer termCountResendmail;
  @Column(name="TERM_REV_REJ_REASON")
  private String termRevRejReason;
  @Column(name="TERM_STATUS_BPKB")
  private String termStatusBpkb;
  @Column(name="TERM_STATUS_PROYEKSI")
  private String termStatusProyeksi;
  @Column(name="TERM_STATUS_RI")
  private String termStatusRi;
  
	public String getTermMemoNo() {
		return termMemoNo;
	}
	public void setTermMemoNo(String termMemoNo) {
		this.termMemoNo = termMemoNo;
	}
	public String getTermCoyoutletId() {
		return termCoyoutletId;
	}
	public void setTermCoyoutletId(String termCoyoutletId) {
		this.termCoyoutletId = termCoyoutletId;
	}
	public Date getTermDate() {
		return termDate;
	}
	public void setTermDate(Date termDate) {
		this.termDate = termDate;
	}
	public String getTermType() {
		return termType;
	}
	public void setTermType(String termType) {
		this.termType = termType;
	}
	public String getTermContractNo() {
		return termContractNo;
	}
	public void setTermContractNo(String termContractNo) {
		this.termContractNo = termContractNo;
	}
	public String getTermStatus() {
		return termStatus;
	}
	public void setTermStatus(String termStatus) {
		this.termStatus = termStatus;
	}
	public String getTermDesc() {
		return termDesc;
	}
	public void setTermDesc(String termDesc) {
		this.termDesc = termDesc;
	}
	public String getTermCreatedBy() {
		return termCreatedBy;
	}
	public void setTermCreatedBy(String termCreatedBy) {
		this.termCreatedBy = termCreatedBy;
	}
	public Date getTermCreatedDate() {
		return termCreatedDate;
	}
	public void setTermCreatedDate(Date termCreatedDate) {
		this.termCreatedDate = termCreatedDate;
	}
	public String getTermApprcancelBy() {
		return termApprcancelBy;
	}
	public void setTermApprcancelBy(String termApprcancelBy) {
		this.termApprcancelBy = termApprcancelBy;
	}
	public Date getTermApprcancelDate() {
		return termApprcancelDate;
	}
	public void setTermApprcancelDate(Date termApprcancelDate) {
		this.termApprcancelDate = termApprcancelDate;
	}
	public Date getTermReceivedDate() {
		return termReceivedDate;
	}
	public void setTermReceivedDate(Date termReceivedDate) {
		this.termReceivedDate = termReceivedDate;
	}
	public String getTermReceivedNo() {
		return termReceivedNo;
	}
	public void setTermReceivedNo(String termReceivedNo) {
		this.termReceivedNo = termReceivedNo;
	}
	public Integer getTermOvdangs() {
		return termOvdangs;
	}
	public void setTermOvdangs(Integer termOvdangs) {
		this.termOvdangs = termOvdangs;
	}
	public Integer getTermOvdangsPaid() {
		return termOvdangsPaid;
	}
	public void setTermOvdangsPaid(Integer termOvdangsPaid) {
		this.termOvdangsPaid = termOvdangsPaid;
	}
	public Integer getTermOvdpen() {
		return termOvdpen;
	}
	public void setTermOvdpen(Integer termOvdpen) {
		this.termOvdpen = termOvdpen;
	}
	public Integer getTermOvdpenPaid() {
		return termOvdpenPaid;
	}
	public void setTermOvdpenPaid(Integer termOvdpenPaid) {
		this.termOvdpenPaid = termOvdpenPaid;
	}
	public Integer getTermCurrPkk() {
		return termCurrPkk;
	}
	public void setTermCurrPkk(Integer termCurrPkk) {
		this.termCurrPkk = termCurrPkk;
	}
	public Integer getTermCurrPkkPaid() {
		return termCurrPkkPaid;
	}
	public void setTermCurrPkkPaid(Integer termCurrPkkPaid) {
		this.termCurrPkkPaid = termCurrPkkPaid;
	}
	public Integer getTermTermadmin() {
		return termTermadmin;
	}
	public void setTermTermadmin(Integer termTermadmin) {
		this.termTermadmin = termTermadmin;
	}
	public Integer getTermTermadminPaid() {
		return termTermadminPaid;
	}
	public void setTermTermadminPaid(Integer termTermadminPaid) {
		this.termTermadminPaid = termTermadminPaid;
	}
	public Integer getTermOutscollfee() {
		return termOutscollfee;
	}
	public void setTermOutscollfee(Integer termOutscollfee) {
		this.termOutscollfee = termOutscollfee;
	}
	public Integer getTermOutscollfeePaid() {
		return termOutscollfeePaid;
	}
	public void setTermOutscollfeePaid(Integer termOutscollfeePaid) {
		this.termOutscollfeePaid = termOutscollfeePaid;
	}
	public Integer getTermDansos() {
		return termDansos;
	}
	public void setTermDansos(Integer termDansos) {
		this.termDansos = termDansos;
	}
	public Integer getTermDansosPaid() {
		return termDansosPaid;
	}
	public void setTermDansosPaid(Integer termDansosPaid) {
		this.termDansosPaid = termDansosPaid;
	}
	public Integer getTermBiaya() {
		return termBiaya;
	}
	public void setTermBiaya(Integer termBiaya) {
		this.termBiaya = termBiaya;
	}
	public Integer getTermBiayaPaid() {
		return termBiayaPaid;
	}
	public void setTermBiayaPaid(Integer termBiayaPaid) {
		this.termBiayaPaid = termBiayaPaid;
	}
	public Integer getTermBngberjalan() {
		return termBngberjalan;
	}
	public void setTermBngberjalan(Integer termBngberjalan) {
		this.termBngberjalan = termBngberjalan;
	}
	public Integer getTermBngberjalanPaid() {
		return termBngberjalanPaid;
	}
	public void setTermBngberjalanPaid(Integer termBngberjalanPaid) {
		this.termBngberjalanPaid = termBngberjalanPaid;
	}
	public Integer getTermWaivedInt() {
		return termWaivedInt;
	}
	public void setTermWaivedInt(Integer termWaivedInt) {
		this.termWaivedInt = termWaivedInt;
	}
	public Integer getTermInstNo() {
		return termInstNo;
	}
	public void setTermInstNo(Integer termInstNo) {
		this.termInstNo = termInstNo;
	}
	public Integer getTermCurrBunga() {
		return termCurrBunga;
	}
	public void setTermCurrBunga(Integer termCurrBunga) {
		this.termCurrBunga = termCurrBunga;
	}
	public Integer getTermOvdPkk() {
		return termOvdPkk;
	}
	public void setTermOvdPkk(Integer termOvdPkk) {
		this.termOvdPkk = termOvdPkk;
	}
	public String getTermContcancelFlag() {
		return termContcancelFlag;
	}
	public void setTermContcancelFlag(String termContcancelFlag) {
		this.termContcancelFlag = termContcancelFlag;
	}
	public String getTermUpdatedBy() {
		return termUpdatedBy;
	}
	public void setTermUpdatedBy(String termUpdatedBy) {
		this.termUpdatedBy = termUpdatedBy;
	}
	public Date getTermUpdatedDate() {
		return termUpdatedDate;
	}
	public void setTermUpdatedDate(Date termUpdatedDate) {
		this.termUpdatedDate = termUpdatedDate;
	}
	public Integer getTermCountResendmail() {
		return termCountResendmail;
	}
	public void setTermCountResendmail(Integer termCountResendmail) {
		this.termCountResendmail = termCountResendmail;
	}
	public String getTermRevRejReason() {
		return termRevRejReason;
	}
	public void setTermRevRejReason(String termRevRejReason) {
		this.termRevRejReason = termRevRejReason;
	}
	public String getTermStatusBpkb() {
		return termStatusBpkb;
	}
	public void setTermStatusBpkb(String termStatusBpkb) {
		this.termStatusBpkb = termStatusBpkb;
	}
	public String getTermStatusProyeksi() {
		return termStatusProyeksi;
	}
	public void setTermStatusProyeksi(String termStatusProyeksi) {
		this.termStatusProyeksi = termStatusProyeksi;
	}
	public String getTermStatusRi() {
		return termStatusRi;
	}
	public void setTermStatusRi(String termStatusRi) {
		this.termStatusRi = termStatusRi;
	}

}