package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MASTER_ROLE_TYPE
 * @created Feb 3, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_ROLE_TYPE")
public class MasterRoleType extends RecordAuditBean {

	@Id
  @Column(name="ROLE_TYPE_ID")
  private int roleTypeId;
  @Column(name="ROLE_TYPE_CODE")
  private String roleTypeCode;
  @Column(name="ROLE_TYPE_DESC")
  private String roleTypeDesc;
  
	public int getRoleTypeId() {
		return roleTypeId;
	}
	public void setRoleTypeId(int roleTypeId) {
		this.roleTypeId = roleTypeId;
	}
	public String getRoleTypeCode() {
		return roleTypeCode;
	}
	public void setRoleTypeCode(String roleTypeCode) {
		this.roleTypeCode = roleTypeCode;
	}
	public String getRoleTypeDesc() {
		return roleTypeDesc;
	}
	public void setRoleTypeDesc(String roleTypeDesc) {
		this.roleTypeDesc = roleTypeDesc;
	}
}
