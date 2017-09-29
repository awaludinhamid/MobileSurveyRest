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
@Table(name="CM_TGH_TRN_VISIT_HDR",schema="SHCM")
public class CmTghTrnVisitHdr implements Serializable {

  @Id
  @Column(name="VST_HDR_OUTLET")
  private String vstHdrOutlet;                                                                     
  @Id
  @Column(name="VST_HDR_DATE")
  @Temporal(TemporalType.DATE)
  private Date vstHdrDate;                                             
  @Id
  @Column(name="VST_HDR_GEN")
  private String vstHdrGen;                                                                           
  @Column(name="VST_HDR_CYCLE")
  private String vstHdrCycle;                                                                            
  @Column(name="VST_HDR_SPV")
  private Double vstHdrSpv;                                                                                
  @Column(name="VST_HDR_KOL")
  private Double vstHdrKol;                                                                                
  @Column(name="VST_HDR_PERIOD")
  private String vstHdrPeriod;                                                                          
  @Column(name="VST_HDR_AREA")
  private String vstHdrArea;                                                                              
  @Column(name="VST_HDR_DESC")
  private String vstHdrDesc;                                                                              
  @Column(name="VST_HDR_ZONA")
  private String vstHdrZona;                                                                              
  @Column(name="VST_HDR_CREATED_BY")
  private String vstHdrCreatedBy;                                                                   
  @Column(name="VST_HDR_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date vstHdrCreatedDate;                                   
  @Column(name="VST_HDR_UPDATED_BY")
  private String vstHdrUpdatedBy;                                                                   
  @Column(name="VST_HDR_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date vstHdrUpdatedDate;
  
	public String getVstHdrOutlet() {
		return vstHdrOutlet;
	}
	public void setVstHdrOutlet(String vstHdrOutlet) {
		this.vstHdrOutlet = vstHdrOutlet;
	}
	public Date getVstHdrDate() {
		return vstHdrDate;
	}
	public void setVstHdrDate(Date vstHdrDate) {
		this.vstHdrDate = vstHdrDate;
	}
	public String getVstHdrGen() {
		return vstHdrGen;
	}
	public void setVstHdrGen(String vstHdrGen) {
		this.vstHdrGen = vstHdrGen;
	}
	public String getVstHdrCycle() {
		return vstHdrCycle;
	}
	public void setVstHdrCycle(String vstHdrCycle) {
		this.vstHdrCycle = vstHdrCycle;
	}
	public Double getVstHdrSpv() {
		return vstHdrSpv;
	}
	public void setVstHdrSpv(Double vstHdrSpv) {
		this.vstHdrSpv = vstHdrSpv;
	}
	public Double getVstHdrKol() {
		return vstHdrKol;
	}
	public void setVstHdrKol(Double vstHdrKol) {
		this.vstHdrKol = vstHdrKol;
	}
	public String getVstHdrPeriod() {
		return vstHdrPeriod;
	}
	public void setVstHdrPeriod(String vstHdrPeriod) {
		this.vstHdrPeriod = vstHdrPeriod;
	}
	public String getVstHdrArea() {
		return vstHdrArea;
	}
	public void setVstHdrArea(String vstHdrArea) {
		this.vstHdrArea = vstHdrArea;
	}
	public String getVstHdrDesc() {
		return vstHdrDesc;
	}
	public void setVstHdrDesc(String vstHdrDesc) {
		this.vstHdrDesc = vstHdrDesc;
	}
	public String getVstHdrZona() {
		return vstHdrZona;
	}
	public void setVstHdrZona(String vstHdrZona) {
		this.vstHdrZona = vstHdrZona;
	}
	public String getVstHdrCreatedBy() {
		return vstHdrCreatedBy;
	}
	public void setVstHdrCreatedBy(String vstHdrCreatedBy) {
		this.vstHdrCreatedBy = vstHdrCreatedBy;
	}
	public Date getVstHdrCreatedDate() {
		return vstHdrCreatedDate;
	}
	public void setVstHdrCreatedDate(Date vstHdrCreatedDate) {
		this.vstHdrCreatedDate = vstHdrCreatedDate;
	}
	public String getVstHdrUpdatedBy() {
		return vstHdrUpdatedBy;
	}
	public void setVstHdrUpdatedBy(String vstHdrUpdatedBy) {
		this.vstHdrUpdatedBy = vstHdrUpdatedBy;
	}
	public Date getVstHdrUpdatedDate() {
		return vstHdrUpdatedDate;
	}
	public void setVstHdrUpdatedDate(Date vstHdrUpdatedDate) {
		this.vstHdrUpdatedDate = vstHdrUpdatedDate;
	}
}