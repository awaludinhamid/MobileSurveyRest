package com.safasoft.mobilesurvey.rest.dto;

import com.safasoft.mobilesurvey.rest.dto.support.ActiveControllerAuditBean;

/**
 * DTO table MASTER_USER
 * @created Nov 18, 2016
 * @author awal
 */
public class MasterUserDTO extends ActiveControllerAuditBean {

	private int userId;
	private String userCode;
	private String userName;
	private String userImei;
	private String userEmail;
	private String userPassword;
	private String isVerif;
	private int officeId;
	private String officeCode;
	private String officeName;
	private int coyId;
	private String coyCode;
	private String coyName;
	private double gpsLatitude;
	private double gpsLongitude;
	private String isGps;
	
	public String getIsGps() {
		return isGps;
	}
	public void setIsGps(String isGps) {
		this.isGps = isGps;
	}
	public MasterUserDTO() {}
	public MasterUserDTO(int userId, String userCode, String userName, int officeId,
			String officeCode, String officeName, int coyId, String coyCode, String coyName) {
		this.userId = userId;
		this.userCode = userCode;
		this.userName = userName;
		this.officeId = officeId;
		this.officeCode = officeCode;
		this.officeName = officeName;
		this.coyId = coyId;
		this.coyCode = coyCode;
		this.coyName = coyName;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserImei() {
		return userImei;
	}
	public void setUserImei(String userImei) {
		this.userImei = userImei;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getIsVerif() {
		return isVerif;
	}
	public void setIsVerif(String isVerif) {
		this.isVerif = isVerif;
	}
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public int getCoyId() {
		return coyId;
	}
	public void setCoyId(int coyId) {
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
	public double getGpsLatitude() {
		return gpsLatitude;
	}
	public void setGpsLatitude(double gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}
	public double getGpsLongitude() {
		return gpsLongitude;
	}
	public void setGpsLongitude(double gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}
}
