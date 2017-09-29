package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="CFIN_MST_VEHICLE",schema="CFIN")
public class CfinMstVehicle implements Serializable {

	@Id
	@Column(name="VEHICLE_ID")
	private String vehicleId;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	@Column(name="VEHICLE_BRAND")
	private String vehicleBrand;
	@Column(name="VEHICLE_TYPE")
	private String vehicleType;
	@Column(name="VEHICLE_MODEL")
	private String vehicleModel;
	@Column(name="VEHICLE_ENG_CAP")
	private Integer vehicleIEngCap;
	@Column(name="VEHICLE_CREATED_BY")
	private String vehicleCreatedBy;
	@Column(name="VEHICLE_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date vehicleCreatedDate;
	@Column(name="VEHICLE_UPDATED_BY")
	private String vehicleUpdatedBy;
	@Column(name="VEHICLE_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date vehicleUpdatedDate;
	@Column(name="VEHICLE_OBJECT_ID")
	private String vehicleObjectId;
	@Column(name="VEHICLE_STATUS")
	private String vehicleStatus;
	
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public Integer getVehicleIEngCap() {
		return vehicleIEngCap;
	}
	public void setVehicleIEngCap(Integer vehicleIEngCap) {
		this.vehicleIEngCap = vehicleIEngCap;
	}
	public String getVehicleCreatedBy() {
		return vehicleCreatedBy;
	}
	public void setVehicleCreatedBy(String vehicleCreatedBy) {
		this.vehicleCreatedBy = vehicleCreatedBy;
	}
	public Date getVehicleCreatedDate() {
		return vehicleCreatedDate;
	}
	public void setVehicleCreatedDate(Date vehicleCreatedDate) {
		this.vehicleCreatedDate = vehicleCreatedDate;
	}
	public String getVehicleUpdatedBy() {
		return vehicleUpdatedBy;
	}
	public void setVehicleUpdatedBy(String vehicleUpdatedBy) {
		this.vehicleUpdatedBy = vehicleUpdatedBy;
	}
	public Date getVehicleUpdatedDate() {
		return vehicleUpdatedDate;
	}
	public void setVehicleUpdatedDate(Date vehicleUpdatedDate) {
		this.vehicleUpdatedDate = vehicleUpdatedDate;
	}
	public String getVehicleObjectId() {
		return vehicleObjectId;
	}
	public void setVehicleObjectId(String vehicleObjectId) {
		this.vehicleObjectId = vehicleObjectId;
	}
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
}
