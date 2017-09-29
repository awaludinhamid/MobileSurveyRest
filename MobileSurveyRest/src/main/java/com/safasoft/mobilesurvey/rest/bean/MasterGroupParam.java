package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * POJO table MASTER_GROUP_PARAM
 * @created Jan 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MASTER_GROUP_PARAM")
public class MasterGroupParam implements Serializable {

	@Id
	@Column(name="GROUP_PARAM_ID")
	private int groupParamId;
	@Column(name="GROUP_PARAM_CODE")
	private String groupParamCode;
	@Column(name="GROUP_PARAM_NAME")
	private String groupParamName;
	@JsonManagedReference
	@OneToMany(mappedBy="groupParam",fetch=FetchType.EAGER)
	private List<DetailGroupParam> detailGroupParams;
	
	public int getGroupParamId() {
		return groupParamId;
	}
	public void setGroupParamId(int groupParamId) {
		this.groupParamId = groupParamId;
	}
	public String getGroupParamCode() {
		return groupParamCode;
	}
	public void setGroupParamCode(String groupParamCode) {
		this.groupParamCode = groupParamCode;
	}
	public String getGroupParamName() {
		return groupParamName;
	}
	public void setGroupParamName(String groupParamName) {
		this.groupParamName = groupParamName;
	}
	public List<DetailGroupParam> getDetailGroupParams() {
		return detailGroupParams;
	}
	public void setDetailGroupParams(List<DetailGroupParam> detailGroupParams) {
		this.detailGroupParams = detailGroupParams;
	}
}
