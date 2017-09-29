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
@Table(name="FIN_MST_TRXDTL")
public class FinMstTrxdtlDest implements Serializable {

  @Id
  @Column(name="TRXDTL_CODE")
  private String trxdtlCode;
  @Column(name="TRXDTL_FLAG")
  private String trxdtlFlag;
  @Column(name="TRXDTL_DESC")
  private String trxdtlDesc;
  @Column(name="TRXDTL_SEGMENT1")
  private String trxdtlSegment1;
  @Column(name="TRXDTL_SEGMENT2")
  private String trxdtlSegment2;
  @Column(name="TRXDTL_SEGMENT3")
  private String trxdtlSegment3;
  @Column(name="TRXDTL_SEGMENT4")
  private String trxdtlSegment4;
  @Column(name="TRXDTL_SEGMENT5")
  private String trxdtlSegment5;
  @Column(name="TRXDTL_SEGMENT6")
  private String trxdtlSegment6;
  @Column(name="TRXDTL_SEGMENT7")
  private String trxdtlSegment7;
  @Column(name="TRXDTL_SEGMENT8")
  private String trxdtlSegment8;
  @Column(name="TRXDTL_SEGMENT9")
  private String trxdtlSegment9;
  @Column(name="TRXDTL_SEGMENT10")
  private String trxdtlSegment10;
  @Column(name="TRXDTL_SEGMENT11")
  private String trxdtlSegment11;
  @Column(name="TRXDTL_SEGMENT12")
  private String trxdtlSegment12;
  @Column(name="TRXDTL_CREATED_BY")
  private String trxdtlCreatedBy;
  @Column(name="TRXDTL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date trxdtlCreatedDate;
  @Column(name="TRXDTL_UPDATED_BY")
  private String trxdtlUpdatedBy;
  @Column(name="TRXDTL_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date trxdtlUpdatedDate;
  @Column(name="TRXDTL_PARAM")
  private String trxdtlParam;
  
	public String getTrxdtlCode() {
		return trxdtlCode;
	}
	public void setTrxdtlCode(String trxdtlCode) {
		this.trxdtlCode = trxdtlCode;
	}
	public String getTrxdtlFlag() {
		return trxdtlFlag;
	}
	public void setTrxdtlFlag(String trxdtlFlag) {
		this.trxdtlFlag = trxdtlFlag;
	}
	public String getTrxdtlDesc() {
		return trxdtlDesc;
	}
	public void setTrxdtlDesc(String trxdtlDesc) {
		this.trxdtlDesc = trxdtlDesc;
	}
	public String getTrxdtlSegment1() {
		return trxdtlSegment1;
	}
	public void setTrxdtlSegment1(String trxdtlSegment1) {
		this.trxdtlSegment1 = trxdtlSegment1;
	}
	public String getTrxdtlSegment2() {
		return trxdtlSegment2;
	}
	public void setTrxdtlSegment2(String trxdtlSegment2) {
		this.trxdtlSegment2 = trxdtlSegment2;
	}
	public String getTrxdtlSegment3() {
		return trxdtlSegment3;
	}
	public void setTrxdtlSegment3(String trxdtlSegment3) {
		this.trxdtlSegment3 = trxdtlSegment3;
	}
	public String getTrxdtlSegment4() {
		return trxdtlSegment4;
	}
	public void setTrxdtlSegment4(String trxdtlSegment4) {
		this.trxdtlSegment4 = trxdtlSegment4;
	}
	public String getTrxdtlSegment5() {
		return trxdtlSegment5;
	}
	public void setTrxdtlSegment5(String trxdtlSegment5) {
		this.trxdtlSegment5 = trxdtlSegment5;
	}
	public String getTrxdtlSegment6() {
		return trxdtlSegment6;
	}
	public void setTrxdtlSegment6(String trxdtlSegment6) {
		this.trxdtlSegment6 = trxdtlSegment6;
	}
	public String getTrxdtlSegment7() {
		return trxdtlSegment7;
	}
	public void setTrxdtlSegment7(String trxdtlSegment7) {
		this.trxdtlSegment7 = trxdtlSegment7;
	}
	public String getTrxdtlSegment8() {
		return trxdtlSegment8;
	}
	public void setTrxdtlSegment8(String trxdtlSegment8) {
		this.trxdtlSegment8 = trxdtlSegment8;
	}
	public String getTrxdtlSegment9() {
		return trxdtlSegment9;
	}
	public void setTrxdtlSegment9(String trxdtlSegment9) {
		this.trxdtlSegment9 = trxdtlSegment9;
	}
	public String getTrxdtlSegment10() {
		return trxdtlSegment10;
	}
	public void setTrxdtlSegment10(String trxdtlSegment10) {
		this.trxdtlSegment10 = trxdtlSegment10;
	}
	public String getTrxdtlSegment11() {
		return trxdtlSegment11;
	}
	public void setTrxdtlSegment11(String trxdtlSegment11) {
		this.trxdtlSegment11 = trxdtlSegment11;
	}
	public String getTrxdtlSegment12() {
		return trxdtlSegment12;
	}
	public void setTrxdtlSegment12(String trxdtlSegment12) {
		this.trxdtlSegment12 = trxdtlSegment12;
	}
	public String getTrxdtlCreatedBy() {
		return trxdtlCreatedBy;
	}
	public void setTrxdtlCreatedBy(String trxdtlCreatedBy) {
		this.trxdtlCreatedBy = trxdtlCreatedBy;
	}
	public Date getTrxdtlCreatedDate() {
		return trxdtlCreatedDate;
	}
	public void setTrxdtlCreatedDate(Date trxdtlCreatedDate) {
		this.trxdtlCreatedDate = trxdtlCreatedDate;
	}
	public String getTrxdtlUpdatedBy() {
		return trxdtlUpdatedBy;
	}
	public void setTrxdtlUpdatedBy(String trxdtlUpdatedBy) {
		this.trxdtlUpdatedBy = trxdtlUpdatedBy;
	}
	public Date getTrxdtlUpdatedDate() {
		return trxdtlUpdatedDate;
	}
	public void setTrxdtlUpdatedDate(Date trxdtlUpdatedDate) {
		this.trxdtlUpdatedDate = trxdtlUpdatedDate;
	}
	public String getTrxdtlParam() {
		return trxdtlParam;
	}
	public void setTrxdtlParam(String trxdtlParam) {
		this.trxdtlParam = trxdtlParam;
	}

}