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
@Table(name="RINV_RECEIVED_HDR")
public class RinvReceivedHdrDest implements Serializable {

  @Id
  @Column(name="RINV_MEMO_NO")
  private String rinvMemoNo;                                                                         
  @Column(name="RINV_MEMO_COYOULET")
  private String rinvMemoCoyoulet;                                                                  
  @Column(name="RINV_MEMO_DATE")
  @Temporal(TemporalType.DATE)
  private Date rinvMemoDate;                                              
  @Column(name="RINV_ASAL")
  private String rinvAsal;                                                                                   
  @Column(name="RINV_CREATED_BY")
  private String rinvCreatedBy;                                                                        
  @Column(name="RINV_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date rinvCreatedDate;                                        
  @Column(name="RINV_UPDATED_BY")
  private String rinvUpdatedBy;                                                                        
  @Column(name="RINV_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date rinvUpdatedDate;                                        
  @Column(name="RINV_NAMA_SERAH")
  private String rinvNamaSerah;                                                                        
  @Column(name="RINV_NAMA_PENERIMA")
  private String rinvNamaPenerima;                                                                  
  @Column(name="RINV_LOCA_TYPE")
  private String rinvLocaType;                                                                          
  @Column(name="RINV_LOCATION_ID")
  private String rinvLocationId;                                                                      
  @Column(name="RINV_REFF_MEMO_NO")
  private String rinvReffMemoNo;
  
	public String getRinvMemoNo() {
		return rinvMemoNo;
	}
	public void setRinvMemoNo(String rinvMemoNo) {
		this.rinvMemoNo = rinvMemoNo;
	}
	public String getRinvMemoCoyoulet() {
		return rinvMemoCoyoulet;
	}
	public void setRinvMemoCoyoulet(String rinvMemoCoyoulet) {
		this.rinvMemoCoyoulet = rinvMemoCoyoulet;
	}
	public Date getRinvMemoDate() {
		return rinvMemoDate;
	}
	public void setRinvMemoDate(Date rinvMemoDate) {
		this.rinvMemoDate = rinvMemoDate;
	}
	public String getRinvAsal() {
		return rinvAsal;
	}
	public void setRinvAsal(String rinvAsal) {
		this.rinvAsal = rinvAsal;
	}
	public String getRinvCreatedBy() {
		return rinvCreatedBy;
	}
	public void setRinvCreatedBy(String rinvCreatedBy) {
		this.rinvCreatedBy = rinvCreatedBy;
	}
	public Date getRinvCreatedDate() {
		return rinvCreatedDate;
	}
	public void setRinvCreatedDate(Date rinvCreatedDate) {
		this.rinvCreatedDate = rinvCreatedDate;
	}
	public String getRinvUpdatedBy() {
		return rinvUpdatedBy;
	}
	public void setRinvUpdatedBy(String rinvUpdatedBy) {
		this.rinvUpdatedBy = rinvUpdatedBy;
	}
	public Date getRinvUpdatedDate() {
		return rinvUpdatedDate;
	}
	public void setRinvUpdatedDate(Date rinvUpdatedDate) {
		this.rinvUpdatedDate = rinvUpdatedDate;
	}
	public String getRinvNamaSerah() {
		return rinvNamaSerah;
	}
	public void setRinvNamaSerah(String rinvNamaSerah) {
		this.rinvNamaSerah = rinvNamaSerah;
	}
	public String getRinvNamaPenerima() {
		return rinvNamaPenerima;
	}
	public void setRinvNamaPenerima(String rinvNamaPenerima) {
		this.rinvNamaPenerima = rinvNamaPenerima;
	}
	public String getRinvLocaType() {
		return rinvLocaType;
	}
	public void setRinvLocaType(String rinvLocaType) {
		this.rinvLocaType = rinvLocaType;
	}
	public String getRinvLocationId() {
		return rinvLocationId;
	}
	public void setRinvLocationId(String rinvLocationId) {
		this.rinvLocationId = rinvLocationId;
	}
	public String getRinvReffMemoNo() {
		return rinvReffMemoNo;
	}
	public void setRinvReffMemoNo(String rinvReffMemoNo) {
		this.rinvReffMemoNo = rinvReffMemoNo;
	}
}