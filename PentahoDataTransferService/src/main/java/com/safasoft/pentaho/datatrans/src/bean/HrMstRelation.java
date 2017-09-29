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
@Table(name="HR_MST_RELATION",schema="HRMS")
public class HrMstRelation implements Serializable {

  @Id
  @Column(name="REL_ID")
  private String relId;                                                                                    
  @Column(name="REL_SEQ")
  private Integer relSeq;                                                                                      
  @Column(name="REL_DESC")
  private String relDesc;                                                                                     
  @Column(name="REL_CREATED_BY")
  private String relCreatedBy;                                                                          
  @Column(name="REL_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date relCreatedDate;                                          
  @Column(name="REL_UPDATED_BY")
  private String relUpdatedBy;                                                                          
  @Column(name="REL_UPDATE_DATE")
  @Temporal(TemporalType.DATE)
  private Date relUpdateDate;
  
	public String getRelId() {
		return relId;
	}
	public void setRelId(String relId) {
		this.relId = relId;
	}
	public Integer getRelSeq() {
		return relSeq;
	}
	public void setRelSeq(Integer relSeq) {
		this.relSeq = relSeq;
	}
	public String getRelDesc() {
		return relDesc;
	}
	public void setRelDesc(String relDesc) {
		this.relDesc = relDesc;
	}
	public String getRelCreatedBy() {
		return relCreatedBy;
	}
	public void setRelCreatedBy(String relCreatedBy) {
		this.relCreatedBy = relCreatedBy;
	}
	public Date getRelCreatedDate() {
		return relCreatedDate;
	}
	public void setRelCreatedDate(Date relCreatedDate) {
		this.relCreatedDate = relCreatedDate;
	}
	public String getRelUpdatedBy() {
		return relUpdatedBy;
	}
	public void setRelUpdatedBy(String relUpdatedBy) {
		this.relUpdatedBy = relUpdatedBy;
	}
	public Date getRelUpdateDate() {
		return relUpdateDate;
	}
	public void setRelUpdateDate(Date relUpdateDate) {
		this.relUpdateDate = relUpdateDate;
	}
}