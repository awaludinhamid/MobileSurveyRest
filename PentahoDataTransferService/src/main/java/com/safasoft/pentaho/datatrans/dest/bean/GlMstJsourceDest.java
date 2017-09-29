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
@Table(name="GL_MST_JSOURCE")
public class GlMstJsourceDest implements Serializable {

  @Id
  @Column(name="JSRC_NAME")
  private String jsrcName;
  @Column(name="JSRC_KETERANGAN")
  private String jsrcKeterangan;
  @Column(name="JSRC_CREATED_BY")
  private String jsrcCreatedBy;
  @Column(name="JSRC_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date jsrcCreatedDate;
  @Column(name="JSRC_UPDATED_BY")
  private String jsrcUpdatedBy;
  @Column(name="JSRC_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date jsrcUpdatedDate;
  
	public String getJsrcName() {
		return jsrcName;
	}
	public void setJsrcName(String jsrcName) {
		this.jsrcName = jsrcName;
	}
	public String getJsrcKeterangan() {
		return jsrcKeterangan;
	}
	public void setJsrcKeterangan(String jsrcKeterangan) {
		this.jsrcKeterangan = jsrcKeterangan;
	}
	public String getJsrcCreatedBy() {
		return jsrcCreatedBy;
	}
	public void setJsrcCreatedBy(String jsrcCreatedBy) {
		this.jsrcCreatedBy = jsrcCreatedBy;
	}
	public Date getJsrcCreatedDate() {
		return jsrcCreatedDate;
	}
	public void setJsrcCreatedDate(Date jsrcCreatedDate) {
		this.jsrcCreatedDate = jsrcCreatedDate;
	}
	public String getJsrcUpdatedBy() {
		return jsrcUpdatedBy;
	}
	public void setJsrcUpdatedBy(String jsrcUpdatedBy) {
		this.jsrcUpdatedBy = jsrcUpdatedBy;
	}
	public Date getJsrcUpdatedDate() {
		return jsrcUpdatedDate;
	}
	public void setJsrcUpdatedDate(Date jsrcUpdatedDate) {
		this.jsrcUpdatedDate = jsrcUpdatedDate;
	}

}