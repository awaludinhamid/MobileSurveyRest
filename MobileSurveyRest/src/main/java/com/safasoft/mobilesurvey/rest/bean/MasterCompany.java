package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * POJO table MASTER_COMPANY
 * @created Oct 12, 2016
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_COMPANY")
public class MasterCompany implements Serializable {

	@Id
	@Column(name="COY_ID")
	private int coyId;
	@Column(name="COY_CODE")
	private String coyCode;
	@Column(name="COY_NAME")
	private String coyName;
	
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
}
