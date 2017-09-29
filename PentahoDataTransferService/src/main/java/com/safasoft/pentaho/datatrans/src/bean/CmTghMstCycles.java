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
@Table(name="CM_TGH_MST_CYCLES",schema="SHCM")
public class CmTghMstCycles implements Serializable {

  @Id
  @Column(name="CYCLE_CODE")
  private String cycleCode;                                                                            
  @Column(name="CYCLE_NAME")
  private String cycleName;                                                                                 
  @Column(name="CYCLE_DESC")
  private String cycleDesc;                                                                                 
  @Column(name="CYCLE_OVD_START")
  private Integer cycleOvdStart;                                                                       
  @Column(name="CYCLE_OVD_END")
  private Integer cycleOvdEnd;                                                                           
  @Column(name="CYCLE_STATUS")
  private String cycleStatus;                                                                             
  @Column(name="CYCLE_CREATED_BY")
  private String cycleCreatedBy;                                                                      
  @Column(name="CYCLE_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date cycleCreatedTimestamp;                            
  @Column(name="CYCLE_LASTUPDATE_BY")
  private String cycleLastupdateBy;                                                                
  @Column(name="CYCLE_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date cycleLastupdateTimestamp;                      
  @Column(name="CYCLE_FLAG")
  private String cycleFlag;                                                                                 
  @Column(name="CYCLE_RPT_POSS")
  private Integer cycleRptPoss;                                                                         
  @Column(name="CYCLE_ROLLING_CPC_CRC")
  private Integer cycleRollingCpcCrc;                                                            
  @Column(name="CYCLE_TYPE")
  private String cycleType;
  
	public String getCycleCode() {
		return cycleCode;
	}
	public void setCycleCode(String cycleCode) {
		this.cycleCode = cycleCode;
	}
	public String getCycleName() {
		return cycleName;
	}
	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}
	public String getCycleDesc() {
		return cycleDesc;
	}
	public void setCycleDesc(String cycleDesc) {
		this.cycleDesc = cycleDesc;
	}
	public Integer getCycleOvdStart() {
		return cycleOvdStart;
	}
	public void setCycleOvdStart(Integer cycleOvdStart) {
		this.cycleOvdStart = cycleOvdStart;
	}
	public Integer getCycleOvdEnd() {
		return cycleOvdEnd;
	}
	public void setCycleOvdEnd(Integer cycleOvdEnd) {
		this.cycleOvdEnd = cycleOvdEnd;
	}
	public String getCycleStatus() {
		return cycleStatus;
	}
	public void setCycleStatus(String cycleStatus) {
		this.cycleStatus = cycleStatus;
	}
	public String getCycleCreatedBy() {
		return cycleCreatedBy;
	}
	public void setCycleCreatedBy(String cycleCreatedBy) {
		this.cycleCreatedBy = cycleCreatedBy;
	}
	public Date getCycleCreatedTimestamp() {
		return cycleCreatedTimestamp;
	}
	public void setCycleCreatedTimestamp(Date cycleCreatedTimestamp) {
		this.cycleCreatedTimestamp = cycleCreatedTimestamp;
	}
	public String getCycleLastupdateBy() {
		return cycleLastupdateBy;
	}
	public void setCycleLastupdateBy(String cycleLastupdateBy) {
		this.cycleLastupdateBy = cycleLastupdateBy;
	}
	public Date getCycleLastupdateTimestamp() {
		return cycleLastupdateTimestamp;
	}
	public void setCycleLastupdateTimestamp(Date cycleLastupdateTimestamp) {
		this.cycleLastupdateTimestamp = cycleLastupdateTimestamp;
	}
	public String getCycleFlag() {
		return cycleFlag;
	}
	public void setCycleFlag(String cycleFlag) {
		this.cycleFlag = cycleFlag;
	}
	public Integer getCycleRptPoss() {
		return cycleRptPoss;
	}
	public void setCycleRptPoss(Integer cycleRptPoss) {
		this.cycleRptPoss = cycleRptPoss;
	}
	public Integer getCycleRollingCpcCrc() {
		return cycleRollingCpcCrc;
	}
	public void setCycleRollingCpcCrc(Integer cycleRollingCpcCrc) {
		this.cycleRollingCpcCrc = cycleRollingCpcCrc;
	}
	public String getCycleType() {
		return cycleType;
	}
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}
}