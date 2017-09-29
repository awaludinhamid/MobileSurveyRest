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
@Table(name="CFIN_CFGROUP_ACCOUNT",schema="CFIN")
public class CfinCfgroupAccount implements Serializable {

	@Id
	@Column(name="BU_SHORTNAME")
	private String buShortname;
	@Id
	@Column(name="BU_ACCT_CODE")
	private String buAcctCode;
	@Id
	@Column(name="PLATFORM")
	private String platform;
	@Column(name="BU_SEGMENT1")
	private String buSegment1;
	@Column(name="BU_SEGMENT2")
	private String buSegment2;
	@Column(name="BU_SEGMENT3")
	private String buSegment3;
	@Column(name="BU_SEGMENT4")
	private String buSegment4;
	@Column(name="BU_SEGMENT5")
	private String buSegment5;
	@Column(name="BU_SEGMENT6")
	private String buSegment6;
	@Column(name="BU_SEGMENT7")
	private String buSegment7;
	@Column(name="BU_SEGMENT8")
	private String buSegment8;
	@Column(name="BU_SEGMENT9")
	private String buSegment9;
	@Column(name="BU_SEGMENT10")
	private String buSegment10;
	@Column(name="BU_SEGMENT11")
	private String buSegment11;
	@Column(name="BU_SEGMENT12")
	private String buSegment12;
	@Column(name="BU_CREATED_BY")
	private String buCreatedBy;
	@Column(name="BU_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date buCreatedDate;
	@Column(name="BU_UPDATED_BY")
	private String buUpdatedBy;
	@Column(name="BU_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date buUpdatedDate;
	
	public String getBuShortname() {
		return buShortname;
	}
	public void setBuShortname(String buShortname) {
		this.buShortname = buShortname;
	}
	public String getBuAcctCode() {
		return buAcctCode;
	}
	public void setBuAcctCode(String buAcctCode) {
		this.buAcctCode = buAcctCode;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getBuSegment1() {
		return buSegment1;
	}
	public void setBuSegment1(String buSegment1) {
		this.buSegment1 = buSegment1;
	}
	public String getBuSegment2() {
		return buSegment2;
	}
	public void setBuSegment2(String buSegment2) {
		this.buSegment2 = buSegment2;
	}
	public String getBuSegment3() {
		return buSegment3;
	}
	public void setBuSegment3(String buSegment3) {
		this.buSegment3 = buSegment3;
	}
	public String getBuSegment4() {
		return buSegment4;
	}
	public void setBuSegment4(String buSegment4) {
		this.buSegment4 = buSegment4;
	}
	public String getBuSegment5() {
		return buSegment5;
	}
	public void setBuSegment5(String buSegment5) {
		this.buSegment5 = buSegment5;
	}
	public String getBuSegment6() {
		return buSegment6;
	}
	public void setBuSegment6(String buSegment6) {
		this.buSegment6 = buSegment6;
	}
	public String getBuSegment7() {
		return buSegment7;
	}
	public void setBuSegment7(String buSegment7) {
		this.buSegment7 = buSegment7;
	}
	public String getBuSegment8() {
		return buSegment8;
	}
	public void setBuSegment8(String buSegment8) {
		this.buSegment8 = buSegment8;
	}
	public String getBuSegment9() {
		return buSegment9;
	}
	public void setBuSegment9(String buSegment9) {
		this.buSegment9 = buSegment9;
	}
	public String getBuSegment10() {
		return buSegment10;
	}
	public void setBuSegment10(String buSegment10) {
		this.buSegment10 = buSegment10;
	}
	public String getBuSegment11() {
		return buSegment11;
	}
	public void setBuSegment11(String buSegment11) {
		this.buSegment11 = buSegment11;
	}
	public String getBuSegment12() {
		return buSegment12;
	}
	public void setBuSegment12(String buSegment12) {
		this.buSegment12 = buSegment12;
	}
	public String getBuCreatedBy() {
		return buCreatedBy;
	}
	public void setBuCreatedBy(String buCreatedBy) {
		this.buCreatedBy = buCreatedBy;
	}
	public Date getBuCreatedDate() {
		return buCreatedDate;
	}
	public void setBuCreatedDate(Date buCreatedDate) {
		this.buCreatedDate = buCreatedDate;
	}
	public String getBuUpdatedBy() {
		return buUpdatedBy;
	}
	public void setBuUpdatedBy(String buUpdatedBy) {
		this.buUpdatedBy = buUpdatedBy;
	}
	public Date getBuUpdatedDate() {
		return buUpdatedDate;
	}
	public void setBuUpdatedDate(Date buUpdatedDate) {
		this.buUpdatedDate = buUpdatedDate;
	}
	
}
