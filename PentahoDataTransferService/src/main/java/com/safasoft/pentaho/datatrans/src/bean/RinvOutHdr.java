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
@Table(name="RINV_OUT_HDR",schema="COLL")
public class RinvOutHdr implements Serializable {

  @Id
  @Column(name="OUT_MEMO_NO")
  private String outMemoNo;                                                                           
  @Column(name="OUT_COYOULET_ID")
  private String outCoyouletId;                                                                        
  @Column(name="OUT_MEMO_DATE")
  @Temporal(TemporalType.DATE)
  private Date outMemoDate;                                                
  @Column(name="OUT_TRX_TYPE")
  private String outTrxType;                                                                              
  @Column(name="OUT_CREATED_BY")
  private String outCreatedBy;                                                                          
  @Column(name="OUT_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date outCreatedDate;                                          
  @Column(name="OUT_UPDATED_BY")
  private String outUpdatedBy;                                                                          
  @Column(name="OUT_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date outUpdatedDate;                                          
  @Column(name="OUT_NAMA_PENERIMA")
  private String outNamaPenerima;                                                                    
  @Column(name="OUT_DEST_COYOUTLET_ID")
  private String outDestCoyoutletId;                                                             
  @Column(name="OUT_DEST_LOCA_TYPE")
  private String outDestLocaType;                                                                   
  @Column(name="OUT_DEST_LOCATION_ID")
  private String outDestLocationId;                                                               
  @Column(name="OUT_ALAMAT_PENERIMA")
  private String outAlamatPenerima;                                                                
  @Column(name="OUT_FROM_LOCA_TYPE")
  private String outFromLocaType;                                                                   
  @Column(name="OUT_FROM_LOCATION_ID")
  private String outFromLocationId;                                                               
  @Column(name="OUT_REFF_MEMO_NO")
  private String outReffMemoNo;
  
	public String getOutMemoNo() {
		return outMemoNo;
	}
	public void setOutMemoNo(String outMemoNo) {
		this.outMemoNo = outMemoNo;
	}
	public String getOutCoyouletId() {
		return outCoyouletId;
	}
	public void setOutCoyouletId(String outCoyouletId) {
		this.outCoyouletId = outCoyouletId;
	}
	public Date getOutMemoDate() {
		return outMemoDate;
	}
	public void setOutMemoDate(Date outMemoDate) {
		this.outMemoDate = outMemoDate;
	}
	public String getOutTrxType() {
		return outTrxType;
	}
	public void setOutTrxType(String outTrxType) {
		this.outTrxType = outTrxType;
	}
	public String getOutCreatedBy() {
		return outCreatedBy;
	}
	public void setOutCreatedBy(String outCreatedBy) {
		this.outCreatedBy = outCreatedBy;
	}
	public Date getOutCreatedDate() {
		return outCreatedDate;
	}
	public void setOutCreatedDate(Date outCreatedDate) {
		this.outCreatedDate = outCreatedDate;
	}
	public String getOutUpdatedBy() {
		return outUpdatedBy;
	}
	public void setOutUpdatedBy(String outUpdatedBy) {
		this.outUpdatedBy = outUpdatedBy;
	}
	public Date getOutUpdatedDate() {
		return outUpdatedDate;
	}
	public void setOutUpdatedDate(Date outUpdatedDate) {
		this.outUpdatedDate = outUpdatedDate;
	}
	public String getOutNamaPenerima() {
		return outNamaPenerima;
	}
	public void setOutNamaPenerima(String outNamaPenerima) {
		this.outNamaPenerima = outNamaPenerima;
	}
	public String getOutDestCoyoutletId() {
		return outDestCoyoutletId;
	}
	public void setOutDestCoyoutletId(String outDestCoyoutletId) {
		this.outDestCoyoutletId = outDestCoyoutletId;
	}
	public String getOutDestLocaType() {
		return outDestLocaType;
	}
	public void setOutDestLocaType(String outDestLocaType) {
		this.outDestLocaType = outDestLocaType;
	}
	public String getOutDestLocationId() {
		return outDestLocationId;
	}
	public void setOutDestLocationId(String outDestLocationId) {
		this.outDestLocationId = outDestLocationId;
	}
	public String getOutAlamatPenerima() {
		return outAlamatPenerima;
	}
	public void setOutAlamatPenerima(String outAlamatPenerima) {
		this.outAlamatPenerima = outAlamatPenerima;
	}
	public String getOutFromLocaType() {
		return outFromLocaType;
	}
	public void setOutFromLocaType(String outFromLocaType) {
		this.outFromLocaType = outFromLocaType;
	}
	public String getOutFromLocationId() {
		return outFromLocationId;
	}
	public void setOutFromLocationId(String outFromLocationId) {
		this.outFromLocationId = outFromLocationId;
	}
	public String getOutReffMemoNo() {
		return outReffMemoNo;
	}
	public void setOutReffMemoNo(String outReffMemoNo) {
		this.outReffMemoNo = outReffMemoNo;
	}
}
