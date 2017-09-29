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
@Table(name="CFIN_REPAY_HISTORY")
public class CfinRepayHistoryDest implements Serializable{

	@Id
	@Column(name="HIST_CONTRACT_NO")
	private String histContractNo;
	@Id
	@Column(name="HIST_INST_NO")
	private Integer histInstNo;
	@Id
	@Column(name="HIST_VERSION_NO")
	private Integer histVersionNo;
	@Id
	@Column(name="HIST_SEQN_NO")
	private Integer histSeqnNo;
	@Column(name="HIST_TRAN_DATE")
	@Temporal(TemporalType.DATE)
	private Date histTranDate;
	@Column(name="HIST_POSTING_DATE")
	@Temporal(TemporalType.DATE)
	private Date histPostingDate;
	@Column(name="HIST_TRAN_TYPE")
	private String histTranType;
	@Column(name="HIST_PAYMENT_METHODE")
	private String histPaymentMethode;
	@Column(name="HIST_REFERENCE_NO")
	private String histReferenceNo;
	@Column(name="HIST_DOCUMENT_NO")
	private String histDocumentNo;
	@Column(name="HIST_BANK_ID")
	private String histBankId;
	@Column(name="HIST_CHEQUE_NO")
	private String histChequeNo;
	@Column(name="HIST_PRIN_AMT")
	private Integer histPrinAmt;
	@Column(name="HIST_INTR_AMT")
	private Integer histIntrAmt;
	@Column(name="HIST_PENALTY_AMT")
	private Integer histPenaltyamt;
	@Column(name="HIST_COLLFEE_AMT")
	private Integer histColfeeAmt;
	@Column(name="HIST_CLOSED_YEAR")
	private Integer histClosedYear;
	@Column(name="HIST_CREATED_BY")
	private String histCreatedBy;
	@Column(name="HIST_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date histCreatedDate;
	@Column(name="HIST_COLLECTOR_ID")
	private Integer histCollectorId;
	@Column(name="HIST_INSTL_DUEDATE")
	@Temporal(TemporalType.DATE)
	private Date histInstlDuedate;
	@Column(name="HIST_OCM_PROCESSED")
	private String histOcmProcessed;
	@Column(name="HIST_UPDATED_BY")
	private String histUpdatedBy;
	@Column(name="HIST_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date histUpdatedDate;
	
	public String getHistContractNo() {
		return histContractNo;
	}
	public void setHistContractNo(String histContractNo) {
		this.histContractNo = histContractNo;
	}
	public Integer getHistInstNo() {
		return histInstNo;
	}
	public void setHistInstNo(Integer histInstNo) {
		this.histInstNo = histInstNo;
	}
	public Integer getHistVersionNo() {
		return histVersionNo;
	}
	public void setHistVersionNo(Integer histVersionNo) {
		this.histVersionNo = histVersionNo;
	}
	public Integer getHistSeqnNo() {
		return histSeqnNo;
	}
	public void setHistSeqnNo(Integer histSeqnNo) {
		this.histSeqnNo = histSeqnNo;
	}
	public Date getHistTranDate() {
		return histTranDate;
	}
	public void setHistTranDate(Date histTranDate) {
		this.histTranDate = histTranDate;
	}
	public Date getHistPostingDate() {
		return histPostingDate;
	}
	public void setHistPostingDate(Date histPostingDate) {
		this.histPostingDate = histPostingDate;
	}
	public String getHistTranType() {
		return histTranType;
	}
	public void setHistTranType(String histTranType) {
		this.histTranType = histTranType;
	}
	public String getHistPaymentMethode() {
		return histPaymentMethode;
	}
	public void setHistPaymentMethode(String histPaymentMethode) {
		this.histPaymentMethode = histPaymentMethode;
	}
	public String getHistReferenceNo() {
		return histReferenceNo;
	}
	public void setHistReferenceNo(String histReferenceNo) {
		this.histReferenceNo = histReferenceNo;
	}
	public String getHistDocumentNo() {
		return histDocumentNo;
	}
	public void setHistDocumentNo(String histDocumentNo) {
		this.histDocumentNo = histDocumentNo;
	}
	public String getHistBankId() {
		return histBankId;
	}
	public void setHistBankId(String histBankId) {
		this.histBankId = histBankId;
	}
	public String getHistChequeNo() {
		return histChequeNo;
	}
	public void setHistChequeNo(String histChequeNo) {
		this.histChequeNo = histChequeNo;
	}
	public Integer getHistPrinAmt() {
		return histPrinAmt;
	}
	public void setHistPrinAmt(Integer histPrinAmt) {
		this.histPrinAmt = histPrinAmt;
	}
	public Integer getHistIntrAmt() {
		return histIntrAmt;
	}
	public void setHistIntrAmt(Integer histIntrAmt) {
		this.histIntrAmt = histIntrAmt;
	}
	public Integer getHistPenaltyamt() {
		return histPenaltyamt;
	}
	public void setHistPenaltyamt(Integer histPenaltyamt) {
		this.histPenaltyamt = histPenaltyamt;
	}
	public Integer getHistColfeeAmt() {
		return histColfeeAmt;
	}
	public void setHistColfeeAmt(Integer histColfeeAmt) {
		this.histColfeeAmt = histColfeeAmt;
	}
	public Integer getHistClosedYear() {
		return histClosedYear;
	}
	public void setHistClosedYear(Integer histClosedYear) {
		this.histClosedYear = histClosedYear;
	}
	public String getHistCreatedBy() {
		return histCreatedBy;
	}
	public void setHistCreatedBy(String histCreatedBy) {
		this.histCreatedBy = histCreatedBy;
	}
	public Date getHistCreatedDate() {
		return histCreatedDate;
	}
	public void setHistCreatedDate(Date histCreatedDate) {
		this.histCreatedDate = histCreatedDate;
	}
	public Integer getHistCollectorId() {
		return histCollectorId;
	}
	public void setHistCollectorId(Integer histCollectorId) {
		this.histCollectorId = histCollectorId;
	}
	public Date getHistInstlDuedate() {
		return histInstlDuedate;
	}
	public void setHistInstlDuedate(Date histInstlDuedate) {
		this.histInstlDuedate = histInstlDuedate;
	}
	public String getHistOcmProcessed() {
		return histOcmProcessed;
	}
	public void setHistOcmProcessed(String histOcmProcessed) {
		this.histOcmProcessed = histOcmProcessed;
	}
	public String getHistUpdatedBy() {
		return histUpdatedBy;
	}
	public void setHistUpdatedBy(String histUpdatedBy) {
		this.histUpdatedBy = histUpdatedBy;
	}
	public Date getHistUpdatedDate() {
		return histUpdatedDate;
	}
	public void setHistUpdatedDate(Date histUpdatedDate) {
		this.histUpdatedDate = histUpdatedDate;
	}
}
