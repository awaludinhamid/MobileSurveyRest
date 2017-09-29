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
@Table(name="CM_TGH_MST_LKP_PARAM",schema="SHCM")
public class CmTghMstLkpParam implements Serializable {

  @Id
  @Column(name="PLKP_FLAG")
  private String plkpFlag;                                                                              
  @Column(name="PLKP_DESC")
  private String plkpDesc;                                                                                   
  @Column(name="PLKP_FLAG_COMMENT")
  private String plkpFlagComment;                                                                    
  @Column(name="PLKP_FLAG_DATE")
  private String plkpFlagDate;                                                                          
  @Column(name="PLKP_NEXT_VISIT")
  private Double plkpNextVisit;                                                                        
  @Column(name="PLKP_CODE")
  private String plkpCode;                                                                                   
  @Column(name="PLKP_MAX_PROMISE")
  private Double plkpMaxPromise;                                                                      
  @Column(name="PLKP_NEED_COLLECT")
  private String plkpNeedCollect;                                                                    
  @Column(name="PLKP_SCRIPT_EOD")
  private String plkpScriptEod;                                                                        
  @Column(name="PLKP_IS_DESKCALL")
  private String plkpIsDeskcall;                                                                      
  @Column(name="PLKP_REQ_SPV_ATT")
  private String plkpReqSpvAtt;                                                                       
  @Column(name="PLKP_SUCCESS_PHONE")
  private String plkpSuccessPhone;                                                                  
  @Column(name="PLKP_CALL_BACK")
  private String plkpCallBack;                                                                          
  @Column(name="PLKP_FLAG_AMOUNT")
  private String plkpFlagAmount;                                                                      
  @Column(name="PLKP_STATUS")
  private String plkpStatus;                                                                               
  @Column(name="PLKP_CREATED_BY")
  private String plkpCreatedBy;                                                                        
  @Column(name="PLKP_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date plkpCreatedTimestamp;                              
  @Column(name="PLKP_LASTUPDATE_BY")
  private String plkpLastupdateBy;                                                                  
  @Column(name="PLKP_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date plkpLastupdateTimestamp;                        
  @Column(name="PLKP_FLAG_MUTASI")
  private String plkpFlagMutasi;                                                                      
  @Column(name="PLKP_FLAG_MUSIMAN")
  private String plkpFlagMusiman;
  
	public String getPlkpFlag() {
		return plkpFlag;
	}
	public void setPlkpFlag(String plkpFlag) {
		this.plkpFlag = plkpFlag;
	}
	public String getPlkpDesc() {
		return plkpDesc;
	}
	public void setPlkpDesc(String plkpDesc) {
		this.plkpDesc = plkpDesc;
	}
	public String getPlkpFlagComment() {
		return plkpFlagComment;
	}
	public void setPlkpFlagComment(String plkpFlagComment) {
		this.plkpFlagComment = plkpFlagComment;
	}
	public String getPlkpFlagDate() {
		return plkpFlagDate;
	}
	public void setPlkpFlagDate(String plkpFlagDate) {
		this.plkpFlagDate = plkpFlagDate;
	}
	public Double getPlkpNextVisit() {
		return plkpNextVisit;
	}
	public void setPlkpNextVisit(Double plkpNextVisit) {
		this.plkpNextVisit = plkpNextVisit;
	}
	public String getPlkpCode() {
		return plkpCode;
	}
	public void setPlkpCode(String plkpCode) {
		this.plkpCode = plkpCode;
	}
	public Double getPlkpMaxPromise() {
		return plkpMaxPromise;
	}
	public void setPlkpMaxPromise(Double plkpMaxPromise) {
		this.plkpMaxPromise = plkpMaxPromise;
	}
	public String getPlkpNeedCollect() {
		return plkpNeedCollect;
	}
	public void setPlkpNeedCollect(String plkpNeedCollect) {
		this.plkpNeedCollect = plkpNeedCollect;
	}
	public String getPlkpScriptEod() {
		return plkpScriptEod;
	}
	public void setPlkpScriptEod(String plkpScriptEod) {
		this.plkpScriptEod = plkpScriptEod;
	}
	public String getPlkpIsDeskcall() {
		return plkpIsDeskcall;
	}
	public void setPlkpIsDeskcall(String plkpIsDeskcall) {
		this.plkpIsDeskcall = plkpIsDeskcall;
	}
	public String getPlkpReqSpvAtt() {
		return plkpReqSpvAtt;
	}
	public void setPlkpReqSpvAtt(String plkpReqSpvAtt) {
		this.plkpReqSpvAtt = plkpReqSpvAtt;
	}
	public String getPlkpSuccessPhone() {
		return plkpSuccessPhone;
	}
	public void setPlkpSuccessPhone(String plkpSuccessPhone) {
		this.plkpSuccessPhone = plkpSuccessPhone;
	}
	public String getPlkpCallBack() {
		return plkpCallBack;
	}
	public void setPlkpCallBack(String plkpCallBack) {
		this.plkpCallBack = plkpCallBack;
	}
	public String getPlkpFlagAmount() {
		return plkpFlagAmount;
	}
	public void setPlkpFlagAmount(String plkpFlagAmount) {
		this.plkpFlagAmount = plkpFlagAmount;
	}
	public String getPlkpStatus() {
		return plkpStatus;
	}
	public void setPlkpStatus(String plkpStatus) {
		this.plkpStatus = plkpStatus;
	}
	public String getPlkpCreatedBy() {
		return plkpCreatedBy;
	}
	public void setPlkpCreatedBy(String plkpCreatedBy) {
		this.plkpCreatedBy = plkpCreatedBy;
	}
	public Date getPlkpCreatedTimestamp() {
		return plkpCreatedTimestamp;
	}
	public void setPlkpCreatedTimestamp(Date plkpCreatedTimestamp) {
		this.plkpCreatedTimestamp = plkpCreatedTimestamp;
	}
	public String getPlkpLastupdateBy() {
		return plkpLastupdateBy;
	}
	public void setPlkpLastupdateBy(String plkpLastupdateBy) {
		this.plkpLastupdateBy = plkpLastupdateBy;
	}
	public Date getPlkpLastupdateTimestamp() {
		return plkpLastupdateTimestamp;
	}
	public void setPlkpLastupdateTimestamp(Date plkpLastupdateTimestamp) {
		this.plkpLastupdateTimestamp = plkpLastupdateTimestamp;
	}
	public String getPlkpFlagMutasi() {
		return plkpFlagMutasi;
	}
	public void setPlkpFlagMutasi(String plkpFlagMutasi) {
		this.plkpFlagMutasi = plkpFlagMutasi;
	}
	public String getPlkpFlagMusiman() {
		return plkpFlagMusiman;
	}
	public void setPlkpFlagMusiman(String plkpFlagMusiman) {
		this.plkpFlagMusiman = plkpFlagMusiman;
	}
}