package com.safasoft.pentaho.datatrans.src.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="APPL_MST_CURRENCY",schema="APPL")
public class ApplMstCurrency implements Serializable {

	@Id
	@Column(name="CURR_ID")
	private String currId;

	public String getCurrId() {
		return currId;
	}

	public void setCurrId(String currId) {
		this.currId = currId;
	}
}
