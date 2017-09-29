package com.safasoft.mobilesurvey.rest.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MOBILE_TASK_RESULT
 * @created Feb 12, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MOBILE_TASK_RESULT")
public class MobileTaskResult extends RecordAuditBean {

	@Id
	@Column(name="TASK_RESULT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@ManyToOne
	@JoinColumn(name="TASK_ID")
	private MobileTaskAssignment task;
	@OneToMany(mappedBy="taskResult",cascade=CascadeType.ALL)
	private Set<MobileTaskResultDetail> taskResultDetails;
	
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
	public MobileTaskAssignment getTask() {
		return task;
	}
	public void setTask(MobileTaskAssignment task) {
		this.task = task;
	}
	public Set<MobileTaskResultDetail> getTaskResultDetails() {
		return taskResultDetails;
	}
	public void setTaskResultDetails(Set<MobileTaskResultDetail> taskResultDetails) {
		this.taskResultDetails = taskResultDetails;
	}
	
}
