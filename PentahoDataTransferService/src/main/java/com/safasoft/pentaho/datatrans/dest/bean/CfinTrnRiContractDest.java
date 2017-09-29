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
@Table(name="CFIN_TRN_RI_CONTRACT")
public class CfinTrnRiContractDest implements Serializable {

  @Id
  @Column(name="RI_CONTRACT_NO")
  private String riContractNo;
  @Column(name="RI_COYOUTLET_ID")
  private String riCoyoutletId;
  @Column(name="RI_CUST_ID")
  private String riCustId;
  @Column(name="RI_TERM_DATE")
  @Temporal(TemporalType.DATE)
  private Date riTermDate;
  @Column(name="RI_STAT_CONTRACT")
  private String riStatContract;
  @Column(name="RI_OUTS_PRINCIPAL")
  private Double riOutsPrincipal;
  @Column(name="RI_OUTS_INTEREST")
  private Double riOutsInterest;
  @Column(name="RI_OUTS_ADMIN")
  private Double riOutsAdmin;
  @Column(name="RI_OUTS_OTHERS")
  private Double riOutsOthers;
  @Column(name="RI_OUTS_PRINCIPAL_PAID")
  private Double riOutsPrincipalPaid;
  @Column(name="RI_OUTS_INTEREST_PAID")
  private Double riOutsInterestPaid;
  @Column(name="RI_OUTS_ADMIN_PAID")
  private Double riOutsAdminPaid;
  @Column(name="RI_OUTS_OTHERS_PAID")
  private Double riOutsOthersPaid;
  @Column(name="RI_CURR_COLL_ID")
  private Double riCurrCollId;
  @Column(name="RI_LAST_COLL_ID")
  private Double riLastCollId;
  @Column(name="RI_PAID_DATE")
  @Temporal(TemporalType.DATE)
  private Date riPaidDate;
  @Column(name="RI_LAST_PAID_DATE")
  @Temporal(TemporalType.DATE)
  private Date riLastPaidDate;
  @Column(name="RI_PROMISE_DATE")
  @Temporal(TemporalType.DATE)
  private Date riPromiseDate;
  @Column(name="RI_STAT_PENUGASAN")
  private String riStatPenugasan;
  @Column(name="RI_LAST_STAT_PENUGASAN")
  private String riLastStatPenugasan;
  @Column(name="RI_STAT_RELEASE_BPKB")
  private String riStatReleaseBpkb;
  @Column(name="RI_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date riCreatedDate;
  @Column(name="RI_CREATED_BY")
  private String riCreatedBy;
  @Column(name="RI_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date riUpdatedDate;
  @Column(name="RI_UPDATED_BY")
  private String riUpdatedBy;
  @Column(name="RI_ZIP_CODE")
  private String riZipCode;
  @Column(name="RI_SUBZIP_CODE")
  private String riSubzipCode;
  @Column(name="RI_PROMISE_AMT")
  private Double riPromiseAmt;
  @Column(name="RI_IS_PTR")
  private String riIsPtr;
  
	public String getRiContractNo() {
		return riContractNo;
	}
	public void setRiContractNo(String riContractNo) {
		this.riContractNo = riContractNo;
	}
	public String getRiCoyoutletId() {
		return riCoyoutletId;
	}
	public void setRiCoyoutletId(String riCoyoutletId) {
		this.riCoyoutletId = riCoyoutletId;
	}
	public String getRiCustId() {
		return riCustId;
	}
	public void setRiCustId(String riCustId) {
		this.riCustId = riCustId;
	}
	public Date getRiTermDate() {
		return riTermDate;
	}
	public void setRiTermDate(Date riTermDate) {
		this.riTermDate = riTermDate;
	}
	public String getRiStatContract() {
		return riStatContract;
	}
	public void setRiStatContract(String riStatContract) {
		this.riStatContract = riStatContract;
	}
	public Double getRiOutsPrincipal() {
		return riOutsPrincipal;
	}
	public void setRiOutsPrincipal(Double riOutsPrincipal) {
		this.riOutsPrincipal = riOutsPrincipal;
	}
	public Double getRiOutsInterest() {
		return riOutsInterest;
	}
	public void setRiOutsInterest(Double riOutsInterest) {
		this.riOutsInterest = riOutsInterest;
	}
	public Double getRiOutsAdmin() {
		return riOutsAdmin;
	}
	public void setRiOutsAdmin(Double riOutsAdmin) {
		this.riOutsAdmin = riOutsAdmin;
	}
	public Double getRiOutsOthers() {
		return riOutsOthers;
	}
	public void setRiOutsOthers(Double riOutsOthers) {
		this.riOutsOthers = riOutsOthers;
	}
	public Double getRiOutsPrincipalPaid() {
		return riOutsPrincipalPaid;
	}
	public void setRiOutsPrincipalPaid(Double riOutsPrincipalPaid) {
		this.riOutsPrincipalPaid = riOutsPrincipalPaid;
	}
	public Double getRiOutsInterestPaid() {
		return riOutsInterestPaid;
	}
	public void setRiOutsInterestPaid(Double riOutsInterestPaid) {
		this.riOutsInterestPaid = riOutsInterestPaid;
	}
	public Double getRiOutsAdminPaid() {
		return riOutsAdminPaid;
	}
	public void setRiOutsAdminPaid(Double riOutsAdminPaid) {
		this.riOutsAdminPaid = riOutsAdminPaid;
	}
	public Double getRiOutsOthersPaid() {
		return riOutsOthersPaid;
	}
	public void setRiOutsOthersPaid(Double riOutsOthersPaid) {
		this.riOutsOthersPaid = riOutsOthersPaid;
	}
	public Double getRiCurrCollId() {
		return riCurrCollId;
	}
	public void setRiCurrCollId(Double riCurrCollId) {
		this.riCurrCollId = riCurrCollId;
	}
	public Double getRiLastCollId() {
		return riLastCollId;
	}
	public void setRiLastCollId(Double riLastCollId) {
		this.riLastCollId = riLastCollId;
	}
	public Date getRiPaidDate() {
		return riPaidDate;
	}
	public void setRiPaidDate(Date riPaidDate) {
		this.riPaidDate = riPaidDate;
	}
	public Date getRiLastPaidDate() {
		return riLastPaidDate;
	}
	public void setRiLastPaidDate(Date riLastPaidDate) {
		this.riLastPaidDate = riLastPaidDate;
	}
	public Date getRiPromiseDate() {
		return riPromiseDate;
	}
	public void setRiPromiseDate(Date riPromiseDate) {
		this.riPromiseDate = riPromiseDate;
	}
	public String getRiStatPenugasan() {
		return riStatPenugasan;
	}
	public void setRiStatPenugasan(String riStatPenugasan) {
		this.riStatPenugasan = riStatPenugasan;
	}
	public String getRiLastStatPenugasan() {
		return riLastStatPenugasan;
	}
	public void setRiLastStatPenugasan(String riLastStatPenugasan) {
		this.riLastStatPenugasan = riLastStatPenugasan;
	}
	public String getRiStatReleaseBpkb() {
		return riStatReleaseBpkb;
	}
	public void setRiStatReleaseBpkb(String riStatReleaseBpkb) {
		this.riStatReleaseBpkb = riStatReleaseBpkb;
	}
	public Date getRiCreatedDate() {
		return riCreatedDate;
	}
	public void setRiCreatedDate(Date riCreatedDate) {
		this.riCreatedDate = riCreatedDate;
	}
	public String getRiCreatedBy() {
		return riCreatedBy;
	}
	public void setRiCreatedBy(String riCreatedBy) {
		this.riCreatedBy = riCreatedBy;
	}
	public Date getRiUpdatedDate() {
		return riUpdatedDate;
	}
	public void setRiUpdatedDate(Date riUpdatedDate) {
		this.riUpdatedDate = riUpdatedDate;
	}
	public String getRiUpdatedBy() {
		return riUpdatedBy;
	}
	public void setRiUpdatedBy(String riUpdatedBy) {
		this.riUpdatedBy = riUpdatedBy;
	}
	public String getRiZipCode() {
		return riZipCode;
	}
	public void setRiZipCode(String riZipCode) {
		this.riZipCode = riZipCode;
	}
	public String getRiSubzipCode() {
		return riSubzipCode;
	}
	public void setRiSubzipCode(String riSubzipCode) {
		this.riSubzipCode = riSubzipCode;
	}
	public Double getRiPromiseAmt() {
		return riPromiseAmt;
	}
	public void setRiPromiseAmt(Double riPromiseAmt) {
		this.riPromiseAmt = riPromiseAmt;
	}
	public String getRiIsPtr() {
		return riIsPtr;
	}
	public void setRiIsPtr(String riIsPtr) {
		this.riIsPtr = riIsPtr;
	}

}