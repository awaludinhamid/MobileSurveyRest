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
@Table(name="RINV_TRN_INVENTORY")
public class RinvTrnInventoryDest implements Serializable {

  @Id
  @Column(name="INVT_ID")
  private String invtId;                                                                                  
  @Column(name="INVT_FINANCE_PROD")
  private String invtFinanceProd;                                                                    
  @Column(name="INVT_PRICING_OUTLET")
  private String invtPricingOutlet;                                                                
  @Column(name="INVT_LOCATION_TYPE")
  private String invtLocationType;                                                                  
  @Column(name="INVT_LOCATION_ID")
  private String invtLocationId;                                                                      
  @Column(name="INVT_SOLD_READY_DATE")
  @Temporal(TemporalType.DATE)
  private Date invtSoldReadyDate;                                   
  @Column(name="INVT_STOCK_STATUS")
  private String invtStockStatus;                                                                    
  @Column(name="INVT_LASTPROCESS_STATUS")
  private String invtLastprocessStatus;                                                        
  @Column(name="INVT_CONTRACT_NO")
  private String invtContractNo;                                                                      
  @Column(name="INVT_OBJT_SEQN")
  private Integer invtObjtSeqn;                                                                         
  @Column(name="INVT_OBJECT_ID")
  private String invtObjectId;                                                                          
  @Column(name="INVT_OBJT_TYPE_ID")
  private String invtObjtTypeId;                                                                     
  @Column(name="INVT_OBJECT_TYPE_FLAG")
  private String invtObjectTypeFlag;                                                             
  @Column(name="INVT_NAME")
  private String invtName;                                                                                   
  @Column(name="INVT_BRAND")
  private String invtBrand;                                                                                 
  @Column(name="INVT_MODEL")
  private String invtModel;                                                                                 
  @Column(name="INVT_TYPE")
  private String invtType;                                                                                   
  @Column(name="INVT_TAHUN")
  private Integer invtTahun;                                                                                
  @Column(name="INVT_WARNA")
  private String invtWarna;                                                                                 
  @Column(name="INVT_FRAME_NO")
  private String invtFrameNo;                                                                            
  @Column(name="INVT_ENGINE_NO")
  private String invtEngineNo;                                                                          
  @Column(name="INVT_SERIAL_NO")
  private String invtSerialNo;                                                                          
  @Column(name="INVT_CAP_SIZE")
  private String invtCapSize;                                                                            
  @Column(name="INVT_BPKB_NAME")
  private String invtBpkbName;                                                                          
  @Column(name="INVT_BPKB_ADDR")
  private String invtBpkbAddr;                                                                          
  @Column(name="INVT_BPKB_OCCUP")
  private String invtBpkbOccup;                                                                        
  @Column(name="INVT_NO_POLISI")
  private String invtNoPolisi;                                                                          
  @Column(name="INVT_STNK_ADA")
  private String invtStnkAda;                                                                            
  @Column(name="INVT_JTEMP_STNK")
  @Temporal(TemporalType.DATE)
  private Date invtJtempStnk;                                            
  @Column(name="INVT_FIRST_GRADE")
  private String invtFirstGrade;                                                                      
  @Column(name="INVT_LAST_GRADE")
  private String invtLastGrade;                                                                        
  @Column(name="INVT_CREATED_BY")
  private String invtCreatedBy;                                                                        
  @Column(name="INVT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date invtCreatedDate;                                        
  @Column(name="INVT_UPDATED_BY")
  private String invtUpdatedBy;                                                                        
  @Column(name="INVT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date invtUpdatedDate;                                        
  @Column(name="INVT_RECONDITION_FLAG")
  private String invtReconditionFlag;                                                            
  @Column(name="INVT_STOCK_IN_DATE")
  @Temporal(TemporalType.DATE)
  private Date invtStockInDate;
  
	public String getInvtId() {
		return invtId;
	}
	public void setInvtId(String invtId) {
		this.invtId = invtId;
	}
	public String getInvtFinanceProd() {
		return invtFinanceProd;
	}
	public void setInvtFinanceProd(String invtFinanceProd) {
		this.invtFinanceProd = invtFinanceProd;
	}
	public String getInvtPricingOutlet() {
		return invtPricingOutlet;
	}
	public void setInvtPricingOutlet(String invtPricingOutlet) {
		this.invtPricingOutlet = invtPricingOutlet;
	}
	public String getInvtLocationType() {
		return invtLocationType;
	}
	public void setInvtLocationType(String invtLocationType) {
		this.invtLocationType = invtLocationType;
	}
	public String getInvtLocationId() {
		return invtLocationId;
	}
	public void setInvtLocationId(String invtLocationId) {
		this.invtLocationId = invtLocationId;
	}
	public Date getInvtSoldReadyDate() {
		return invtSoldReadyDate;
	}
	public void setInvtSoldReadyDate(Date invtSoldReadyDate) {
		this.invtSoldReadyDate = invtSoldReadyDate;
	}
	public String getInvtStockStatus() {
		return invtStockStatus;
	}
	public void setInvtStockStatus(String invtStockStatus) {
		this.invtStockStatus = invtStockStatus;
	}
	public String getInvtLastprocessStatus() {
		return invtLastprocessStatus;
	}
	public void setInvtLastprocessStatus(String invtLastprocessStatus) {
		this.invtLastprocessStatus = invtLastprocessStatus;
	}
	public String getInvtContractNo() {
		return invtContractNo;
	}
	public void setInvtContractNo(String invtContractNo) {
		this.invtContractNo = invtContractNo;
	}
	public Integer getInvtObjtSeqn() {
		return invtObjtSeqn;
	}
	public void setInvtObjtSeqn(Integer invtObjtSeqn) {
		this.invtObjtSeqn = invtObjtSeqn;
	}
	public String getInvtObjectId() {
		return invtObjectId;
	}
	public void setInvtObjectId(String invtObjectId) {
		this.invtObjectId = invtObjectId;
	}
	public String getInvtObjtTypeId() {
		return invtObjtTypeId;
	}
	public void setInvtObjtTypeId(String invtObjtTypeId) {
		this.invtObjtTypeId = invtObjtTypeId;
	}
	public String getInvtObjectTypeFlag() {
		return invtObjectTypeFlag;
	}
	public void setInvtObjectTypeFlag(String invtObjectTypeFlag) {
		this.invtObjectTypeFlag = invtObjectTypeFlag;
	}
	public String getInvtName() {
		return invtName;
	}
	public void setInvtName(String invtName) {
		this.invtName = invtName;
	}
	public String getInvtBrand() {
		return invtBrand;
	}
	public void setInvtBrand(String invtBrand) {
		this.invtBrand = invtBrand;
	}
	public String getInvtModel() {
		return invtModel;
	}
	public void setInvtModel(String invtModel) {
		this.invtModel = invtModel;
	}
	public String getInvtType() {
		return invtType;
	}
	public void setInvtType(String invtType) {
		this.invtType = invtType;
	}
	public Integer getInvtTahun() {
		return invtTahun;
	}
	public void setInvtTahun(Integer invtTahun) {
		this.invtTahun = invtTahun;
	}
	public String getInvtWarna() {
		return invtWarna;
	}
	public void setInvtWarna(String invtWarna) {
		this.invtWarna = invtWarna;
	}
	public String getInvtFrameNo() {
		return invtFrameNo;
	}
	public void setInvtFrameNo(String invtFrameNo) {
		this.invtFrameNo = invtFrameNo;
	}
	public String getInvtEngineNo() {
		return invtEngineNo;
	}
	public void setInvtEngineNo(String invtEngineNo) {
		this.invtEngineNo = invtEngineNo;
	}
	public String getInvtSerialNo() {
		return invtSerialNo;
	}
	public void setInvtSerialNo(String invtSerialNo) {
		this.invtSerialNo = invtSerialNo;
	}
	public String getInvtCapSize() {
		return invtCapSize;
	}
	public void setInvtCapSize(String invtCapSize) {
		this.invtCapSize = invtCapSize;
	}
	public String getInvtBpkbName() {
		return invtBpkbName;
	}
	public void setInvtBpkbName(String invtBpkbName) {
		this.invtBpkbName = invtBpkbName;
	}
	public String getInvtBpkbAddr() {
		return invtBpkbAddr;
	}
	public void setInvtBpkbAddr(String invtBpkbAddr) {
		this.invtBpkbAddr = invtBpkbAddr;
	}
	public String getInvtBpkbOccup() {
		return invtBpkbOccup;
	}
	public void setInvtBpkbOccup(String invtBpkbOccup) {
		this.invtBpkbOccup = invtBpkbOccup;
	}
	public String getInvtNoPolisi() {
		return invtNoPolisi;
	}
	public void setInvtNoPolisi(String invtNoPolisi) {
		this.invtNoPolisi = invtNoPolisi;
	}
	public String getInvtStnkAda() {
		return invtStnkAda;
	}
	public void setInvtStnkAda(String invtStnkAda) {
		this.invtStnkAda = invtStnkAda;
	}
	public Date getInvtJtempStnk() {
		return invtJtempStnk;
	}
	public void setInvtJtempStnk(Date invtJtempStnk) {
		this.invtJtempStnk = invtJtempStnk;
	}
	public String getInvtFirstGrade() {
		return invtFirstGrade;
	}
	public void setInvtFirstGrade(String invtFirstGrade) {
		this.invtFirstGrade = invtFirstGrade;
	}
	public String getInvtLastGrade() {
		return invtLastGrade;
	}
	public void setInvtLastGrade(String invtLastGrade) {
		this.invtLastGrade = invtLastGrade;
	}
	public String getInvtCreatedBy() {
		return invtCreatedBy;
	}
	public void setInvtCreatedBy(String invtCreatedBy) {
		this.invtCreatedBy = invtCreatedBy;
	}
	public Date getInvtCreatedDate() {
		return invtCreatedDate;
	}
	public void setInvtCreatedDate(Date invtCreatedDate) {
		this.invtCreatedDate = invtCreatedDate;
	}
	public String getInvtUpdatedBy() {
		return invtUpdatedBy;
	}
	public void setInvtUpdatedBy(String invtUpdatedBy) {
		this.invtUpdatedBy = invtUpdatedBy;
	}
	public Date getInvtUpdatedDate() {
		return invtUpdatedDate;
	}
	public void setInvtUpdatedDate(Date invtUpdatedDate) {
		this.invtUpdatedDate = invtUpdatedDate;
	}
	public String getInvtReconditionFlag() {
		return invtReconditionFlag;
	}
	public void setInvtReconditionFlag(String invtReconditionFlag) {
		this.invtReconditionFlag = invtReconditionFlag;
	}
	public Date getInvtStockInDate() {
		return invtStockInDate;
	}
	public void setInvtStockInDate(Date invtStockInDate) {
		this.invtStockInDate = invtStockInDate;
	}
}