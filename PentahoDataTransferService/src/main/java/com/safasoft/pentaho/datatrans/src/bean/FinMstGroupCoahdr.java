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
@Table(name="FIN_MST_GROUP_COAHDR",schema="FINA")
public class FinMstGroupCoahdr implements Serializable {

  @Id
  @Column(name="GRCOA_ID")
  private String grcoaId;
  @Column(name="GRCOA_DESC")
  private String grcoaDesc;
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
  
	public String getGrcoaId() {
		return grcoaId;
	}
	public void setGrcoaId(String grcoaId) {
		this.grcoaId = grcoaId;
	}
	public String getGrcoaDesc() {
		return grcoaDesc;
	}
	public void setGrcoaDesc(String grcoaDesc) {
		this.grcoaDesc = grcoaDesc;
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

}