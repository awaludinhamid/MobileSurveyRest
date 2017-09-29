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
@Table(name="CFIN_OVERBOOK_DTL")
public class CfinOverbookDtlDest implements Serializable {

	@Id
	@Column(name="OVBDTL_MEMO_NO")
	private String ovbdtlMemoNo;
	@Id
	@Column(name="OVBDTL_CONTRACT_NO")
	private String ovbdtlContractNo;
	@Id
	@Column(name="OVBDTL_INST_NO")
	private Integer ovbdtlInstNo;
	@Column(name="OVBDTL_TRAN_DATE")
	@Temporal(TemporalType.DATE)
	private Date ovbdtlTranDate;
	@Column(name="OVBDTL_REFF_NO")
	private String ovbdtlReffNo;
	@Column(name="OVBDTL_SEQN_NO")
	private Integer ovbdtlSeqnNo;
	@Column(name="OVBDTL_INST_AMOUNT")
	private Integer ovbdtlInstAmount;
	@Column(name="OVBDTL_CREATED_BY")
	private String ovbdtlCreatedBy;
	@Column(name="OVBDTL_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ovbdtlCreatedDate;
	@Column(name="OVBDTL_UPDATED_BY")
	private String ovbdtlUpdatedBy;
	@Column(name="OVBDTL_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date ovbdtlUpdatedDate;
	@Column(name="OVBDTL_PEN_AMOUNT")
	private Integer ovbdtlPenAmount;
	@Column(name="OVBDTL_COLLFEE_AMT")
	private Integer ovbdtlColfeeAmt;
	
	public String getOvbdtlMemoNo() {
		return ovbdtlMemoNo;
	}
	public void setOvbdtlMemoNo(String ovbdtlMemoNo) {
		this.ovbdtlMemoNo = ovbdtlMemoNo;
	}
	public String getOvbdtlContractNo() {
		return ovbdtlContractNo;
	}
	public void setOvbdtlContractNo(String ovbdtlContractNo) {
		this.ovbdtlContractNo = ovbdtlContractNo;
	}
	public Integer getOvbdtlInstNo() {
		return ovbdtlInstNo;
	}
	public void setOvbdtlInstNo(Integer ovbdtlInstNo) {
		this.ovbdtlInstNo = ovbdtlInstNo;
	}
	public Date getOvbdtlTranDate() {
		return ovbdtlTranDate;
	}
	public void setOvbdtlTranDate(Date ovbdtlTranDate) {
		this.ovbdtlTranDate = ovbdtlTranDate;
	}
	public String getOvbdtlReffNo() {
		return ovbdtlReffNo;
	}
	public void setOvbdtlReffNo(String ovbdtlReffNo) {
		this.ovbdtlReffNo = ovbdtlReffNo;
	}
	public Integer getOvbdtlSeqnNo() {
		return ovbdtlSeqnNo;
	}
	public void setOvbdtlSeqnNo(Integer ovbdtlSeqnNo) {
		this.ovbdtlSeqnNo = ovbdtlSeqnNo;
	}
	public Integer getOvbdtlInstAmount() {
		return ovbdtlInstAmount;
	}
	public void setOvbdtlInstAmount(Integer ovbdtlInstAmount) {
		this.ovbdtlInstAmount = ovbdtlInstAmount;
	}
	public String getOvbdtlCreatedBy() {
		return ovbdtlCreatedBy;
	}
	public void setOvbdtlCreatedBy(String ovbdtlCreatedBy) {
		this.ovbdtlCreatedBy = ovbdtlCreatedBy;
	}
	public Date getOvbdtlCreatedDate() {
		return ovbdtlCreatedDate;
	}
	public void setOvbdtlCreatedDate(Date ovbdtlCreatedDate) {
		this.ovbdtlCreatedDate = ovbdtlCreatedDate;
	}
	public String getOvbdtlUpdatedBy() {
		return ovbdtlUpdatedBy;
	}
	public void setOvbdtlUpdatedBy(String ovbdtlUpdatedBy) {
		this.ovbdtlUpdatedBy = ovbdtlUpdatedBy;
	}
	public Date getOvbdtlUpdatedDate() {
		return ovbdtlUpdatedDate;
	}
	public void setOvbdtlUpdatedDate(Date ovbdtlUpdatedDate) {
		this.ovbdtlUpdatedDate = ovbdtlUpdatedDate;
	}
	public Integer getOvbdtlPenAmount() {
		return ovbdtlPenAmount;
	}
	public void setOvbdtlPenAmount(Integer ovbdtlPenAmount) {
		this.ovbdtlPenAmount = ovbdtlPenAmount;
	}
	public Integer getOvbdtlColfeeAmt() {
		return ovbdtlColfeeAmt;
	}
	public void setOvbdtlColfeeAmt(Integer ovbdtlColfeeAmt) {
		this.ovbdtlColfeeAmt = ovbdtlColfeeAmt;
	}
}
