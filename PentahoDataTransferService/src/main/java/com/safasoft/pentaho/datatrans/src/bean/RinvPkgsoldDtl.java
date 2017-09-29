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
@Table(name="RINV_PKGSOLD_DTL",schema="COLL")
public class RinvPkgsoldDtl implements Serializable {

	@Id
  @Column(name="DTLSOLD_PACKAGE_NO")
  private String dtlsoldPackageNo;                                                             
  @Id
  @Column(name="DTLSOLD_INVT_ID")
  private String dtlsoldInvtId;                                                                   
  @Column(name="DTLSOLD_SOLD_PRICE")
  private Long dtlsoldSoldPrice;                                                                    
  @Column(name="DTLSOLD_PROFIT_DEALER")
  private Long dtlsoldProfitDealer;                                                              
  @Column(name="DTLSOLD_RECEIVED_NO")
  private String dtlsoldReceivedNo;                                                                
  @Column(name="DTLSOLD_RECEIVED_DATE")
  @Temporal(TemporalType.DATE)
  private Date dtlsoldReceivedDate;                                
  @Column(name="DTLSOLD_CREATED_BY")
  private String dtlsoldCreatedBy;                                                                  
  @Column(name="DTLSOLD_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date dtlsoldCreatedDate;                                  
  @Column(name="DTLSOLD_UPDATED_BY")
  private String dtlsoldUpdatedBy;                                                                  
  @Column(name="DTLSOLD_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date dtlsoldUpdatedDate;                                  
  @Column(name="DTLSOLD_BUYER_CUSTID1")
  private String dtlsoldBuyerCustid1;                                                            
  @Column(name="DTLSOLD_BUYER_PRICE1")
  private Long dtlsoldBuyerPrice1;                                                                
  @Column(name="DTLSOLD_BUYER_CUSTID2")
  private String dtlsoldBuyerCustid2;                                                            
  @Column(name="DTLSOLD_BUYER_PRICE2")
  private Long dtlsoldBuyerPrice2;                                                                
  @Column(name="DTLSOLD_BUYER_CUSTID3")
  private String dtlsoldBuyerCustid3;                                                            
  @Column(name="DTLSOLD_BUYER_PRICE3")
  private Long dtlsoldBuyerPrice3;                                                                
  @Column(name="DTLSOLD_FINAL_CUSTID")
  private String dtlsoldFinalCustid;                                                              
  @Column(name="DTLSOLD_FINAL_PRICE")
  private Long dtlsoldFinalPrice;                                                                  
  @Column(name="DTLSOLD_HISTORY_PEMENANG")
  private String dtlsoldHistoryPemenang;
  
	public String getDtlsoldPackageNo() {
		return dtlsoldPackageNo;
	}
	public void setDtlsoldPackageNo(String dtlsoldPackageNo) {
		this.dtlsoldPackageNo = dtlsoldPackageNo;
	}
	public String getDtlsoldInvtId() {
		return dtlsoldInvtId;
	}
	public void setDtlsoldInvtId(String dtlsoldInvtId) {
		this.dtlsoldInvtId = dtlsoldInvtId;
	}
	public Long getDtlsoldSoldPrice() {
		return dtlsoldSoldPrice;
	}
	public void setDtlsoldSoldPrice(Long dtlsoldSoldPrice) {
		this.dtlsoldSoldPrice = dtlsoldSoldPrice;
	}
	public Long getDtlsoldProfitDealer() {
		return dtlsoldProfitDealer;
	}
	public void setDtlsoldProfitDealer(Long dtlsoldProfitDealer) {
		this.dtlsoldProfitDealer = dtlsoldProfitDealer;
	}
	public String getDtlsoldReceivedNo() {
		return dtlsoldReceivedNo;
	}
	public void setDtlsoldReceivedNo(String dtlsoldReceivedNo) {
		this.dtlsoldReceivedNo = dtlsoldReceivedNo;
	}
	public Date getDtlsoldReceivedDate() {
		return dtlsoldReceivedDate;
	}
	public void setDtlsoldReceivedDate(Date dtlsoldReceivedDate) {
		this.dtlsoldReceivedDate = dtlsoldReceivedDate;
	}
	public String getDtlsoldCreatedBy() {
		return dtlsoldCreatedBy;
	}
	public void setDtlsoldCreatedBy(String dtlsoldCreatedBy) {
		this.dtlsoldCreatedBy = dtlsoldCreatedBy;
	}
	public Date getDtlsoldCreatedDate() {
		return dtlsoldCreatedDate;
	}
	public void setDtlsoldCreatedDate(Date dtlsoldCreatedDate) {
		this.dtlsoldCreatedDate = dtlsoldCreatedDate;
	}
	public String getDtlsoldUpdatedBy() {
		return dtlsoldUpdatedBy;
	}
	public void setDtlsoldUpdatedBy(String dtlsoldUpdatedBy) {
		this.dtlsoldUpdatedBy = dtlsoldUpdatedBy;
	}
	public Date getDtlsoldUpdatedDate() {
		return dtlsoldUpdatedDate;
	}
	public void setDtlsoldUpdatedDate(Date dtlsoldUpdatedDate) {
		this.dtlsoldUpdatedDate = dtlsoldUpdatedDate;
	}
	public String getDtlsoldBuyerCustid1() {
		return dtlsoldBuyerCustid1;
	}
	public void setDtlsoldBuyerCustid1(String dtlsoldBuyerCustid1) {
		this.dtlsoldBuyerCustid1 = dtlsoldBuyerCustid1;
	}
	public Long getDtlsoldBuyerPrice1() {
		return dtlsoldBuyerPrice1;
	}
	public void setDtlsoldBuyerPrice1(Long dtlsoldBuyerPrice1) {
		this.dtlsoldBuyerPrice1 = dtlsoldBuyerPrice1;
	}
	public String getDtlsoldBuyerCustid2() {
		return dtlsoldBuyerCustid2;
	}
	public void setDtlsoldBuyerCustid2(String dtlsoldBuyerCustid2) {
		this.dtlsoldBuyerCustid2 = dtlsoldBuyerCustid2;
	}
	public Long getDtlsoldBuyerPrice2() {
		return dtlsoldBuyerPrice2;
	}
	public void setDtlsoldBuyerPrice2(Long dtlsoldBuyerPrice2) {
		this.dtlsoldBuyerPrice2 = dtlsoldBuyerPrice2;
	}
	public String getDtlsoldBuyerCustid3() {
		return dtlsoldBuyerCustid3;
	}
	public void setDtlsoldBuyerCustid3(String dtlsoldBuyerCustid3) {
		this.dtlsoldBuyerCustid3 = dtlsoldBuyerCustid3;
	}
	public Long getDtlsoldBuyerPrice3() {
		return dtlsoldBuyerPrice3;
	}
	public void setDtlsoldBuyerPrice3(Long dtlsoldBuyerPrice3) {
		this.dtlsoldBuyerPrice3 = dtlsoldBuyerPrice3;
	}
	public String getDtlsoldFinalCustid() {
		return dtlsoldFinalCustid;
	}
	public void setDtlsoldFinalCustid(String dtlsoldFinalCustid) {
		this.dtlsoldFinalCustid = dtlsoldFinalCustid;
	}
	public Long getDtlsoldFinalPrice() {
		return dtlsoldFinalPrice;
	}
	public void setDtlsoldFinalPrice(Long dtlsoldFinalPrice) {
		this.dtlsoldFinalPrice = dtlsoldFinalPrice;
	}
	public String getDtlsoldHistoryPemenang() {
		return dtlsoldHistoryPemenang;
	}
	public void setDtlsoldHistoryPemenang(String dtlsoldHistoryPemenang) {
		this.dtlsoldHistoryPemenang = dtlsoldHistoryPemenang;
	} 
}