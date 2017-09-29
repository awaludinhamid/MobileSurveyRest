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
@Table(name="GL_MST_BU_ACCOUNT",schema="FINA")
public class GlMstBuAccount implements Serializable {

  @Id
  @Column(name="GLBU_ACCT_NO")
  private String glbuAcctNo;
  @Column(name="GLBU_ACCT_DESC")
  private String glbuAcctDesc;
  @Column(name="GLBU_ENABLE")
  private String glbuEnable;
  @Column(name="GLBU_CREATED_BY")
  private String glbuCreatedBy;
  @Column(name="GLBU_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date glbuCreatedDate;
  @Column(name="GLBU_UPDATED_BY")
  private String glbuUpdatedBy;
  @Column(name="GLBU_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date glbuUpdatedDate;
  @Column(name="GLBU_DEFAULT_FLAG")
  private String glbuDefaultFlag;
  
	public String getGlbuAcctNo() {
		return glbuAcctNo;
	}
	public void setGlbuAcctNo(String glbuAcctNo) {
		this.glbuAcctNo = glbuAcctNo;
	}
	public String getGlbuAcctDesc() {
		return glbuAcctDesc;
	}
	public void setGlbuAcctDesc(String glbuAcctDesc) {
		this.glbuAcctDesc = glbuAcctDesc;
	}
	public String getGlbuEnable() {
		return glbuEnable;
	}
	public void setGlbuEnable(String glbuEnable) {
		this.glbuEnable = glbuEnable;
	}
	public String getGlbuCreatedBy() {
		return glbuCreatedBy;
	}
	public void setGlbuCreatedBy(String glbuCreatedBy) {
		this.glbuCreatedBy = glbuCreatedBy;
	}
	public Date getGlbuCreatedDate() {
		return glbuCreatedDate;
	}
	public void setGlbuCreatedDate(Date glbuCreatedDate) {
		this.glbuCreatedDate = glbuCreatedDate;
	}
	public String getGlbuUpdatedBy() {
		return glbuUpdatedBy;
	}
	public void setGlbuUpdatedBy(String glbuUpdatedBy) {
		this.glbuUpdatedBy = glbuUpdatedBy;
	}
	public Date getGlbuUpdatedDate() {
		return glbuUpdatedDate;
	}
	public void setGlbuUpdatedDate(Date glbuUpdatedDate) {
		this.glbuUpdatedDate = glbuUpdatedDate;
	}
	public String getGlbuDefaultFlag() {
		return glbuDefaultFlag;
	}
	public void setGlbuDefaultFlag(String glbuDefaultFlag) {
		this.glbuDefaultFlag = glbuDefaultFlag;
	}

}