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
@Table(name="CFIN_TRN_CONTRACTS")
public class CfinTrnContractsDest implements Serializable {

  @Id
  @Column(name="CONT_CONTRACT_NO")
  private String contContractNo;
  @Column(name="CONT_COYOUTLET_ID")
  private String contCoyoutletId;
  @Column(name="CONT_ORDER_ID")
  private String contOrderId;
  @Column(name="CONT_CUST_ID")
  private String contCustId;
  @Column(name="CONT_VERSION_NO")
  private Integer contVersionNo;
  @Column(name="CONT_OUTS_PRIN")
  private Integer contOutsPrin;
  @Column(name="CONT_OUTS_INT")
  private Integer contOutsInt;
  @Column(name="CONT_CURR_INST")
  private Integer contCurrInst;
  @Column(name="CONT_DUE_DATE")
  @Temporal(TemporalType.DATE)
  private Date contDueDate;
  @Column(name="CONT_CURR_INST_PRIN")
  private Integer contCurrInstPrin;
  @Column(name="CONT_CURR_INST_INT")
  private Integer contCurrInstInt;
  @Column(name="CONT_GROUPCUST_ID")
  private String contGroupcustId;
  @Column(name="CONT_CFIN_GROUP")
  private String contCfinGroup;
  @Column(name="CONT_SYARIAH_FLAG")
  private String contSyariahFlag;
  @Column(name="CONT_PENALTY_PCT")
  private Double contPenaltyPct;
  @Column(name="CONT_PRETERM_ADM_PCT")
  private Double contPretermAdmPct;
  @Column(name="CONT_PEN_TOLERANCE")
  private Integer contPenTolerance;
  @Column(name="CONT_COLL_FEE")
  private Integer contCollFee;
  @Column(name="CONT_CLOSING_DATE")
  @Temporal(TemporalType.DATE)
  private Date contClosingDate;
  @Column(name="CONT_STATUS")
  private String contStatus;
  @Column(name="CONT_BOOKED_DATE")
  @Temporal(TemporalType.DATE)
  private Date contBookedDate;
  @Column(name="CONT_BOOKED_STATUS")
  private String contBookedStatus;
  @Column(name="CONT_FACILITY_CODE")
  private String contFacilityCode;
  @Column(name="CONT_LAST_PAID_DATE")
  @Temporal(TemporalType.DATE)
  private Date contLastPaidDate;
  @Column(name="CONT_MIN_PENALTY")
  private Integer contMinPenalty;
  @Column(name="CONT_MATURITY_DATE")
  @Temporal(TemporalType.DATE)
  private Date contMaturityDate;
  @Column(name="CONT_PEN_AMT_TEMP")
  private Integer contPenAmtTemp;
  @Column(name="CONT_COLL_DATE")
  private Integer contCollDate;
  @Column(name="CONT_COLL_ADDMONTHS")
  private Integer contCollAddmonths;
  @Column(name="CONT_CREATED_BY")
  private String contCreatedBy;
  @Column(name="CONT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date contCreatedDate;
  @Column(name="CONT_UPDATED_BY")
  private String contUpdatedBy;
  @Column(name="CONT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date contUpdatedDate;
  @Column(name="CONT_PEN_NEGO_FLAG")
  private String contPenNegoFlag;
  @Column(name="CONT_CURRENCY")
  private String contCurrency;
  @Column(name="CONT_DATE")
  @Temporal(TemporalType.DATE)
  private Date contDate;
  @Column(name="CONT_CARA_BAYAR")
  private String contCaraBayar;
  @Column(name="CONT_REPAY_VERNO")
  private Integer contRepayVerno;
  @Column(name="CONT_FLAGWO_DATE")
  @Temporal(TemporalType.DATE)
  private Date contFlagwoDate;
  @Column(name="CONT_LAST_AR_UPDATE")
  @Temporal(TemporalType.DATE)
  private Date contLastArUpdate;
  @Column(name="CONT_FLAGRECOV_DATE")
  @Temporal(TemporalType.DATE)
  private Date contFlagrecovDate;
  @Column(name="CONT_AVAL_NO")
  private String contAvalNo;
  
	public String getContContractNo() {
		return contContractNo;
	}
	public void setContContractNo(String contContractNo) {
		this.contContractNo = contContractNo;
	}
	public String getContCoyoutletId() {
		return contCoyoutletId;
	}
	public void setContCoyoutletId(String contCoyoutletId) {
		this.contCoyoutletId = contCoyoutletId;
	}
	public String getContOrderId() {
		return contOrderId;
	}
	public void setContOrderId(String contOrderId) {
		this.contOrderId = contOrderId;
	}
	public String getContCustId() {
		return contCustId;
	}
	public void setContCustId(String contCustId) {
		this.contCustId = contCustId;
	}
	public Integer getContVersionNo() {
		return contVersionNo;
	}
	public void setContVersionNo(Integer contVersionNo) {
		this.contVersionNo = contVersionNo;
	}
	public Integer getContOutsPrin() {
		return contOutsPrin;
	}
	public void setContOutsPrin(Integer contOutsPrin) {
		this.contOutsPrin = contOutsPrin;
	}
	public Integer getContOutsInt() {
		return contOutsInt;
	}
	public void setContOutsInt(Integer contOutsInt) {
		this.contOutsInt = contOutsInt;
	}
	public Integer getContCurrInst() {
		return contCurrInst;
	}
	public void setContCurrInst(Integer contCurrInst) {
		this.contCurrInst = contCurrInst;
	}
	public Date getContDueDate() {
		return contDueDate;
	}
	public void setContDueDate(Date contDueDate) {
		this.contDueDate = contDueDate;
	}
	public Integer getContCurrInstPrin() {
		return contCurrInstPrin;
	}
	public void setContCurrInstPrin(Integer contCurrInstPrin) {
		this.contCurrInstPrin = contCurrInstPrin;
	}
	public Integer getContCurrInstInt() {
		return contCurrInstInt;
	}
	public void setContCurrInstInt(Integer contCurrInstInt) {
		this.contCurrInstInt = contCurrInstInt;
	}
	public String getContGroupcustId() {
		return contGroupcustId;
	}
	public void setContGroupcustId(String contGroupcustId) {
		this.contGroupcustId = contGroupcustId;
	}
	public String getContCfinGroup() {
		return contCfinGroup;
	}
	public void setContCfinGroup(String contCfinGroup) {
		this.contCfinGroup = contCfinGroup;
	}
	public String getContSyariahFlag() {
		return contSyariahFlag;
	}
	public void setContSyariahFlag(String contSyariahFlag) {
		this.contSyariahFlag = contSyariahFlag;
	}
	public Double getContPenaltyPct() {
		return contPenaltyPct;
	}
	public void setContPenaltyPct(Double contPenaltyPct) {
		this.contPenaltyPct = contPenaltyPct;
	}
	public Double getContPretermAdmPct() {
		return contPretermAdmPct;
	}
	public void setContPretermAdmPct(Double contPretermAdmPct) {
		this.contPretermAdmPct = contPretermAdmPct;
	}
	public Integer getContPenTolerance() {
		return contPenTolerance;
	}
	public void setContPenTolerance(Integer contPenTolerance) {
		this.contPenTolerance = contPenTolerance;
	}
	public Integer getContCollFee() {
		return contCollFee;
	}
	public void setContCollFee(Integer contCollFee) {
		this.contCollFee = contCollFee;
	}
	public Date getContClosingDate() {
		return contClosingDate;
	}
	public void setContClosingDate(Date contClosingDate) {
		this.contClosingDate = contClosingDate;
	}
	public String getContStatus() {
		return contStatus;
	}
	public void setContStatus(String contStatus) {
		this.contStatus = contStatus;
	}
	public Date getContBookedDate() {
		return contBookedDate;
	}
	public void setContBookedDate(Date contBookedDate) {
		this.contBookedDate = contBookedDate;
	}
	public String getContBookedStatus() {
		return contBookedStatus;
	}
	public void setContBookedStatus(String contBookedStatus) {
		this.contBookedStatus = contBookedStatus;
	}
	public String getContFacilityCode() {
		return contFacilityCode;
	}
	public void setContFacilityCode(String contFacilityCode) {
		this.contFacilityCode = contFacilityCode;
	}
	public Date getContLastPaidDate() {
		return contLastPaidDate;
	}
	public void setContLastPaidDate(Date contLastPaidDate) {
		this.contLastPaidDate = contLastPaidDate;
	}
	public Integer getContMinPenalty() {
		return contMinPenalty;
	}
	public void setContMinPenalty(Integer contMinPenalty) {
		this.contMinPenalty = contMinPenalty;
	}
	public Date getContMaturityDate() {
		return contMaturityDate;
	}
	public void setContMaturityDate(Date contMaturityDate) {
		this.contMaturityDate = contMaturityDate;
	}
	public Integer getContPenAmtTemp() {
		return contPenAmtTemp;
	}
	public void setContPenAmtTemp(Integer contPenAmtTemp) {
		this.contPenAmtTemp = contPenAmtTemp;
	}
	public Integer getContCollDate() {
		return contCollDate;
	}
	public void setContCollDate(Integer contCollDate) {
		this.contCollDate = contCollDate;
	}
	public Integer getContCollAddmonths() {
		return contCollAddmonths;
	}
	public void setContCollAddmonths(Integer contCollAddmonths) {
		this.contCollAddmonths = contCollAddmonths;
	}
	public String getContCreatedBy() {
		return contCreatedBy;
	}
	public void setContCreatedBy(String contCreatedBy) {
		this.contCreatedBy = contCreatedBy;
	}
	public Date getContCreatedDate() {
		return contCreatedDate;
	}
	public void setContCreatedDate(Date contCreatedDate) {
		this.contCreatedDate = contCreatedDate;
	}
	public String getContUpdatedBy() {
		return contUpdatedBy;
	}
	public void setContUpdatedBy(String contUpdatedBy) {
		this.contUpdatedBy = contUpdatedBy;
	}
	public Date getContUpdatedDate() {
		return contUpdatedDate;
	}
	public void setContUpdatedDate(Date contUpdatedDate) {
		this.contUpdatedDate = contUpdatedDate;
	}
	public String getContPenNegoFlag() {
		return contPenNegoFlag;
	}
	public void setContPenNegoFlag(String contPenNegoFlag) {
		this.contPenNegoFlag = contPenNegoFlag;
	}
	public String getContCurrency() {
		return contCurrency;
	}
	public void setContCurrency(String contCurrency) {
		this.contCurrency = contCurrency;
	}
	public Date getContDate() {
		return contDate;
	}
	public void setContDate(Date contDate) {
		this.contDate = contDate;
	}
	public String getContCaraBayar() {
		return contCaraBayar;
	}
	public void setContCaraBayar(String contCaraBayar) {
		this.contCaraBayar = contCaraBayar;
	}
	public Integer getContRepayVerno() {
		return contRepayVerno;
	}
	public void setContRepayVerno(Integer contRepayVerno) {
		this.contRepayVerno = contRepayVerno;
	}
	public Date getContFlagwoDate() {
		return contFlagwoDate;
	}
	public void setContFlagwoDate(Date contFlagwoDate) {
		this.contFlagwoDate = contFlagwoDate;
	}
	public Date getContLastArUpdate() {
		return contLastArUpdate;
	}
	public void setContLastArUpdate(Date contLastArUpdate) {
		this.contLastArUpdate = contLastArUpdate;
	}
	public Date getContFlagrecovDate() {
		return contFlagrecovDate;
	}
	public void setContFlagrecovDate(Date contFlagrecovDate) {
		this.contFlagrecovDate = contFlagrecovDate;
	}
	public String getContAvalNo() {
		return contAvalNo;
	}
	public void setContAvalNo(String contAvalNo) {
		this.contAvalNo = contAvalNo;
	}

}