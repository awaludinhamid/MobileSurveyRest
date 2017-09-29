package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * POJO table DETAIL_GROUP_PARAM
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="DETAIL_GROUP_PARAM")
public class DetailGroupParam implements Serializable {

	@Id
	@Column(name="DETAIL_GROUP_PARAM_ID")
	private int detailGroupParamId;
	@Column(name="DETAIL_GROUP_PARAM_CODE")
	private String detailGroupParamCode;
	@Column(name="DETAIL_GROUP_PARAM_NAME")
	private String detailGroupParamName;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="GROUP_PARAM_ID")
	private MasterGroupParam groupParam;
	
	public int getDetailGroupParamId() {
		return detailGroupParamId;
	}
	public void setDetailGroupParamId(int detailGroupParamId) {
		this.detailGroupParamId = detailGroupParamId;
	}
	public String getDetailGroupParamCode() {
		return detailGroupParamCode;
	}
	public void setDetailGroupParamCode(String detailGroupParamCode) {
		this.detailGroupParamCode = detailGroupParamCode;
	}
	public String getDetailGroupParamName() {
		return detailGroupParamName;
	}
	public void setDetailGroupParamName(String detailGroupParamName) {
		this.detailGroupParamName = detailGroupParamName;
	}
	public MasterGroupParam getGroupParam() {
		return groupParam;
	}
	public void setGroupParam(MasterGroupParam groupParam) {
		this.groupParam = groupParam;
	}
}
