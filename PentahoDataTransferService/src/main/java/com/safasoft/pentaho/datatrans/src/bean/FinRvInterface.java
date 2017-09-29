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
@Table(name="FIN_RV_INTERFACE",schema="FINA")
public class FinRvInterface implements Serializable {

	@Id
  @Column(name="REFFERENCE_NO")
  private String refferenceNo;
	@Id
  @Column(name="CUSTOMER_ID")
  private String customerId;
  @Column(name="RV_MST_CODE")
  private String rvMstCode;
  @Column(name="FROM_DESCRIPTION")
  private String fromDescription;
  @Column(name="COYOUTLET_ID")
  private String coyoutletId;
  @Column(name="SRC_COYOUTLET_ID")
  private String srcCoyoutletId;
  @Column(name="RV_NO")
  private String rvNo;
  @Column(name="SEGMENT1")
  private String segment1;
  @Column(name="SEGMENT2")
  private String segment2;
  @Column(name="SEGMENT3")
  private String segment3;
  @Column(name="SEGMENT4")
  private String segment4;
  @Column(name="SEGMENT5")
  private String segment5;
  @Column(name="SEGMENT6")
  private String segment6;
  @Column(name="SEGMENT7")
  private String segment7;
  @Column(name="SEGMENT8")
  private String segment8;
  @Column(name="SEGMENT9")
  private String segment9;
  @Column(name="SEGMENT10")
  private String segment10;
  @Column(name="SEGMENT11")
  private String segment11;
  @Column(name="SEGMENT12")
  private String segment12;
  @Column(name="DR_OR_CR")
  private String drOrCr;
  @Column(name="TRXDTL_CODE")
  private String trxdtlCode;
  @Column(name="DESCRIPTION")
  private String description;
  @Column(name="RV_NET_AMOUNT")
  private Integer rvNetAmount;
  @Column(name="BANK_CODE")
  private String bankCode;
  @Column(name="CREATED_BY")
  private String createdBy;
  @Column(name="CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date createdDate;
  @Column(name="FEE_AMOUNT")
  private Integer feeAmount;
  
	public String getRefferenceNo() {
		return refferenceNo;
	}
	public void setRefferenceNo(String refferenceNo) {
		this.refferenceNo = refferenceNo;
	}
	public String getRvMstCode() {
		return rvMstCode;
	}
	public void setRvMstCode(String rvMstCode) {
		this.rvMstCode = rvMstCode;
	}
	public String getFromDescription() {
		return fromDescription;
	}
	public void setFromDescription(String fromDescription) {
		this.fromDescription = fromDescription;
	}
	public String getCoyoutletId() {
		return coyoutletId;
	}
	public void setCoyoutletId(String coyoutletId) {
		this.coyoutletId = coyoutletId;
	}
	public String getSrcCoyoutletId() {
		return srcCoyoutletId;
	}
	public void setSrcCoyoutletId(String srcCoyoutletId) {
		this.srcCoyoutletId = srcCoyoutletId;
	}
	public String getRvNo() {
		return rvNo;
	}
	public void setRvNo(String rvNo) {
		this.rvNo = rvNo;
	}
	public String getSegment1() {
		return segment1;
	}
	public void setSegment1(String segment1) {
		this.segment1 = segment1;
	}
	public String getSegment2() {
		return segment2;
	}
	public void setSegment2(String segment2) {
		this.segment2 = segment2;
	}
	public String getSegment3() {
		return segment3;
	}
	public void setSegment3(String segment3) {
		this.segment3 = segment3;
	}
	public String getSegment4() {
		return segment4;
	}
	public void setSegment4(String segment4) {
		this.segment4 = segment4;
	}
	public String getSegment5() {
		return segment5;
	}
	public void setSegment5(String segment5) {
		this.segment5 = segment5;
	}
	public String getSegment6() {
		return segment6;
	}
	public void setSegment6(String segment6) {
		this.segment6 = segment6;
	}
	public String getSegment7() {
		return segment7;
	}
	public void setSegment7(String segment7) {
		this.segment7 = segment7;
	}
	public String getSegment8() {
		return segment8;
	}
	public void setSegment8(String segment8) {
		this.segment8 = segment8;
	}
	public String getSegment9() {
		return segment9;
	}
	public void setSegment9(String segment9) {
		this.segment9 = segment9;
	}
	public String getSegment10() {
		return segment10;
	}
	public void setSegment10(String segment10) {
		this.segment10 = segment10;
	}
	public String getSegment11() {
		return segment11;
	}
	public void setSegment11(String segment11) {
		this.segment11 = segment11;
	}
	public String getSegment12() {
		return segment12;
	}
	public void setSegment12(String segment12) {
		this.segment12 = segment12;
	}
	public String getDrOrCr() {
		return drOrCr;
	}
	public void setDrOrCr(String drOrCr) {
		this.drOrCr = drOrCr;
	}
	public String getTrxdtlCode() {
		return trxdtlCode;
	}
	public void setTrxdtlCode(String trxdtlCode) {
		this.trxdtlCode = trxdtlCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Integer getRvNetAmount() {
		return rvNetAmount;
	}
	public void setRvNetAmount(Integer rvNetAmount) {
		this.rvNetAmount = rvNetAmount;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
	public Integer getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(Integer feeAmount) {
		this.feeAmount = feeAmount;
	}

}