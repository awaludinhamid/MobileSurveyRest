package com.safasoft.mobilesurvey.rest.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.safasoft.mobilesurvey.rest.bean.support.RecordAuditBean;

/**
 * POJO table MOBILE_USER_LOCATION
 *
 * @author awal
 * @created Mar 21, 2017
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MOBILE_USER_LOCATION")
public class MobileUserLocation extends RecordAuditBean {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_LOCATION_ID")
	private int userLocationId;
	@Column(name="GPS_LATITUDE")
	private double gpsLatitude;
	@Column(name="GPS_LONGITUDE")
	private double gpsLongitude;
	@Column(name="IS_GPS")
	private String isGps;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private MasterUser user;
	
	public int getUserLocationId() {
		return userLocationId;
	}
	public void setUserLocationId(int userLocationId) {
		this.userLocationId = userLocationId;
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
	public MasterUser getUser() {
		return user;
	}
	public void setUser(MasterUser user) {
		this.user = user;
	}
	public String getIsGps() {
		return isGps;
	}
	public void setIsGps(String isGps) {
		this.isGps = isGps;
	}
}
