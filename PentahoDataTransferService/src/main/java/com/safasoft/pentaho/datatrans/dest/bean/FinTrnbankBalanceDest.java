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
@Table(name="FIN_TRNBANK_BALANCE")
public class FinTrnbankBalanceDest implements Serializable {

	@Id
  @Column(name="BANKBAL_DATE")
  @Temporal(TemporalType.DATE)
  private Date bankbalDate;                                            
  @Id
  @Column(name="BANKBAL_BANK_CODE")
  private String bankbalBankCode;                                                               
  @Id
  @Column(name="BANKBAL_BANK_BRANCH")
  private String bankbalBankBranch;                                                           
  @Id
  @Column(name="BANKBAL_BANK_ACCTNO")
  private String bankbalBankAcctno;                                                           
  @Column(name="BANKBAL_SALDO_AWAL")
  private Long bankbalSaldoAwal;                                                                    
  @Column(name="BANKBAL_GL_DR")
  private Long bankbalGlDr;                                                                              
  @Column(name="BANKBAL_GL_CR")
  private Long bankbalGlCr;                                                                              
  @Column(name="BANKBAL_SALDO_AKHIR")
  private Long bankbalSaldoAkhir;                                                                  
  @Column(name="BANKBAL_CREATED_BY")
  private String bankbalCreatedBy;                                                                  
  @Column(name="BANKBAL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date bankbalCreatedDate;                                  
  @Column(name="BANKBAL_UPDATED_BY")
  private String bankbalUpdatedBy;                                                                  
  @Column(name="BANKBAL_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date bankbalUpdatedDate;                                  
  @Column(name="BANKBAL_OUTLET_ID")
  private String bankbalOutletId;
  
	public Date getBankbalDate() {
		return bankbalDate;
	}
	public void setBankbalDate(Date bankbalDate) {
		this.bankbalDate = bankbalDate;
	}
	public String getBankbalBankCode() {
		return bankbalBankCode;
	}
	public void setBankbalBankCode(String bankbalBankCode) {
		this.bankbalBankCode = bankbalBankCode;
	}
	public String getBankbalBankBranch() {
		return bankbalBankBranch;
	}
	public void setBankbalBankBranch(String bankbalBankBranch) {
		this.bankbalBankBranch = bankbalBankBranch;
	}
	public String getBankbalBankAcctno() {
		return bankbalBankAcctno;
	}
	public void setBankbalBankAcctno(String bankbalBankAcctno) {
		this.bankbalBankAcctno = bankbalBankAcctno;
	}
	public Long getBankbalSaldoAwal() {
		return bankbalSaldoAwal;
	}
	public void setBankbalSaldoAwal(Long bankbalSaldoAwal) {
		this.bankbalSaldoAwal = bankbalSaldoAwal;
	}
	public Long getBankbalGlDr() {
		return bankbalGlDr;
	}
	public void setBankbalGlDr(Long bankbalGlDr) {
		this.bankbalGlDr = bankbalGlDr;
	}
	public Long getBankbalGlCr() {
		return bankbalGlCr;
	}
	public void setBankbalGlCr(Long bankbalGlCr) {
		this.bankbalGlCr = bankbalGlCr;
	}
	public Long getBankbalSaldoAkhir() {
		return bankbalSaldoAkhir;
	}
	public void setBankbalSaldoAkhir(Long bankbalSaldoAkhir) {
		this.bankbalSaldoAkhir = bankbalSaldoAkhir;
	}
	public String getBankbalCreatedBy() {
		return bankbalCreatedBy;
	}
	public void setBankbalCreatedBy(String bankbalCreatedBy) {
		this.bankbalCreatedBy = bankbalCreatedBy;
	}
	public Date getBankbalCreatedDate() {
		return bankbalCreatedDate;
	}
	public void setBankbalCreatedDate(Date bankbalCreatedDate) {
		this.bankbalCreatedDate = bankbalCreatedDate;
	}
	public String getBankbalUpdatedBy() {
		return bankbalUpdatedBy;
	}
	public void setBankbalUpdatedBy(String bankbalUpdatedBy) {
		this.bankbalUpdatedBy = bankbalUpdatedBy;
	}
	public Date getBankbalUpdatedDate() {
		return bankbalUpdatedDate;
	}
	public void setBankbalUpdatedDate(Date bankbalUpdatedDate) {
		this.bankbalUpdatedDate = bankbalUpdatedDate;
	}
	public String getBankbalOutletId() {
		return bankbalOutletId;
	}
	public void setBankbalOutletId(String bankbalOutletId) {
		this.bankbalOutletId = bankbalOutletId;
	}

}