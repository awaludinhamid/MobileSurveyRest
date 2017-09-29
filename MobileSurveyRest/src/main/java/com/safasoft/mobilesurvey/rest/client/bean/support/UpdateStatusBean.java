package com.safasoft.mobilesurvey.rest.client.bean.support;

import java.util.List;

/**
 * POJO for status container
 * @created Oct 14, 2016
 * @author awal
 */
public class UpdateStatusBean {

	private String status;
	private List<String> idList;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getIdList() {
		return idList;
	}
	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}
