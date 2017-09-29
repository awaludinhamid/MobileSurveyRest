package com.safasoft.mobsur.rest.client.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.safasoft.mobsur.rest.client.bean.support.RecordAuditBean;

@SuppressWarnings("serial")
@Entity
@Table(name="MBS_TASK_RESULT")
public class TaskResult extends RecordAuditBean {

	@Id
	@Column(name="TASK_RESULT_ID")
	private int taskResultId;
	@Column(name="MCC")
	private String mcc;
	@Column(name="MNC")
	private String mnc;
	@Column(name="LAC")
	private String lac;
	@Column(name="CELL_ID")
	private String cellId;
	@Column(name="IS_GPS")
	private String isGps;
	@Column(name="GPS_LATITUDE")
	private double gpsLatitude;
	@Column(name="GPS_LONGITUDE")
	private double gpsLongitude;
	@Column(name="ACCURACY")
	private int	accuracy;
	@Column(name="TASK_ID")
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
