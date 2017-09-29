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
@Table(name="RINV_PICKUP_DTL")
public class RinvPickupDtlDest implements Serializable {

  @Id
  @Column(name="PUDTL_NO")
  private String pudtlNo;                                                                                
  @Id
  @Column(name="PUDTL_CONTRACT_NO")
  private String pudtlContractNo;                                                               
  @Id
  @Column(name="PUDTL_OBJT_SEQN")
  private Integer pudtlObjtSeqn;                                                                  
  @Column(name="PUDTL_CREATED_BY")
  private String pudtlCreatedBy;                                                                      
  @Column(name="PUDTL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pudtlCreatedDate;                                      
  @Column(name="PUDTL_UPDATED_BY")
  private String pudtlUpdatedBy;                                                                      
  @Column(name="PUDTL_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date pudtlUpdatedDate;                                      
  @Column(name="PUDTL_NO_POLISI")
  private String pudtlNoPolisi;                                                                        
  @Column(name="PUDTL_STNK_ADA")
  private String pudtlStnkAda;                                                                          
  @Column(name="PUDTL_JTEMP_STNK")
  @Temporal(TemporalType.DATE)
  private Date pudtlJtempStnk;                                          
  @Column(name="PUDTL_INVT_ID")
  private String pudtlInvtId;
  
	public String getPudtlNo() {
		return pudtlNo;
	}
	public void setPudtlNo(String pudtlNo) {
		this.pudtlNo = pudtlNo;
	}
	public String getPudtlContractNo() {
		return pudtlContractNo;
	}
	public void setPudtlContractNo(String pudtlContractNo) {
		this.pudtlContractNo = pudtlContractNo;
	}
	public Integer getPudtlObjtSeqn() {
		return pudtlObjtSeqn;
	}
	public void setPudtlObjtSeqn(Integer pudtlObjtSeqn) {
		this.pudtlObjtSeqn = pudtlObjtSeqn;
	}
	public String getPudtlCreatedBy() {
		return pudtlCreatedBy;
	}
	public void setPudtlCreatedBy(String pudtlCreatedBy) {
		this.pudtlCreatedBy = pudtlCreatedBy;
	}
	public Date getPudtlCreatedDate() {
		return pudtlCreatedDate;
	}
	public void setPudtlCreatedDate(Date pudtlCreatedDate) {
		this.pudtlCreatedDate = pudtlCreatedDate;
	}
	public String getPudtlUpdatedBy() {
		return pudtlUpdatedBy;
	}
	public void setPudtlUpdatedBy(String pudtlUpdatedBy) {
		this.pudtlUpdatedBy = pudtlUpdatedBy;
	}
	public Date getPudtlUpdatedDate() {
		return pudtlUpdatedDate;
	}
	public void setPudtlUpdatedDate(Date pudtlUpdatedDate) {
		this.pudtlUpdatedDate = pudtlUpdatedDate;
	}
	public String getPudtlNoPolisi() {
		return pudtlNoPolisi;
	}
	public void setPudtlNoPolisi(String pudtlNoPolisi) {
		this.pudtlNoPolisi = pudtlNoPolisi;
	}
	public String getPudtlStnkAda() {
		return pudtlStnkAda;
	}
	public void setPudtlStnkAda(String pudtlStnkAda) {
		this.pudtlStnkAda = pudtlStnkAda;
	}
	public Date getPudtlJtempStnk() {
		return pudtlJtempStnk;
	}
	public void setPudtlJtempStnk(Date pudtlJtempStnk) {
		this.pudtlJtempStnk = pudtlJtempStnk;
	}
	public String getPudtlInvtId() {
		return pudtlInvtId;
	}
	public void setPudtlInvtId(String pudtlInvtId) {
		this.pudtlInvtId = pudtlInvtId;
	}   
}