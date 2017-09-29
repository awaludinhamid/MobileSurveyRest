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
@Table(name="CM_TGH_TRN_VISIT_DTL")
public class CmTghTrnVisitDtlDest implements Serializable {

  @Id
  @Column(name="VST_SUBDTL_VISIT_DATE")
  @Temporal(TemporalType.DATE)
  private Date vstSubdtlVisitDate;                            
  @Id
  @Column(name="VST_SUBDTL_ZIPCODE")
  private String vstSubdtlZipcode;                                                             
  @Id
  @Column(name="VST_SUBDTL_SUBZIP")
  private String vstSubdtlSubzip;                                                               
  @Id
  @Column(name="VST_SUBDTL_KOL")
  private Double vstSubdtlKol;                                                                     
  @Id
  @Column(name="VST_SUBDTL_OUTLET")
  private String vstSubdtlOutlet;                                                               
  @Id
  @Column(name="VST_SUBDTL_GEN")
  private String vstSubdtlGen;                                                                     
  @Column(name="VST_SUBDTL_ZIPDESC")
  private String vstSubdtlZipdesc;                                                                  
  @Column(name="VST_SUBDTL_SUBDESC")
  private String vstSubdtlSubdesc;                                                                  
  @Column(name="VST_SUBDTL_CREATED_BY")
  private String vstSubdtlCreatedBy;                                                             
  @Column(name="VST_SUBDTL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date vstSubdtlCreatedDate;                             
  @Column(name="VST_SUBDTL_UPDATED_BY")
  private String vstSubdtlUpdatedBy;                                                             
  @Column(name="VST_SUBDTL_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date vstSubdtlUpdatedDate;                             
  @Column(name="VST_SUBDTL_PERIOD")
  private String vstSubdtlPeriod;
  
	public Date getVstSubdtlVisitDate() {
		return vstSubdtlVisitDate;
	}
	public void setVstSubdtlVisitDate(Date vstSubdtlVisitDate) {
		this.vstSubdtlVisitDate = vstSubdtlVisitDate;
	}
	public String getVstSubdtlZipcode() {
		return vstSubdtlZipcode;
	}
	public void setVstSubdtlZipcode(String vstSubdtlZipcode) {
		this.vstSubdtlZipcode = vstSubdtlZipcode;
	}
	public String getVstSubdtlSubzip() {
		return vstSubdtlSubzip;
	}
	public void setVstSubdtlSubzip(String vstSubdtlSubzip) {
		this.vstSubdtlSubzip = vstSubdtlSubzip;
	}
	public Double getVstSubdtlKol() {
		return vstSubdtlKol;
	}
	public void setVstSubdtlKol(Double vstSubdtlKol) {
		this.vstSubdtlKol = vstSubdtlKol;
	}
	public String getVstSubdtlOutlet() {
		return vstSubdtlOutlet;
	}
	public void setVstSubdtlOutlet(String vstSubdtlOutlet) {
		this.vstSubdtlOutlet = vstSubdtlOutlet;
	}
	public String getVstSubdtlGen() {
		return vstSubdtlGen;
	}
	public void setVstSubdtlGen(String vstSubdtlGen) {
		this.vstSubdtlGen = vstSubdtlGen;
	}
	public String getVstSubdtlZipdesc() {
		return vstSubdtlZipdesc;
	}
	public void setVstSubdtlZipdesc(String vstSubdtlZipdesc) {
		this.vstSubdtlZipdesc = vstSubdtlZipdesc;
	}
	public String getVstSubdtlSubdesc() {
		return vstSubdtlSubdesc;
	}
	public void setVstSubdtlSubdesc(String vstSubdtlSubdesc) {
		this.vstSubdtlSubdesc = vstSubdtlSubdesc;
	}
	public String getVstSubdtlCreatedBy() {
		return vstSubdtlCreatedBy;
	}
	public void setVstSubdtlCreatedBy(String vstSubdtlCreatedBy) {
		this.vstSubdtlCreatedBy = vstSubdtlCreatedBy;
	}
	public Date getVstSubdtlCreatedDate() {
		return vstSubdtlCreatedDate;
	}
	public void setVstSubdtlCreatedDate(Date vstSubdtlCreatedDate) {
		this.vstSubdtlCreatedDate = vstSubdtlCreatedDate;
	}
	public String getVstSubdtlUpdatedBy() {
		return vstSubdtlUpdatedBy;
	}
	public void setVstSubdtlUpdatedBy(String vstSubdtlUpdatedBy) {
		this.vstSubdtlUpdatedBy = vstSubdtlUpdatedBy;
	}
	public Date getVstSubdtlUpdatedDate() {
		return vstSubdtlUpdatedDate;
	}
	public void setVstSubdtlUpdatedDate(Date vstSubdtlUpdatedDate) {
		this.vstSubdtlUpdatedDate = vstSubdtlUpdatedDate;
	}
	public String getVstSubdtlPeriod() {
		return vstSubdtlPeriod;
	}
	public void setVstSubdtlPeriod(String vstSubdtlPeriod) {
		this.vstSubdtlPeriod = vstSubdtlPeriod;
	}
}