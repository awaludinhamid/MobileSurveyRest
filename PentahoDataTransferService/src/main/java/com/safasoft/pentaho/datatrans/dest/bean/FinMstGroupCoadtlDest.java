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
@Table(name="FIN_MST_GROUP_COADTL")
public class FinMstGroupCoadtlDest implements Serializable {

  @Id
  @Column(name="GRCOA_IDDTL")
  private String grcoaIddtl;
  @Id
  @Column(name="GRCOA_SEQ")
  private Double grcoaSeq;
  @Column(name="GRCOA_GL_ACCT")
  private String grcoaGlAcct;
  @Column(name="GRCOA_DL_DESC")
  private String grcoaDlDesc;
  @Column(name="CREATED_BY")
  private String createdBy;
  @Column(name="CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date createdDate;
  @Column(name="UPDATED_BY")
  private String updatedBy;
  @Column(name="UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date updatedDate;
  @Column(name="GRCOA_GL_ACCT_BAL")
  private String grcoaGlAcctBal;
  
	public String getGrcoaIddtl() {
		return grcoaIddtl;
	}
	public void setGrcoaIddtl(String grcoaIddtl) {
		this.grcoaIddtl = grcoaIddtl;
	}
	public Double getGrcoaSeq() {
		return grcoaSeq;
	}
	public void setGrcoaSeq(Double grcoaSeq) {
		this.grcoaSeq = grcoaSeq;
	}
	public String getGrcoaGlAcct() {
		return grcoaGlAcct;
	}
	public void setGrcoaGlAcct(String grcoaGlAcct) {
		this.grcoaGlAcct = grcoaGlAcct;
	}
	public String getGrcoaDlDesc() {
		return grcoaDlDesc;
	}
	public void setGrcoaDlDesc(String grcoaDlDesc) {
		this.grcoaDlDesc = grcoaDlDesc;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getGrcoaGlAcctBal() {
		return grcoaGlAcctBal;
	}
	public void setGrcoaGlAcctBal(String grcoaGlAcctBal) {
		this.grcoaGlAcctBal = grcoaGlAcctBal;
	}

}