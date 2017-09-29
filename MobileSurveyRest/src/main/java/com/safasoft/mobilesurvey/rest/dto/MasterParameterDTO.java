package com.safasoft.mobilesurvey.rest.dto;

/**
 * DTO table MASTER_PARAMETER
 * @created Nov 29, 2016
 * @author awal
 */
public class MasterParameterDTO {
	
	private int parId;
	private String parCode;
	private String parDesc;
	private String parAppsType;
	private String parDataType;
	private String parValue;
	private String parDefaultValue;
	private Integer coyId;
	private String coyCode;
	private String coyName;
	
	public int getParId() {
		return parId;
	}
	public void setParId(int parId) {
		this.parId = parId;
	}
	public String getParCode() {
		return parCode;
	}
	public void setParCode(String parCode) {
		this.parCode = parCode;
	}
	public String getParDesc() {
		return parDesc;
	}
	public void setParDesc(String parDesc) {
		this.parDesc = parDesc;
	}
	public String getParAppsType() {
		return parAppsType;
	}
	public void setParAppsType(String parAppsType) {
		this.parAppsType = parAppsType;
	}
	public String getParDataType() {
		return parDataType;
	}
	public void setParDataType(String parDataType) {
		this.parDataType = parDataType;
	}
	public String getParValue() {
		return parValue;
	}
	public void setParValue(String parValue) {
		this.parValue = parValue;
	}
	public String getParDefaultValue() {
		return parDefaultValue;
	}
	public void setParDefaultValue(String parDefaultValue) {
		this.parDefaultValue = parDefaultValue;
	}
	public Integer getCoyId() {
		return coyId;
	}
	public void setCoyId(Integer coyId) {
		this.coyId = coyId;
	}
	public String getCoyCode() {
		return coyCode;
	}
	public void setCoyCode(String coyCode) {
		this.coyCode = coyCode;
	}
	public String getCoyName() {
		return coyName;
	}
	public void setCoyName(String coyName) {
		this.coyName = coyName;
	}
}
