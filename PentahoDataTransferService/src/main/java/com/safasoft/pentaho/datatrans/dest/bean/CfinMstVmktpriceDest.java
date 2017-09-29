package com.safasoft.pentaho.datatrans.dest.bean;

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
@Table(name="CFIN_MST_VMKTPRICE")
public class CfinMstVmktpriceDest implements Serializable {

	@Id
	@Column(name="VEHICLE_ID")
	private String vehicleId;
	@Id
	@Column(name="TAHUN")
	private Integer tahun;
	@Id
	@Column(name="FIRST_OR_LAST")
	private String firstOrLast;
	@Id
	@Column(name="COYOUTLET_ID")
	private String coyoutletId;
	@Column(name="MARKETPRICE")
	private Integer marketprice;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	@Column(name="UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Integer getTahun() {
		return tahun;
	}
	public void setTahun(Integer tahun) {
		this.tahun = tahun;
	}
	public String getFirstOrLast() {
		return firstOrLast;
	}
	public void setFirstOrLast(String firstOrLast) {
		this.firstOrLast = firstOrLast;
	}
	public String getCoyoutletId() {
		return coyoutletId;
	}
	public void setCoyoutletId(String coyoutletId) {
		this.coyoutletId = coyoutletId;
	}
	public Integer getMarketprice() {
		return marketprice;
	}
	public void setMarketprice(Integer marketprice) {
		this.marketprice = marketprice;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
