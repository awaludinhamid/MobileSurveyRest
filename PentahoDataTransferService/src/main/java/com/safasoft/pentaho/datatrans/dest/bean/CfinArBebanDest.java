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
@Table(name="CFIN_AR_BEBAN")
public class CfinArBebanDest implements Serializable {

	@Id
	@Column(name="BBN_PER_TAHUN")
	private Integer bbnPerTahun;
	@Id
	@Column(name="BBN_PER_BULAN")
	private Integer bbnPerBulan;
	@Id
	@Column(name="BBN_CONTRACT_NO")
	private String bbnContractNo;
	@Column(name="BBN_COYOUTLET_ID")
	private String bbnCoyoutletId;
	@Column(name="BBN_COLL_ID")
	private Integer bbnCollId;
	@Column(name="BBN_OUTSPRIN_AWAL")
	private Integer bbnOutsprinAwal;
	@Column(name="BBN_OUTSINT_AWAL")
	private Integer bbnOutsintAwal;
	@Column(name="BBN_DUEDATE_AWAL")
	@Temporal(TemporalType.DATE)
	private Date bbnDuedateAwal;
	@Column(name="BBN_INSTNO_AWAL")
	private Integer bbnInstnoAwal;
	@Column(name="BBN_CYCLE_AWAL")
	private String bbnCycleAwal;
	@Column(name="BBN_POLABAYAR_AWAL")
	private String bbnPolabayarAwal;
	@Column(name="BBN_OUTSPRIN_AKHIR")
	private Integer bbnOutsprinAkhir;
	@Column(name="BBN_OUTSINT_AKHIR")
	private Integer bbnOutsintAkhir;
	@Column(name="BBN_DUEDATE_AKHIR")
	@Temporal(TemporalType.DATE)
	private Date bbnDuedateAkhir;
	@Column(name="BBN_INSTNO_AKHIR")
	private Integer bbnInstnoAkhir;
	@Column(name="BBN_CYCLE_AKHIR")
	private String bbnCycleAkhir;
	@Column(name="BBN_POLABAYAR_AKHIR")
	private String bbnPolabayarAkhir;
	@Column(name="BBN_STATUS_CONT")
	private String bbnStatusCont;
	@Column(name="BBN_STATUS_BEBAN")
	private String bbnStatusBeban;
	@Column(name="BBN_AMBC_PRIN")
	private Integer bbnAmbcPrin;
	@Column(name="BBN_AMBC_INT")
	private Integer bbnAmbcInt;
	@Column(name="BBN_DUE_DATE")
	@Temporal(TemporalType.DATE)
	private Date bbnDueDate;
	@Column(name="BBN_PAID_DATE")
	@Temporal(TemporalType.DATE)
	private Date bbnPaidDate;
	@Column(name="BBN_TRAN_TYPE")
	private String bbnTranType;
	@Column(name="BBN_CARA_BYR")
	private String bbnCaraByr;
	@Column(name="BBN_AC_PRIN")
	private Integer bbnAcPrin;
	@Column(name="BBN_AC_INT")
	private Integer bbnAcInt;
	@Column(name="BBN_AC_PENALTY")
	private Integer bbnAcPenalty;
	@Column(name="BBN_AC_COLLFEE")
	private Integer bbnAcCollFee;
	@Column(name="BBN_DATE_PU")
	@Temporal(TemporalType.DATE)
	private Date bbnDatePu;
	@Column(name="BBN_DATE_AYD")
	@Temporal(TemporalType.DATE)
	private Date bbnDateAyd;
	@Column(name="BBN_CREATED_BY")
	private String bbnCreatedBy;
	@Column(name="BBN_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date bbnCreatedDate;
	@Column(name="BBN_UPDATE_BY")
	private String bbnUpdateBy;
	@Column(name="BBN_UPDATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date bbnUpdateDate;
	@Column(name="BBN_AMBC_PRIN_AKHIR")
	private Integer bbnAmbcPrinAkhir;
	@Column(name="BBN_AMBC_INT_AKHIR")
	private Integer bbnAmbcIntAkhir;
	@Column(name="BBN_SUPERVISOR_ID")
	private Integer bbnSupervisorId;
	@Column(name="BBN_LAST_DESKCALL_ID")
	private Integer bbnLastDeskcallId;
	@Column(name="BBN_LKP_STATUS")
	private String bbnLkpStatusn;
	@Column(name="BBN_LKP_LAST_VISIT")
	@Temporal(TemporalType.DATE)
	private Date bbnLkpLastVisit;
	@Column(name="BBN_LKP_LAST_FLAG")
	private String bbnLastLkpFlag;
	@Column(name="BBN_LAST_LKP_NO")
	private String bbnLAstLkpNo;
	@Column(name="BBN_LAST_LKP_DATE")
	@Temporal(TemporalType.DATE)
	private Date bbnLastLkpDate;
	@Column(name="BBN_NEXT_VISIT")
	@Temporal(TemporalType.DATE)
	private Date bbnNextVisit;
	@Column(name="BBN_COLLECTOR_TYPE")
	private String bbnCollectorType;
	@Column(name="BBN_LAST_POTENSI")
	private Integer bbnLastPotensi;
	@Column(name="BBN_LAST_COLL_ID")
	private Integer bbnLastCollId;
	@Column(name="BBN_LAST_SUPERVISOR_ID")
	private Integer bbnLastSupervisorId;
	@Column(name="BBN_ASSIGNED")
	private Integer bbnAssigned;
	@Column(name="BBN_VISITED")
	private Integer bbnVisited;
	@Column(name="BBN_ZIP")
	private String bbnZip;
	@Column(name="BBN_SUB_ZIP")
	private String bbnSubZip;
	@Column(name="BBN_LAST_PROMISE_DATE")
	@Temporal(TemporalType.DATE)
	private Date bbnLastPromiseDate;
	@Column(name="BBN_ASSIGN_DATE_FIRST")
	@Temporal(TemporalType.DATE)
	private Date bbnAssignDateFirst;
	@Column(name="BBN_ASSIGN_DATE_LAST")
	@Temporal(TemporalType.DATE)
	private Date bbnAssignDateLast;
	@Column(name="BBN_WORK_FLAG")
	private String bbnWorkFlag;
	@Column(name="BBN_INSTL_TYPE")
	private String bbnInstlType;
	@Column(name="BBN_COLLECTED_BY")
	private Integer bbnCollectedBy;
	@Column(name="BBN_AC_PRNC_FIELD")
	private Integer bbnAcPrncField;
	@Column(name="BBN_AC_INTR_FIELD")
	private Integer bbnAcIntrField;
	@Column(name="BBN_LAST_COLL_PREVMONTH")
	private Integer bbnLastCollPrevmonth;
	@Column(name="BBN_PITSTOP")
	private String bbnPitstop;
	@Column(name="BBN_POLABAYAR_PREVMONTH")
	private String bbnPolabayarPrevmonth;
	@Column(name="BBN_CYCLE_AWAL_PREVMONTH")
	private String bbnCycleAwalPrevmonth;
	@Column(name="BBN_LAST_PLAN_CODE")
	private String bbnLastPlanCode;
	@Column(name="BBN_LAST_DELQ_CODE")
	private String bbnLastDelqCode;
	@Column(name="BBN_TYPE_LKS")
	private String bbnTypeLks;
	@Column(name="BBN_JRK_ANGS")
	private Integer bbnJrkAngs;
	@Column(name="BBN_PRIO_FLAG")
	private String bbnPrioFlag;
	@Column(name="BBN_PRIO_SEQN")
	private Integer bbnPrioSeqn;
	@Column(name="BBN_PENUGASAN")
	private String bbnPenugasan;
	@Column(name="BBN_TEMP_ASSIGN")
	private String bbnTempAssign;
	
	public Integer getBbnPerTahun() {
		return bbnPerTahun;
	}
	public void setBbnPerTahun(Integer bbnPerTahun) {
		this.bbnPerTahun = bbnPerTahun;
	}
	public Integer getBbnPerBulan() {
		return bbnPerBulan;
	}
	public void setBbnPerBulan(Integer bbnPerBulan) {
		this.bbnPerBulan = bbnPerBulan;
	}
	public String getBbnContractNo() {
		return bbnContractNo;
	}
	public void setBbnContractNo(String bbnContractNo) {
		this.bbnContractNo = bbnContractNo;
	}
	public String getBbnCoyoutletId() {
		return bbnCoyoutletId;
	}
	public void setBbnCoyoutletId(String bbnCoyoutletId) {
		this.bbnCoyoutletId = bbnCoyoutletId;
	}
	public Integer getBbnCollId() {
		return bbnCollId;
	}
	public void setBbnCollId(Integer bbnCollId) {
		this.bbnCollId = bbnCollId;
	}
	public Integer getBbnOutsprinAwal() {
		return bbnOutsprinAwal;
	}
	public void setBbnOutsprinAwal(Integer bbnOutsprinAwal) {
		this.bbnOutsprinAwal = bbnOutsprinAwal;
	}
	public Integer getBbnOutsintAwal() {
		return bbnOutsintAwal;
	}
	public void setBbnOutsintAwal(Integer bbnOutsintAwal) {
		this.bbnOutsintAwal = bbnOutsintAwal;
	}
	public Date getBbnDuedateAwal() {
		return bbnDuedateAwal;
	}
	public void setBbnDuedateAwal(Date bbnDuedateAwal) {
		this.bbnDuedateAwal = bbnDuedateAwal;
	}
	public Integer getBbnInstnoAwal() {
		return bbnInstnoAwal;
	}
	public void setBbnInstnoAwal(Integer bbnInstnoAwal) {
		this.bbnInstnoAwal = bbnInstnoAwal;
	}
	public String getBbnCycleAwal() {
		return bbnCycleAwal;
	}
	public void setBbnCycleAwal(String bbnCycleAwal) {
		this.bbnCycleAwal = bbnCycleAwal;
	}
	public String getBbnPolabayarAwal() {
		return bbnPolabayarAwal;
	}
	public void setBbnPolabayarAwal(String bbnPolabayarAwal) {
		this.bbnPolabayarAwal = bbnPolabayarAwal;
	}
	public Integer getBbnOutsprinAkhir() {
		return bbnOutsprinAkhir;
	}
	public void setBbnOutsprinAkhir(Integer bbnOutsprinAkhir) {
		this.bbnOutsprinAkhir = bbnOutsprinAkhir;
	}
	public Integer getBbnOutsintAkhir() {
		return bbnOutsintAkhir;
	}
	public void setBbnOutsintAkhir(Integer bbnOutsintAkhir) {
		this.bbnOutsintAkhir = bbnOutsintAkhir;
	}
	public Date getBbnDuedateAkhir() {
		return bbnDuedateAkhir;
	}
	public void setBbnDuedateAkhir(Date bbnDuedateAkhir) {
		this.bbnDuedateAkhir = bbnDuedateAkhir;
	}
	public Integer getBbnInstnoAkhir() {
		return bbnInstnoAkhir;
	}
	public void setBbnInstnoAkhir(Integer bbnInstnoAkhir) {
		this.bbnInstnoAkhir = bbnInstnoAkhir;
	}
	public String getBbnCycleAkhir() {
		return bbnCycleAkhir;
	}
	public void setBbnCycleAkhir(String bbnCycleAkhir) {
		this.bbnCycleAkhir = bbnCycleAkhir;
	}
	public String getBbnPolabayarAkhir() {
		return bbnPolabayarAkhir;
	}
	public void setBbnPolabayarAkhir(String bbnPolabayarAkhir) {
		this.bbnPolabayarAkhir = bbnPolabayarAkhir;
	}
	public String getBbnStatusCont() {
		return bbnStatusCont;
	}
	public void setBbnStatusCont(String bbnStatusCont) {
		this.bbnStatusCont = bbnStatusCont;
	}
	public String getBbnStatusBeban() {
		return bbnStatusBeban;
	}
	public void setBbnStatusBeban(String bbnStatusBeban) {
		this.bbnStatusBeban = bbnStatusBeban;
	}
	public Integer getBbnAmbcPrin() {
		return bbnAmbcPrin;
	}
	public void setBbnAmbcPrin(Integer bbnAmbcPrin) {
		this.bbnAmbcPrin = bbnAmbcPrin;
	}
	public Integer getBbnAmbcInt() {
		return bbnAmbcInt;
	}
	public void setBbnAmbcInt(Integer bbnAmbcInt) {
		this.bbnAmbcInt = bbnAmbcInt;
	}
	public Date getBbnDueDate() {
		return bbnDueDate;
	}
	public void setBbnDueDate(Date bbnDueDate) {
		this.bbnDueDate = bbnDueDate;
	}
	public Date getBbnPaidDate() {
		return bbnPaidDate;
	}
	public void setBbnPaidDate(Date bbnPaidDate) {
		this.bbnPaidDate = bbnPaidDate;
	}
	public String getBbnTranType() {
		return bbnTranType;
	}
	public void setBbnTranType(String bbnTranType) {
		this.bbnTranType = bbnTranType;
	}
	public String getBbnCaraByr() {
		return bbnCaraByr;
	}
	public void setBbnCaraByr(String bbnCaraByr) {
		this.bbnCaraByr = bbnCaraByr;
	}
	public Integer getBbnAcPrin() {
		return bbnAcPrin;
	}
	public void setBbnAcPrin(Integer bbnAcPrin) {
		this.bbnAcPrin = bbnAcPrin;
	}
	public Integer getBbnAcInt() {
		return bbnAcInt;
	}
	public void setBbnAcInt(Integer bbnAcInt) {
		this.bbnAcInt = bbnAcInt;
	}
	public Integer getBbnAcPenalty() {
		return bbnAcPenalty;
	}
	public void setBbnAcPenalty(Integer bbnAcPenalty) {
		this.bbnAcPenalty = bbnAcPenalty;
	}
	public Integer getBbnAcCollFee() {
		return bbnAcCollFee;
	}
	public void setBbnAcCollFee(Integer bbnAcCollFee) {
		this.bbnAcCollFee = bbnAcCollFee;
	}
	public Date getBbnDatePu() {
		return bbnDatePu;
	}
	public void setBbnDatePu(Date bbnDatePu) {
		this.bbnDatePu = bbnDatePu;
	}
	public Date getBbnDateAyd() {
		return bbnDateAyd;
	}
	public void setBbnDateAyd(Date bbnDateAyd) {
		this.bbnDateAyd = bbnDateAyd;
	}
	public String getBbnCreatedBy() {
		return bbnCreatedBy;
	}
	public void setBbnCreatedBy(String bbnCreatedBy) {
		this.bbnCreatedBy = bbnCreatedBy;
	}
	public Date getBbnCreatedDate() {
		return bbnCreatedDate;
	}
	public void setBbnCreatedDate(Date bbnCreatedDate) {
		this.bbnCreatedDate = bbnCreatedDate;
	}
	public String getBbnUpdateBy() {
		return bbnUpdateBy;
	}
	public void setBbnUpdateBy(String bbnUpdateBy) {
		this.bbnUpdateBy = bbnUpdateBy;
	}
	public Date getBbnUpdateDate() {
		return bbnUpdateDate;
	}
	public void setBbnUpdateDate(Date bbnUpdateDate) {
		this.bbnUpdateDate = bbnUpdateDate;
	}
	public Integer getBbnAmbcPrinAkhir() {
		return bbnAmbcPrinAkhir;
	}
	public void setBbnAmbcPrinAkhir(Integer bbnAmbcPrinAkhir) {
		this.bbnAmbcPrinAkhir = bbnAmbcPrinAkhir;
	}
	public Integer getBbnAmbcIntAkhir() {
		return bbnAmbcIntAkhir;
	}
	public void setBbnAmbcIntAkhir(Integer bbnAmbcIntAkhir) {
		this.bbnAmbcIntAkhir = bbnAmbcIntAkhir;
	}
	public Integer getBbnSupervisorId() {
		return bbnSupervisorId;
	}
	public void setBbnSupervisorId(Integer bbnSupervisorId) {
		this.bbnSupervisorId = bbnSupervisorId;
	}
	public Integer getBbnLastDeskcallId() {
		return bbnLastDeskcallId;
	}
	public void setBbnLastDeskcallId(Integer bbnLastDeskcallId) {
		this.bbnLastDeskcallId = bbnLastDeskcallId;
	}
	public String getBbnLkpStatusn() {
		return bbnLkpStatusn;
	}
	public void setBbnLkpStatusn(String bbnLkpStatusn) {
		this.bbnLkpStatusn = bbnLkpStatusn;
	}
	public Date getBbnLkpLastVisit() {
		return bbnLkpLastVisit;
	}
	public void setBbnLkpLastVisit(Date bbnLkpLastVisit) {
		this.bbnLkpLastVisit = bbnLkpLastVisit;
	}
	public String getBbnLastLkpFlag() {
		return bbnLastLkpFlag;
	}
	public void setBbnLastLkpFlag(String bbnLastLkpFlag) {
		this.bbnLastLkpFlag = bbnLastLkpFlag;
	}
	public String getBbnLAstLkpNo() {
		return bbnLAstLkpNo;
	}
	public void setBbnLAstLkpNo(String bbnLAstLkpNo) {
		this.bbnLAstLkpNo = bbnLAstLkpNo;
	}
	public Date getBbnLastLkpDate() {
		return bbnLastLkpDate;
	}
	public void setBbnLastLkpDate(Date bbnLastLkpDate) {
		this.bbnLastLkpDate = bbnLastLkpDate;
	}
	public Date getBbnNextVisit() {
		return bbnNextVisit;
	}
	public void setBbnNextVisit(Date bbnNextVisit) {
		this.bbnNextVisit = bbnNextVisit;
	}
	public String getBbnCollectorType() {
		return bbnCollectorType;
	}
	public void setBbnCollectorType(String bbnCollectorType) {
		this.bbnCollectorType = bbnCollectorType;
	}
	public Integer getBbnLastPotensi() {
		return bbnLastPotensi;
	}
	public void setBbnLastPotensi(Integer bbnLastPotensi) {
		this.bbnLastPotensi = bbnLastPotensi;
	}
	public Integer getBbnLastCollId() {
		return bbnLastCollId;
	}
	public void setBbnLastCollId(Integer bbnLastCollId) {
		this.bbnLastCollId = bbnLastCollId;
	}
	public Integer getBbnLastSupervisorId() {
		return bbnLastSupervisorId;
	}
	public void setBbnLastSupervisorId(Integer bbnLastSupervisorId) {
		this.bbnLastSupervisorId = bbnLastSupervisorId;
	}
	public Integer getBbnAssigned() {
		return bbnAssigned;
	}
	public void setBbnAssigned(Integer bbnAssigned) {
		this.bbnAssigned = bbnAssigned;
	}
	public Integer getBbnVisited() {
		return bbnVisited;
	}
	public void setBbnVisited(Integer bbnVisited) {
		this.bbnVisited = bbnVisited;
	}
	public String getBbnZip() {
		return bbnZip;
	}
	public void setBbnZip(String bbnZip) {
		this.bbnZip = bbnZip;
	}
	public String getBbnSubZip() {
		return bbnSubZip;
	}
	public void setBbnSubZip(String bbnSubZip) {
		this.bbnSubZip = bbnSubZip;
	}
	public Date getBbnLastPromiseDate() {
		return bbnLastPromiseDate;
	}
	public void setBbnLastPromiseDate(Date bbnLastPromiseDate) {
		this.bbnLastPromiseDate = bbnLastPromiseDate;
	}
	public Date getBbnAssignDateFirst() {
		return bbnAssignDateFirst;
	}
	public void setBbnAssignDateFirst(Date bbnAssignDateFirst) {
		this.bbnAssignDateFirst = bbnAssignDateFirst;
	}
	public Date getBbnAssignDateLast() {
		return bbnAssignDateLast;
	}
	public void setBbnAssignDateLast(Date bbnAssignDateLast) {
		this.bbnAssignDateLast = bbnAssignDateLast;
	}
	public String getBbnWorkFlag() {
		return bbnWorkFlag;
	}
	public void setBbnWorkFlag(String bbnWorkFlag) {
		this.bbnWorkFlag = bbnWorkFlag;
	}
	public String getBbnInstlType() {
		return bbnInstlType;
	}
	public void setBbnInstlType(String bbnInstlType) {
		this.bbnInstlType = bbnInstlType;
	}
	public Integer getBbnCollectedBy() {
		return bbnCollectedBy;
	}
	public void setBbnCollectedBy(Integer bbnCollectedBy) {
		this.bbnCollectedBy = bbnCollectedBy;
	}
	public Integer getBbnAcPrncField() {
		return bbnAcPrncField;
	}
	public void setBbnAcPrncField(Integer bbnAcPrncField) {
		this.bbnAcPrncField = bbnAcPrncField;
	}
	public Integer getBbnAcIntrField() {
		return bbnAcIntrField;
	}
	public void setBbnAcIntrField(Integer bbnAcIntrField) {
		this.bbnAcIntrField = bbnAcIntrField;
	}
	public Integer getBbnLastCollPrevmonth() {
		return bbnLastCollPrevmonth;
	}
	public void setBbnLastCollPrevmonth(Integer bbnLastCollPrevmonth) {
		this.bbnLastCollPrevmonth = bbnLastCollPrevmonth;
	}
	public String getBbnPitstop() {
		return bbnPitstop;
	}
	public void setBbnPitstop(String bbnPitstop) {
		this.bbnPitstop = bbnPitstop;
	}
	public String getBbnPolabayarPrevmonth() {
		return bbnPolabayarPrevmonth;
	}
	public void setBbnPolabayarPrevmonth(String bbnPolabayarPrevmonth) {
		this.bbnPolabayarPrevmonth = bbnPolabayarPrevmonth;
	}
	public String getBbnCycleAwalPrevmonth() {
		return bbnCycleAwalPrevmonth;
	}
	public void setBbnCycleAwalPrevmonth(String bbnCycleAwalPrevmonth) {
		this.bbnCycleAwalPrevmonth = bbnCycleAwalPrevmonth;
	}
	public String getBbnLastPlanCode() {
		return bbnLastPlanCode;
	}
	public void setBbnLastPlanCode(String bbnLastPlanCode) {
		this.bbnLastPlanCode = bbnLastPlanCode;
	}
	public String getBbnLastDelqCode() {
		return bbnLastDelqCode;
	}
	public void setBbnLastDelqCode(String bbnLastDelqCode) {
		this.bbnLastDelqCode = bbnLastDelqCode;
	}
	public String getBbnTypeLks() {
		return bbnTypeLks;
	}
	public void setBbnTypeLks(String bbnTypeLks) {
		this.bbnTypeLks = bbnTypeLks;
	}
	public Integer getBbnJrkAngs() {
		return bbnJrkAngs;
	}
	public void setBbnJrkAngs(Integer bbnJrkAngs) {
		this.bbnJrkAngs = bbnJrkAngs;
	}
	public String getBbnPrioFlag() {
		return bbnPrioFlag;
	}
	public void setBbnPrioFlag(String bbnPrioFlag) {
		this.bbnPrioFlag = bbnPrioFlag;
	}
	public Integer getBbnPrioSeqn() {
		return bbnPrioSeqn;
	}
	public void setBbnPrioSeqn(Integer bbnPrioSeqn) {
		this.bbnPrioSeqn = bbnPrioSeqn;
	}
	public String getBbnPenugasan() {
		return bbnPenugasan;
	}
	public void setBbnPenugasan(String bbnPenugasan) {
		this.bbnPenugasan = bbnPenugasan;
	}
	public String getBbnTempAssign() {
		return bbnTempAssign;
	}
	public void setBbnTempAssign(String bbnTempAssign) {
		this.bbnTempAssign = bbnTempAssign;
	}
}
