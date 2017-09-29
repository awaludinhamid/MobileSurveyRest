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
@Table(name="CM_TGH_MST_PATTERN",schema="SHCM")
public class CmTghMstPattern implements Serializable {

  @Id
  @Column(name="PTRN_CODE")
  private String ptrnCode;                                                                              
  @Column(name="PTRN_DESC")
  private String ptrnDesc;                                                                                   
  @Column(name="PTRN_OVD_START")
  private Integer ptrnOvdStart;                                                                         
  @Column(name="PTRN_OVD_END")
  private Integer ptrnOvdEnd;                                                                             
  @Column(name="PTRN_STATUS")
  private String ptrnStatus;                                                                               
  @Column(name="PTRN_CREATED_BY")
  private String ptrnCreatedBy;                                                                        
  @Column(name="PTRN_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date ptrnCreatedTimestamp;                              
  @Column(name="PTRN_LASTUPDATE_BY")
  private String ptrnLastupdateBy;                                                                  
  @Column(name="PTRN_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date ptrnLastupdateTimestamp;                        
  @Column(name="PTRN_IS_PAYMENT")
  private Integer ptrnIsPayment;                                                                       
  @Column(name="PTRN_GROUP")
  private String ptrnGroup;
  
	public String getPtrnCode() {
		return ptrnCode;
	}
	public void setPtrnCode(String ptrnCode) {
		this.ptrnCode = ptrnCode;
	}
	public String getPtrnDesc() {
		return ptrnDesc;
	}
	public void setPtrnDesc(String ptrnDesc) {
		this.ptrnDesc = ptrnDesc;
	}
	public Integer getPtrnOvdStart() {
		return ptrnOvdStart;
	}
	public void setPtrnOvdStart(Integer ptrnOvdStart) {
		this.ptrnOvdStart = ptrnOvdStart;
	}
	public Integer getPtrnOvdEnd() {
		return ptrnOvdEnd;
	}
	public void setPtrnOvdEnd(Integer ptrnOvdEnd) {
		this.ptrnOvdEnd = ptrnOvdEnd;
	}
	public String getPtrnStatus() {
		return ptrnStatus;
	}
	public void setPtrnStatus(String ptrnStatus) {
		this.ptrnStatus = ptrnStatus;
	}
	public String getPtrnCreatedBy() {
		return ptrnCreatedBy;
	}
	public void setPtrnCreatedBy(String ptrnCreatedBy) {
		this.ptrnCreatedBy = ptrnCreatedBy;
	}
	public Date getPtrnCreatedTimestamp() {
		return ptrnCreatedTimestamp;
	}
	public void setPtrnCreatedTimestamp(Date ptrnCreatedTimestamp) {
		this.ptrnCreatedTimestamp = ptrnCreatedTimestamp;
	}
	public String getPtrnLastupdateBy() {
		return ptrnLastupdateBy;
	}
	public void setPtrnLastupdateBy(String ptrnLastupdateBy) {
		this.ptrnLastupdateBy = ptrnLastupdateBy;
	}
	public Date getPtrnLastupdateTimestamp() {
		return ptrnLastupdateTimestamp;
	}
	public void setPtrnLastupdateTimestamp(Date ptrnLastupdateTimestamp) {
		this.ptrnLastupdateTimestamp = ptrnLastupdateTimestamp;
	}
	public Integer getPtrnIsPayment() {
		return ptrnIsPayment;
	}
	public void setPtrnIsPayment(Integer ptrnIsPayment) {
		this.ptrnIsPayment = ptrnIsPayment;
	}
	public String getPtrnGroup() {
		return ptrnGroup;
	}
	public void setPtrnGroup(String ptrnGroup) {
		this.ptrnGroup = ptrnGroup;
	}
}