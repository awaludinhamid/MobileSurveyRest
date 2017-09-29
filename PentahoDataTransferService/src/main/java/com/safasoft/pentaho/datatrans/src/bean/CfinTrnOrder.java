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
@Table(name="CFIN_TRN_ORDER",schema="CFIN")
public class CfinTrnOrder implements Serializable {

  @Id
  @Column(name="ORD_ORDER_ID")
  private String ordOrderId;
  @Column(name="ORD_CUST_ID")
  private String ordCustId;
  @Column(name="ORD_ORDER_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordOrderDate;
  @Column(name="ORD_ORDER_TYPE")
  private String ordOrderType;
  @Column(name="ORD_GROUPCUST_ID")
  private String ordGroupcustId;
  @Column(name="ORD_COYOUTLET_ID")
  private String ordCoyoutletId;
  @Column(name="ORD_REFF_CUSTID")
  private String ordReffCustid;
  @Column(name="ORD_CFIN_GROUP")
  private String ordCfinGroup;
  @Column(name="ORD_SYARIAH_FLAG")
  private String ordSyariahFlag;
  @Column(name="ORD_APPRV_STS")
  private String ordApprvSts;
  @Column(name="ORD_SURVEYOR_ID")
  private Double ordSurveyorId;
  @Column(name="ORD_CS_ID")
  private Double ordCsId;
  @Column(name="ORD_PRODUCT_BRAND")
  private String ordProductBrand;
  @Column(name="ORD_MARKET_PROG")
  private String ordMarketProg;
  @Column(name="ORD_OBJECT_FLAG")
  private String ordObjectFlag;
  @Column(name="ORD_CATT_SURVEY")
  private String ordCattSurvey;
  @Column(name="ORD_APPROVE1_BY")
  private String ordApprove1By;
  @Column(name="ORD_APPROVE1_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordApprove1Date;
  @Column(name="ORD_APPROVE2_BY")
  private String ordApprove2By;
  @Column(name="ORD_APPROVE2_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordApprove2Date;
  @Column(name="ORD_APPROVE3_BY")
  private String ordApprove3By;
  @Column(name="ORD_APPROVE3_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordApprove3Date;
  @Column(name="ORD_APPROVE4_BY")
  private String ordApprove4By;
  @Column(name="ORD_APPROVE4_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordApprove4Date;
  @Column(name="ORD_CREATED_BY")
  private String ordCreatedBy;
  @Column(name="ORD_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordCreatedDate;
  @Column(name="ORD_UPDATED_BY")
  private String ordUpdatedBy;
  @Column(name="ORD_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date ordUpdatedDate;
  @Column(name="ORD_SUPL_REFF_ID")
  private String ordSuplReffId;
  @Column(name="ORD_CURRENCY")
  private String ordCurrency;
  @Column(name="ORD_CARA_BAYAR")
  private String ordCaraBayar;
  @Column(name="ORD_SOURCE")
  private String ordSource;
  @Column(name="ORD_MT_SHT")
  private String ordMtSht;
  @Column(name="ORD_SOB_ID")
  private String ordSobId;
  @Column(name="ORD_COYOUTLET_POS")
  private String ordCoyoutletPos;
  @Column(name="ORD_REASON_PINJAMAN")
  private String ordReasonPinjaman;
  @Column(name="ORD_SURVEY_FLAG")
  private String ordSurveyFlag;
  
	public String getOrdOrderId() {
		return ordOrderId;
	}
	public void setOrdOrderId(String ordOrderId) {
		this.ordOrderId = ordOrderId;
	}
	public String getOrdCustId() {
		return ordCustId;
	}
	public void setOrdCustId(String ordCustId) {
		this.ordCustId = ordCustId;
	}
	public Date getOrdOrderDate() {
		return ordOrderDate;
	}
	public void setOrdOrderDate(Date ordOrderDate) {
		this.ordOrderDate = ordOrderDate;
	}
	public String getOrdOrderType() {
		return ordOrderType;
	}
	public void setOrdOrderType(String ordOrderType) {
		this.ordOrderType = ordOrderType;
	}
	public String getOrdGroupcustId() {
		return ordGroupcustId;
	}
	public void setOrdGroupcustId(String ordGroupcustId) {
		this.ordGroupcustId = ordGroupcustId;
	}
	public String getOrdCoyoutletId() {
		return ordCoyoutletId;
	}
	public void setOrdCoyoutletId(String ordCoyoutletId) {
		this.ordCoyoutletId = ordCoyoutletId;
	}
	public String getOrdReffCustid() {
		return ordReffCustid;
	}
	public void setOrdReffCustid(String ordReffCustid) {
		this.ordReffCustid = ordReffCustid;
	}
	public String getOrdCfinGroup() {
		return ordCfinGroup;
	}
	public void setOrdCfinGroup(String ordCfinGroup) {
		this.ordCfinGroup = ordCfinGroup;
	}
	public String getOrdSyariahFlag() {
		return ordSyariahFlag;
	}
	public void setOrdSyariahFlag(String ordSyariahFlag) {
		this.ordSyariahFlag = ordSyariahFlag;
	}
	public String getOrdApprvSts() {
		return ordApprvSts;
	}
	public void setOrdApprvSts(String ordApprvSts) {
		this.ordApprvSts = ordApprvSts;
	}
	public Double getOrdSurveyorId() {
		return ordSurveyorId;
	}
	public void setOrdSurveyorId(Double ordSurveyorId) {
		this.ordSurveyorId = ordSurveyorId;
	}
	public Double getOrdCsId() {
		return ordCsId;
	}
	public void setOrdCsId(Double ordCsId) {
		this.ordCsId = ordCsId;
	}
	public String getOrdProductBrand() {
		return ordProductBrand;
	}
	public void setOrdProductBrand(String ordProductBrand) {
		this.ordProductBrand = ordProductBrand;
	}
	public String getOrdMarketProg() {
		return ordMarketProg;
	}
	public void setOrdMarketProg(String ordMarketProg) {
		this.ordMarketProg = ordMarketProg;
	}
	public String getOrdObjectFlag() {
		return ordObjectFlag;
	}
	public void setOrdObjectFlag(String ordObjectFlag) {
		this.ordObjectFlag = ordObjectFlag;
	}
	public String getOrdCattSurvey() {
		return ordCattSurvey;
	}
	public void setOrdCattSurvey(String ordCattSurvey) {
		this.ordCattSurvey = ordCattSurvey;
	}
	public String getOrdApprove1By() {
		return ordApprove1By;
	}
	public void setOrdApprove1By(String ordApprove1By) {
		this.ordApprove1By = ordApprove1By;
	}
	public Date getOrdApprove1Date() {
		return ordApprove1Date;
	}
	public void setOrdApprove1Date(Date ordApprove1Date) {
		this.ordApprove1Date = ordApprove1Date;
	}
	public String getOrdApprove2By() {
		return ordApprove2By;
	}
	public void setOrdApprove2By(String ordApprove2By) {
		this.ordApprove2By = ordApprove2By;
	}
	public Date getOrdApprove2Date() {
		return ordApprove2Date;
	}
	public void setOrdApprove2Date(Date ordApprove2Date) {
		this.ordApprove2Date = ordApprove2Date;
	}
	public String getOrdApprove3By() {
		return ordApprove3By;
	}
	public void setOrdApprove3By(String ordApprove3By) {
		this.ordApprove3By = ordApprove3By;
	}
	public Date getOrdApprove3Date() {
		return ordApprove3Date;
	}
	public void setOrdApprove3Date(Date ordApprove3Date) {
		this.ordApprove3Date = ordApprove3Date;
	}
	public String getOrdApprove4By() {
		return ordApprove4By;
	}
	public void setOrdApprove4By(String ordApprove4By) {
		this.ordApprove4By = ordApprove4By;
	}
	public Date getOrdApprove4Date() {
		return ordApprove4Date;
	}
	public void setOrdApprove4Date(Date ordApprove4Date) {
		this.ordApprove4Date = ordApprove4Date;
	}
	public String getOrdCreatedBy() {
		return ordCreatedBy;
	}
	public void setOrdCreatedBy(String ordCreatedBy) {
		this.ordCreatedBy = ordCreatedBy;
	}
	public Date getOrdCreatedDate() {
		return ordCreatedDate;
	}
	public void setOrdCreatedDate(Date ordCreatedDate) {
		this.ordCreatedDate = ordCreatedDate;
	}
	public String getOrdUpdatedBy() {
		return ordUpdatedBy;
	}
	public void setOrdUpdatedBy(String ordUpdatedBy) {
		this.ordUpdatedBy = ordUpdatedBy;
	}
	public Date getOrdUpdatedDate() {
		return ordUpdatedDate;
	}
	public void setOrdUpdatedDate(Date ordUpdatedDate) {
		this.ordUpdatedDate = ordUpdatedDate;
	}
	public String getOrdSuplReffId() {
		return ordSuplReffId;
	}
	public void setOrdSuplReffId(String ordSuplReffId) {
		this.ordSuplReffId = ordSuplReffId;
	}
	public String getOrdCurrency() {
		return ordCurrency;
	}
	public void setOrdCurrency(String ordCurrency) {
		this.ordCurrency = ordCurrency;
	}
	public String getOrdCaraBayar() {
		return ordCaraBayar;
	}
	public void setOrdCaraBayar(String ordCaraBayar) {
		this.ordCaraBayar = ordCaraBayar;
	}
	public String getOrdSource() {
		return ordSource;
	}
	public void setOrdSource(String ordSource) {
		this.ordSource = ordSource;
	}
	public String getOrdMtSht() {
		return ordMtSht;
	}
	public void setOrdMtSht(String ordMtSht) {
		this.ordMtSht = ordMtSht;
	}
	public String getOrdSobId() {
		return ordSobId;
	}
	public void setOrdSobId(String ordSobId) {
		this.ordSobId = ordSobId;
	}
	public String getOrdCoyoutletPos() {
		return ordCoyoutletPos;
	}
	public void setOrdCoyoutletPos(String ordCoyoutletPos) {
		this.ordCoyoutletPos = ordCoyoutletPos;
	}
	public String getOrdReasonPinjaman() {
		return ordReasonPinjaman;
	}
	public void setOrdReasonPinjaman(String ordReasonPinjaman) {
		this.ordReasonPinjaman = ordReasonPinjaman;
	}
	public String getOrdSurveyFlag() {
		return ordSurveyFlag;
	}
	public void setOrdSurveyFlag(String ordSurveyFlag) {
		this.ordSurveyFlag = ordSurveyFlag;
	}

}