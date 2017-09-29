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
@Table(name="CFIN_TB_SALDO")
public class CfinTbSaldoDest implements Serializable {

  @Id
  @Column(name="TB_TAHUN")
  private String tbTahun;
  @Id
  @Column(name="TB_COYOUTLET")
  private String tbCoyoutlet;
  @Column(name="TB_BEG_BALANCE")
  private Double tbBegBalance;
  @Column(name="TB_JAN")
  private Double tbJan;
  @Column(name="TB_FEB")
  private Double tbFeb;
  @Column(name="TB_MAR")
  private Double tbMar;
  @Column(name="TB_APR")
  private Double tbApr;
  @Column(name="TB_MEI")
  private Double tbMei;
  @Column(name="TB_JUN")
  private Double tbJun;
  @Column(name="TB_JUL")
  private Double tbJul;
  @Column(name="TB_AUG")
  private Double tbAug;
  @Column(name="TB_SEP")
  private Double tbSep;
  @Column(name="TB_OKT")
  private Double tbOkt;
  @Column(name="TB_NOV")
  private Double tbNov;
  @Column(name="TB_DES")
  private Double tbDes;
  @Column(name="TB_CREATED_BY")
  private String tbCreatedBy;
  @Column(name="TB_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date tbCreatedDate;
  @Column(name="TB_UPDATED_BY")
  private String tbUpdatedBy;
  @Column(name="TB_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date tbUpdatedDate;
  
	public String getTbTahun() {
		return tbTahun;
	}
	public void setTbTahun(String tbTahun) {
		this.tbTahun = tbTahun;
	}
	public String getTbCoyoutlet() {
		return tbCoyoutlet;
	}
	public void setTbCoyoutlet(String tbCoyoutlet) {
		this.tbCoyoutlet = tbCoyoutlet;
	}
	public Double getTbBegBalance() {
		return tbBegBalance;
	}
	public void setTbBegBalance(Double tbBegBalance) {
		this.tbBegBalance = tbBegBalance;
	}
	public Double getTbJan() {
		return tbJan;
	}
	public void setTbJan(Double tbJan) {
		this.tbJan = tbJan;
	}
	public Double getTbFeb() {
		return tbFeb;
	}
	public void setTbFeb(Double tbFeb) {
		this.tbFeb = tbFeb;
	}
	public Double getTbMar() {
		return tbMar;
	}
	public void setTbMar(Double tbMar) {
		this.tbMar = tbMar;
	}
	public Double getTbApr() {
		return tbApr;
	}
	public void setTbApr(Double tbApr) {
		this.tbApr = tbApr;
	}
	public Double getTbMei() {
		return tbMei;
	}
	public void setTbMei(Double tbMei) {
		this.tbMei = tbMei;
	}
	public Double getTbJun() {
		return tbJun;
	}
	public void setTbJun(Double tbJun) {
		this.tbJun = tbJun;
	}
	public Double getTbJul() {
		return tbJul;
	}
	public void setTbJul(Double tbJul) {
		this.tbJul = tbJul;
	}
	public Double getTbAug() {
		return tbAug;
	}
	public void setTbAug(Double tbAug) {
		this.tbAug = tbAug;
	}
	public Double getTbSep() {
		return tbSep;
	}
	public void setTbSep(Double tbSep) {
		this.tbSep = tbSep;
	}
	public Double getTbOkt() {
		return tbOkt;
	}
	public void setTbOkt(Double tbOkt) {
		this.tbOkt = tbOkt;
	}
	public Double getTbNov() {
		return tbNov;
	}
	public void setTbNov(Double tbNov) {
		this.tbNov = tbNov;
	}
	public Double getTbDes() {
		return tbDes;
	}
	public void setTbDes(Double tbDes) {
		this.tbDes = tbDes;
	}
	public String getTbCreatedBy() {
		return tbCreatedBy;
	}
	public void setTbCreatedBy(String tbCreatedBy) {
		this.tbCreatedBy = tbCreatedBy;
	}
	public Date getTbCreatedDate() {
		return tbCreatedDate;
	}
	public void setTbCreatedDate(Date tbCreatedDate) {
		this.tbCreatedDate = tbCreatedDate;
	}
	public String getTbUpdatedBy() {
		return tbUpdatedBy;
	}
	public void setTbUpdatedBy(String tbUpdatedBy) {
		this.tbUpdatedBy = tbUpdatedBy;
	}
	public Date getTbUpdatedDate() {
		return tbUpdatedDate;
	}
	public void setTbUpdatedDate(Date tbUpdatedDate) {
		this.tbUpdatedDate = tbUpdatedDate;
	}

}
