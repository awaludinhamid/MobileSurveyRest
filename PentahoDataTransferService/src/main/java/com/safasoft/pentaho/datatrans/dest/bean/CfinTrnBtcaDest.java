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
@Table(name="CFIN_TRN_BTCA")
public class CfinTrnBtcaDest implements Serializable {

  @Id
  @Column(name="BTCA_MEMO_NO")
  private String btcaMemoNo;
  @Column(name="BTCA_COYOUTLET_ID")
  private String btcaCoyoutletId;
  @Column(name="BTCA_DATE")
  @Temporal(TemporalType.DATE)
  private Date btcaDate;
  @Column(name="BTCA_TYPE")
  private String btcaType;
  @Column(name="BTCA_CONTRACT_NO")
  private String btcaContractNo;
  @Column(name="BTCA_STATUS")
  private String btcaStatus;
  @Column(name="BTCA_DESC")
  private String btcaDesc;
  @Column(name="BTCA_CREATED_BY")
  private String btcaCreatedBy;
  @Column(name="BTCA_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date btcaCreatedDate;
  @Column(name="BTCA_RECEIVED_DATE")
  @Temporal(TemporalType.DATE)
  private Date btcaReceivedDate;
  @Column(name="BTCA_RECEIVED_NO")
  private String btcaReceivedNo;
  @Column(name="BTCA_OVDANGS")
  private Integer btcaOvdangs;
  @Column(name="BTCA_OVDANGS_PAID")
  private Integer btcaOvdangsPaid;
  @Column(name="BTCA_OVDPEN")
  private Integer btcaOvdpen;
  @Column(name="BTCA_OVDPEN_PAID")
  private Integer btcaOvdpenPaid;
  @Column(name="BTCA_OVDCOLLFEE")
  private Integer btcaOvdcollfee;
  @Column(name="BTCA_OVDCOLLFEE_PAID")
  private Integer btcaOvdcollfeePaid;
  @Column(name="BTCA_BIAYA")
  private Integer btcaBiaya;
  @Column(name="BTCA_BIAYA_PAID")
  private Integer btcaBiayaPaid;
  @Column(name="BTCA_DANSOS")
  private Integer btcaDansos;
  @Column(name="BTCA_DANSOS_PAID")
  private Integer btcaDansosPaid;
  @Column(name="BTCA_UPDATED_BY")
  private String btcaUpdatedBy;
  @Column(name="BTCA_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date btcaUpdatedDate;
  
	public String getBtcaMemoNo() {
		return btcaMemoNo;
	}
	public void setBtcaMemoNo(String btcaMemoNo) {
		this.btcaMemoNo = btcaMemoNo;
	}
	public String getBtcaCoyoutletId() {
		return btcaCoyoutletId;
	}
	public void setBtcaCoyoutletId(String btcaCoyoutletId) {
		this.btcaCoyoutletId = btcaCoyoutletId;
	}
	public Date getBtcaDate() {
		return btcaDate;
	}
	public void setBtcaDate(Date btcaDate) {
		this.btcaDate = btcaDate;
	}
	public String getBtcaType() {
		return btcaType;
	}
	public void setBtcaType(String btcaType) {
		this.btcaType = btcaType;
	}
	public String getBtcaContractNo() {
		return btcaContractNo;
	}
	public void setBtcaContractNo(String btcaContractNo) {
		this.btcaContractNo = btcaContractNo;
	}
	public String getBtcaStatus() {
		return btcaStatus;
	}
	public void setBtcaStatus(String btcaStatus) {
		this.btcaStatus = btcaStatus;
	}
	public String getBtcaDesc() {
		return btcaDesc;
	}
	public void setBtcaDesc(String btcaDesc) {
		this.btcaDesc = btcaDesc;
	}
	public String getBtcaCreatedBy() {
		return btcaCreatedBy;
	}
	public void setBtcaCreatedBy(String btcaCreatedBy) {
		this.btcaCreatedBy = btcaCreatedBy;
	}
	public Date getBtcaCreatedDate() {
		return btcaCreatedDate;
	}
	public void setBtcaCreatedDate(Date btcaCreatedDate) {
		this.btcaCreatedDate = btcaCreatedDate;
	}
	public Date getBtcaReceivedDate() {
		return btcaReceivedDate;
	}
	public void setBtcaReceivedDate(Date btcaReceivedDate) {
		this.btcaReceivedDate = btcaReceivedDate;
	}
	public String getBtcaReceivedNo() {
		return btcaReceivedNo;
	}
	public void setBtcaReceivedNo(String btcaReceivedNo) {
		this.btcaReceivedNo = btcaReceivedNo;
	}
	public Integer getBtcaOvdangs() {
		return btcaOvdangs;
	}
	public void setBtcaOvdangs(Integer btcaOvdangs) {
		this.btcaOvdangs = btcaOvdangs;
	}
	public Integer getBtcaOvdangsPaid() {
		return btcaOvdangsPaid;
	}
	public void setBtcaOvdangsPaid(Integer btcaOvdangsPaid) {
		this.btcaOvdangsPaid = btcaOvdangsPaid;
	}
	public Integer getBtcaOvdpen() {
		return btcaOvdpen;
	}
	public void setBtcaOvdpen(Integer btcaOvdpen) {
		this.btcaOvdpen = btcaOvdpen;
	}
	public Integer getBtcaOvdpenPaid() {
		return btcaOvdpenPaid;
	}
	public void setBtcaOvdpenPaid(Integer btcaOvdpenPaid) {
		this.btcaOvdpenPaid = btcaOvdpenPaid;
	}
	public Integer getBtcaOvdcollfee() {
		return btcaOvdcollfee;
	}
	public void setBtcaOvdcollfee(Integer btcaOvdcollfee) {
		this.btcaOvdcollfee = btcaOvdcollfee;
	}
	public Integer getBtcaOvdcollfeePaid() {
		return btcaOvdcollfeePaid;
	}
	public void setBtcaOvdcollfeePaid(Integer btcaOvdcollfeePaid) {
		this.btcaOvdcollfeePaid = btcaOvdcollfeePaid;
	}
	public Integer getBtcaBiaya() {
		return btcaBiaya;
	}
	public void setBtcaBiaya(Integer btcaBiaya) {
		this.btcaBiaya = btcaBiaya;
	}
	public Integer getBtcaBiayaPaid() {
		return btcaBiayaPaid;
	}
	public void setBtcaBiayaPaid(Integer btcaBiayaPaid) {
		this.btcaBiayaPaid = btcaBiayaPaid;
	}
	public Integer getBtcaDansos() {
		return btcaDansos;
	}
	public void setBtcaDansos(Integer btcaDansos) {
		this.btcaDansos = btcaDansos;
	}
	public Integer getBtcaDansosPaid() {
		return btcaDansosPaid;
	}
	public void setBtcaDansosPaid(Integer btcaDansosPaid) {
		this.btcaDansosPaid = btcaDansosPaid;
	}
	public String getBtcaUpdatedBy() {
		return btcaUpdatedBy;
	}
	public void setBtcaUpdatedBy(String btcaUpdatedBy) {
		this.btcaUpdatedBy = btcaUpdatedBy;
	}
	public Date getBtcaUpdatedDate() {
		return btcaUpdatedDate;
	}
	public void setBtcaUpdatedDate(Date btcaUpdatedDate) {
		this.btcaUpdatedDate = btcaUpdatedDate;
	}

}