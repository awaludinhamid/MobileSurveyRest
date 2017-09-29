package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="HR_MST_EMPLOYEE_STS",schema="HRMS")
public class HrMstEmployeeSts implements Serializable {

  @Id
  @Column(name="EMPLSTS_CURRJOB_ID")
  private String emplstsCurrjobId;                                                             
  @Id
  @Column(name="EMPLSTS_CURR_STS")
  private String emplstsCurrSts;                                                                 
  @Id
  @Column(name="EMPLSTS_DESTJOB_ID")
  private String emplstsDestjobId;                                                             
  @Id
  @Column(name="EMPLSTS_DEST_STS")
  private String emplstsDestSts;                                                                 
  @Column(name="EMPLSTS_DEFAULT_STS")
  private String emplstsDefaultSts;
  
	public String getEmplstsCurrjobId() {
		return emplstsCurrjobId;
	}
	public void setEmplstsCurrjobId(String emplstsCurrjobId) {
		this.emplstsCurrjobId = emplstsCurrjobId;
	}
	public String getEmplstsCurrSts() {
		return emplstsCurrSts;
	}
	public void setEmplstsCurrSts(String emplstsCurrSts) {
		this.emplstsCurrSts = emplstsCurrSts;
	}
	public String getEmplstsDestjobId() {
		return emplstsDestjobId;
	}
	public void setEmplstsDestjobId(String emplstsDestjobId) {
		this.emplstsDestjobId = emplstsDestjobId;
	}
	public String getEmplstsDestSts() {
		return emplstsDestSts;
	}
	public void setEmplstsDestSts(String emplstsDestSts) {
		this.emplstsDestSts = emplstsDestSts;
	}
	public String getEmplstsDefaultSts() {
		return emplstsDefaultSts;
	}
	public void setEmplstsDefaultSts(String emplstsDefaultSts) {
		this.emplstsDefaultSts = emplstsDefaultSts;
	}
}