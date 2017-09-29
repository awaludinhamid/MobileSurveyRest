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
@Table(name="CM_TGH_LKP_HDRS")
public class CmTghLkpHdrsDest implements Serializable {

  @Id
  @Column(name="LKP_NO")
  private String lkpNo;                                                                                    
  @Column(name="LKPH_LKP_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkphLkpDate;                                                
  @Column(name="LKPH_OFFICE_CODE")
  private String lkphOfficeCode;                                                                      
  @Column(name="LKPH_EMPL_CODE")
  private Double lkphEmplCode;                                                                          
  @Column(name="LKPH_WORK_FLAG")
  private String lkphWorkFlag;                                                                          
  @Column(name="LKPH_CYCLE")
  private String lkphCycle;                                                                                 
  @Column(name="LKPH_UNIT_TOTAL")
  private Double lkphUnitTotal;                                                                        
  @Column(name="LKPH_PRNC_AMBC")
  private Double lkphPrncAmbc;                                                                          
  @Column(name="LKPH_PRNC_AC")
  private Double lkphPrncAc;                                                                              
  @Column(name="LKPH_INTR_AMBC")
  private Double lkphIntrAmbc;                                                                          
  @Column(name="LKPH_INTR_AC")
  private Double lkphIntrAc;                                                                              
  @Column(name="LKPH_AMBC_TOTAL")
  private Double lkphAmbcTotal;                                                                        
  @Column(name="LKPH_AC_TOTAL")
  private Double lkphAcTotal;                                                                            
  @Column(name="LKPH_MAX_ENTRY_DAYS")
  private Double lkphMaxEntryDays;                                                                 
  @Column(name="LKPH_COY_ID")
  private String lkphCoyId;                                                                                
  @Column(name="LKPH_SUPERVISOR_ID")
  private Double lkphSupervisorId;                                                                  
  @Column(name="LKPH_TYPE")
  private String lkphType;                                                                                   
  @Column(name="LKPH_APPROVED_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkphApprovedDate;                                      
  @Column(name="LKPH_CREATED_BY")
  private String lkphCreatedBy;                                                                        
  @Column(name="LKPH_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date lkphCreatedTimestamp;                              
  @Column(name="LKPH_LASTUPDATE_BY")
  private String lkphLastupdateBy;                                                                  
  @Column(name="LKPH_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date lkphLastupdateTimestamp;                        
  @Column(name="LKPH_PITSTOP")
  private String lkphPitstop;                                                                             
  @Column(name="LKPH_APPROVED_BY")
  private String lkphApprovedBy;                                                                      
  @Column(name="LKPH_TYPE_LKS")
  private Double lkphTypeLks;  
  
	public String getLkpNo() {
		return lkpNo;
	}
	public void setLkpNo(String lkpNo) {
		this.lkpNo = lkpNo;
	}
	public Date getLkphLkpDate() {
		return lkphLkpDate;
	}
	public void setLkphLkpDate(Date lkphLkpDate) {
		this.lkphLkpDate = lkphLkpDate;
	}
	public String getLkphOfficeCode() {
		return lkphOfficeCode;
	}
	public void setLkphOfficeCode(String lkphOfficeCode) {
		this.lkphOfficeCode = lkphOfficeCode;
	}
	public Double getLkphEmplCode() {
		return lkphEmplCode;
	}
	public void setLkphEmplCode(Double lkphEmplCode) {
		this.lkphEmplCode = lkphEmplCode;
	}
	public String getLkphWorkFlag() {
		return lkphWorkFlag;
	}
	public void setLkphWorkFlag(String lkphWorkFlag) {
		this.lkphWorkFlag = lkphWorkFlag;
	}
	public String getLkphCycle() {
		return lkphCycle;
	}
	public void setLkphCycle(String lkphCycle) {
		this.lkphCycle = lkphCycle;
	}
	public Double getLkphUnitTotal() {
		return lkphUnitTotal;
	}
	public void setLkphUnitTotal(Double lkphUnitTotal) {
		this.lkphUnitTotal = lkphUnitTotal;
	}
	public Double getLkphPrncAmbc() {
		return lkphPrncAmbc;
	}
	public void setLkphPrncAmbc(Double lkphPrncAmbc) {
		this.lkphPrncAmbc = lkphPrncAmbc;
	}
	public Double getLkphPrncAc() {
		return lkphPrncAc;
	}
	public void setLkphPrncAc(Double lkphPrncAc) {
		this.lkphPrncAc = lkphPrncAc;
	}
	public Double getLkphIntrAmbc() {
		return lkphIntrAmbc;
	}
	public void setLkphIntrAmbc(Double lkphIntrAmbc) {
		this.lkphIntrAmbc = lkphIntrAmbc;
	}
	public Double getLkphIntrAc() {
		return lkphIntrAc;
	}
	public void setLkphIntrAc(Double lkphIntrAc) {
		this.lkphIntrAc = lkphIntrAc;
	}
	public Double getLkphAmbcTotal() {
		return lkphAmbcTotal;
	}
	public void setLkphAmbcTotal(Double lkphAmbcTotal) {
		this.lkphAmbcTotal = lkphAmbcTotal;
	}
	public Double getLkphAcTotal() {
		return lkphAcTotal;
	}
	public void setLkphAcTotal(Double lkphAcTotal) {
		this.lkphAcTotal = lkphAcTotal;
	}
	public Double getLkphMaxEntryDays() {
		return lkphMaxEntryDays;
	}
	public void setLkphMaxEntryDays(Double lkphMaxEntryDays) {
		this.lkphMaxEntryDays = lkphMaxEntryDays;
	}
	public String getLkphCoyId() {
		return lkphCoyId;
	}
	public void setLkphCoyId(String lkphCoyId) {
		this.lkphCoyId = lkphCoyId;
	}
	public Double getLkphSupervisorId() {
		return lkphSupervisorId;
	}
	public void setLkphSupervisorId(Double lkphSupervisorId) {
		this.lkphSupervisorId = lkphSupervisorId;
	}
	public String getLkphType() {
		return lkphType;
	}
	public void setLkphType(String lkphType) {
		this.lkphType = lkphType;
	}
	public Date getLkphApprovedDate() {
		return lkphApprovedDate;
	}
	public void setLkphApprovedDate(Date lkphApprovedDate) {
		this.lkphApprovedDate = lkphApprovedDate;
	}
	public String getLkphCreatedBy() {
		return lkphCreatedBy;
	}
	public void setLkphCreatedBy(String lkphCreatedBy) {
		this.lkphCreatedBy = lkphCreatedBy;
	}
	public Date getLkphCreatedTimestamp() {
		return lkphCreatedTimestamp;
	}
	public void setLkphCreatedTimestamp(Date lkphCreatedTimestamp) {
		this.lkphCreatedTimestamp = lkphCreatedTimestamp;
	}
	public String getLkphLastupdateBy() {
		return lkphLastupdateBy;
	}
	public void setLkphLastupdateBy(String lkphLastupdateBy) {
		this.lkphLastupdateBy = lkphLastupdateBy;
	}
	public Date getLkphLastupdateTimestamp() {
		return lkphLastupdateTimestamp;
	}
	public void setLkphLastupdateTimestamp(Date lkphLastupdateTimestamp) {
		this.lkphLastupdateTimestamp = lkphLastupdateTimestamp;
	}
	public String getLkphPitstop() {
		return lkphPitstop;
	}
	public void setLkphPitstop(String lkphPitstop) {
		this.lkphPitstop = lkphPitstop;
	}
	public String getLkphApprovedBy() {
		return lkphApprovedBy;
	}
	public void setLkphApprovedBy(String lkphApprovedBy) {
		this.lkphApprovedBy = lkphApprovedBy;
	}
	public Double getLkphTypeLks() {
		return lkphTypeLks;
	}
	public void setLkphTypeLks(Double lkphTypeLks) {
		this.lkphTypeLks = lkphTypeLks;
	}
}