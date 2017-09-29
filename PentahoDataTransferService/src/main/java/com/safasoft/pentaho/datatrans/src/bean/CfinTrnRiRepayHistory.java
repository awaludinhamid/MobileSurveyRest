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
@Table(name="CFIN_TRN_RI_REPAY_HISTORY",schema="CFIN")
public class CfinTrnRiRepayHistory implements Serializable {

  @Id
  @Column(name="RIHIST_CONTRACT_NO")
  private String rihistContractNo;
  @Id
  @Column(name="RIHIST_SEQN_NO")
  private Integer rihistSeqnNo;
  @Column(name="RIHIST_TRAN_DATE")
  @Temporal(TemporalType.DATE)
  private Date rihistTranDate;
  @Column(name="RIHIST_POSTING_DATE")
  @Temporal(TemporalType.DATE)
  private Date rihistPostingDate;
  @Column(name="RIHIST_TRAN_TYPE")
  private String rihistTranType;
  @Column(name="RIHIST_PAYMENT_METHODE")
  private String rihistPaymentMethode;
  @Column(name="RIHIST_REFERENCE_NO")
  private String rihistReferenceNo;
  @Column(name="RIHIST_DOCUMENT_NO")
  private String rihistDocumentNo;
  @Column(name="RIHIST_BANK_ID")
  private String rihistBankId;
  @Column(name="RIHIST_CHEQUE_NO")
  private String rihistChequeNo;
  @Column(name="RIHIST_PRIN_AMT")
  private Integer rihistPrinAmt;
  @Column(name="RIHIST_INTR_AMT")
  private Integer rihistIntrAmt;
  @Column(name="RIHIST_ADMIN_AMT")
  private Integer rihistAdminAmt;
  @Column(name="RIHIST_OTHERS_AMT")
  private Integer rihistOthersAmt;
  @Column(name="RIHIST_COLLECTOR_ID")
  private Double rihistCollectorId;
  @Column(name="RIHIST_CREATED_BY")
  private String rihistCreatedBy;
  @Column(name="RIHIST_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date rihistCreatedDate;
  @Column(name="RIHIST_UPDATED_BY")
  private String rihistUpdatedBy;
  @Column(name="RIHIST_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date rihistUpdatedDate;
  
	public String getRihistContractNo() {
		return rihistContractNo;
	}
	public void setRihistContractNo(String rihistContractNo) {
		this.rihistContractNo = rihistContractNo;
	}
	public Integer getRihistSeqnNo() {
		return rihistSeqnNo;
	}
	public void setRihistSeqnNo(Integer rihistSeqnNo) {
		this.rihistSeqnNo = rihistSeqnNo;
	}
	public Date getRihistTranDate() {
		return rihistTranDate;
	}
	public void setRihistTranDate(Date rihistTranDate) {
		this.rihistTranDate = rihistTranDate;
	}
	public Date getRihistPostingDate() {
		return rihistPostingDate;
	}
	public void setRihistPostingDate(Date rihistPostingDate) {
		this.rihistPostingDate = rihistPostingDate;
	}
	public String getRihistTranType() {
		return rihistTranType;
	}
	public void setRihistTranType(String rihistTranType) {
		this.rihistTranType = rihistTranType;
	}
	public String getRihistPaymentMethode() {
		return rihistPaymentMethode;
	}
	public void setRihistPaymentMethode(String rihistPaymentMethode) {
		this.rihistPaymentMethode = rihistPaymentMethode;
	}
	public String getRihistReferenceNo() {
		return rihistReferenceNo;
	}
	public void setRihistReferenceNo(String rihistReferenceNo) {
		this.rihistReferenceNo = rihistReferenceNo;
	}
	public String getRihistDocumentNo() {
		return rihistDocumentNo;
	}
	public void setRihistDocumentNo(String rihistDocumentNo) {
		this.rihistDocumentNo = rihistDocumentNo;
	}
	public String getRihistBankId() {
		return rihistBankId;
	}
	public void setRihistBankId(String rihistBankId) {
		this.rihistBankId = rihistBankId;
	}
	public String getRihistChequeNo() {
		return rihistChequeNo;
	}
	public void setRihistChequeNo(String rihistChequeNo) {
		this.rihistChequeNo = rihistChequeNo;
	}
	public Integer getRihistPrinAmt() {
		return rihistPrinAmt;
	}
	public void setRihistPrinAmt(Integer rihistPrinAmt) {
		this.rihistPrinAmt = rihistPrinAmt;
	}
	public Integer getRihistIntrAmt() {
		return rihistIntrAmt;
	}
	public void setRihistIntrAmt(Integer rihistIntrAmt) {
		this.rihistIntrAmt = rihistIntrAmt;
	}
	public Integer getRihistAdminAmt() {
		return rihistAdminAmt;
	}
	public void setRihistAdminAmt(Integer rihistAdminAmt) {
		this.rihistAdminAmt = rihistAdminAmt;
	}
	public Integer getRihistOthersAmt() {
		return rihistOthersAmt;
	}
	public void setRihistOthersAmt(Integer rihistOthersAmt) {
		this.rihistOthersAmt = rihistOthersAmt;
	}
	public Double getRihistCollectorId() {
		return rihistCollectorId;
	}
	public void setRihistCollectorId(Double rihistCollectorId) {
		this.rihistCollectorId = rihistCollectorId;
	}
	public String getRihistCreatedBy() {
		return rihistCreatedBy;
	}
	public void setRihistCreatedBy(String rihistCreatedBy) {
		this.rihistCreatedBy = rihistCreatedBy;
	}
	public Date getRihistCreatedDate() {
		return rihistCreatedDate;
	}
	public void setRihistCreatedDate(Date rihistCreatedDate) {
		this.rihistCreatedDate = rihistCreatedDate;
	}
	public String getRihistUpdatedBy() {
		return rihistUpdatedBy;
	}
	public void setRihistUpdatedBy(String rihistUpdatedBy) {
		this.rihistUpdatedBy = rihistUpdatedBy;
	}
	public Date getRihistUpdatedDate() {
		return rihistUpdatedDate;
	}
	public void setRihistUpdatedDate(Date rihistUpdatedDate) {
		this.rihistUpdatedDate = rihistUpdatedDate;
	}

}