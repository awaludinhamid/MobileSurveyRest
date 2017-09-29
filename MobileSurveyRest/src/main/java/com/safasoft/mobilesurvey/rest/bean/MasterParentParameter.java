package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * POJO table MASTER_PARENT_PARAMETER
 *
 * @author awal
 * @created Mar 14, 2017
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_PARENT_PARAMETER")
public class MasterParentParameter implements Serializable {

	@Id
	@Column(name="PARENT_PAR_ID")
	private int parentParId;
	@Column(name="PARENT_PAR_CODE")
	private String parentParCode;
	@Column(name="PARENT_PAR_DESC")
	private String parentParDesc;
	@Column(name="PARENT_PAR_APPSTYPE")
	private String parentParAppstype;
	@Column(name="PARENT_PAR_DATATYPE")
	private String parentParDatatype;
	@Column(name="PARENT_PAR_VALUE")
	private String parentParValue;
	@OneToMany(mappedBy="parentParameter",fetch=FetchType.EAGER)
	private Set<MasterParameter> parameters;
	
	public Set<MasterParameter> getParameters() {
		return parameters;
	}
	public void setParameters(Set<MasterParameter> parameters) {
		this.parameters = parameters;
	}
	public int getParentParId() {
		return parentParId;
	}
	public void setParentParId(int parentParId) {
		this.parentParId = parentParId;
	}
	public String getParentParCode() {
		return parentParCode;
	}
	public void setParentParCode(String parentParCode) {
		this.parentParCode = parentParCode;
	}
	public String getParentParDesc() {
		return parentParDesc;
	}
	public void setParentParDesc(String parentParDesc) {
		this.parentParDesc = parentParDesc;
	}
	public String getParentParAppstype() {
		return parentParAppstype;
	}
	public void setParentParAppstype(String parentParAppstype) {
		this.parentParAppstype = parentParAppstype;
	}
	public String getParentParDatatype() {
		return parentParDatatype;
	}
	public void setParentParDatatype(String parentParDatatype) {
		this.parentParDatatype = parentParDatatype;
	}
	public String getParentParValue() {
		return parentParValue;
	}
	public void setParentParValue(String parentParValue) {
		this.parentParValue = parentParValue;
	}
}
