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
@Table(name="GL_MST_JCATG",schema="FINA")
public class GlMstJcatg implements Serializable {

  @Id
  @Column(name="JCATG_NAME")
  private String jcatgName;
  @Column(name="JCATG_KETERANGAN")
  private String jcatgKeterangan;
  @Column(name="JCATG_CREATED_BY")
  private String jcatgCreatedBy;
  @Column(name="JCATG_CREATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date jcatgCreatedDate;
  @Column(name="JCATG_UPDATED_BY")
  private String jcatgUpdatedBy;
  @Column(name="JCATG_UPDATED_DATE")
  @Temporal(TemporalType.DATE)
  private Date jcatgUpdatedDate;
  
	public String getJcatgName() {
		return jcatgName;
	}
	public void setJcatgName(String jcatgName) {
		this.jcatgName = jcatgName;
	}
	public String getJcatgKeterangan() {
		return jcatgKeterangan;
	}
	public void setJcatgKeterangan(String jcatgKeterangan) {
		this.jcatgKeterangan = jcatgKeterangan;
	}
	public String getJcatgCreatedBy() {
		return jcatgCreatedBy;
	}
	public void setJcatgCreatedBy(String jcatgCreatedBy) {
		this.jcatgCreatedBy = jcatgCreatedBy;
	}
	public Date getJcatgCreatedDate() {
		return jcatgCreatedDate;
	}
	public void setJcatgCreatedDate(Date jcatgCreatedDate) {
		this.jcatgCreatedDate = jcatgCreatedDate;
	}
	public String getJcatgUpdatedBy() {
		return jcatgUpdatedBy;
	}
	public void setJcatgUpdatedBy(String jcatgUpdatedBy) {
		this.jcatgUpdatedBy = jcatgUpdatedBy;
	}
	public Date getJcatgUpdatedDate() {
		return jcatgUpdatedDate;
	}
	public void setJcatgUpdatedDate(Date jcatgUpdatedDate) {
		this.jcatgUpdatedDate = jcatgUpdatedDate;
	}

}