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
@Table(name="CFIN_TRN_RI_LKRI_DTL",schema="CFIN")
public class CfinTrnRiLkriDtl implements Serializable {

  @Id
  @Column(name="LKRIDTL_NO")
  private String lkridtlNo;
  @Id
  @Column(name="LKRIDTL_CONT_NO")
  private String lkridtlContNo;
  @Column(name="LKRIDTL_COLL_ID")
  private Double lkridtlCollId;
  @Column(name="LKRIDTL_OUTS_BNG")
  private Double lkridtlOutsBng;
  @Column(name="LKRIDTL_OUTS_PKK")
  private Double lkridtlOutsPkk;
  @Column(name="LKRIDTL_OUTS_ADM")
  private Double lkridtlOutsAdm;
  @Column(name="LKRIDTL_OUTS_OTHERS")
  private Double lkridtlOutsOthers;
  @Column(name="LKRIDTL_OUTS_BNG_PAID")
  private Double lkridtlOutsBngPaid;
  @Column(name="LKRIDTL_OUTS_PKK_PAID")
  private Double lkridtlOutsPkkPaid;
  @Column(name="LKRIDTL_OUTS_ADM_PAID")
  private Double lkridtlOutsAdmPaid;
  @Column(name="LKRIDTL_OUTS_OTHERS_PAID")
  private Double lkridtlOutsOthersPaid;
  @Column(name="LKRIDTL_CUST_PAID")
  private Double lkridtlCustPaid;
  @Column(name="LKRIDTL_FLAG_PARAM")
  private String lkridtlFlagParam;
  @Column(name="LKRIDTL_MEET_CODE")
  private Double lkridtlMeetCode;
  @Column(name="LKRIDTL_UNIT_INFO")
  private String lkridtlUnitInfo;
  @Column(name="LKRIDTL_PROMISE_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkridtlPromiseDate;
  @Column(name="LKRIDTL_PROMISE_AMOUNT")
  private Double lkridtlPromiseAmount;
  @Column(name="LKRIDTL_COMMENT")
  private String lkridtlComment;
  @Column(name="LKRIDTL_CREATED_BY")
  private String lkridtlCreatedBy;
  @Column(name="LKRIDTL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkridtlCreatedDate;
  @Column(name="LKRIDTL_UPDATED_BY")
  private String lkridtlUpdatedBy;
  @Column(name="LKRIDTL_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkridtlUpdatedDate;
  @Column(name="LKRIDTL_STAT_PROSES")
  private Double lkridtlStatProses;
  @Column(name="LKRIDTL_FLAG_CODE")
  private String lkridtlFlagCode;
  
	public String getLkridtlNo() {
		return lkridtlNo;
	}
	public void setLkridtlNo(String lkridtlNo) {
		this.lkridtlNo = lkridtlNo;
	}
	public String getLkridtlContNo() {
		return lkridtlContNo;
	}
	public void setLkridtlContNo(String lkridtlContNo) {
		this.lkridtlContNo = lkridtlContNo;
	}
	public Double getLkridtlCollId() {
		return lkridtlCollId;
	}
	public void setLkridtlCollId(Double lkridtlCollId) {
		this.lkridtlCollId = lkridtlCollId;
	}
	public Double getLkridtlOutsBng() {
		return lkridtlOutsBng;
	}
	public void setLkridtlOutsBng(Double lkridtlOutsBng) {
		this.lkridtlOutsBng = lkridtlOutsBng;
	}
	public Double getLkridtlOutsPkk() {
		return lkridtlOutsPkk;
	}
	public void setLkridtlOutsPkk(Double lkridtlOutsPkk) {
		this.lkridtlOutsPkk = lkridtlOutsPkk;
	}
	public Double getLkridtlOutsAdm() {
		return lkridtlOutsAdm;
	}
	public void setLkridtlOutsAdm(Double lkridtlOutsAdm) {
		this.lkridtlOutsAdm = lkridtlOutsAdm;
	}
	public Double getLkridtlOutsOthers() {
		return lkridtlOutsOthers;
	}
	public void setLkridtlOutsOthers(Double lkridtlOutsOthers) {
		this.lkridtlOutsOthers = lkridtlOutsOthers;
	}
	public Double getLkridtlOutsBngPaid() {
		return lkridtlOutsBngPaid;
	}
	public void setLkridtlOutsBngPaid(Double lkridtlOutsBngPaid) {
		this.lkridtlOutsBngPaid = lkridtlOutsBngPaid;
	}
	public Double getLkridtlOutsPkkPaid() {
		return lkridtlOutsPkkPaid;
	}
	public void setLkridtlOutsPkkPaid(Double lkridtlOutsPkkPaid) {
		this.lkridtlOutsPkkPaid = lkridtlOutsPkkPaid;
	}
	public Double getLkridtlOutsAdmPaid() {
		return lkridtlOutsAdmPaid;
	}
	public void setLkridtlOutsAdmPaid(Double lkridtlOutsAdmPaid) {
		this.lkridtlOutsAdmPaid = lkridtlOutsAdmPaid;
	}
	public Double getLkridtlOutsOthersPaid() {
		return lkridtlOutsOthersPaid;
	}
	public void setLkridtlOutsOthersPaid(Double lkridtlOutsOthersPaid) {
		this.lkridtlOutsOthersPaid = lkridtlOutsOthersPaid;
	}
	public Double getLkridtlCustPaid() {
		return lkridtlCustPaid;
	}
	public void setLkridtlCustPaid(Double lkridtlCustPaid) {
		this.lkridtlCustPaid = lkridtlCustPaid;
	}
	public String getLkridtlFlagParam() {
		return lkridtlFlagParam;
	}
	public void setLkridtlFlagParam(String lkridtlFlagParam) {
		this.lkridtlFlagParam = lkridtlFlagParam;
	}
	public Double getLkridtlMeetCode() {
		return lkridtlMeetCode;
	}
	public void setLkridtlMeetCode(Double lkridtlMeetCode) {
		this.lkridtlMeetCode = lkridtlMeetCode;
	}
	public String getLkridtlUnitInfo() {
		return lkridtlUnitInfo;
	}
	public void setLkridtlUnitInfo(String lkridtlUnitInfo) {
		this.lkridtlUnitInfo = lkridtlUnitInfo;
	}
	public Date getLkridtlPromiseDate() {
		return lkridtlPromiseDate;
	}
	public void setLkridtlPromiseDate(Date lkridtlPromiseDate) {
		this.lkridtlPromiseDate = lkridtlPromiseDate;
	}
	public Double getLkridtlPromiseAmount() {
		return lkridtlPromiseAmount;
	}
	public void setLkridtlPromiseAmount(Double lkridtlPromiseAmount) {
		this.lkridtlPromiseAmount = lkridtlPromiseAmount;
	}
	public String getLkridtlComment() {
		return lkridtlComment;
	}
	public void setLkridtlComment(String lkridtlComment) {
		this.lkridtlComment = lkridtlComment;
	}
	public String getLkridtlCreatedBy() {
		return lkridtlCreatedBy;
	}
	public void setLkridtlCreatedBy(String lkridtlCreatedBy) {
		this.lkridtlCreatedBy = lkridtlCreatedBy;
	}
	public Date getLkridtlCreatedDate() {
		return lkridtlCreatedDate;
	}
	public void setLkridtlCreatedDate(Date lkridtlCreatedDate) {
		this.lkridtlCreatedDate = lkridtlCreatedDate;
	}
	public String getLkridtlUpdatedBy() {
		return lkridtlUpdatedBy;
	}
	public void setLkridtlUpdatedBy(String lkridtlUpdatedBy) {
		this.lkridtlUpdatedBy = lkridtlUpdatedBy;
	}
	public Date getLkridtlUpdatedDate() {
		return lkridtlUpdatedDate;
	}
	public void setLkridtlUpdatedDate(Date lkridtlUpdatedDate) {
		this.lkridtlUpdatedDate = lkridtlUpdatedDate;
	}
	public Double getLkridtlStatProses() {
		return lkridtlStatProses;
	}
	public void setLkridtlStatProses(Double lkridtlStatProses) {
		this.lkridtlStatProses = lkridtlStatProses;
	}
	public String getLkridtlFlagCode() {
		return lkridtlFlagCode;
	}
	public void setLkridtlFlagCode(String lkridtlFlagCode) {
		this.lkridtlFlagCode = lkridtlFlagCode;
	}

}