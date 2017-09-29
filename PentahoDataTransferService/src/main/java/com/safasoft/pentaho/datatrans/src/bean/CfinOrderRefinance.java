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
@Table(name="CFIN_ORDER_REFINANCE",schema="CFIN")
public class CfinOrderRefinance implements Serializable {

	@Id
	@Column(name="REF_ORD_ID")
	private String refOrdId;
	@Column(name="REF_OBJECT_ID")
	private String refObjectId;
	@Column(name="REF_VEHICLE_ID")
	private String refVehicleId;
	@Column(name="REF_VHCL_TAHUN")
	private Integer refVhclTahun;
	@Column(name="REF_FIRST_OR_LAST")
	private String refFirstOrLast;
	@Column(name="REF_MARKET_PRICE")
	private Integer refMarketPrice;
	@Column(name="REF_PCT_TAKSASI")
	private Double refPctTaksasi;
	@Column(name="REF_CREATED_BY")
	private String refCreatedBy;
	@Column(name="REF_CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date refCreatedDate;
	@Column(name="REF_UPDATED_BY")
	private String refUpdatedBy;
	@Column(name="REF_UPDATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date refUpdatedDate;
	
	public String getRefOrdId() {
		return refOrdId;
	}
	public void setRefOrdId(String refOrdId) {
		this.refOrdId = refOrdId;
	}
	public String getRefObjectId() {
		return refObjectId;
	}
	public void setRefObjectId(String refObjectId) {
		this.refObjectId = refObjectId;
	}
	public String getRefVehicleId() {
		return refVehicleId;
	}
	public void setRefVehicleId(String refVehicleId) {
		this.refVehicleId = refVehicleId;
	}
	public Integer getRefVhclTahun() {
		return refVhclTahun;
	}
	public void setRefVhclTahun(Integer refVhclTahun) {
		this.refVhclTahun = refVhclTahun;
	}
	public String getRefFirstOrLast() {
		return refFirstOrLast;
	}
	public void setRefFirstOrLast(String refFirstOrLast) {
		this.refFirstOrLast = refFirstOrLast;
	}
	public Integer getRefMarketPrice() {
		return refMarketPrice;
	}
	public void setRefMarketPrice(Integer refMarketPrice) {
		this.refMarketPrice = refMarketPrice;
	}
	public Double getRefPctTaksasi() {
		return refPctTaksasi;
	}
	public void setRefPctTaksasi(Double refPctTaksasi) {
		this.refPctTaksasi = refPctTaksasi;
	}
	public String getRefCreatedBy() {
		return refCreatedBy;
	}
	public void setRefCreatedBy(String refCreatedBy) {
		this.refCreatedBy = refCreatedBy;
	}
	public Date getRefCreatedDate() {
		return refCreatedDate;
	}
	public void setRefCreatedDate(Date refCreatedDate) {
		this.refCreatedDate = refCreatedDate;
	}
	public String getRefUpdatedBy() {
		return refUpdatedBy;
	}
	public void setRefUpdatedBy(String refUpdatedBy) {
		this.refUpdatedBy = refUpdatedBy;
	}
	public Date getRefUpdatedDate() {
		return refUpdatedDate;
	}
	public void setRefUpdatedDate(Date refUpdatedDate) {
		this.refUpdatedDate = refUpdatedDate;
	}
}
