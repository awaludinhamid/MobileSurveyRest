package com.safasoft.mobilesurvey.rest.bean.support;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * POJO superclass for audit function
 * @created Oct 14, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class RecordAuditBean implements Serializable {

  @Column(name="CREATED_BY")
  private String createdBy;
  @Column(name="UPDATED_BY")
  private String updatedBy;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="CREATED_DATE",insertable=false,updatable=false)
	private Date createdDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="UPDATED_DATE",insertable=false,updatable=false)
	private Date updatedDate;

  /**
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * @param createdBy the createdBy to set
   */
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * @param updatedBy the updatedBy to set
   */
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public Date getUpdatedDate() {
	return updatedDate;
}

public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
}
}
