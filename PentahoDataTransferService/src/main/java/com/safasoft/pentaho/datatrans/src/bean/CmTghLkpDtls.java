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
@Table(name="CM_TGH_LKP_DTLS",schema="SHCM")
public class CmTghLkpDtls implements Serializable {

  @Id
  @Column(name="LKP_NO")
  private String lkpNo;                                                                                    
  @Id
  @Column(name="LKPD_SEQ_NO")
  private Double lkpdSeqNo;                                                                           
  @Column(name="BBN_PER_TAHUN")
  private Integer bbnPerTahun;                                                                           
  @Column(name="BBN_PER_BULAN")
  private Integer bbnPerBulan;                                                                           
  @Column(name="LKPD_CONTRACT_NO")
  private String lkpdContractNo;                                                                      
  @Column(name="LKPD_OVD_INST_NO")
  private Double lkpdOvdInstNo;                                                                       
  @Column(name="LKPD_OVD_DUE_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkpdOvdDueDate;                                         
  @Column(name="LKPD_INST_NO")
  private Double lkpdInstNo;                                                                              
  @Column(name="LKPD_DUE_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkpdDueDate;                                                
  @Column(name="LKPD_PRNC_AMBC")
  private Double lkpdPrncAmbc;                                                                          
  @Column(name="LKPD_PRNC_AMBC_FIELD")
  private Double lkpdPrncAmbcField;                                                               
  @Column(name="LKPD_INTR_AMBC")
  private Double lkpdIntrAmbc;                                                                          
  @Column(name="LKPD_INTR_AMBC_FIELD")
  private Double lkpdIntrAmbcField;                                                               
  @Column(name="LKPD_PENALTY_AMBC")
  private Double lkpdPenaltyAmbc;                                                                    
  @Column(name="LKPD_LKP_FLAG")
  private String lkpdLkpFlag;                                                                            
  @Column(name="LKPD_PROMISE_DATE")
  @Temporal(TemporalType.DATE)
  private Date lkpdPromiseDate;                                        
  @Column(name="LKPD_PRNC_AC")
  private Double lkpdPrncAc;                                                                              
  @Column(name="LKPD_PRNC_AC_FIELD")
  private Double lkpdPrncAcField;                                                                   
  @Column(name="LKPD_INTR_AC")
  private Double lkpdIntrAc;                                                                              
  @Column(name="LKPD_INTR_AC_FIELD")
  private Double lkpdIntrAcField;                                                                   
  @Column(name="LKPD_PENALTY_AC")
  private Double lkpdPenaltyAc;                                                                        
  @Column(name="LKPD_COMMENT_STATUS")
  private String lkpdCommentStatus;                                                                
  @Column(name="LKPD_UNIT_STATUS")
  private String lkpdUnitStatus;                                                                      
  @Column(name="LKPD_WORK_STATUS")
  private String lkpdWorkStatus;                                                                      
  @Column(name="LKPD_VISIT_SEQ")
  private Double lkpdVisitSeq;                                                                          
  @Column(name="LKPD_PRNC_OTS")
  private Double lkpdPrncOts;                                                                            
  @Column(name="LKPD_PRNC_OTS_AKHIR")
  private Double lkpdPrncOtsAkhir;                                                                 
  @Column(name="LKPD_POTENSI")
  private Double lkpdPotensi;                                                                             
  @Column(name="LKPD_LT_SK_NO")
  private String lkpdLtSkNo;                                                                             
  @Column(name="LKPD_LT_CYCLE")
  private String lkpdLtCycle;                                                                            
  @Column(name="LKPD_LT_SEQ_NO")
  private Double lkpdLtSeqNo;                                                                           
  @Column(name="LKPD_LT_PRNC_AC_FIELD")
  private Double lkpdLtPrncAcField;                                                              
  @Column(name="LKPD_LT_INTR_AC_FIELD")
  private Double lkpdLtIntrAcField;                                                              
  @Column(name="LKPD_POSTED")
  private String lkpdPosted;                                                                               
  @Column(name="LKPD_POINT_PK_AC_FIELD")
  private Double lkpdPointPkAcField;                                                            
  @Column(name="LKPD_POST_VISITED")
  private String lkpdPostVisited;                                                                    
  @Column(name="LKPD_CREATED_BY")
  private String lkpdCreatedBy;                                                                        
  @Column(name="LKPD_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date lkpdCreatedTimestamp;                              
  @Column(name="LKPD_LASTUPDATE_BY")
  private String lkpdLastupdateBy;                                                                  
  @Column(name="LKPD_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date lkpdLastupdateTimestamp;                        
  @Column(name="LKPD_CLASS_CODE")
  private String lkpdClassCode;                                                                        
  @Column(name="LKPD_DELQ_CODE")
  private String lkpdDelqCode;                                                                          
  @Column(name="LKPD_POTENSI_CODE")
  private String lkpdPotensiCode;                                                                    
  @Column(name="LKPD_WHO_MET_CODE")
  private String lkpdWhoMetCode;                                                                     
  @Column(name="LKPD_UNIT_HOLDER_CODE")
  private String lkpdUnitHolderCode;                                                             
  @Column(name="LKPD_COMMENTS")
  private String lkpdComments;                                                                           
  @Column(name="LKPD_ACTION_PLAN")
  private String lkpdActionPlan;                                                                      
  @Column(name="LKPD_CYCLE_AWAL")
  private String lkpdCycleAwal;                                                                        
  @Column(name="LKPD_STAT_PROSES")
  private Double lkpdStatProses;                                                                      
  @Column(name="LKPD_FLAG_SOMASI")
  private String lkpdFlagSomasi;                                                                      
  @Column(name="LKPD_TYPE_SOMASI")
  private String lkpdTypeSomasi;                                                                      
  @Column(name="LKPD_SOMASI_PRINT")
  private String lkpdSomasiPrint;                                                                    
  @Column(name="LKPD_INSTL_TYPE")
  private String lkpdInstlType;                                                                        
  @Column(name="LKPD_JRK_ANGS")
  private Double lkpdJrkAngs;                                                                            
  @Column(name="LKPD_SEQN_ASSIGN")
  private Double lkpdSeqnAssign;                                                                      
  @Column(name="LKPD_PRIO_CODE")
  private String lkpdPrioCode;
  
	public String getLkpNo() {
		return lkpNo;
	}
	public void setLkpNo(String lkpNo) {
		this.lkpNo = lkpNo;
	}
	public Double getLkpdSeqNo() {
		return lkpdSeqNo;
	}
	public void setLkpdSeqNo(Double lkpdSeqNo) {
		this.lkpdSeqNo = lkpdSeqNo;
	}
	public Integer getBbnPerTahun() {
		return bbnPerTahun;
	}
	public void setBbnPerTahun(Integer bbnPerTahun) {
		this.bbnPerTahun = bbnPerTahun;
	}
	public Integer getBbnPerBulan() {
		return bbnPerBulan;
	}
	public void setBbnPerBulan(Integer bbnPerBulan) {
		this.bbnPerBulan = bbnPerBulan;
	}
	public String getLkpdContractNo() {
		return lkpdContractNo;
	}
	public void setLkpdContractNo(String lkpdContractNo) {
		this.lkpdContractNo = lkpdContractNo;
	}
	public Double getLkpdOvdInstNo() {
		return lkpdOvdInstNo;
	}
	public void setLkpdOvdInstNo(Double lkpdOvdInstNo) {
		this.lkpdOvdInstNo = lkpdOvdInstNo;
	}
	public Date getLkpdOvdDueDate() {
		return lkpdOvdDueDate;
	}
	public void setLkpdOvdDueDate(Date lkpdOvdDueDate) {
		this.lkpdOvdDueDate = lkpdOvdDueDate;
	}
	public Double getLkpdInstNo() {
		return lkpdInstNo;
	}
	public void setLkpdInstNo(Double lkpdInstNo) {
		this.lkpdInstNo = lkpdInstNo;
	}
	public Date getLkpdDueDate() {
		return lkpdDueDate;
	}
	public void setLkpdDueDate(Date lkpdDueDate) {
		this.lkpdDueDate = lkpdDueDate;
	}
	public Double getLkpdPrncAmbc() {
		return lkpdPrncAmbc;
	}
	public void setLkpdPrncAmbc(Double lkpdPrncAmbc) {
		this.lkpdPrncAmbc = lkpdPrncAmbc;
	}
	public Double getLkpdPrncAmbcField() {
		return lkpdPrncAmbcField;
	}
	public void setLkpdPrncAmbcField(Double lkpdPrncAmbcField) {
		this.lkpdPrncAmbcField = lkpdPrncAmbcField;
	}
	public Double getLkpdIntrAmbc() {
		return lkpdIntrAmbc;
	}
	public void setLkpdIntrAmbc(Double lkpdIntrAmbc) {
		this.lkpdIntrAmbc = lkpdIntrAmbc;
	}
	public Double getLkpdIntrAmbcField() {
		return lkpdIntrAmbcField;
	}
	public void setLkpdIntrAmbcField(Double lkpdIntrAmbcField) {
		this.lkpdIntrAmbcField = lkpdIntrAmbcField;
	}
	public Double getLkpdPenaltyAmbc() {
		return lkpdPenaltyAmbc;
	}
	public void setLkpdPenaltyAmbc(Double lkpdPenaltyAmbc) {
		this.lkpdPenaltyAmbc = lkpdPenaltyAmbc;
	}
	public String getLkpdLkpFlag() {
		return lkpdLkpFlag;
	}
	public void setLkpdLkpFlag(String lkpdLkpFlag) {
		this.lkpdLkpFlag = lkpdLkpFlag;
	}
	public Date getLkpdPromiseDate() {
		return lkpdPromiseDate;
	}
	public void setLkpdPromiseDate(Date lkpdPromiseDate) {
		this.lkpdPromiseDate = lkpdPromiseDate;
	}
	public Double getLkpdPrncAc() {
		return lkpdPrncAc;
	}
	public void setLkpdPrncAc(Double lkpdPrncAc) {
		this.lkpdPrncAc = lkpdPrncAc;
	}
	public Double getLkpdPrncAcField() {
		return lkpdPrncAcField;
	}
	public void setLkpdPrncAcField(Double lkpdPrncAcField) {
		this.lkpdPrncAcField = lkpdPrncAcField;
	}
	public Double getLkpdIntrAc() {
		return lkpdIntrAc;
	}
	public void setLkpdIntrAc(Double lkpdIntrAc) {
		this.lkpdIntrAc = lkpdIntrAc;
	}
	public Double getLkpdIntrAcField() {
		return lkpdIntrAcField;
	}
	public void setLkpdIntrAcField(Double lkpdIntrAcField) {
		this.lkpdIntrAcField = lkpdIntrAcField;
	}
	public Double getLkpdPenaltyAc() {
		return lkpdPenaltyAc;
	}
	public void setLkpdPenaltyAc(Double lkpdPenaltyAc) {
		this.lkpdPenaltyAc = lkpdPenaltyAc;
	}
	public String getLkpdCommentStatus() {
		return lkpdCommentStatus;
	}
	public void setLkpdCommentStatus(String lkpdCommentStatus) {
		this.lkpdCommentStatus = lkpdCommentStatus;
	}
	public String getLkpdUnitStatus() {
		return lkpdUnitStatus;
	}
	public void setLkpdUnitStatus(String lkpdUnitStatus) {
		this.lkpdUnitStatus = lkpdUnitStatus;
	}
	public String getLkpdWorkStatus() {
		return lkpdWorkStatus;
	}
	public void setLkpdWorkStatus(String lkpdWorkStatus) {
		this.lkpdWorkStatus = lkpdWorkStatus;
	}
	public Double getLkpdVisitSeq() {
		return lkpdVisitSeq;
	}
	public void setLkpdVisitSeq(Double lkpdVisitSeq) {
		this.lkpdVisitSeq = lkpdVisitSeq;
	}
	public Double getLkpdPrncOts() {
		return lkpdPrncOts;
	}
	public void setLkpdPrncOts(Double lkpdPrncOts) {
		this.lkpdPrncOts = lkpdPrncOts;
	}
	public Double getLkpdPrncOtsAkhir() {
		return lkpdPrncOtsAkhir;
	}
	public void setLkpdPrncOtsAkhir(Double lkpdPrncOtsAkhir) {
		this.lkpdPrncOtsAkhir = lkpdPrncOtsAkhir;
	}
	public Double getLkpdPotensi() {
		return lkpdPotensi;
	}
	public void setLkpdPotensi(Double lkpdPotensi) {
		this.lkpdPotensi = lkpdPotensi;
	}
	public String getLkpdLtSkNo() {
		return lkpdLtSkNo;
	}
	public void setLkpdLtSkNo(String lkpdLtSkNo) {
		this.lkpdLtSkNo = lkpdLtSkNo;
	}
	public String getLkpdLtCycle() {
		return lkpdLtCycle;
	}
	public void setLkpdLtCycle(String lkpdLtCycle) {
		this.lkpdLtCycle = lkpdLtCycle;
	}
	public Double getLkpdLtSeqNo() {
		return lkpdLtSeqNo;
	}
	public void setLkpdLtSeqNo(Double lkpdLtSeqNo) {
		this.lkpdLtSeqNo = lkpdLtSeqNo;
	}
	public Double getLkpdLtPrncAcField() {
		return lkpdLtPrncAcField;
	}
	public void setLkpdLtPrncAcField(Double lkpdLtPrncAcField) {
		this.lkpdLtPrncAcField = lkpdLtPrncAcField;
	}
	public Double getLkpdLtIntrAcField() {
		return lkpdLtIntrAcField;
	}
	public void setLkpdLtIntrAcField(Double lkpdLtIntrAcField) {
		this.lkpdLtIntrAcField = lkpdLtIntrAcField;
	}
	public String getLkpdPosted() {
		return lkpdPosted;
	}
	public void setLkpdPosted(String lkpdPosted) {
		this.lkpdPosted = lkpdPosted;
	}
	public Double getLkpdPointPkAcField() {
		return lkpdPointPkAcField;
	}
	public void setLkpdPointPkAcField(Double lkpdPointPkAcField) {
		this.lkpdPointPkAcField = lkpdPointPkAcField;
	}
	public String getLkpdPostVisited() {
		return lkpdPostVisited;
	}
	public void setLkpdPostVisited(String lkpdPostVisited) {
		this.lkpdPostVisited = lkpdPostVisited;
	}
	public String getLkpdCreatedBy() {
		return lkpdCreatedBy;
	}
	public void setLkpdCreatedBy(String lkpdCreatedBy) {
		this.lkpdCreatedBy = lkpdCreatedBy;
	}
	public Date getLkpdCreatedTimestamp() {
		return lkpdCreatedTimestamp;
	}
	public void setLkpdCreatedTimestamp(Date lkpdCreatedTimestamp) {
		this.lkpdCreatedTimestamp = lkpdCreatedTimestamp;
	}
	public String getLkpdLastupdateBy() {
		return lkpdLastupdateBy;
	}
	public void setLkpdLastupdateBy(String lkpdLastupdateBy) {
		this.lkpdLastupdateBy = lkpdLastupdateBy;
	}
	public Date getLkpdLastupdateTimestamp() {
		return lkpdLastupdateTimestamp;
	}
	public void setLkpdLastupdateTimestamp(Date lkpdLastupdateTimestamp) {
		this.lkpdLastupdateTimestamp = lkpdLastupdateTimestamp;
	}
	public String getLkpdClassCode() {
		return lkpdClassCode;
	}
	public void setLkpdClassCode(String lkpdClassCode) {
		this.lkpdClassCode = lkpdClassCode;
	}
	public String getLkpdDelqCode() {
		return lkpdDelqCode;
	}
	public void setLkpdDelqCode(String lkpdDelqCode) {
		this.lkpdDelqCode = lkpdDelqCode;
	}
	public String getLkpdPotensiCode() {
		return lkpdPotensiCode;
	}
	public void setLkpdPotensiCode(String lkpdPotensiCode) {
		this.lkpdPotensiCode = lkpdPotensiCode;
	}
	public String getLkpdWhoMetCode() {
		return lkpdWhoMetCode;
	}
	public void setLkpdWhoMetCode(String lkpdWhoMetCode) {
		this.lkpdWhoMetCode = lkpdWhoMetCode;
	}
	public String getLkpdUnitHolderCode() {
		return lkpdUnitHolderCode;
	}
	public void setLkpdUnitHolderCode(String lkpdUnitHolderCode) {
		this.lkpdUnitHolderCode = lkpdUnitHolderCode;
	}
	public String getLkpdComments() {
		return lkpdComments;
	}
	public void setLkpdComments(String lkpdComments) {
		this.lkpdComments = lkpdComments;
	}
	public String getLkpdActionPlan() {
		return lkpdActionPlan;
	}
	public void setLkpdActionPlan(String lkpdActionPlan) {
		this.lkpdActionPlan = lkpdActionPlan;
	}
	public String getLkpdCycleAwal() {
		return lkpdCycleAwal;
	}
	public void setLkpdCycleAwal(String lkpdCycleAwal) {
		this.lkpdCycleAwal = lkpdCycleAwal;
	}
	public Double getLkpdStatProses() {
		return lkpdStatProses;
	}
	public void setLkpdStatProses(Double lkpdStatProses) {
		this.lkpdStatProses = lkpdStatProses;
	}
	public String getLkpdFlagSomasi() {
		return lkpdFlagSomasi;
	}
	public void setLkpdFlagSomasi(String lkpdFlagSomasi) {
		this.lkpdFlagSomasi = lkpdFlagSomasi;
	}
	public String getLkpdTypeSomasi() {
		return lkpdTypeSomasi;
	}
	public void setLkpdTypeSomasi(String lkpdTypeSomasi) {
		this.lkpdTypeSomasi = lkpdTypeSomasi;
	}
	public String getLkpdSomasiPrint() {
		return lkpdSomasiPrint;
	}
	public void setLkpdSomasiPrint(String lkpdSomasiPrint) {
		this.lkpdSomasiPrint = lkpdSomasiPrint;
	}
	public String getLkpdInstlType() {
		return lkpdInstlType;
	}
	public void setLkpdInstlType(String lkpdInstlType) {
		this.lkpdInstlType = lkpdInstlType;
	}
	public Double getLkpdJrkAngs() {
		return lkpdJrkAngs;
	}
	public void setLkpdJrkAngs(Double lkpdJrkAngs) {
		this.lkpdJrkAngs = lkpdJrkAngs;
	}
	public Double getLkpdSeqnAssign() {
		return lkpdSeqnAssign;
	}
	public void setLkpdSeqnAssign(Double lkpdSeqnAssign) {
		this.lkpdSeqnAssign = lkpdSeqnAssign;
	}
	public String getLkpdPrioCode() {
		return lkpdPrioCode;
	}
	public void setLkpdPrioCode(String lkpdPrioCode) {
		this.lkpdPrioCode = lkpdPrioCode;
	} 
}