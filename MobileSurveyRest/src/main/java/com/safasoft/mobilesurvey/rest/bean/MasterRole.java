package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.ActiveRecordAuditBean;

/**
 * POJO table MASTER_ROLE
 * @created Apr 4, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_ROLE")
public class MasterRole extends ActiveRecordAuditBean {

  @Id
  @Column(name="ROLE_ID")
  private int roleId;
  @Column(name="ROLE_CODE")
  private String roleCode;
  @Column(name="ROLE_NAME")
  private String roleName;
  @Column(name="ROLE_DESC")
  private String roleDesc;
  @Column(name="ROLE_LEVEL")
  private int roleLevel;
  @ManyToOne
  @JoinColumn(name="ROLE_TYPE_ID")
  private MasterRoleType roleType;
  
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public int getRoleLevel() {
		return roleLevel;
	}
	public void setRoleLevel(int roleLevel) {
		this.roleLevel = roleLevel;
	}
	public MasterRoleType getRoleType() {
		return roleType;
	}
	public void setRoleType(MasterRoleType roleType) {
		this.roleType = roleType;
	} 

}
