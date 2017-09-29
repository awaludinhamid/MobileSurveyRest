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
@Table(name="RINV_PKGSOLD_HDR",schema="COLL")
public class RinvPkgsoldHdr implements Serializable {

  @Id
  @Column(name="SOLD_PACKAGE_NO")
  private String soldPackageNo;                                                                   
  @Column(name="SOLD_COYOULET_ID")
  private String soldCoyouletId;                                                                      
  @Column(name="SOLD_PACKAGE_DATE")
  @Temporal(TemporalType.DATE)
  private Date soldPackageDate;                                        
  @Column(name="SOLD_TYPE")
  private String soldType;                                                                                   
  @Column(name="SOLD_PAYMENT_TYPE")
  private String soldPaymentType;                                                                    
  @Column(name="SOLD_CASH_OR_DEPO")
  private String soldCashOrDepo;                                                                     
  @Column(name="SOLD_PACKAGE_STATUS")
  private String soldPackageStatus;                                                                
  @Column(name="SOLD_CREATED_BY")
  private String soldCreatedBy;                                                                        
  @Column(name="SOLD_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date soldCreatedDate;                                        
  @Column(name="SOLD_UPDATED_BY")
  private String soldUpdatedBy;                                                                        
  @Column(name="SOLD_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date soldUpdatedDate;                                        
  @Column(name="SOLD_APPRCANCEL_BY")
  private String soldApprcancelBy;                                                                  
  @Column(name="SOLD_APPRCANCEL_DATE")
  @Temporal(TemporalType.DATE)
  private Date soldApprcancelDate;                                  
  @Column(name="SOLD_REASON")
  private String soldReason;                                                                               
  @Column(name="SOLD_REFF_MEMO_NO")
  private String soldReffMemoNo;                                                                     
  @Column(name="SOLD_BUYER_CUSTID")
  private String soldBuyerCustid;                                                                    
  @Column(name="SOLD_BUYER_NAME")
  private String soldBuyerName;                                                                        
  @Column(name="SOLD_RECEIVE_NO")
  private String soldReceiveNo;                                                                        
  @Column(name="SOLD_RECEIVE_DATE")
  @Temporal(TemporalType.DATE)
  private Date soldReceiveDate;                                        
  @Column(name="SOLD_BUYER_ID")
  private String soldBuyerId;                                                                            
  @Column(name="SOLD_BUYER_ADDR")
  private String soldBuyerAddr;                                                                        
  @Column(name="SOLD_REQ_OS")
  private String soldReqOs;                                                                                
  @Column(name="SOLD_REASON_REVREJ")
  private String soldReasonRevrej;                                                                  
  @Column(name="SOLD_SUBMIT_TITIPAN_NO")
  private String soldSubmitTitipanNo;                                                           
  @Column(name="SOLD_SUBMIT_TITIPAN_STS")
  private String soldSubmitTitipanSts;                                                         
  @Column(name="SOLD_SEND_MAIL_OK")
  private Integer soldSendMailOk;                                                                    
  @Column(name="SOLD_SEND_MAIL_DEPO_OK")
  private Integer soldSendMailDepoOk;
  
	public String getSoldPackageNo() {
		return soldPackageNo;
	}
	public void setSoldPackageNo(String soldPackageNo) {
		this.soldPackageNo = soldPackageNo;
	}
	public String getSoldCoyouletId() {
		return soldCoyouletId;
	}
	public void setSoldCoyouletId(String soldCoyouletId) {
		this.soldCoyouletId = soldCoyouletId;
	}
	public Date getSoldPackageDate() {
		return soldPackageDate;
	}
	public void setSoldPackageDate(Date soldPackageDate) {
		this.soldPackageDate = soldPackageDate;
	}
	public String getSoldType() {
		return soldType;
	}
	public void setSoldType(String soldType) {
		this.soldType = soldType;
	}
	public String getSoldPaymentType() {
		return soldPaymentType;
	}
	public void setSoldPaymentType(String soldPaymentType) {
		this.soldPaymentType = soldPaymentType;
	}
	public String getSoldCashOrDepo() {
		return soldCashOrDepo;
	}
	public void setSoldCashOrDepo(String soldCashOrDepo) {
		this.soldCashOrDepo = soldCashOrDepo;
	}
	public String getSoldPackageStatus() {
		return soldPackageStatus;
	}
	public void setSoldPackageStatus(String soldPackageStatus) {
		this.soldPackageStatus = soldPackageStatus;
	}
	public String getSoldCreatedBy() {
		return soldCreatedBy;
	}
	public void setSoldCreatedBy(String soldCreatedBy) {
		this.soldCreatedBy = soldCreatedBy;
	}
	public Date getSoldCreatedDate() {
		return soldCreatedDate;
	}
	public void setSoldCreatedDate(Date soldCreatedDate) {
		this.soldCreatedDate = soldCreatedDate;
	}
	public String getSoldUpdatedBy() {
		return soldUpdatedBy;
	}
	public void setSoldUpdatedBy(String soldUpdatedBy) {
		this.soldUpdatedBy = soldUpdatedBy;
	}
	public Date getSoldUpdatedDate() {
		return soldUpdatedDate;
	}
	public void setSoldUpdatedDate(Date soldUpdatedDate) {
		this.soldUpdatedDate = soldUpdatedDate;
	}
	public String getSoldApprcancelBy() {
		return soldApprcancelBy;
	}
	public void setSoldApprcancelBy(String soldApprcancelBy) {
		this.soldApprcancelBy = soldApprcancelBy;
	}
	public Date getSoldApprcancelDate() {
		return soldApprcancelDate;
	}
	public void setSoldApprcancelDate(Date soldApprcancelDate) {
		this.soldApprcancelDate = soldApprcancelDate;
	}
	public String getSoldReason() {
		return soldReason;
	}
	public void setSoldReason(String soldReason) {
		this.soldReason = soldReason;
	}
	public String getSoldReffMemoNo() {
		return soldReffMemoNo;
	}
	public void setSoldReffMemoNo(String soldReffMemoNo) {
		this.soldReffMemoNo = soldReffMemoNo;
	}
	public String getSoldBuyerCustid() {
		return soldBuyerCustid;
	}
	public void setSoldBuyerCustid(String soldBuyerCustid) {
		this.soldBuyerCustid = soldBuyerCustid;
	}
	public String getSoldBuyerName() {
		return soldBuyerName;
	}
	public void setSoldBuyerName(String soldBuyerName) {
		this.soldBuyerName = soldBuyerName;
	}
	public String getSoldReceiveNo() {
		return soldReceiveNo;
	}
	public void setSoldReceiveNo(String soldReceiveNo) {
		this.soldReceiveNo = soldReceiveNo;
	}
	public Date getSoldReceiveDate() {
		return soldReceiveDate;
	}
	public void setSoldReceiveDate(Date soldReceiveDate) {
		this.soldReceiveDate = soldReceiveDate;
	}
	public String getSoldBuyerId() {
		return soldBuyerId;
	}
	public void setSoldBuyerId(String soldBuyerId) {
		this.soldBuyerId = soldBuyerId;
	}
	public String getSoldBuyerAddr() {
		return soldBuyerAddr;
	}
	public void setSoldBuyerAddr(String soldBuyerAddr) {
		this.soldBuyerAddr = soldBuyerAddr;
	}
	public String getSoldReqOs() {
		return soldReqOs;
	}
	public void setSoldReqOs(String soldReqOs) {
		this.soldReqOs = soldReqOs;
	}
	public String getSoldReasonRevrej() {
		return soldReasonRevrej;
	}
	public void setSoldReasonRevrej(String soldReasonRevrej) {
		this.soldReasonRevrej = soldReasonRevrej;
	}
	public String getSoldSubmitTitipanNo() {
		return soldSubmitTitipanNo;
	}
	public void setSoldSubmitTitipanNo(String soldSubmitTitipanNo) {
		this.soldSubmitTitipanNo = soldSubmitTitipanNo;
	}
	public String getSoldSubmitTitipanSts() {
		return soldSubmitTitipanSts;
	}
	public void setSoldSubmitTitipanSts(String soldSubmitTitipanSts) {
		this.soldSubmitTitipanSts = soldSubmitTitipanSts;
	}
	public Integer getSoldSendMailOk() {
		return soldSendMailOk;
	}
	public void setSoldSendMailOk(Integer soldSendMailOk) {
		this.soldSendMailOk = soldSendMailOk;
	}
	public Integer getSoldSendMailDepoOk() {
		return soldSendMailDepoOk;
	}
	public void setSoldSendMailDepoOk(Integer soldSendMailDepoOk) {
		this.soldSendMailDepoOk = soldSendMailDepoOk;
	}
}