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
@Table(name="APPL_COY_BANKACCT")
public class ApplCoyBankacctDest implements Serializable {

	@Id
	@Column(name="BANK_CODE")
	private String bankCode;
	@Id
	@Column(name="BANK_BRANCH")
	private String bankBranch;
	@Id
	@Column(name="BANK_ACCTNO")
	private String bankAcctno;
	@Column(name="BANK_ACCT_STS")
	private String bankAcctSts;
	@Column(name="BANK_SI_OD")
	private String bankSiOd;
	@Column(name="BANK_COY_OUTLET")
	private String bankCoyOutlet;
	@Column(name="BANK_SEGMENT1")
	private String bankSegment1;
	@Column(name="BANK_SEGMENT2")
	private String bankSegment2;
	@Column(name="BANK_SEGMENT3")
	private String bankSegment3;
	@Column(name="BANK_SEGMENT4")
	private String bankSegment4;
	@Column(name="BANK_SEGMENT5")
	private String bankSegment5;
	@Column(name="BANK_SEGMENT6")
	private String bankSegment6;
	@Column(name="BANK_SEGMENT7")
	private String bankSegment7;
	@Column(name="BANK_SEGMENT8")
	private String bankSegment8;
	@Column(name="BANK_SEGMENT9")
	private String bankSegment9;
	@Column(name="BANK_SEGMENT10")
	private String bankSegment10;
	@Column(name="BANK_SEGMENT11")
	private String bankSegment11;
	@Column(name="BANK_SEGMENT12")
	private String bankSegment12;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@Column(name="BANK_CURRENCY")
	private String bankAcctCurrency;
	@Column(name="BANK_ACCT_NAME")
	private String bankAcctName;
	@Column(name="BANK_IS_DEFAULT")
	private String bankIsDefault;
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getBankAcctno() {
		return bankAcctno;
	}
	public void setBankAcctno(String bankAcctno) {
		this.bankAcctno = bankAcctno;
	}
	public String getBankAcctSts() {
		return bankAcctSts;
	}
	public void setBankAcctSts(String bankAcctSts) {
		this.bankAcctSts = bankAcctSts;
	}
	public String getBankSiOd() {
		return bankSiOd;
	}
	public void setBankSiOd(String bankSiOd) {
		this.bankSiOd = bankSiOd;
	}
	public String getBankCoyOutlet() {
		return bankCoyOutlet;
	}
	public void setBankCoyOutlet(String bankCoyOutlet) {
		this.bankCoyOutlet = bankCoyOutlet;
	}
	public String getBankSegment1() {
		return bankSegment1;
	}
	public void setBankSegment1(String bankSegment1) {
		this.bankSegment1 = bankSegment1;
	}
	public String getBankSegment2() {
		return bankSegment2;
	}
	public void setBankSegment2(String bankSegment2) {
		this.bankSegment2 = bankSegment2;
	}
	public String getBankSegment3() {
		return bankSegment3;
	}
	public void setBankSegment3(String bankSegment3) {
		this.bankSegment3 = bankSegment3;
	}
	public String getBankSegment4() {
		return bankSegment4;
	}
	public void setBankSegment4(String bankSegment4) {
		this.bankSegment4 = bankSegment4;
	}
	public String getBankSegment5() {
		return bankSegment5;
	}
	public void setBankSegment5(String bankSegment5) {
		this.bankSegment5 = bankSegment5;
	}
	public String getBankSegment6() {
		return bankSegment6;
	}
	public void setBankSegment6(String bankSegment6) {
		this.bankSegment6 = bankSegment6;
	}
	public String getBankSegment7() {
		return bankSegment7;
	}
	public void setBankSegment7(String bankSegment7) {
		this.bankSegment7 = bankSegment7;
	}
	public String getBankSegment8() {
		return bankSegment8;
	}
	public void setBankSegment8(String bankSegment8) {
		this.bankSegment8 = bankSegment8;
	}
	public String getBankSegment9() {
		return bankSegment9;
	}
	public void setBankSegment9(String bankSegment9) {
		this.bankSegment9 = bankSegment9;
	}
	public String getBankSegment10() {
		return bankSegment10;
	}
	public void setBankSegment10(String bankSegment10) {
		this.bankSegment10 = bankSegment10;
	}
	public String getBankSegment11() {
		return bankSegment11;
	}
	public void setBankSegment11(String bankSegment11) {
		this.bankSegment11 = bankSegment11;
	}
	public String getBankSegment12() {
		return bankSegment12;
	}
	public void setBankSegment12(String bankSegment12) {
		this.bankSegment12 = bankSegment12;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getBankAcctCurrency() {
		return bankAcctCurrency;
	}
	public void setBankAcctCurrency(String bankAcctCurrency) {
		this.bankAcctCurrency = bankAcctCurrency;
	}
	public String getBankAcctName() {
		return bankAcctName;
	}
	public void setBankAcctName(String bankAcctName) {
		this.bankAcctName = bankAcctName;
	}
	public String getBankIsDefault() {
		return bankIsDefault;
	}
	public void setBankIsDefault(String bankIsDefault) {
		this.bankIsDefault = bankIsDefault;
	}
}
