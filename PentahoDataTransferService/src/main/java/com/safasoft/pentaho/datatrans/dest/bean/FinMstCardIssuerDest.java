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
@Table(name="FIN_MST_CARD_ISSUER")
public class FinMstCardIssuerDest implements Serializable {

  @Id
  @Column(name="ISSUER_NAME")
  private String issuerName;
  @Column(name="ISSUER_TYPE")
  private String issuerType;
  @Column(name="ISSUER_CREATED_BY")
  private String issuerCreatedBy;
  @Column(name="ISSUER_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date issuerCreatedDate;
  @Column(name="ISSUER_UPDATED_BY")
  private String issuerUpdatedBy;
  @Column(name="ISSUER_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date issuerUpdatedDate;
  
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public String getIssuerType() {
		return issuerType;
	}
	public void setIssuerType(String issuerType) {
		this.issuerType = issuerType;
	}
	public String getIssuerCreatedBy() {
		return issuerCreatedBy;
	}
	public void setIssuerCreatedBy(String issuerCreatedBy) {
		this.issuerCreatedBy = issuerCreatedBy;
	}
	public Date getIssuerCreatedDate() {
		return issuerCreatedDate;
	}
	public void setIssuerCreatedDate(Date issuerCreatedDate) {
		this.issuerCreatedDate = issuerCreatedDate;
	}
	public String getIssuerUpdatedBy() {
		return issuerUpdatedBy;
	}
	public void setIssuerUpdatedBy(String issuerUpdatedBy) {
		this.issuerUpdatedBy = issuerUpdatedBy;
	}
	public Date getIssuerUpdatedDate() {
		return issuerUpdatedDate;
	}
	public void setIssuerUpdatedDate(Date issuerUpdatedDate) {
		this.issuerUpdatedDate = issuerUpdatedDate;
	}

}