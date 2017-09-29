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
@Table(name="APPL_MST_CASH")
public class ApplMstCashDest implements Serializable {

	@Id
	@Column(name="CASH_COY_OUTLET")
	private String cashCoyOutlet;
	@Id
	@Column(name="CASH_CURRENCY")
	private String cashCurrency;
	@Column(name="CASH_SEGMENT1")
	private String cashSegment1;
	@Column(name="CASH_SEGMENT2")
	private String cashSegment2;
	@Column(name="CASH_SEGMENT3")
	private String cashSegment3;
	@Column(name="CASH_SEGMENT4")
	private String cashSegment4;
	@Column(name="CASH_SEGMENT5")
	private String cashSegment5;
	@Column(name="CASH_SEGMENT6")
	private String cashSegment6;
	@Column(name="CASH_SEGMENT7")
	private String cashSegment7;
	@Column(name="CASH_SEGMENT8")
	private String cashSegment8;
	@Column(name="CASH_SEGMENT9")
	private String cashSegment9;
	@Column(name="CASH_SEGMENT10")
	private String cashSegment10;
	@Column(name="CASH_SEGMENT11")
	private String cashSegment11;
	@Column(name="CASH_SEGMENT12")
	private String cashSegment12;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="UPDATED_DATE")
	private String updatedDate;
	
	public String getCashCoyOutlet() {
		return cashCoyOutlet;
	}
	public void setCashCoyOutlet(String cashCoyOutlet) {
		this.cashCoyOutlet = cashCoyOutlet;
	}
	public String getCashCurrency() {
		return cashCurrency;
	}
	public void setCashCurrency(String cashCurrency) {
		this.cashCurrency = cashCurrency;
	}
	public String getCashSegment1() {
		return cashSegment1;
	}
	public void setCashSegment1(String cashSegment1) {
		this.cashSegment1 = cashSegment1;
	}
	public String getCashSegment2() {
		return cashSegment2;
	}
	public void setCashSegment2(String cashSegment2) {
		this.cashSegment2 = cashSegment2;
	}
	public String getCashSegment3() {
		return cashSegment3;
	}
	public void setCashSegment3(String cashSegment3) {
		this.cashSegment3 = cashSegment3;
	}
	public String getCashSegment4() {
		return cashSegment4;
	}
	public void setCashSegment4(String cashSegment4) {
		this.cashSegment4 = cashSegment4;
	}
	public String getCashSegment5() {
		return cashSegment5;
	}
	public void setCashSegment5(String cashSegment5) {
		this.cashSegment5 = cashSegment5;
	}
	public String getCashSegment6() {
		return cashSegment6;
	}
	public void setCashSegment6(String cashSegment6) {
		this.cashSegment6 = cashSegment6;
	}
	public String getCashSegment7() {
		return cashSegment7;
	}
	public void setCashSegment7(String cashSegment7) {
		this.cashSegment7 = cashSegment7;
	}
	public String getCashSegment8() {
		return cashSegment8;
	}
	public void setCashSegment8(String cashSegment8) {
		this.cashSegment8 = cashSegment8;
	}
	public String getCashSegment9() {
		return cashSegment9;
	}
	public void setCashSegment9(String cashSegment9) {
		this.cashSegment9 = cashSegment9;
	}
	public String getCashSegment10() {
		return cashSegment10;
	}
	public void setCashSegment10(String cashSegment10) {
		this.cashSegment10 = cashSegment10;
	}
	public String getCashSegment11() {
		return cashSegment11;
	}
	public void setCashSegment11(String cashSegment11) {
		this.cashSegment11 = cashSegment11;
	}
	public String getCashSegment12() {
		return cashSegment12;
	}
	public void setCashSegment12(String cashSegment12) {
		this.cashSegment12 = cashSegment12;
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
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String uodatedDate) {
		this.updatedDate = uodatedDate;
	}
}
