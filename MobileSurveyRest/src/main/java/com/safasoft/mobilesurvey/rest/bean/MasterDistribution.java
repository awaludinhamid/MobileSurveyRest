package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_DISTRIBUTION
 * @created Dec 4, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_DISTRIBUTION")
public class MasterDistribution extends ActiveRecordAuditBean {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="DIST_ID")
  private int distId;
  @Column(name="IS_AUTO_DIST")
  private String isAutoDist;
  @Column(name="METHOD_TYPE")
  private String methodType;
  @ManyToOne
  @JoinColumn(name="OFFICE_ID")
  private MasterOffice office;
  @ManyToOne
  @JoinColumn(name="ROLE_ASSIGN_TO")
  private MasterRole roleAssignTo;
  
	public int getDistId() {
		return distId;
	}
	public void setDistId(int distId) {
		this.distId = distId;
	}
	public String getIsAutoDist() {
		return isAutoDist;
	}
	public void setIsAutoDist(String isAutoDist) {
		this.isAutoDist = isAutoDist;
	}
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public MasterOffice getOffice() {
		return office;
	}
	public void setOffice(MasterOffice office) {
		this.office = office;
	}
	public MasterRole getRoleAssignTo() {
		return roleAssignTo;
	}
	public void setRoleAssignTo(MasterRole roleAssignTo) {
		this.roleAssignTo = roleAssignTo;
	}

}
