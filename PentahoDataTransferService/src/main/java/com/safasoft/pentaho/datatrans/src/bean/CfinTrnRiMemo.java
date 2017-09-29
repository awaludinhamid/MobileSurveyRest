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
@Table(name="CFIN_TRN_RI_MEMO",schema="CFIN")
public class CfinTrnRiMemo implements Serializable {

  @Id
  @Column(name="TRNRI_MEMO_NO")
  private String trnriMemoNo;
  @Column(name="TRNRI_OUTLET_ID")
  private String trnriOutletId;
  @Column(name="TRNRI_DATE")
  @Temporal(TemporalType.DATE)
  private Date trnriDate;
  @Column(name="TRNRI_STATUS")
  private String trnriStatus;
  @Column(name="TRNRI_CONTRACT_NO")
  private String trnriContractNo;
  @Column(name="TRNRI_APPRV_BY")
  private String trnriApprvBy;
  @Column(name="TRNRI_APPRV_DATE")
  @Temporal(TemporalType.DATE)
  private Date trnriApprvDate;
  @Column(name="TRNRI_CREATED_BY")
  private String trnriCreatedBy;
  @Column(name="TRNRI_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date trnriCreatedDate;
  @Column(name="TRNRI_UPDATED_BY")
  private String trnriUpdatedBy;
  @Column(name="TRNRI_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date trnriUpdatedDate;
  @Column(name="TRNRI_PKK_PEMBIAYAAN")
  private Double trnriPkkPembiayaan;
  @Column(name="TRNRI_TOTL_ADM")
  private Double trnriTotlAdm;
  @Column(name="TRNRI_PKK_HUTANG")
  private Double trnriPkkHutang;
  @Column(name="TRNRI_BNG_OR_MARGIN")
  private Double trnriBngOrMargin;
  @Column(name="TRNRI_TENOR")
  private Double trnriTenor;
  @Column(name="TRNRI_TYPE_ANGS")
  private String trnriTypeAngs;
  @Column(name="TRNRI_ANGS_PERBLN")
  private Double trnriAngsPerbln;
  @Column(name="TRNRI_OVD_ANGS_KE")
  private Double trnriOvdAngsKe;
  @Column(name="TRNRI_CYCLE_AWAL")
  private String trnriCycleAwal;
  @Column(name="TRNRI_LAMA_OVD")
  private Double trnriLamaOvd;
  @Column(name="TRNRI_OUTS_PRIN_BEF_PK")
  private Double trnriOutsPrinBefPk;
  @Column(name="TRNRI_OUTS_INT_BEF_PK")
  private Double trnriOutsIntBefPk;
  @Column(name="TRNRI_OVDPEN_BEF_PK")
  private Double trnriOvdpenBefPk;
  @Column(name="TRNRI_TOTAL_PAID_PK")
  private Double trnriTotalPaidPk;
  @Column(name="TRNRI_PRIN_AMT_PAID")
  private Double trnriPrinAmtPaid;
  @Column(name="TRNRI_INTR_AMT_PAID")
  private Double trnriIntrAmtPaid;
  @Column(name="TRNRI_PEN_AMT_PAID")
  private Double trnriPenAmtPaid;
  @Column(name="TRNRI_TERMADMIN_PAID")
  private Double trnriTermadminPaid;
  @Column(name="TRNRI_PAID_AFT_PK")
  private Double trnriPaidAftPk;
  @Column(name="TRNRI_OUTS_PRIN_AFT_PK")
  private Double trnriOutsPrinAftPk;
  @Column(name="TRNRI_OUTS_INT_AFT_PK")
  private Double trnriOutsIntAftPk;
  @Column(name="TRNRI_TERMADMIN")
  private Double trnriTermadmin;
  @Column(name="TRNRI_AMOUNT_MUST_BE_PK")
  private Double trnriAmountMustBePk;
  @Column(name="TRNRI_AMOUNT_RECEIVED")
  private Double trnriAmountReceived;
  @Column(name="TRNRI_AMOUNT_PLAN_PAID")
  private Double trnriAmountPlanPaid;
  @Column(name="TRNRI_BPKB")
  private String trnriBpkb;
  @Column(name="TRNRI_SISA_OSPOK")
  private Double trnriSisaOspok;
  @Column(name="TRNRI_DESC_HISTORY_PK")
  private String trnriDescHistoryPk;
  @Column(name="TRNRI_MEET_CODE")
  private Double trnriMeetCode;
  @Column(name="TRNRI_UNIT_INFO")
  private String trnriUnitInfo;
  @Column(name="TRNRI_PROMISE_PAID_DATE")
  @Temporal(TemporalType.DATE)
  private Date trnriPromisePaidDate;
  @Column(name="TRNRI_AMOUNT_PAID")
  private Double trnriAmountPaid;
  @Column(name="TRNRI_CURRENT_HISTORY")
  private String trnriCurrentHistory;
  @Column(name="TRNRI_REV_REJ_REASON")
  private String trnriRevRejReason;
  @Column(name="TRNRI_OUTS_PEN_AFT_PK")
  private Double trnriOutsPenAftPk;
  
	public String getTrnriMemoNo() {
		return trnriMemoNo;
	}
	public void setTrnriMemoNo(String trnriMemoNo) {
		this.trnriMemoNo = trnriMemoNo;
	}
	public String getTrnriOutletId() {
		return trnriOutletId;
	}
	public void setTrnriOutletId(String trnriOutletId) {
		this.trnriOutletId = trnriOutletId;
	}
	public Date getTrnriDate() {
		return trnriDate;
	}
	public void setTrnriDate(Date trnriDate) {
		this.trnriDate = trnriDate;
	}
	public String getTrnriStatus() {
		return trnriStatus;
	}
	public void setTrnriStatus(String trnriStatus) {
		this.trnriStatus = trnriStatus;
	}
	public String getTrnriContractNo() {
		return trnriContractNo;
	}
	public void setTrnriContractNo(String trnriContractNo) {
		this.trnriContractNo = trnriContractNo;
	}
	public String getTrnriApprvBy() {
		return trnriApprvBy;
	}
	public void setTrnriApprvBy(String trnriApprvBy) {
		this.trnriApprvBy = trnriApprvBy;
	}
	public Date getTrnriApprvDate() {
		return trnriApprvDate;
	}
	public void setTrnriApprvDate(Date trnriApprvDate) {
		this.trnriApprvDate = trnriApprvDate;
	}
	public String getTrnriCreatedBy() {
		return trnriCreatedBy;
	}
	public void setTrnriCreatedBy(String trnriCreatedBy) {
		this.trnriCreatedBy = trnriCreatedBy;
	}
	public Date getTrnriCreatedDate() {
		return trnriCreatedDate;
	}
	public void setTrnriCreatedDate(Date trnriCreatedDate) {
		this.trnriCreatedDate = trnriCreatedDate;
	}
	public String getTrnriUpdatedBy() {
		return trnriUpdatedBy;
	}
	public void setTrnriUpdatedBy(String trnriUpdatedBy) {
		this.trnriUpdatedBy = trnriUpdatedBy;
	}
	public Date getTrnriUpdatedDate() {
		return trnriUpdatedDate;
	}
	public void setTrnriUpdatedDate(Date trnriUpdatedDate) {
		this.trnriUpdatedDate = trnriUpdatedDate;
	}
	public Double getTrnriPkkPembiayaan() {
		return trnriPkkPembiayaan;
	}
	public void setTrnriPkkPembiayaan(Double trnriPkkPembiayaan) {
		this.trnriPkkPembiayaan = trnriPkkPembiayaan;
	}
	public Double getTrnriTotlAdm() {
		return trnriTotlAdm;
	}
	public void setTrnriTotlAdm(Double trnriTotlAdm) {
		this.trnriTotlAdm = trnriTotlAdm;
	}
	public Double getTrnriPkkHutang() {
		return trnriPkkHutang;
	}
	public void setTrnriPkkHutang(Double trnriPkkHutang) {
		this.trnriPkkHutang = trnriPkkHutang;
	}
	public Double getTrnriBngOrMargin() {
		return trnriBngOrMargin;
	}
	public void setTrnriBngOrMargin(Double trnriBngOrMargin) {
		this.trnriBngOrMargin = trnriBngOrMargin;
	}
	public Double getTrnriTenor() {
		return trnriTenor;
	}
	public void setTrnriTenor(Double trnriTenor) {
		this.trnriTenor = trnriTenor;
	}
	public String getTrnriTypeAngs() {
		return trnriTypeAngs;
	}
	public void setTrnriTypeAngs(String trnriTypeAngs) {
		this.trnriTypeAngs = trnriTypeAngs;
	}
	public Double getTrnriAngsPerbln() {
		return trnriAngsPerbln;
	}
	public void setTrnriAngsPerbln(Double trnriAngsPerbln) {
		this.trnriAngsPerbln = trnriAngsPerbln;
	}
	public Double getTrnriOvdAngsKe() {
		return trnriOvdAngsKe;
	}
	public void setTrnriOvdAngsKe(Double trnriOvdAngsKe) {
		this.trnriOvdAngsKe = trnriOvdAngsKe;
	}
	public String getTrnriCycleAwal() {
		return trnriCycleAwal;
	}
	public void setTrnriCycleAwal(String trnriCycleAwal) {
		this.trnriCycleAwal = trnriCycleAwal;
	}
	public Double getTrnriLamaOvd() {
		return trnriLamaOvd;
	}
	public void setTrnriLamaOvd(Double trnriLamaOvd) {
		this.trnriLamaOvd = trnriLamaOvd;
	}
	public Double getTrnriOutsPrinBefPk() {
		return trnriOutsPrinBefPk;
	}
	public void setTrnriOutsPrinBefPk(Double trnriOutsPrinBefPk) {
		this.trnriOutsPrinBefPk = trnriOutsPrinBefPk;
	}
	public Double getTrnriOutsIntBefPk() {
		return trnriOutsIntBefPk;
	}
	public void setTrnriOutsIntBefPk(Double trnriOutsIntBefPk) {
		this.trnriOutsIntBefPk = trnriOutsIntBefPk;
	}
	public Double getTrnriOvdpenBefPk() {
		return trnriOvdpenBefPk;
	}
	public void setTrnriOvdpenBefPk(Double trnriOvdpenBefPk) {
		this.trnriOvdpenBefPk = trnriOvdpenBefPk;
	}
	public Double getTrnriTotalPaidPk() {
		return trnriTotalPaidPk;
	}
	public void setTrnriTotalPaidPk(Double trnriTotalPaidPk) {
		this.trnriTotalPaidPk = trnriTotalPaidPk;
	}
	public Double getTrnriPrinAmtPaid() {
		return trnriPrinAmtPaid;
	}
	public void setTrnriPrinAmtPaid(Double trnriPrinAmtPaid) {
		this.trnriPrinAmtPaid = trnriPrinAmtPaid;
	}
	public Double getTrnriIntrAmtPaid() {
		return trnriIntrAmtPaid;
	}
	public void setTrnriIntrAmtPaid(Double trnriIntrAmtPaid) {
		this.trnriIntrAmtPaid = trnriIntrAmtPaid;
	}
	public Double getTrnriPenAmtPaid() {
		return trnriPenAmtPaid;
	}
	public void setTrnriPenAmtPaid(Double trnriPenAmtPaid) {
		this.trnriPenAmtPaid = trnriPenAmtPaid;
	}
	public Double getTrnriTermadminPaid() {
		return trnriTermadminPaid;
	}
	public void setTrnriTermadminPaid(Double trnriTermadminPaid) {
		this.trnriTermadminPaid = trnriTermadminPaid;
	}
	public Double getTrnriPaidAftPk() {
		return trnriPaidAftPk;
	}
	public void setTrnriPaidAftPk(Double trnriPaidAftPk) {
		this.trnriPaidAftPk = trnriPaidAftPk;
	}
	public Double getTrnriOutsPrinAftPk() {
		return trnriOutsPrinAftPk;
	}
	public void setTrnriOutsPrinAftPk(Double trnriOutsPrinAftPk) {
		this.trnriOutsPrinAftPk = trnriOutsPrinAftPk;
	}
	public Double getTrnriOutsIntAftPk() {
		return trnriOutsIntAftPk;
	}
	public void setTrnriOutsIntAftPk(Double trnriOutsIntAftPk) {
		this.trnriOutsIntAftPk = trnriOutsIntAftPk;
	}
	public Double getTrnriTermadmin() {
		return trnriTermadmin;
	}
	public void setTrnriTermadmin(Double trnriTermadmin) {
		this.trnriTermadmin = trnriTermadmin;
	}
	public Double getTrnriAmountMustBePk() {
		return trnriAmountMustBePk;
	}
	public void setTrnriAmountMustBePk(Double trnriAmountMustBePk) {
		this.trnriAmountMustBePk = trnriAmountMustBePk;
	}
	public Double getTrnriAmountReceived() {
		return trnriAmountReceived;
	}
	public void setTrnriAmountReceived(Double trnriAmountReceived) {
		this.trnriAmountReceived = trnriAmountReceived;
	}
	public Double getTrnriAmountPlanPaid() {
		return trnriAmountPlanPaid;
	}
	public void setTrnriAmountPlanPaid(Double trnriAmountPlanPaid) {
		this.trnriAmountPlanPaid = trnriAmountPlanPaid;
	}
	public String getTrnriBpkb() {
		return trnriBpkb;
	}
	public void setTrnriBpkb(String trnriBpkb) {
		this.trnriBpkb = trnriBpkb;
	}
	public Double getTrnriSisaOspok() {
		return trnriSisaOspok;
	}
	public void setTrnriSisaOspok(Double trnriSisaOspok) {
		this.trnriSisaOspok = trnriSisaOspok;
	}
	public String getTrnriDescHistoryPk() {
		return trnriDescHistoryPk;
	}
	public void setTrnriDescHistoryPk(String trnriDescHistoryPk) {
		this.trnriDescHistoryPk = trnriDescHistoryPk;
	}
	public Double getTrnriMeetCode() {
		return trnriMeetCode;
	}
	public void setTrnriMeetCode(Double trnriMeetCode) {
		this.trnriMeetCode = trnriMeetCode;
	}
	public String getTrnriUnitInfo() {
		return trnriUnitInfo;
	}
	public void setTrnriUnitInfo(String trnriUnitInfo) {
		this.trnriUnitInfo = trnriUnitInfo;
	}
	public Date getTrnriPromisePaidDate() {
		return trnriPromisePaidDate;
	}
	public void setTrnriPromisePaidDate(Date trnriPromisePaidDate) {
		this.trnriPromisePaidDate = trnriPromisePaidDate;
	}
	public Double getTrnriAmountPaid() {
		return trnriAmountPaid;
	}
	public void setTrnriAmountPaid(Double trnriAmountPaid) {
		this.trnriAmountPaid = trnriAmountPaid;
	}
	public String getTrnriCurrentHistory() {
		return trnriCurrentHistory;
	}
	public void setTrnriCurrentHistory(String trnriCurrentHistory) {
		this.trnriCurrentHistory = trnriCurrentHistory;
	}
	public String getTrnriRevRejReason() {
		return trnriRevRejReason;
	}
	public void setTrnriRevRejReason(String trnriRevRejReason) {
		this.trnriRevRejReason = trnriRevRejReason;
	}
	public Double getTrnriOutsPenAftPk() {
		return trnriOutsPenAftPk;
	}
	public void setTrnriOutsPenAftPk(Double trnriOutsPenAftPk) {
		this.trnriOutsPenAftPk = trnriOutsPenAftPk;
	}

}