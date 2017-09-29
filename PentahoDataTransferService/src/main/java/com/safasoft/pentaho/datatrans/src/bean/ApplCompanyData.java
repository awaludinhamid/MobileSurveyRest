package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="APPL_COMPANY_DATA",schema="APPL")
public class ApplCompanyData implements Serializable {

	@Id
	@Column(name="COY_NAME")
	private String coyName;
	@Column(name="COY_CURR")
	private String coyCurr;
	@Column(name="COY_DATABASE")
	private String coyDatabase;
	@Column(name="COY_LOGO")
	private byte[] coyLogo;
	
	public String getCoyName() {
		return coyName;
	}
	public void setCoyName(String coyName) {
		this.coyName = coyName;
	}
	public String getCoyCurr() {
		return coyCurr;
	}
	public void setCoyCurr(String coyCurr) {
		this.coyCurr = coyCurr;
	}
	public String getCoyDatabase() {
		return coyDatabase;
	}
	public void setCoyDatabase(String coyDatabase) {
		this.coyDatabase = coyDatabase;
	}
	public byte[] getCoyLogo() {
		return coyLogo;
	}
	public void setCoyLogo(byte[] coyLogo) {
		this.coyLogo = coyLogo;
	}
	
}
