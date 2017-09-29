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
@Table(name="CFIN_CONT_CANCEL")
public class CfinContCancelDest implements Serializable {

	@Id
	@Column(name="CAN_CONTRACT_NO")
	private String canContractNo;
	@Column(name="CAN_CANCEL_DATE")
	@Temporal(TemporalType.DATE)
	private Date canCancelDate;
	@Column(name="CAN_CANCEL_REASON")
	private String canCancelReason;
	@Column(name="CAN_CANCEL_BY")
	private String canCancelBy;
	@Column(name="CAN_PRETERM_NO")
	private String canPretermNo;
	
	public String getCanContractNo() {
		return canContractNo;
	}
	public void setCanContractNo(String canContractNo) {
		this.canContractNo = canContractNo;
	}
	public Date getCanCancelDate() {
		return canCancelDate;
	}
	public void setCanCancelDate(Date canCancelDate) {
		this.canCancelDate = canCancelDate;
	}
	public String getCanCancelReason() {
		return canCancelReason;
	}
	public void setCanCancelReason(String canCancelReason) {
		this.canCancelReason = canCancelReason;
	}
	public String getCanCancelBy() {
		return canCancelBy;
	}
	public void setCanCancelBy(String canCancelBy) {
		this.canCancelBy = canCancelBy;
	}
	public String getCanPretermNo() {
		return canPretermNo;
	}
	public void setCanPretermNo(String canPretermNo) {
		this.canPretermNo = canPretermNo;
	}
}
