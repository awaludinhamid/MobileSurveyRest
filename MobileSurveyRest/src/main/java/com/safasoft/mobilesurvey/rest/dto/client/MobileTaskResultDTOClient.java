package com.safasoft.mobilesurvey.rest.dto.client;

import com.safasoft.mobilesurvey.rest.dto.support.ControllerAuditBean;

/**
 * DTO table MOBILE_TASK_RESULT on client side
 * 
 * @author awal
 * @created Feb 20, 2017
 */
public class MobileTaskResultDTOClient extends ControllerAuditBean {

	//task result
	private int taskResultId;
	private String mcc;
	private String mnc;
	private String lac;
	private String cellId;
	private String isGps;
	private double gpsLatitude;
	private double gpsLongitude;
	private int	accuracy;
	//task assignment
	private int taskId;
	
	public int getTaskResultId() {
		return taskResultId;
	}
	public void setTaskResultId(int taskResultId) {
		this.taskResultId = taskResultId;
	}
	public String getMcc() {
		return mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	public String getMnc() {
		return mnc;
	}
	public void setMnc(String mnc) {
		this.mnc = mnc;
	}
	public String getLac() {
		return lac;
	}
	public void setLac(String lac) {
		this.lac = lac;
	}
	public String getCellId() {
		return cellId;
	}
	public void setCellId(String cellId) {
		this.cellId = cellId;
	}
	public String getIsGps() {
		return isGps;
	}
	public void setIsGps(String isGps) {
		this.isGps = isGps;
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
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

}
