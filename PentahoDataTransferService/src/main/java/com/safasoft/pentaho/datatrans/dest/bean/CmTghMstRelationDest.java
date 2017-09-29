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
@Table(name="CM_TGH_MST_RELATION")
public class CmTghMstRelationDest implements Serializable {

  @Id
  @Column(name="REL_CODE")
  private String relCode;                                                                                
  @Column(name="REL_DESC")
  private String relDesc;                                                                                     
  @Column(name="REL_STATUS")
  private String relStatus;                                                                                 
  @Column(name="REL_CREATED_BY")
  private String relCreatedBy;                                                                          
  @Column(name="REL_CREATED_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date relCreatedTimestamp;                                
  @Column(name="REL_LASTUPDATE_BY")
  private String relLastupdateBy;                                                                    
  @Column(name="REL_LASTUPDATE_TIMESTAMP")
  @Temporal(TemporalType.DATE)
  private Date relLastupdateTimestamp;                          
  @Column(name="REL_OWNER")
  private Double relOwner;
  
	public String getRelCode() {
		return relCode;
	}
	public void setRelCode(String relCode) {
		this.relCode = relCode;
	}
	public String getRelDesc() {
		return relDesc;
	}
	public void setRelDesc(String relDesc) {
		this.relDesc = relDesc;
	}
	public String getRelStatus() {
		return relStatus;
	}
	public void setRelStatus(String relStatus) {
		this.relStatus = relStatus;
	}
	public String getRelCreatedBy() {
		return relCreatedBy;
	}
	public void setRelCreatedBy(String relCreatedBy) {
		this.relCreatedBy = relCreatedBy;
	}
	public Date getRelCreatedTimestamp() {
		return relCreatedTimestamp;
	}
	public void setRelCreatedTimestamp(Date relCreatedTimestamp) {
		this.relCreatedTimestamp = relCreatedTimestamp;
	}
	public String getRelLastupdateBy() {
		return relLastupdateBy;
	}
	public void setRelLastupdateBy(String relLastupdateBy) {
		this.relLastupdateBy = relLastupdateBy;
	}
	public Date getRelLastupdateTimestamp() {
		return relLastupdateTimestamp;
	}
	public void setRelLastupdateTimestamp(Date relLastupdateTimestamp) {
		this.relLastupdateTimestamp = relLastupdateTimestamp;
	}
	public Double getRelOwner() {
		return relOwner;
	}
	public void setRelOwner(Double relOwner) {
		this.relOwner = relOwner;
	}
}