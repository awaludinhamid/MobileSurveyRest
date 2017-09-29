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
@Table(name="FIN_TRNCASH_BALANCE",schema="FINA")
public class FinTrncashBalance implements Serializable {

	@Id
  @Column(name="CASHBAL_DATE")
  @Temporal(TemporalType.DATE)
  private Date cashbalDate;                                            
  @Id
  @Column(name="CASHBAL_CURR")
  private String cashbalCurr;                                                                        
  @Id
  @Column(name="CASHBAL_USERID")
  private String cashbalUserid;                                                                    
  @Id
  @Column(name="CASHBAL_OUTLET_ID")
  private String cashbalOutletId;                                                               
  @Column(name="CASHBAL_SALDO_AWAL")
  private Long cashbalSaldoAwal;                                                                    
  @Column(name="CASHBAL_USER_DR")
  private Long cashbalUserDr;                                                                          
  @Column(name="CASHBAL_USER_CR")
  private Long cashbalUserCr;                                                                          
  @Column(name="CASHBAL_GL_DR")
  private Long cashbalGlDr;                                                                              
  @Column(name="CASHBAL_GL_CR")
  private Long cashbalGlCr;                                                                              
  @Column(name="CASHBAL_SALDO_AKHIR")
  private Long cashbalSaldoAkhir;                                                                  
  @Column(name="CASHBAL_CREATED_BY")
  private String cashbalCreatedBy;                                                                  
  @Column(name="CASHBAL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date cashbalCreatedDate;                                  
  @Column(name="CASHBAL_UPDATED_BY")
  private String cashbalUpdatedBy;                                                                  
  @Column(name="CASHBAL_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date cashbalUpdatedDate;
  
	public Date getCashbalDate() {
		return cashbalDate;
	}
	public void setCashbalDate(Date cashbalDate) {
		this.cashbalDate = cashbalDate;
	}
	public String getCashbalCurr() {
		return cashbalCurr;
	}
	public void setCashbalCurr(String cashbalCurr) {
		this.cashbalCurr = cashbalCurr;
	}
	public String getCashbalUserid() {
		return cashbalUserid;
	}
	public void setCashbalUserid(String cashbalUserid) {
		this.cashbalUserid = cashbalUserid;
	}
	public String getCashbalOutletId() {
		return cashbalOutletId;
	}
	public void setCashbalOutletId(String cashbalOutletId) {
		this.cashbalOutletId = cashbalOutletId;
	}
	public Long getCashbalSaldoAwal() {
		return cashbalSaldoAwal;
	}
	public void setCashbalSaldoAwal(Long cashbalSaldoAwal) {
		this.cashbalSaldoAwal = cashbalSaldoAwal;
	}
	public Long getCashbalUserDr() {
		return cashbalUserDr;
	}
	public void setCashbalUserDr(Long cashbalUserDr) {
		this.cashbalUserDr = cashbalUserDr;
	}
	public Long getCashbalUserCr() {
		return cashbalUserCr;
	}
	public void setCashbalUserCr(Long cashbalUserCr) {
		this.cashbalUserCr = cashbalUserCr;
	}
	public Long getCashbalGlDr() {
		return cashbalGlDr;
	}
	public void setCashbalGlDr(Long cashbalGlDr) {
		this.cashbalGlDr = cashbalGlDr;
	}
	public Long getCashbalGlCr() {
		return cashbalGlCr;
	}
	public void setCashbalGlCr(Long cashbalGlCr) {
		this.cashbalGlCr = cashbalGlCr;
	}
	public Long getCashbalSaldoAkhir() {
		return cashbalSaldoAkhir;
	}
	public void setCashbalSaldoAkhir(Long cashbalSaldoAkhir) {
		this.cashbalSaldoAkhir = cashbalSaldoAkhir;
	}
	public String getCashbalCreatedBy() {
		return cashbalCreatedBy;
	}
	public void setCashbalCreatedBy(String cashbalCreatedBy) {
		this.cashbalCreatedBy = cashbalCreatedBy;
	}
	public Date getCashbalCreatedDate() {
		return cashbalCreatedDate;
	}
	public void setCashbalCreatedDate(Date cashbalCreatedDate) {
		this.cashbalCreatedDate = cashbalCreatedDate;
	}
	public String getCashbalUpdatedBy() {
		return cashbalUpdatedBy;
	}
	public void setCashbalUpdatedBy(String cashbalUpdatedBy) {
		this.cashbalUpdatedBy = cashbalUpdatedBy;
	}
	public Date getCashbalUpdatedDate() {
		return cashbalUpdatedDate;
	}
	public void setCashbalUpdatedDate(Date cashbalUpdatedDate) {
		this.cashbalUpdatedDate = cashbalUpdatedDate;
	}

}