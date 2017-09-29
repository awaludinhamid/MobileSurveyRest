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
@Table(name="CFIN_REPAY_SCHD")
public class CfinRepaySchdDest implements Serializable {

	@Id
	@Column(name="REPAY_CONTRACT_NO")
	private String repayContractNo;
	@Id
	@Column(name="REPAY_INST_NO")
	private Integer repayInstNo;
	@Column(name="REPAY_DUE_DATE")
	@Temporal(TemporalType.DATE)
	private Date repayDueDate;
	@Column(name="REPAY_INST_PAID_DATE")
	@Temporal(TemporalType.DATE)
	private Date repayInstPaidDate;
	@Column(name="REPAY_PRIN_AMT")
	private Integer repayPrinAmt;
	@Column(name="REPAY_PRIN_AMT_PAID")
	private Integer repayPrinAmtPaid;
	@Column(name="REPAY_INTR_AMT")
	private Integer repayIntrAmt;
	@Column(name="REPAY_INTR_AMT_PAID")
	private Integer repayIntrAmtPaid;
	@Column(name="REPAY_PEN_AMT")
	private Integer repayPenAmt;
	@Column(name="REPAY_PEN_AMT_NEGO")
	private Integer repayPenAmtNego;
	@Column(name="REPAY_PEN_AMT_PAID")
	private Integer repayPenAmtPaid;
	@Column(name="REPAY_PEN_PAID_DATE")
	@Temporal(TemporalType.DATE)
	private Date repayPenPaidDate;
	@Column(name="REPAY_COLLFEE_AMT")
	private Integer repayColfeeAmt;
	@Column(name="REPAY_COLLFEE_NEGO")
	private Integer repayColfeeNego;
	@Column(name="REPAY_COLLFEE_PAID")
	private Integer repayColfeePaid;
	@Column(name="REPAY_COLLFEE_PAID_DATE")
	@Temporal(TemporalType.DATE)
	private Date repayColfeePaidDate;
	@Column(name="REPAY_CLOSED_YEAR")
	private Integer repayClosedYear;
	@Column(name="REPAY_CREATED_BY")
	private String repayCreatedBy;
	@Column(name="REPAY_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date repayCreatedDate;
	@Column(name="REPAY_UPDATED_BY")
	private String repayUpdatedBy;
	@Column(name="REPAY_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date repayUpdatedDate;
	
	public String getRepayContractNo() {
		return repayContractNo;
	}
	public void setRepayContractNo(String repayContractNo) {
		this.repayContractNo = repayContractNo;
	}
	public Integer getRepayInstNo() {
		return repayInstNo;
	}
	public void setRepayInstNo(Integer repayInstNo) {
		this.repayInstNo = repayInstNo;
	}
	public Date getRepayDueDate() {
		return repayDueDate;
	}
	public void setRepayDueDate(Date repayDueDate) {
		this.repayDueDate = repayDueDate;
	}
	public Date getRepayInstPaidDate() {
		return repayInstPaidDate;
	}
	public void setRepayInstPaidDate(Date repayInstPaidDate) {
		this.repayInstPaidDate = repayInstPaidDate;
	}
	public Integer getRepayPrinAmt() {
		return repayPrinAmt;
	}
	public void setRepayPrinAmt(Integer repayPrinAmt) {
		this.repayPrinAmt = repayPrinAmt;
	}
	public Integer getRepayPrinAmtPaid() {
		return repayPrinAmtPaid;
	}
	public void setRepayPrinAmtPaid(Integer repayPrinAmtPaid) {
		this.repayPrinAmtPaid = repayPrinAmtPaid;
	}
	public Integer getRepayIntrAmt() {
		return repayIntrAmt;
	}
	public void setRepayIntrAmt(Integer repayIntrAmt) {
		this.repayIntrAmt = repayIntrAmt;
	}
	public Integer getRepayIntrAmtPaid() {
		return repayIntrAmtPaid;
	}
	public void setRepayIntrAmtPaid(Integer repayIntrAmtPaid) {
		this.repayIntrAmtPaid = repayIntrAmtPaid;
	}
	public Integer getRepayPenAmt() {
		return repayPenAmt;
	}
	public void setRepayPenAmt(Integer repayPenAmt) {
		this.repayPenAmt = repayPenAmt;
	}
	public Integer getRepayPenAmtNego() {
		return repayPenAmtNego;
	}
	public void setRepayPenAmtNego(Integer repayPenAmtNego) {
		this.repayPenAmtNego = repayPenAmtNego;
	}
	public Integer getRepayPenAmtPaid() {
		return repayPenAmtPaid;
	}
	public void setRepayPenAmtPaid(Integer repayPenAmtPaid) {
		this.repayPenAmtPaid = repayPenAmtPaid;
	}
	public Date getRepayPenPaidDate() {
		return repayPenPaidDate;
	}
	public void setRepayPenPaidDate(Date repayPenPaidDate) {
		this.repayPenPaidDate = repayPenPaidDate;
	}
	public Integer getRepayColfeeAmt() {
		return repayColfeeAmt;
	}
	public void setRepayColfeeAmt(Integer repayColfeeAmt) {
		this.repayColfeeAmt = repayColfeeAmt;
	}
	public Integer getRepayColfeeNego() {
		return repayColfeeNego;
	}
	public void setRepayColfeeNego(Integer repayColfeeNego) {
		this.repayColfeeNego = repayColfeeNego;
	}
	public Integer getRepayColfeePaid() {
		return repayColfeePaid;
	}
	public void setRepayColfeePaid(Integer repayColfeePaid) {
		this.repayColfeePaid = repayColfeePaid;
	}
	public Date getRepayColfeePaidDate() {
		return repayColfeePaidDate;
	}
	public void setRepayColfeePaidDate(Date repayColfeePaidDate) {
		this.repayColfeePaidDate = repayColfeePaidDate;
	}
	public Integer getRepayClosedYear() {
		return repayClosedYear;
	}
	public void setRepayClosedYear(Integer repayClosedYear) {
		this.repayClosedYear = repayClosedYear;
	}
	public String getRepayCreatedBy() {
		return repayCreatedBy;
	}
	public void setRepayCreatedBy(String repayCreatedBy) {
		this.repayCreatedBy = repayCreatedBy;
	}
	public Date getRepayCreatedDate() {
		return repayCreatedDate;
	}
	public void setRepayCreatedDate(Date repayCreatedDate) {
		this.repayCreatedDate = repayCreatedDate;
	}
	public String getRepayUpdatedBy() {
		return repayUpdatedBy;
	}
	public void setRepayUpdatedBy(String repayUpdatedBy) {
		this.repayUpdatedBy = repayUpdatedBy;
	}
	public Date getRepayUpdatedDate() {
		return repayUpdatedDate;
	}
	public void setRepayUpdatedDate(Date repayUpdatedDate) {
		this.repayUpdatedDate = repayUpdatedDate;
	}
}
